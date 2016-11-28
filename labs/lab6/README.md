# CS 190 Lab 6 (2016) - Git

The purpose of this lab is to gain a workable knowledge of git and GitHub. Not only is this a powerful tool for assuring you get the best grade possible on your projects, protecting you from losing code, and collaborating, but it is also a necessary skill in the work place. You will never have a computer science job that doesn't require the use of a version control system.

__For quick reference on the git commands we covered, see the cheat sheet [here] (https://github.com/Purdue-CSUSB/CS-190-F2016/blob/master/labs/lab6/lecture06-git.md)__

## The Lab

This lab will walk you through an example open source project and teach you in a real use case situation how to use git and its features.

## Required git setup

Before you start working you have to do some setup of git. You need to set up your global gitconfig with your name and email. These will be attached to each commit to tie you to them.

You should replace the `<your name>` below with your real name, e.g., "John Doe"

```bash
git config --global user.name <your name>
git config --global user.email $USER@purdue.edu
```

## Get the code

We will now get the code for the lab from GitHub. Before you continue, you must have a GitHub account. You should have made one in an earlier lab, but if you don't already have one, sign up [here](https://github.com/join).

Navigate to the project page that can be found at https://github.com/Purdue-CSUSB/pycalc. In the top right-hand corner, press the "Fork" button.

![Fork screenshot](https://raw.githubusercontent.com/Purdue-CSUSB/CS-190-F2016/master/labs/lab6/assets/fork-screenshot.png)

*Note: If you are part of a group on GitHub, it may ask you where you want to fork the repository. If it asks you this,just fork it into your personal GitHub.*

Forking simply makes a copy of the repository in your own account so that you have permission to make changes. After forking, you should be in a new repository. The title of the repo at the top left should be "*your username*/snake" instead of "Purdue-CSUSB/pycalc"

Now on the right side of the screen click the button to copy the clone URL to your clipboard. Make sure that you have selected
the HTTPS option.

![Clone screenshot](https://raw.githubusercontent.com/Purdue-CSUSB/CS-190-F2016/master/labs/lab6/assets/clone-screenshot.png)

*Note: There are other protocols to do this (some of them more convenient than HTTPS). If you'd like to learn how
to set up SSH keys to use SSH to clone you can learn more [here](https://help.github.com/articles/generating-ssh-keys/) (please
do this on your own time).*

Finally, run the clone command in your terminal:

    $ git clone <clone URL>

where `<clone URL>` is the URL you just copied to your clipboard.

## Step 0: The project

The project we will be working with is a simple 4-function calculator written in Python. See the [project page](https://github.com/Purdue-CSUSB/pycalc) for steps on how to use the calculator on how to use the calculator.

## Step 1: Check the status of the repo

Run `git status`. You should see some output that looks like this:

```
On branch master
Your branch is up-to-date with 'origin/master'.
nothing to commit, working directory clean
```

Now run `git log`. You should see a list of the few commits that I pushed to publish the project. Note: it will open in a program called less. Press
'q' to exit.

## Step 2: Make a change

Now, let's demonstrate git's usefulness in tracking code changes. 

Open up `calc.py` in a text editor. Go to the subtract function, which starts on line 22. On line 26, change the return statement to be `a + b`. 

Run the calculator again and check what happens with the subtraction function. Some example output:

    Enter the first argument: 3
    Enter the operation: -
    Enter the second argument: 3
    Difference:  6

Let's check the status of our git repo.

* Run the status command. You should see that `calc.py` has been modified. We need to commit this file's changes.
* Run `git add .` This will add all our files to the staging area.
* Run `git commit -m "<your commit message here>"` with a nice, descriptive, present-tense commit message.
* Run `git log` and you should now see your new commit. You're well on your way to becoming a git pro!

We just modified the subtraction function to actually add the numbers, which is a bug. Even worse, we committed buggy code to the master branch! No worries, we will revert this change later.

**IMPORTANT: Don't move on to step 3 until you make sure you commit your changes**(check your git log).

## Step 3: Make another change

Let's make another change to the code base. 

Again, open `calc.py` in a text editor. Just before the main loop runs (line 52), we want to print out a welcome message. On line 51, write the following code:

```python
print "Welcome to PyCalc!"
```

Run the calculator again and see your welcome message in the terminal. Some example output:

    Welcome to PyCalc!
    Enter the first argument: 3
    Enter the operation: -
    Enter the second argument: 3
    Difference:  6

As you can see, both changes (the faulty subtraction function, and the welcome message) are present in our code base.

Again, add the files to track their changes in git. Commit the change you made, and check the log to ensure the new commit is there.

## Step 4: A step backwards

The current state of our calculator isn't so great. It prints a welcome message (nice!) but it doesn't subtract properly (yikes!).

Run `git log`. Find the commit that you breaks the subtraction function (it should be the second from the top) and copy the commit hash.

Run `git revert <commit_hash>`. This will open up an editor with a commit that says something like
"Revert '*some message*' This commit reverts *some commit hash*".

**Important Note!**

The revert command will likely open vim. Follow these steps to save the file and return to the nice familiar terminal.

1. Don't panic
2. Press <ESC> a few times to make sure you are in command mode, not edit mode.
3. type `:wq`

    > Remember: the colon allows you to type commands, w is for write, and q is for quit.

4. You have now committed!


Run the calculator again. You should now see the welcome message (yay!) and the subtract function should work correctly (woohoo!). Example output:

    Welcome to PyCalc!
    Enter the first argument: 3
    Enter the operation: -
    Enter the second argument: 3
    Difference:  0

**Give your neighbor a high five, you just did some serious source control.**

## Grading

Show your TA your git log.

## Extras

Here are some practical things you could do with git if you have extra time:

* Work on your .gitconfig file. Some useful information here: http://git-scm.com/docs/git-config
* Put your CS 180 project into a git repository!

    Please don't put your Purdue CS projects into public repos on GitHub. Make sure they're in a private repo. You can get in big trouble with your professors if you post projects publicly. 

* Setting up SSH keys:

    You may have noticed that every time you pull or push to GitHub, you have to enter your username and password. This is because you are using the HTTPS protocol to connect to GitHub as a remote. 
    
    This has a few advantages:

    * It's easier and faster to set up.
    * It will still work on strict firewalls and proxies such as those restricting
      all ports but port 80 and 443 (only HTTP and HTTPS traffic).

    The downsides being:

    * You have to enter your credentials every time you push or pull.
    * Typing your password can be insecure on unfamiliar machines or HTTP
      connections

    Luckily, there is another way. You can set up the remote to use SSH instead of
    HTTPS.

    SSH uses RSA encryption. This allows you use a "password-less log in" using a
    public/private key pair.

    There is a great tutorial by GitHub on how to set up and use this method
    [here](https://help.github.com/articles/generating-ssh-keys/).

    > Note: you will need to add an SSH key for every different machine you want
    to clone on (e.g. your personal machine and the CS servers).
