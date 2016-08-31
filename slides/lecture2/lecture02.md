# CS 190: Tools
### September 6, 2016 <!-- .element: class="subtitle" style="text-align: center"-->



# Welcome back!
![more terminal](assets/kanye.png) <!-- .element: class="center" style="width: 50%"-->


# First, some review <!-- .element: style="text-align: center"-->


## Quiz 2.1
What do `.` and `..` represent in your terminal, respectively?

A. The end of a command and a "wildcard."

B. The home directory and "back" one directory.

C. The current directory and the parent directory.

D. The system root directory and the configuration folder.


Reminder...

| symbol | what it does                           |
| ------ | -------------------------------------- |
| `*`    | wildcard (matches anything)            |
| `..`   | parent directory (up one folder)       |
| `.`    | current directory (you are here)       |
| `cd -` | go back (like in your browser)         |
| `~`    | home directory (you live here)         |
| `/`    | root directory (everything lives here) |



# More terminal tips


## Tab completion
```
# use tab to have the terminal finish commands for you
~ » ls some_rea<tab>

# becomes...
~ » ls some_really_long_folder_name

# most shells will let you know if there are multiple matches
~ » cp file<tab>
file1 file2 file3
```
<!-- .element: class="hljs nohighlight"-->


## History
```
# use the up arrow to navigate through the history of previous commands
~ » <up-arrow>

# becomes...
~ » cp file1

# use bang bang to substitute the last command
~ » echo !!

# becomes...
~ » echo cp file1
```
<!-- .element: class="hljs nohighlight"-->



# Input and Output


- The terminal functions on a system of input and output.
- Users input commands, terminals output results (or take some kind of action).


## Standard Input
- The standard input stream, or "`stdin`," is the default input source for the terminal.
- Commands you type at the shell prompt feed into `stdin`.
- Most programming languages offer constructs to interface with `stdin`, such as Scanner in Java.


## Standard Output
- The standard output stream, or "`stdout`, " is the default place for the terminal to display output.
- Almost everything you see on your terminal is from `stdout`.
- Printing functions in programming languages rely on `stdout`, like Java's System.out family of methods (`println`, `printf`).



## Redirection
```
# use < to change the source for stdin
~ » java Statistics < numeric_data

# and use > to change the destination for stdout
~ » ls > list_of_files

# or use both at once
~ » java Tumblr < sadness > memes
```
<!-- .element: class="hljs nohighlight"-->


## Pipes
```
# pipes let you feed the output of one command to the input of another

# see if a specific file is in a specific folder
~ » ls folder_with_lots_of_files | grep a_very_special_file

# get the number of lines of code for your lab
~ » cat Code.java | wc -l
```
<!-- .element: class="hljs nohighlight"-->

