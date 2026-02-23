#!/usr/bin/env bash
set -euo pipefail

message="${1-}"
branch="${2-}"

run_git() {
  if ! git "$@"; then
    echo "git $* failed." >&2
    return 1
  fi
}

push_with_spinner() {
  local remote="$1"
  local target_branch="$2"

  if ! [[ -t 1 ]]; then
    run_git push --progress "$remote" "$target_branch"
    return
  fi

  local spinner='|/-\'
  local index=0
  local percent=0
  local stdout_file
  local stderr_file
  stdout_file="$(mktemp)"
  stderr_file="$(mktemp)"

  git push --progress "$remote" "$target_branch" >"$stdout_file" 2>"$stderr_file" &
  local pid=$!

  while kill -0 "$pid" 2>/dev/null; do
    local frame="${spinner:$((index % ${#spinner})):1}"
    printf "\r[%s] Pushing commits to %s/%s (%d%%)" "$frame" "$remote" "$target_branch" "$percent"
    sleep 0.12
    index=$((index + 1))
    percent=$(((percent + 3) % 100))
  done

  wait "$pid"
  local exit_code=$?
  printf "\r\n"

  if [[ -s "$stdout_file" ]]; then
    cat "$stdout_file"
  fi
  if [[ -s "$stderr_file" ]]; then
    cat "$stderr_file" >&2
  fi
  rm -f "$stdout_file" "$stderr_file"

  if [[ $exit_code -ne 0 ]]; then
    echo "git push $remote $target_branch failed with exit code $exit_code." >&2
    return "$exit_code"
  fi
}

inside_repo="$(git rev-parse --is-inside-work-tree 2>/dev/null || true)"
if [[ "$inside_repo" != "true" ]]; then
  echo "Run this script from inside a git repository." >&2
  exit 1
fi

if [[ -z "$branch" ]]; then
  branch="$(git rev-parse --abbrev-ref HEAD)"
fi

git_status="$(git status --porcelain)"
if [[ -n "$git_status" ]]; then
  if [[ -z "$message" ]]; then
    message="Update $(date '+%Y-%m-%d %H:%M:%S')"
  fi

  run_git add -A
  run_git commit -m "$message"
else
  echo "No local changes to commit."
fi

push_with_spinner "origin" "$branch"
echo "Push complete on branch '$branch'."
