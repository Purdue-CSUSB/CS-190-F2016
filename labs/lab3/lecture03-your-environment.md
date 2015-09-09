# lecture3 #

## Your Environment ##

Below, I have listed examples of the many common commands and practices of the
shell. If you want to know more about specific commands, you can use man to
find out more information.

```bash
man find  # will return the man page about find. Press 'q' to get out of this page
```

Or just do what I did for this entire lesson and search The Google.

### Relevant Terminal Commands ###

#### which - locate where a program lives in the file system ####

```bash
# Instructions
# which <program>

which ls
# /bin/ls

which wget
# /usr/bin/ls

which bash
# /usr/local/bin/bash

```

### Environment Variables ###

Environment variables are temporary variables used inside your shell.
Some are set by the operating system ($USER, $CWD, etc). Some are
user specified. They're helpful storing information that you might
use a lot ($ANDROID_IP), or information that is needed for your
programs to run, but is too sensitive to put in your code ($DATABASE_PASSWORD).

#### Getting and Setting ####


```bash
# Print all of the environment variables to the screen
printenv

# Create and assign an environment variable
# <Variable Name>="<Value>"
NAME="kirby"

# Reference an environment variable
# $<Variable Name>
echo My name is $NAME
# My name is kirby
```

#### Important Environment Variables ####

Here are some important environment variables you should know about.

| Variable | Description |
| -------- | ------------|
| $HOME    | The home directory of the current user |
| $PATH    | Indicates search path for commands |
| $PWD     | The current working directory |
| $USER    | The current user |

#### The PATH ####

The $PATH variable is especially important. It is how your terminal knows
where your programs are. When you type `ls` in the terminal the OS searches
through your $PATH variable for possible directories for it.

Here is an example $PATH variable:

```bash
PATH=/homes/kkohlmor/bin/.amd64-linux:/homes/kkohlmor/bin:/usr/local/bin:/bin:/usr/bin:/sbin:/usr/sbin:/usr/x86_64-pc-linux-gnu/gcc-bin/4.6.3:/usr/games/bin:.
```

Colons are used to delimitate each directory for searching. The directories
are ordered with highest precedence first and lowest last.

Here is the same $PATH, but with each directory on a line

```bash
PATH=
/homes/kkohlmor/bin/.amd64-linux  # the OS will look for commands here first
/homes/kkohlmor/bin               # this is where you should install apps
/usr/local/bin                    # because it's in your home directory
/bin                              # unlike the other directories
/usr/bin
/sbin
/usr/sbin
/usr/x86_64-pc-linux-gnu/gcc-bin/4.6.3
/usr/games/bin
.                                 # and will look here last
```

### Backticks (Subshell) ###

Text between backticks is executed and replaced by the output of the command.

For example:

```bash
# if hello.txt contains "Hello World"
echo The contents of hello.txt are `cat hello.txt`.
# The contents of hello.txt are Hello World.

# you can do a lot more useful and complex things too

# if list_of_files.txt contains some files
# you can delete all of them this way
rm `cat list_of_files.txt`

# store files in an environment variable
FILES=`find . -name "Shape.java"`
```
