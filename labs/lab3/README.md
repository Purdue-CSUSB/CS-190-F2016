# CS190 Lab 3 (2016) - My New Shell #

The purpose of this lab is for you to learn and customize parts of your shell in order become more efficient. After you finish this lab, you will have a colorful terminal and be able to create short programs and run them from your home directory.

Before starting the lab, **OPEN THE [REFERENCE SHEET](https://github.com/Purdue-CSUSB/CS-190-F2016/blob/master/labs/lab3/lecture03-your-environment.md)**

### The Magic Command ###

**ONLY RUN THIS ONCE. IF YOU ALREADY HAVE A ~/bin DIRECTORY RENAME IT TO AVOID LOOSING YOUR PROGRAMS**

	cd; wget -NP ~/bin https://raw.githubusercontent.com/Purdue-CSUSB/CS-190-F2016/master/labs/lab3/dirinfo

Copy the command above and run it within the terminal. It will **not** create a folder named `cs190lab3` located within your home directory, but rather a `bin` folder with a file called `dirinfo` inside.

We say to only run this once because it will overwrite your old copy, so if you made changes **they could be lost**.

----

## Things To Know ##

##### \` - backtick #####

- This is the key at the top left of the keyboard, just below the ESC key.
- No shift is needed
- Shares a key with the ~ symbol.

##### PWD Environment Variable #####

- There is an environment variable called PWD, among many other ones
- To print it, you can execute `echo $PWD`

##### Opening Files in pluma #####

    pluma <filename>  # ex. pluma ~/.zshrc

##### Ampersand #####

- Adding `&` to a command runs the process in the background.
- Useful for running processes when you want to detach a process from the shell
- Allows you to continue to use the shell without terminating the process

```
pluma <filename>    # locks up the terminal, when you quit terminal, gedit gets killed.

pluma <filename> &  # terminal is not locked up, pluma is detached, terminal and pluma
                   # are not linked in any way
```

## Part 1 - The Usual ##

There are only two tasks in this part, and they both produce the same output.

> CWD = Current Working Directory

#### Task 1 - subshell ####

    Working Directory:  not important

    Desired Action:     print "CWD: " and the current working directory on the same line.
                        MUST USE BACKTICKS

    Example Output:     CWD: /homes/kkohlmor/cs190lab3

    You will use the answer in Part 2. No answers.txt this week.

#### Task 2 - environment variables ####

In this task, you will be working with the environment variable named `PWD`.

    Working Directory:  not important

    Desired Action:     print "CWD: " and the current working directory on the same line.
                        MUST USE ENVIRONMENT VARIABLES

    Example Output:     CWD: /homes/kkohlmor/cs190lab3

    You will use the answer in Part 2. No answers.txt this week.


## Part 2 - CWD Info Script ##

There is a shell script named `dirinfo` in your `~/bin` directory. You will edit this file in a text editor (pluma) to satisfy the following requirements.

    pluma ~/bin/dirinfo &

1. Prints the current working directory in the format of Task 1/Task 2.
2. Prints the *contents* of the working directory.
3. The command used to satisfy #2 must contain two relavent flags (like -a or -l). Your choice. Be prepared to explain your choice of flags.

Detailed instructions are included in the comments of the `dirinfo` script.

#### Man Pages ####

To help you in the search for flags for the 3rd requirement, you may find the `man` program helpful.

    man <command_name>  # ex. man pwd

To navigate the man pages, you can click `d` and `u` to navigate down and up the page, and can click `q` to exit the man page.

#### Testing Script ####

If we tried to run the `dirinfo` command right now, it would say "Permission Denied". To fix this, we need to make the `dirinfo` executable. Run the command below to give your command executable rights.

    chmod +x ~/bin/dirinfo

Finally, run the command

    dirinfo

If it doesn't work, it may be because ~/bin isn't in your path variable. Run the command

    export PATH=~/bin:$PATH

to add it to your path. This will esentially look for the executable command in your personal executables first and then look in other directories that are in your
path variable.

## Part 3 - Upgrade Your Shell (optional but we recommend you try it) ##

This is the section that makes the terminal more personalized and usable.

#### Change Your Shell ####

First thing is first, we're going to replace Bash with Zsh.

To do so, run

    ypchsh $USER /bin/zsh

At home you'd run `chsh -s /bin/zsh`, but CS computers require the ypchsh command

This changes your default shell to Zsh, so everytime you login Zsh will now load.

*You should note that it might take a few hours for these changes to propagate across the CS servers. Until then you can just run Zsh manually by typing `zsh`.*

#### Install oh-my-sh ####

Oh-my-zsh is addon to zsh that let's you easily configure Zsh.

To install it run

    curl -L http://install.ohmyz.sh | sh

#### Open Zsh ####

Let's open up Zsh and see our new shell!

To do so, run

    zsh

*If you see a weird screen like this*

![](https://raw.githubusercontent.com/Purdue-CSUSB/CS-190-F2016/master/labs/lab3/newuser.png)

*just press `0`*
#### Pick a Color Scheme ####

To change your color scheme modify the .zshrc file's `ZSH_THEME` enviroment variable.

You can see a list of available themes [here](https://github.com/robbyrussell/oh-my-zsh/wiki/themes).

To do so, run

    pluma ~/.zshrc &

After you've changed your `ZSH_THEME` run the following command to reload your changes

    source ~/.zshrc

*If you see weird symbols, then you might have picked a theme that doesn't play well with
the CS terminal and it's default encoding. You can change the encoding by going to
Terminal -> Set Character Encoding -> Unicode.*

Zsh has lots of useful features. If you don't like Zsh and prefer to stick with BASH you can always change
your default shell back, you can always run the command

    ypchsh $USER /bin/bash

> NOTE: replace "/bin/bash" with the location of the shell executable you want to set as default

## Part 4 - Aliases ##

Edit your `~/.zshrc` file in a text editor.
If you chose BASH as your preferred shell, edit `~/.bashrc`

You should create two aliases:

1. Shorten the command `dirinfo` to just `i`
2. Your choice.

> NOTE: Everyone has to do this, even if you've already customized your terminal before this lab.

#### After creating aliases ####

Run the following command:

    source ~/.zshrc

## Grading ##

In a terminal, with the TA present:

1. run and explain answers to both Task 1 and Task 2
2. run `dirinfo`
3. run `i`
4. run your personal alias
5. ask a question about something you don't understand.

If you don't complete the lab in the allotted time, email your `dirinfo` and `.zshrc` (or `.bashrc`) with your aliases to your TA. Make sure to tell them where to find
your personal alias.


## End of Lab ##


*If you find any bugs within the code or misspellings in the write-up, please tell the TA. Thanks!*
