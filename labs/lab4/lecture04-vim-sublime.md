# lecture4 #

## Vim and Sublime

Below, I have listed examples of the many common commands and use cases for Vim and Sublime Text

### Vim ###

#### Opening and closing files

To open a file in vim, just type 

```bash
vim <filename>
```

To save and exit files, you must be in command mode (click esc). You must type the `:` before each of the lettered commands.

- **:q** &nbsp;&nbsp;&nbsp;exit editor
- **:w** &nbsp;&nbsp;&nbsp;save changes
- **:wq** &nbsp;save changes and exit editor
- **:q!** &nbsp;&nbsp;&nbsp;force quit editor without saving changes


#### Moving through the text

- **h** &nbsp;&nbsp;move the cursor to the left
- **l** &nbsp;&nbsp;&nbsp;move it to the right
- **k** &nbsp;&nbsp;move up
- **j** &nbsp;&nbsp;&nbsp;move down
- or use the arrow keys
<br>
- **^** &nbsp;&nbsp;&nbsp;move the cursor to the begnning of the line
- **$** &nbsp;&nbsp;&nbsp;move the cursor to the end of the line
- **gg** &nbsp;move the cursor to the beginning of file
- **G** &nbsp;&nbsp;&nbsp;move the cursor to the end of the file

#### Get into Insert Mode

- This will allow you to type and make changes just like you would in gedit or similar
- **i** &nbsp;&nbsp;insert mode 

> To exit editing mode, press `ESC` key.

#### Editing Text in Command Mode (The Basics)
- **dd** &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;will delete current line
- ***n* dd** &nbsp;&nbsp;will delete ***n*** lines including and below current line
- **dw** &nbsp;&nbsp;will delete the word to the right of the cursor
- ***n* dw** &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;will delete ***n*** words to the right of the cursor
- **x** &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;will delete letter highlighted by the cursor 
- **:n** &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;go to the ***n***th line in the file.

### Sublime Text

#### Navigate Menus

Ctrl+Shift+P

![](https://github.com/Purdue-CSUSB/CS-190-F2016/raw/master/labs/lab4/sublime1.png)

#### Navigate Files

Ctrl+P <Filename>

![](https://github.com/Purdue-CSUSB/CS-190-F2016/raw/master/labs/lab4/sublime2.png)

#### Finding Functions in Files

Ctrl+P @<Function Name>

![](https://github.com/Purdue-CSUSB/CS-190-F2016/raw/master/labs/lab4/sublime3.png)

#### Package Control

Package control lets you install plugins for Sublime on the fly. You can install it by going to [https://sublime.wbond.net/installation](https://sublime.wbond.net/installation).

Ctrl+Shift+P "Package Control"

![](https://github.com/Purdue-CSUSB/CS-190-F2016/raw/master/labs/lab4/sublime4.png)

After selecting "Install Package," you type the name of the package you want to install, and click enter.

#### Multiple Cursors

Multiple Cursors are incredibly useful. Naturally, they let you select multiple blocks of text and type at the same time.

There are two ways to get multiple cursors.

- Selecting text and hitting `Ctrl+D`

![](https://github.com/Purdue-CSUSB/CS-190-F2016/raw/master/labs/lab4/sublime5.gif)

- Selecting lines and hitting `Ctrl+Shift+L`

![](https://github.com/Purdue-CSUSB/CS-190-F2016/raw/master/labs/lab4/sublime6.gif)
