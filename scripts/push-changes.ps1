param(
    [Parameter(Position = 0)]
    [string]$Message,
    [Parameter(Position = 1)]
    [string]$Branch
)

$ErrorActionPreference = "Stop"

function Invoke-Git {
    param(
        [Parameter(Mandatory = $true)]
        [string[]]$Args
    )

    & git @Args
    if ($LASTEXITCODE -ne 0) {
        throw "git $($Args -join ' ') failed."
    }
}

$insideRepo = (& git rev-parse --is-inside-work-tree 2>$null)
if ($LASTEXITCODE -ne 0 -or $insideRepo.Trim() -ne "true") {
    throw "Run this script from inside a git repository."
}

if ([string]::IsNullOrWhiteSpace($Branch)) {
    $Branch = (& git rev-parse --abbrev-ref HEAD).Trim()
}

$status = (& git status --porcelain)
if ($LASTEXITCODE -ne 0) {
    throw "Unable to read git status."
}

if (-not [string]::IsNullOrWhiteSpace(($status -join ""))) {
    if ([string]::IsNullOrWhiteSpace($Message)) {
        $Message = "Update $(Get-Date -Format 'yyyy-MM-dd HH:mm:ss')"
    }

    Invoke-Git -Args @("add", "-A")
    Invoke-Git -Args @("commit", "-m", $Message)
} else {
    Write-Host "No local changes to commit."
}

Invoke-Git -Args @("push", "origin", $Branch)
Write-Host "Push complete on branch '$Branch'."
