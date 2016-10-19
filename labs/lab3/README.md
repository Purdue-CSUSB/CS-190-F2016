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

There are only two tasks in this part, and they both produce the same output. **There is no answers.txt for this lab**, but you should remember these answers for part 2. 

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

There is a shell script named `dirinfo` in your `~/bin` directory. You can edit this file in a text editor (like pluma). 


1. Under "Command A", add the code to print the current working directory like you did in Part 1. 
2. Under "Command B", add the code to print the *contents* of the working directory. You have used this command before! 
3. Add two flags to command B (like -a or -l). You can pick any flags you want, but be prepared to explain what they do. If you don't know any flags, check the `man pages` section below. 


Detailed instructions are included in the comments of the `dirinfo` script.

Remember that you can open the file using this command:

    pluma ~/bin/dirinfo &

#### Man Pages ####

The `man` program will give you instructions for most other programs. It also explains which flags do what. If you ever need to look up flags to use with a command, just run this code:

    man <command_name>  # ex. man pwd

To navigate the man pages, you can type `d` and `u` to navigate down and up the page, and can type `q` to exit the man page.

#### Testing the dirinfo Script ####

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

If you are still using Bash, run the following command:

    source ~/.bashrc

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
