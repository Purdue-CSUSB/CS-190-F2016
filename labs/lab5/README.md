# CS190 Lab 5 (2016) - Debugging #

In this lab you'll go through a short program, identify the bugs and fix them.

### Download the source ###

Use `wget` to download the source code for this lab.

**You should make a new directory to store this, eg. `~/cs190lab5`**

You can find the java file at:

https://raw.githubusercontent.com/Purdue-CSUSB/CS-190-F2016/master/labs/lab5/Transformer.tar.gz

Untar the source project by running the command `tar -zxvf Transformer.tar.gz` in the directory where you downloaded it.

*CS 177 Students*: We recommend using the Java code if you are familiar with Java.
If you are not, [here](http://files.harrischristiansen.com/code/3J411X3r462K) is equivalent Python code created by a CS 190 TA Harris Christiansen.

If you are using the Python file, you should use print statement debugging for capitalize and inspect control flow/state for reverse.

----

## Things To Know ##

##### Using the IntelliJ debugger #####

1. Open IntelliJ on your lab computer by going to `Applications > Programming > IntelliJ IDEA`.
2. Import the project by using `File > Open` in IntelliJ and browsing to the folder where you untarred the source code.
3. Go to `Run > Run`. The program will spit out some output.
4. To add a breakpoint, select the line you wish to break on and go to `Run > Toggle` breakpoint.
5. To run in debug mode, go to `Run > Debug`.
6. The buttons to step in, out, over, etc are all above the debug pane. Hover over to see what each does.

![](https://raw.githubusercontent.com/Purdue-CSUSB/CS-190-F2016/master/labs/lab5/intellij.png)

##### Using the jdb debugger #####

1. Open a terminal.
2. Go to the location of your Transformer.java file (e.g. cs190lab5/Transformer/src).
3. Compile Transformer.java (with `-g` to get better debug information) by running the command `javac -g Transformer.java`.
4. Start jdb by running the command `jdb Transformer` within the directory with the .class file.
5. Set a breakpoint by running `stop at Transformer:<line number here>`. (Make sure the line you specify has code, otherwise jdb will not run)
6. Start the debugging process by running `run`.
7. Execute the code line by line by running `step`.
8. Display the current value of a variable by running `print <name of variable>`
9. Stop jdb with `exit` or `quit`.
10. Type `help` from within jdb to see a list of all the available commands.


## Start Here ##
When you first run the program, you'll see some output that will look like this:

```
Original Input is: cs190 is sooooooo awesome!!!
==================
Capitalized Version:
=====================
cS190 iS sOOOOOOO aWESOME!!!
==================
Reversed Version:
==================
cs190 is sooooooo awesome!!!
```

## Transform.java ##
The Transformer class will take a string in the constructor and then it will perform various transformations on that string.

There are currently two transformations implemented, but neither works correctly.

 - The `capitalize()` method should return a string with each the first letter of each word in upper case.
 - The `reverse()` method should return a string with the characters in reverse order.

As we can see from the output above, the capitalized version isn't capitalized in the way we want.
Let's figure out what's wrong.

Use either the IntelliJ debugger or jdb to find and fix the bugs. If you want, you may use another IDE of your choice.
We recommend you mix it up to get familiar with various debugging methods.

### `capitalize()` ###

The capitalize method will basically split the string into words separated by spaces.
It will then take each word and capitalize the first character of it.

As we can see from the output above, this isn't what the capitalize method currently does.
It currently capitalizes a bunch of characters, but not the first character.

Find the bug in here, then implement a fix.

After this, you should have a working capitalize method, so let's look at `reverse()`

### `reverse()` ###
This reverse method uses a pretty standard reversal algorithm.
It will start at the outside of the string and work its way inwards.

> This is a VERY common entry level interview question, so take note!

For an example, lets use 'watch'.
On the first iteration, we'll swap '**w**' and '**h**' and end up with **hatcw**.
We'll continue in this way until the string is reversed.

The current implementation is incorrect.
This bug is most easily found using the DrJava debugger and a break point on line 63.
You can use the `continue` button to continue the execution of the program to the next breakpoint.

If a breakpoint is in a loop, then it will break every time it hits that line, so every time through the loop.

After you've found the bug, fix it and compile and run your program again.

## Final Result ##

After you've fixed both bugs, you should see an output that looks like this.

```
Original Input is: cs190 is sooooooo awesome!!!
==================
Capitalized Version:
=====================
Cs190 Is Sooooooo Awesome!!!
==================
Reversed Version:
==================
!!!emosewa ooooooos si 091sc
```

If this is what you see, then you're done! Look below at **grading** to see what you need to turn in.


## Grading ##

Explain to a TA what debugging method you used.

Explain each bug to a TA and say how you fixed it.


## End of Lab ##


*If you find any bugs within the code or misspellings in the write-up, please tell the TA. Thanks!*
