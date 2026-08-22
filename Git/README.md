GIT CHEAT SHEET


# Mental model how GIT as version control system for my project.

Your computer
     │
     │ git add
     ▼
 STAGING AREA
     │
     │ git commit
     ▼
 LOCAL REPOSITORY
     │
     │ git push
     ▼
    GitHub
   (REMOTE) // this is the part that makes your project available online





# when it was uploaded on github and you wanna have a copy of it

GitHub
   │
   │ git fetch / git pull
   ▼
Your computer




# Git identity configuration (do this once per machine)
# Who made this commit?

git config --global user.name "Your Name"
git config --global user.email "your@email.com"


# Windows line endings (helps Git handle windows line endings consistently) 
git config --global core.autocrlf true

# verify your configuration
git config --list --show-origin

# Git states
Untracked -> Modified -> Staged -> Commited



# git process
git init (initialize)
git status (the hidden git. directory)
git clone <repo-url> (for an exisiting project that you want to have a copy)
git diff (compares your working file to the company file)
git add . 
git commit -m "message"
git rm <file> (remove file)
git mv <old name> <new name>
git push -u origin main (to push the main branch, telling it where to go [if the upstream was already configured])

# git branches
git branch (display exisiting branches)
git switch -c <branch name> (create branch and switch into it)
git switch <branch name> (switch branch)
git checkout <branch name> (switch to another branch with classic command )
git branch -m oldName newName

# git delete branch
git branch -d <branch/name> (delete branches that are fully merge, git refuses to delete unmerged branches)
git branch -D <branch/name> (force deletion)

# adding remote
git remote add origin <repo url> (connecting local git to the github repo)




