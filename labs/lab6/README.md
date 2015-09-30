# CS 190 Lab 6 (2015) - Basics of Git Part 1: Local Git

The purpose of this lab is to gain a workable knowledge of git. Not only is this a powerful
tool for assuring you get the best grade possible on your projects, protecting you from losing
code, and collaborating, but it is also a necessary skill in the work place.

You will never have a computer science job that doesn't require the use of a version control system.

__For quick reference on the git commands we covered, see the cheat sheet [here] (https://github.com/Purdue-CSUSB/CSToolsCourse/blob/master/labs/lab6/lecture06-git.md)__

## The Lab

This lab will walk you through an example open source project and teach you in a real use case situation
how to use git and it's features.

## Required git setup

Before you start working you have to do some setup of git. You need to set up your global gitconfig with
your name and email. These will be attached to each commit to tie you to them.

You should replace the `$USER` below with your real name, e.g., "Levi Starrett"

```bash
git config --global user.name $USER
git config --global user.email $USER@purdue.edu
```

## Get the code

We will now get the code for the lab from GitHub. Some of these commands will be unfamiliar to you, but we will
explain more about using GitHub in the next lecture. Before you continue, you must have a GitHub account. If you
don't already have one, sign up [here](https://github.com/join).

Navigate to the project page that can be found at https://github.com/leviathan747/snake. In the top right-hand corner,
press the "Fork" button.

![] (https://raw.githubusercontent.com/Purdue-CSUSB/CSToolsCourse/master/labs/lab6/fork.png)

*Note: If you are part of a group on GitHub, it may ask you where you want to fork the repository. If it asks you this,
just fork it into your personal GitHub.*

Forking simply makes a copy of the repository in your own account so that you have permission to make changes. After
forking, you should be in a new repository. The title of the repo at the top left should be "*your username*/snake"
instead of "leviathan747/snake"

Now on the right side of the screen click the button to copy the clone URL to your clipboard. Make sure that you have selected
the HTTPS option. 

![] (https://raw.githubusercontent.com/Purdue-CSUSB/CSToolsCourse/master/labs/lab6/clone.png)

*Note: There are other protocols to do this (some of them more convenient than HTTPS). If you'd like to learn how
to set up SSH keys to use SSH to clone you can learn more [here](https://help.github.com/articles/generating-ssh-keys/) (please
do this on your own time).*

Finally, in your terminal:
    
    git clone <clone URL>

where *clone URL* is the URL you just copied to your clipboard.

## Step 0: The project

The project we will be working with is actually an open source project that I wrote when I was a freshman and then revamped
on GitHub last Summer/Fall. It's a web hosted snake game. If you've ever played snake on an old Nokia phone, this will be
very familiar to you.

To run the game, navigate into the `snake/play` directory and run the command:

    python -m SimpleHTTPServer 8000

then go to your browser and type "http://localhost:8000" into the address bar. Familiarize yourself with how the game works.
The project page can be found at http://levistarrett.com/snake.

Press Ctrl-C to stop the python server.

## Step 1: Check the status of the repo

Run `git status`. You should see some output that looks like this:

```
On branch master
Your branch is up-to-date with 'origin/master'.
nothing to commit, working directory clean
```

Now run `git log`. You should see a list of all my commits from last year. Note: it will open in a program called less. Press
'q' to exit.

## Step 2: Make a change

When I wrote snake, I designed it with the ability to add cheat modules. Let's add a new one! Ours won't be very useful. It'll
just be a behavior to make the snake zig zag.

Use `wget` to download the file `zigzag.js` into the `snake/play/js/cheat/` directory. `zigzag.js` can be found at 
https://raw.githubusercontent.com/Purdue-CSUSB/CSToolsCourse/master/labs/lab6/zigzag.js

Open up `index.json` in the `snake/play/js/cheat/` directory and add an entry for your new cheat module. You will need to provide
a name and description for your module. The name should be "zigzag.js" (matches the name of the JavaScript file).

Run `python -m SimpleHTTPServer 8000` again and refresh your browser window. Try loading and enabling your new cheat. Instructions
on how to do this can be found at http://levistarrett.com/snake

Let's check the status of our git repo.
* Run the status command. You should see that `zigzag.js` is an untracked file and `index.json` has been modified. Now we need to 
add them to be committed.
* Run `git add .` This will add all our files to the staging area.
* Run `git commit -m "<your commit message here>"` with a nice descriptive commit message.
* Run `git log` and you should now see both of your commit. You're well on your way to becoming a git pro!

__DON'T MOVE ON TO STEP 3 UNTIL YOU MAKE SURE YOU COMMIT YOUR CHANGES__ (check your git log).

## Step 3: Make another change

Now let's change the color of the food from red to green.

Open `style.css` within the `snake/play/css/` directory in your editor. On line 32, change the "background-color" from "red"
to "#00FF00".

Restart the python server, refresh your browser and see that the color has changed. If you get stuck make sure you ask a TA
to help you.

Now with git:
* Add the changes to `style.css`
* Commit your changes.
* Check your git status and git log

You're getting fluent at these git commands
already!

__Pro tip: You can never overuse the *log* and *status* commands. You should be looking at these between
almost every command__

__DON'T MOVE ON TO STEP 4 UNTIL YOU MAKE SURE YOU COMMIT YOUR CHANGES__ (check your git log).

## Step 4: A step backwards

Now that you're this far you decide that you want the food to be red again instead of green.

Run `git log`. Find the commit that you just committed (it should be the top one) and copy the commit hash.

Run `git revert <commit_hash>`. This will open up an editor with a commit that says something like
"Revert '*some message*' This commit reverts *some commit hash*".

**Important Note!**

If it opens in vim, then follow these steps to save the file and return to the nice familiar terminal.

1. Don't panic
2. type `:wq`

    > For the curious: the colon allows you to type commands, w is for write, and q is for quit.

3. You have now committed!


Restart the python server again and refresh. The food should be back to red!

__Give your neighbor a high five, you just did some serious source control.__

## Grading

Show your TA your git log.

## Step 5: Extras!

Here are some practical things you could do with git if you have extra time:

* Work on your .gitconfig file. Some useful information here: http://git-scm.com/docs/git-config
* Put your CS 180 project into a git repository!

    > Please don't put your CS 180 projects into public repos on GitHub. Make sure it's in a private repo

* If you want, write a real cheat module for snake and submit a pull request. I'd love to see what you guys can
come up with!
* Ask your TA a question about something you don't understand.
