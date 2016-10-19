# CS190 Lab 4 (2016) - Vim & Sublime #

The purpose of this lab is for you to learn the basics of Vim and Sublime Text. After you finish this lab, you will have a much better understanding of text editing for programming

Before starting the lab, **OPEN THE [REFERENCE SHEET](https://github.com/Purdue-CSUSB/CS-190-F2016/blob/master/labs/lab4/lecture04-vim-sublime.md)**

## Part 1 - Vim

### Setup

**NOTE: Don't do this if you already have a .vimrc customized to your liking!!!**
```bash
wget -nc -O ~/.vimrc https://raw.githubusercontent.com/Purdue-CSUSB/CS-190-F2016/master/labs/lab4/vimrc
```

We will be working with the DrJava source code again this week. If you are working remotely (through ssh) make sure you have X11 forwarding enabled. If you forget how to do this, follow the setup instructions from [lab 2](https://github.com/Purdue-CSUSB/CS-190-F2016/tree/master/labs/lab2)

We have seeded the DrJava source code with some bugs that you will use your editing skills to fix. Run this command to download the buggy source code:

```bash
wget -N -P ~ https://raw.githubusercontent.com/Purdue-CSUSB/CS-190-F2016/master/labs/lab4/buggy-drjava.tar.gz
```

Extract the code in your home directory by running the command:

```bash
tar -zxvf ~/buggy-drjava.tar.gz -C ~
```

### Fixing DrJava

#### Attempt to compile DrJava

First we will try to compile DrJava to see that it is in fact broken.

* Tell ant where Java 8 is:

```bash
export JAVA8_HOME=/opt/oracle-jdk-bin-1.8.0.92/
```

* Compile DrJava by running the command:

```basn
cd ~/drjava; ant jar
```

* You should see a lot of compile errors

#### Fix spelling error

The first bug that we will fix is a spelling error in `DrJava.java`

* Navigate to the `~/drjava` directory. Open `DrJava.java` with the command:

```bash
vim src/edu/rice/cs/drjava/DrJava.java
```

* The problem is that each "static" keyword is misspelled as "statc". Use a vim command
to replace all instances of "statc" to "static" in this file (Hint: you can find how do do this in the [lecture slides](https://docs.google.com/presentation/d/1p5Bsy503w449pXEM6EkqNOje-rfHVAaIwB3gPkcwplc/edit?usp=sharing))

#### Fix logical error

The next problem we have is a logical error causing the quit dialog to be completely bypassed (even if there are unsaved changes).

* From the `~/drjava` directory, open `MainFrame.java` with the command:

```bash
vim src/edu/rice/cs/drjava/ui/MainFrame.java
```

* From within vim, navigate to line 5329 with a single command (i.e. don't just hold `j` until you get there)

* On this line, remove the `&& false` from the `if` statement. (Hint: you can do this in command mode or insert mode)

* Write a comment on this line explaining the edit that you made (Hint: now you must use insert mode)

#### Recompile and test

Recompile DrJava with the command:

```bash
cd ~/drjava; ant jar
```

Run DrJava with this command and verify that your changes fixed the bugs:

```bash
java -jar drjava.jar
```

## Editing the .vimrc (optional) ##

### What is the .vimrc? ###
The vimrc file contains optional runtime configuration settings that get loaded each time Vim is run. This means that what ever the settings you have in this file, they will be executed when Vim is started.

For part two we will add a couple of settings to your .vimrc that maybe useful.

1. Open `~/.vimrc` with Vim
    ```bash
    vim ~/.vimrc
    ```
![If you downloaded the .vimrc during setup it should look like this:](https://github.com/Purdue-CSUSB/CS-190-F2016/raw/master/labs/lab4/vimrc1.png)

2. Jump to the bottom of the file using `Shift + g`.

3. Jump to the end of the line by typing `$`.

4. Press `o`, this will put you in *Insert Mode* and add a new line under your cursor. This is one of vim's MANY handy shortcuts.

5. On this newly created line, in *Insert mode* (you should be from the last step), paste the code below on that line.

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

3. Now save the file and quit:
    ```
    <ESC>
    :wq
    ```
4. Now open the file again in vim and you should see the current cursor position in the lower right of the window.

![It should look similar to this](https://github.com/Purdue-CSUSB/CS-190-F2016/raw/master/labs/lab4/vimrc2.png)

## Part 2 - Sublime

### Setup

First create a directory for the lab in your home directory (no more magic command, you should be able to do this by
yourself with `mkdir`).

Download `animals.txt` and `animal-stats.rb` using `wget`. The URLs are:

```
https://raw.githubusercontent.com/Purdue-CSUSB/CS-190-F2016/master/labs/lab4/animals.txt
and
https://raw.githubusercontent.com/Purdue-CSUSB/CS-190-F2016/master/labs/lab4/animal-stats.rb
```

Next you need to install Sublime on your system. Run the following commands:

```bash
mkdir -p ~/bin
wget https://download.sublimetext.com/sublime_text_3_build_3126_x64.tar.bz2    
tar jxf sublime_text_3_build_3126_x64.tar.bz2 -C ~/bin
PATH=$PATH:$HOME/bin/sublime_text_3
```

Run Sublime with `sublime_text &`

> If you want this to work permanently, add `export PATH=$PATH:$HOME/bin/Sublime\ Text\ 2` to the end of your .zshrc (or .bashrc if you are using bash).


In this part of the lab you are given two files `animals.txt` and `animal-stats.rb`. Your goal is to use Sublime to edit `animals.txt`, so you can insert it into `animal-stats.rb`, so that it can run properly.

### Multiple Cursors & Animals.txt

`animals.txt` is a huge list of animals, you need to convert it into an `Array` of `Strings` like so.

![](https://github.com/Purdue-CSUSB/CS-190-F2016/raw/master/labs/lab4/sublime7.png)

to

![](https://github.com/Purdue-CSUSB/CS-190-F2016/raw/master/labs/lab4/sublime8.png)

Once you have this array, you need to copy and paste it into `animal-stats.rb` like so.

![](https://github.com/Purdue-CSUSB/CS-190-F2016/raw/master/labs/lab4/sublime9.png)

Then you can run `ruby animal-stats.rb`!

Hints:
* Use the reference sheet to put a cursor on every line of `animals.txt`
* Use all the cursors at once to add quotes and commas
* Use the arrow keys to move all the cursors forward one character (to the beginning of the next line)
* Use backspace to delete all the newlines at once
* If you get stuck ask your TA for a hint

## Grading

1. Run this command to show your comment on line 5329 of MainFrame.java to your TA.
    `sed -n '5320,5340p' ~/drjava/src/edu/rice/cs/drjava/ui/MainFrame.java`

2. Run your DrJava and show the TA that you fixed the bugs. `cd ~/drjava && java -jar drjava.jar`

3. Check output of ruby program (`ruby animal-stats.rb`), output should look like this:

```
There are 591 animals with an average letter count of 10.
Here are the beginning letter frequency of all of the animals:
"A"=>51
"B"=>66
"C"=>54
...
```

## End of Lab ##


*If you find any bugs within the code or misspellings in the write-up, please tell the TA. Thanks!*
