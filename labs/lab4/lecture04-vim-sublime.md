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
- **:*n*** &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;go to the ***n***th line in the file.

### Sublime Text

#### Navigate Menus

Ctrl+Shift+P

![](https://lh3.googleusercontent.com/lWKRb-vbmv5s4gnj06Q-bruj69cstggvdpy1WACQZ83w0GZBGSUaYO4ONwaN1ROh4AUiC5uiL8D4mvypHRt0g-o4QDTxBogtRhqwyIorQp17LHj6awOAEgJIoJvhNSJ5JEnB)

#### Navigate Files

Ctrl+P <Filename>

![](https://lh3.googleusercontent.com/9TOajRRn3ppq0JaPzD8R6HkhwIahYukJ_-qlpxisWcdzdMQXbCmx40ziTVy6G954DhWbK78rx8DoMmU-blKwo3b52eF8wpnoNDGvNv-a0hC9VjZclK-EPUO4y4xoHC9sBNe-)

#### Finding Functions in Files

Ctrl+P @<Function Name>

![](https://lh5.googleusercontent.com/f1ljv2-wF7sC0m4zu9htMdzHQMbqFVVyVgCeTB5GUuVTg5UrIlB2xRlCyo6Gnho-DTHqwLEolAb7yW7wVKer3GFh8ojI0F1Y55UMk8QIeABYE9Z0sNzeqD0lH4li4IRLpUyc)

#### Package Control

Package control lets you install plugins for Sublime on the fly. You can install it by going to [https://sublime.wbond.net/installation](https://sublime.wbond.net/installation).

Ctrl+Shift+P "Package Control"

![](https://lh4.googleusercontent.com/HlKWIM3hZUFyjvgA9P7hBiv9k9lswc7mrkhGVtsqlBlKkjfwXjlF1JIKTz8tnsnOKiJGLEgzKLgFUMzzIvxwiGpyJFM6fMvzbJoKjVE_s1CkT0QnK-YRyvE0JLkkj3b8ct5D)

After selecting "Install Package," you type the name of the package you want to install, and click enter.

#### Multiple Cursors

Multiple Cursors are incredibly useful. Naturally, they let you select multiple blocks of text and type at the same time.

There are two ways to get multiple cursors.

- Selecting text and hitting `Ctrl+D`

![](http://i.imgur.com/62RS0C8.gif)

- Selecting lines and hitting `Ctrl+Shift+L`

![](http://i.gyazo.com/9cf79c9957945b0ff56aa9e8bb240939.gif)
