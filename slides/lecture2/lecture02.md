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

D. The system root directory and the meme folder.


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