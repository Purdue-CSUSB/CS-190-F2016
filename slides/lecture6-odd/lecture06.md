# CS190: Tools
### November 8, 2016
<!--.element: class="subtitle" style="text-align: center" -->



## Lecture 6<!--.element: style="text-align: center;" -->
### Collaboration in git <!--.element: style="text-align: center;" -->
### AKA git remotes <!--.element: class="subtitle" style="text-align: center; font-size: 30pt" -->



# But first! Let's review ;) <!--.element style="text-align: center"-->


## Quiz 6.1
What is Github?

A. A piece of software that sends code to other developers.

B. A website that provides a frontend for git repositories with extra features.

C. A dating website for programmers.

D. A new version of git.
<br>

<span>Forgot your i>clicker? Sign in: https://purdueusb.com/cs190/signin</span>
<!--.element: style="font-size: 16pt" -->



# Lecture 6:
### git remotes and collaboration <!-- .element: class="subtitle" style="text-align: center" -->


# Reminders: Local git basics <!-- .element: style="text-align: center"-->


### Initialize
```
~ » git init
Initialized empty Git repository in /Users/matthew/cool_project/.git/
~ git:(master) » git status
On branch master

Initial commit

nothing to commit (create/copy files and use "git add" to track)
```
<!-- .element: class="hljs nohighlight"-->


### Add (or track)
```
~ » git status
On branch master

Initial commit

Untracked files:
  (use "git add <file>..." to include in what will be committed)
  CoolCode.java
nothing added to commit but untracked files present (use "git add" to track)
~ » git add CoolCode.java
~ » git status
On branch master
Initial commit

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)

new file:   CoolCode.java
```
<!-- .element: class="hljs nohighlight"-->


### Commit
```
~ » git commit -m “Add some cool code”
[master (root-commit) 4127eaa] Add some cool code
 1 file changed,48 insertions(+), 0 deletions(-)
 create mode 100644 CoolCode.java
~ » git status
On branch master
nothing to commit, working directory clean
```
<!-- .element: class="hljs nohighlight"-->


# But...
### What comes next? <!-- .element: style="text-align: center" -->



# Remotes!
### Move your code from here...

### to there... <!-- .element: style="text-align: right"-->

### and back again
<!-- is this too extra? -->