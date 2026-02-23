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

push_with_progress() {
  local remote="$1"
  local target_branch="$2"

  echo "Pushing commits to $remote/$target_branch..."
  run_git push --progress "$remote" "$target_branch"
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

push_with_progress "origin" "$branch"
echo "Push complete on branch '$branch'."
