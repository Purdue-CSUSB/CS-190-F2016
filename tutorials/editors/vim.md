Copyright 2015 [Scott Opell](http://scottopell.com)

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


### Buffers

A `buffer` is vim's word for an open file. But that's not quite right. If you
have a new tab or new file that you haven't saved yet, that is also a buffer.

If you need to get a new buffer in your current tab/split (both covered below),
you can use `:enew` to create a new buffer in place of the current one. If you
haven't saved your buffer and you have changes, then vim won't let you throw
those changes away unless you add a bang `:enew!`

Finally, all of the commands covered in the very first section (`:w`, `:wq`,
`:q`, etc), are actually acting on the current buffer. Find an expanded list
below.

sequence     | result
----------   | -------
`:q`         | quit
`:q!`        | quit without saving
`:wq`        | save (write) and quit
`:w`         | save (write)
`:e <file>`  | opens `<file>` in the current buffer
`:e! <file>` | opens `<file>` in the current buffer and discards the current contents
`:qa`        | quit all open buffers (tabs/splits)
`:wqa`       | saves and quits all open buffers (tabs/splits)


### Tabs

Tabs are a pretty standard tool from any IDE, and you can rest easy knowing
that vim has you covered here too.

sequence        | result
----------      | -------
`:tabnew`       | creates a new tab to the right of your current tab
`:tabp` OR `gT` | switch one tab left
`:tabn` OR `gt` | switch one tab right
*n*`gt`         | go to the *n*th tab

> Note: on the `gt` and `gT` commands that there is no `:`, so you just hit one
after the other from normal mode

### Splits

Splits are useful for fitting more than one file onto the screen. You can do
either vertical or horizontal splits, and you can put as many splits as you
want.

> Super advanced, emulate @kirbyk's favorite setup with the vim plugin
`GoldenView`

sequence | result
-------- | -------
`:sp`    | Split the current buffer **horizontally** into two
`:vsp`    | Split the current buffer **vertically** into two
`ctrl + w l` | move to the buffer **right** of the current one
`ctrl + w h` | move to the buffer **left** of the current one
`ctrl + w j` | move to the buffer **below** of the current one
`ctrl + w k` | move to the buffer **above** of the current one

In my opinion, having to hit `ctrl + w` before each split movement command is
really annoying. Add the following lines to your `~/.vimrc` file to map
ctrl + l to move right, ctrl + h to move left, etc.

```vimL
"  vim splits
" easier mappings for switching panes
nnoremap <C-J> <C-W><C-J>
nnoremap <C-K> <C-W><C-K>
nnoremap <C-L> <C-W><C-L>
nnoremap <C-H> <C-W><C-H>
```

### Macros
Macros are one very unique feature of vim that are very powerful, but quite
intimidating at first. Try not to feel too intimidated by these, start out
with small easy tasks and work your way up.

Macros let you record a sequence of commands and replay them over any text.
One use case would be if you wanted to change a list formatted like this

```
Best Editors
1) vim
2) any other editor with vim mode
3) nano
43) jk about nano
```

to this

```
Best Editors
- vim
- any other editor with vim mode
- nano
- jk about nano
```

This macro would look something like this.
1. start recording by hitting `qt` (`t` is a random letter, we'll come back
to this)
this macro in (pick any letter).
2. If you hit `f` then `)`, this will `f`ind the first `)` character in the
current line.
3. Next hit `l` to move after the `)`
4. Do `c^` to delete all the text to the left until the beginning of the line
AND move into insert mode
5. Type a '-'  to get the new formatting
6. Exit insert mode (ESC)
7. Move down one line (`j`)
8. Hit `q` to stop recording the current macro

Now you can replay this macro with `@t`

AND, to automate this further, if you have 10 lines you want to do this for,
you can do `10@t`, which will play this macro over 10 times

A few things to note from this example, instead of using absolute movements
(move 2 characters right), we use anchors throughout the text, to that for
numbers with more than one digit, this still works.

Another is going down one line at the end, this allows us to replay this macro
multiple times, otherwise it would just do everything on the same line. We
could have avoided this by using a find command (`/)`) instead of `f`, but I've
found this is a good habit to get into.

sequence | result
---------| ------
`q`*letter* | start recording a macro into the register called *letter*
`@`*letter* | play back the macro at *letter* from the current position
*n*`@`*letter* | play back the macro at *letter* from the current position *n* times


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
