Copyright 2015 Ryan Everett (@Changer098)
![alt text](https://raw.githubusercontent.com/Changer098/CSToolsCourse/master/tutorials/other/nano_screen_files/nano_screen.jpg "Nano")
# Nano and screen

Nano is a user-friendly console based editor. Similar to vim, but much more user-friendly. Like vim, nano is keyboard-based and does not use a mouse. Unlike vim, navigation is done through the arrow keys and is always in insert mode. Nano is not by any means a vim replacement, nor is it more powerful. Nano is simply an easier alternative to vim, and sometimes faster to use.

## Basic use of nano
```sh
$ nano                          //opens a blank nano session
$ nano <filename.extension>     //opens a nano session to write to the specified file
```
Nano's UI displays the avaiable commands at the bottom, but the basic commands are as follows:

| Commands | Description     |
| -------- | --------------- |
| Ctrl + X | Exit            |
| Ctrl + O | Save file       |
| Ctrl + R | Load a new file |
| Ctrl + _ | Go to Line      |

# Actually using it
Consider a situation in which you've written some code on one computer and need to transfer it to another computer. You could save the code and transfer through various means, such as a flash drive or sftp. Or if you're already ssh'd into the machine, you could just paste the code into nano in all of about four actions. Consider you have the code below in Program.cs.
```c#
using System;
namespace HelloWorld
{
	class Program
	{
		static void Main(string[] args) {
			Console.WriteLine("Hello World");
		}
	}
}
```
The process would be:

1. Copy the code + switch to ssh session
2. `$ nano Program.cs`
3. Paste (if PuTTY, Right Click)
4. Ctrl + O

That's it. It's simple and quick. Yes, you could do this in vim. Nano is simply just another solution/approach. 
# Practice and slick tie-in with screen
There's a C file called time.c located [here](https://github.com/Changer098/CSToolsCourse/raw/master/tutorials/other/nano_screen_files/time.c). Grab it with wget and try to compile it with `$ gcc time.c -o time-std=c99`. You will find that the file will not compile because the 'time' header is missing. Fix 'time.c' by adding `#include <time.h>` at Line 4. And then recompile. If you run the file (`$./time`), you will notice that it displays the time, waits thirty seconds, and then repeats. Forever. The program can run indefinitely. You can test this idea with screen. Screen is a program that runs a program within a program, usually a shell. With screen you can: open a shell, leave, and then re-open it again as if it were never shut. The processes in that shell will continue running regardless if the user is viewing it or not.
## screen commands
#### commands for running screen
| Command | Description |
| --------- | ----------- |
| -S <name> | opens a session with the given name |
| -e <program> | opens a session with the program specified (instead of the shelf) |
| -r <session name> | detaches a screen session from another screen instance and attaches it to the current screen instance |
| -x <session name> | attaches to a screen session through whatever means necessary.
| -ls | lists all running screen sessions |
| killall screen | kills all running screens |
#### commands for running within screen
Hint: Ctrl + 1,2 means do Ctrl + 1 first and then do 2 by itself

| Command | Description |
| ---- | --------------- |
| Ctrl+A, d | detaches from the screen session, but doesn't close it |
| quit | kills a screen |
| Ctrl+A, c | creates a new window |
| Ctrl+A, A | name the current window |
| Ctrl+A," | lists all windows to navigate to |

# Practice continued
We can use screen to test if time actually runs indefinitely. By creating a new screen and then starting time, we can routinely "check in" and see if time is still running.
# Practical applications of screen
A possible application of screen is to test whether a program runs indefinitely or not. Though this application isn't...well...exciting or useful. More practical applications include checking on large compilations, checking the progress of an Operating System torrent download, or checking the status of a server. screen is a powerful way to manage processes whilst retaining their output.
