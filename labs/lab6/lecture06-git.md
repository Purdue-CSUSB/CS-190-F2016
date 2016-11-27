Git Reference Sheet
=====

This is a reference guide for the git commands that we've gone over in lecture and that you will need for the lab.

## Working with git locally

1. Create a repository in the current folder

  ```bash
  git init
  ```

2. Tell git to track a new file

  ```bash
  git add <filename(s)>

  # OR to simply add all the files in the current working directory:
  git add .
  ```

3. Commit changes in staging area

  ```bash
  git commit -m "<message here>"
  
  # ex.
  git commit -m "adds initial java files for lab 8"
  ```

4. Looking at old commits

  ```bash
  git show <commit hash>
  
  # ex.
  git show 68a3056
  ```

5. Looking at files in an old commit

  ```bash
  git show <commit hash, branch, or tag>:<file_name>
  
  # ex.
  git show master:Example.java
  git show 68a3056:Example2.java
  ```

6. Undoing an old commit

  ```bash
  git revert <commit hash>
  
  # ex.
  git revert 68a3056
  ```

7. Check status of repository

  ```bash
  git status
  ```

8. Check log of recent commits

  ```bash
  git log

  # OR, for a simpler view
  git log pretty=oneline
  ```

9. To remove a file from the staging area

> This will unstage the given file, meaning when you do `git commit`, the changes to this file will NOT be included

> You will only ever need to do this if you accidentally `add` a file

  ```bash
  git rm --cached <filename>
  ```

### Troubleshooting

If something goes wrong, use `git status` and `git log` to see if you can figure out what happened.
Remember, don't panic, as long as you committed something, its virtually impossible to lose it

For branching issues, try `git log --graph --full-history --pretty=format:"%h%x09%d%x20%s"`

Since we should all have color set up we can try `git log --graph --full-history --all --color --pretty=format:"%x1b[31m%h%x09%x1b[32m%d%x1b[0m%x20%s"` for an even prettier view
