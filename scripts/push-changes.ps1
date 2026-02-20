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

function Invoke-GitPushWithAnimation {
    param(
        [Parameter(Mandatory = $true)]
        [string]$Remote,
        [Parameter(Mandatory = $true)]
        [string]$TargetBranch
    )

    $frames = @("|", "/", "-", "\")
    $index = 0
    $percent = 0

    $process = Start-Process -FilePath "git" -ArgumentList @("push", "--progress", $Remote, $TargetBranch) -NoNewWindow -PassThru

    while (-not $process.HasExited) {
        $frame = $frames[$index % $frames.Count]
        Write-Progress -Activity "Git Push" -Status "$frame Pushing commits to $Remote/$TargetBranch" -PercentComplete $percent
        Start-Sleep -Milliseconds 120
        $index++
        $percent = ($percent + 3) % 100
    }

    Write-Progress -Activity "Git Push" -Completed

    if ($process.ExitCode -ne 0) {
        throw "git push $Remote $TargetBranch failed."
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

Invoke-GitPushWithAnimation -Remote "origin" -TargetBranch $Branch
Write-Host "Push complete on branch '$Branch'."
