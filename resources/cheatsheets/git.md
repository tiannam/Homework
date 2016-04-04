`git init`

`git status`

`git add <file>` => adds a file and its content to version tracker // staging area

`git add -p` => allows you to add in hunks from individual files, if it is not a tracked file, it wont show up here

`git add -A` => adds all files to be tracked and to staging area

`git reset -p` => resets files from staging area in hunks

`git checkout <file>` => resets the working directory for a specific file.

`git checkout <branch>` => move to a branch

`git checkout <commit>` => take you back to that commit, ignores all commits after. This is known a state called DETACHED HEAD. USE CAUTION!

`git branch` => shows all branches and a * next to to the branch we are on. 

`git branch <name>` => creates a branch in that name

`git checkout -b <name>` => creates a branch and checks out to it. 

`git branch -d <name>` => deletes a branch

`git merge <branchname>` => merges <branchname> to the branch we are currently on. 

`git remote -v` => shows a list of all connected remote repositories and their names

`git remote add <name> <ssh or https url>` => adds a remote repo called <name> at a specified location. https url is provided by github (or other host). origin is the <name> used for our main backup to github (or other host)

`git push [-u] <remote> <branch>` => -u is for the initial push, sets this remote to be upstream. 

`git pull <remote> <branch>` => fetches all new changes from <remote> AND MERGES 

`git fetch <remote> <branch>` => fetches all new changes from <remote> and DOESNT MERGE

`git diff` => shows changes between current branch and compared branch.

`git log` => shows you a list of previous commits (on current branch)











