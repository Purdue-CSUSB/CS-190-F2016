# Vim
## About Vim
### Background Information
Vim was created as an improvement of vi, one of the oldest editors around.
Vi was created by Bill Joy in 1976 and has been ported to almost every platform
in existence. Vim (vi improved) was created in 1991 by Bram Moolenaar.

A core idea of vi and vim is modes. There are two main modes that
you'll spend 90% of your time in, and these are the two that we've already covered:

- Normal Mode (sometimes called command mode)
- Insert mode

The only other one that you may use in more advanced actions is called Visual Mode.

For more information on the different modes and their behaviors, check
[here](http://en.wikibooks.org/wiki/Learning_the_vi_Editor/Vim/Modes)

**Important Note**

Key sequences that start with a colon `:` need to be run from normal (command) mode.

Get to normal (command) mode by hitting `<ESC>`

As soon as you hit `:`, you'll see that your cursor will focus at the bottom of the screen.

From here, you just type whatever letters/symbols come AFTER the `:`

> Advanced: Technically this is a separate mode (the concept of modes will be 
> covered later)

> This mode is called command-line mode and you can get more information in
> `:help Command-line-mode`

**Another Important Note**

Unless otherwise stated, case matters! `n` is not the same as `N`

### Opening and closing files

To open a file in vim, just type

```bash
vim <filename>
```


sequence | result
-------  | ---------
`:q`   | exit editor
`:w`   | save changes
`:wq`  | save changes and exit editor
`:q!`  | force quit editor without saving changes


### Moving through the text

Moving relative to your cursor

sequence | result
-------  | ---------
`h`   | move left
`l`   | move right
`k`   | move up
`j`   | move down
or use the arrow keys


sequence | result
-------- | ---------
`w`        | move forward by word
`b`        | move backwards by word
`e`        | move forwards by word, putting your cursor at the end of each word
`}`        | move forwards by one paragraph
`{`        | move backwards by one paragraph
`ctrl + f` | move forwards by one page
`ctrl + b` | move backwards by one page



Note that all of these

Moving to an anchored location (not relative)

sequence  | result
--------- | -------
`^`    | move the cursor to the begnning of the line
`$`    | move the cursor to the end of the line
`gg`   | move the cursor to the beginning of file
`G`    | move the cursor to the end of the file


> More information and techniques can be found in the help file

> `:help movement`


### Get into Insert Mode

- Insert mode is what you'll spend most of your time in. Text that you type is inserted into the document normally, versus normal (command) mode where keys have special meanings.

sequence  | result
--------- | -------
`i`       | switch from normal (command) mode to insert mode

The following will go into insert mode, but they will all put your cursor at different spots.

sequence | result
-------- | ----------
`a`       | after the cursor
`A`       | at end of line
`i`       | before cursor
`I`       | before line
`o`       | Create new line below and start editing
`O`       | Create new line above and start editing
`gi`       | Place cursor where you were last editing (Useful for when you exit Insert mode and then need to go back where you once were)

- To exit insert mode, press `ESC` key.

### Editing Text in Normal Mode (The Basics)
sequence          | result
----------------- | -----------------
`dd`              | delete current line
*n*`dd`           | delete *n* lines including and below current line
`dw`              | delete the word to the right of the cursor
*n*`dw`           | delete *n* words to the right of the cursor
`x`               | delete letter highlighted by the cursor
`:`*n* OR *n*`gg` | go to the *n*th line in the file.


### Undo and Redo

sequence   | result
-----------|-----------------
`u`        | undo last action
`ctrl + r` | redo last action

## Advanced Tips and Tricks

This section is intended for people that are comfortable with the basics of
vim, or people that are curious about some of the more advanced features of vim.

### Search and Replace

#### Search
To find some text `needle`, from normal mode, do `/needle` and hit enter.

To find the next occurrence of this (search down further), hit `n`.
For the previous (search up), hit `N`

#### Replace

To replace `needle` with `vimrox`, you would do `:%s/needle/vimrox`. Note that 
this will only replace the FIRST occurrence of `needle` PER LINE.

If you want to replace every instance everywhere, you can add `g` at the end.

`:%s/needle/vimrox/g`


### Tabs
TODO

### Splits
TODO

### Macros
TODO

### Autocomplete
TODO

### The Jumplist

Vim keeps track of all the places in the file that you've jumped around to.
So if you're working in function `foo` and the you search for some other
function `bar`, then you can jump back and forth between the two by using the
commands below

sequence   | result
-----------|-----------------
`ctrl + o` | jump backwards
`ctrl + i` | jump forwards


## Plugins
TODO
