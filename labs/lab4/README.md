# CS190 Lab 4 - Vim, Sublime, & Tmux #

The purpose of this lab is for you to learn the basics of Vim, Sublime Text, and Tmux. After you finish this lab, you will have a much better understanding of text editing for programming and terminal management.

Before starting the lab, **OPEN THE [REFERENCE SHEET](https://github.com/Purdue-CSUSB/CSToolsCourse/blob/master/labs/lab4/lecture04-vim-sublime.md)**

### The Magic Command ###

```bash
cd; curl -S https://raw.githubusercontent.com/PurdueCS190/lab8/master/init.sh | bash
```

### Part 1 - Vim

NOTE: Don't do this if you already have a .vimrc customized to your liking!!!
```bash
wget -O ~/.vimrc https://raw.githubusercontent.com/PurdueCS190/lab8/master/vimrc
```

## Part 1 - Editing example files with vim ##

**NOTE: DO NOT USE INSERT MODE UNLESS TOLD TO DO SO. USE THE COMMANDS DESCRIBED TO FIX THE ERRORS.**

----

### errors.txt ###

This file contains duplicate lines, words, and misspellings that need to be fixed. You need to edit this file using Vim and fix the errors.

You can find the commands in the Vim Cheatsheet.

> This is the time you should probably open up the [Vim Cheatsheet](https://github.com/PurdueCS190/syllabus/blob/master/lecture08-vim-sublime-tmux.md) mentioned in the beginning of the lab :)

1.  Open `errors.txt` in Vim
    ```bash
    vim errors.txt
    ```
    ![Original File](http://i.imgur.com/qQeNKfY.png)

    The file originally looks like the above text. As you can see there are multiple errors in this text file, such as lines 3-6 being duplicated and lines 8 having a mispelled 'I'.

2.  **Remove duplicate lines**

    > BIG HINT: The commands listed here correspond to commands that can be found in the [Vim Cheatsheet](https://github.com/PurdueCS190/syllabus/blob/master/lecture08-vim-sublime-tmux.md), most are under the section "Editing Text in Command Mode"

    ```
    GOAL:       Remove duplicated lines appearing on lines 4 and 5.
    COMMANDS:   delete current line, delete n lines.
    ```

    ![After removing duplicated lines](http://i.imgur.com/4B8EFn2.png)

3.  **Remove duplicate words**
    ```
    GOAL:       Remove duplicated words appearing on line 5
    COMMANDS:   delete word, delete n words
    ```

    ![After deleting duplicated words](http://i.imgur.com/lDA7Xpu.png)

3.  **Fix misspellings**
    ```
    GOAL:       Remove characters causing misspellings on lines 6 and 7.
    COMMANDS:   Remove character
    ```

    ![After fixing simple misspellings](http://i.imgur.com/gXR1KCt.png)

4.  **Save the file and quit**
    ```
    :wq
    ```
----

### jump_around.txt ###

This is a really long file...actually a book called The Young Engineers. There are little messages interleaved in the middle.

1.  Open `jump_around.txt` in Vim.
2.  Press `G` (shift and g at the same time) to go the very end of the file
3.  Type `gg` to go to the beginning of the file
5.  Type `:462` to go to line 462. Mark down the name of Chapter II found on this line.
6.  Type `:3403` to go to line 3403.
7.  Type `$` to go to the end of line 3403.
8.  Type `^` to go to the beginning of line 3403.
9.  Hit `i` to go into insert mode.
10. Add the word "BoilerMake" to the end of this line.
11. Save and quit this file. HINT: (w)rite and (q)uit

## Part Two - Editing the .vimrc ##

### What is the .vimrc? ###
The vimrc file contains optional runtime configuration settings that get loaded each time Vim is run. This means that what ever the settings you have in this file, they will be executed when Vim is started.

For part two we will add a couple of settings to your .vimrc that maybe useful.

1. Open `~/.vimrc` with Vim
    ```bash
    vim ~/.vimrc
    ```
![If you downloaded the .vimrc during setup it should look like this:](http://i.imgur.com/0O6bRKg.png)

2. Jump to the bottom of the file using `Shift + g`.

3. Jump to the end of the line by typing `$`.

4. Press `o`, this will put you in *Insert Mode* and add a new line under your cursor. This is one of vim's MANY handy shortcuts.

5. On this newly created line, in insert mode(you should be from the last step), paste the code below on that line.

    > If you try and paste code without being in *Insert Mode*, each character that is part of the
    > pasted string will act as input to Vim.
    >
    > e.g., if you paste the word `insert` while still in *Command Mode*, `i` will trigger *Insert Mode* and then `nsert` will be written in the file.

    ```VimL
    " Always display the current cursor position in the lower right corner of the Vim window.
    set ruler
    " Press space to clear search highlighting and any message already displayed.
    nnoremap <silent> <Space> :silent noh<Bar>echo<CR>
    ```

3. Now save the file and quit
    ```
    <ESC>
    :wq
    ```
4. Now open the file again in vim and you should see the current cursor position in the lower right of the window.

![It should look similar to this](http://i.imgur.com/ENnvQXA.png)

### Part 2 - Sublime

#### Setup

First you need to install Sublime on your system. Run the following commands

```bash
mkdir -p ~/bin
wget http://c758482.r82.cf2.rackcdn.com/Sublime%20Text%202.0.2%20x64.tar.bz2
tar jxf Sublime\ Text\ 2.0.2\ x64.tar.bz2 -C ~/bin
PATH=$PATH:$HOME/bin/Sublime\ Text\ 2
```

Run Sublime with `sublime_text &`!

> If you want this to work permantetly, add `export PATH=$PATH:$HOME/bin/Sublime\ Text\ 2` to the end of your .zshrc.


In this part of the lab you are given two files `animals.txt` and `animal-stats.rb`. Your goal is to use Sublime to edit `animals.txt`, so you can insert it into `animal-stats.rb`, so that it can run properly.

#### Multiple Cursors & Animals.txt

`Animals.txt` is a huge list of animals, you need to convert it into an `Array` of `Strings` like so.

![](http://i.imgur.com/ZM5k5GW.png)

to

![](http://i.imgur.com/Dvfy98c.png)

Once you have this array, you need to copy and paste it into `animal-stats.rb` like so.

![](http://i.imgur.com/7RjcXNt.png)

Then you can run `ruby animal-stats.rb`!

### Part 3 - Tmux

For part 3 of this lab you are to setup 2 tmux sessions, one called `rubyAndJava` and one called `vimtutor`. Here is an example of what you should see when you run `tmux ls`.

![](http://i.imgur.com/L8nT0mN.png)

For these 2 sessions you need to make them look like they do in the screenshots below.

#### The Task

First thing first, you need to rename this session to `rubyAndJava`.

Window #1

This window has 2 panes split horizontally with the top one being split again vertically. The top pane has a vertical split between two vim sessions with `attribute.rb` and `core.rb`, and the bottom one should just contain your default shell.

![](http://i.imgur.com/MZQjXrO.png)

Window #2

This window has only 1 pane with a vim session open with a vertical split of `PtrClassicDefaultHeader.java` and `PtrFrameLayout.java`.

![](http://i.imgur.com/MXDvFc7.png)

After completing this, detach this session!!
(Check cheatsheet for this)


## Grading
Have a terminal open in the lab directory when you call your TA over.

1. Check that errors.txt has no more errors.

2. grep for BoilerMake in the jump_around file
  ```
  grep -n "BoilerMake" jump_around.txt
  ```

3. Check output of ruby program (`ruby animal-stats.rb`), output should look like this

```
There are 591 animals with an average letter count of 10.
Here are the beginning letter frequency of all of the animals:
"A"=>51
"B"=>66
"C"=>54
...
```

4. Instruct the student to attach the tmux session from earlier (should be called `rubyAndJava`), then de-attach
