# CS 190 Lab 2 (2016) - The Doctor Exposed #

The purpose of this lab is to teach some more advanced shell commands. After you finish this lab, you will be able to search for files and text, and be able to further learn any command desired.

Before starting the lab, **OPEN THE [REFERENCE SHEET](https://github.com/Purdue-CSUSB/CS-190-F2016/blob/master/labs/lab2/lecture02-more-terminal.md)**

## Setup ##

Depending on your working environment, perform the appropriate action:

| Environment   | Action        |
| ------------- | ------------- |
| Linux Lab Machine            | Open a terminal window        |
| Windows or Personal Computer | SSH into `data.cs.purdue.edu`*  |

----

### X11 Forwarding ###
If you're working on this lab from home, you need to set up X11 forwarding. If you're using a lab computer, you can skip this step. 

X11 forwarding is an awesome feature of ssh. Normally when you ssh into a lab machine, you're only able to use command line programs. With X11, you'll be able to use GUI programs as well. 

#### Windows Instructions ####

1. Search for 'Xming' in the start menu and run it.
2. Open PuTTy
3. Expand the 'SSH' tab from the 'Category' list
4. Choose 'X11' from 'SSH' list
5. Check 'Enable X11 Forwarding'
6. Connect like normal to `data.cs.purdue.edu` within PuTTy.

#### OS X Instructions ####

1. Install [XQuartz](http://xquartz.macosforge.org/landing/)
2. Log out and log back in
3. Open your terminal
4. Connect with the `-X` flag, e.g. `ssh -X <user>@data.cs.purdue.edu`

----

### The Magic Command ###
    cd; curl -sL https://raw.githubusercontent.com/Purdue-CSUSB/CS-190-F2016/master/labs/lab2/lab2init | bash

Copy the command above and run it within the terminal. It will create a folder named `cs190lab2` located within your home directory.


## Part 1 - Just Like Last Time ##

This section is just like the last lab. You are given tasks that each have:

- a working directory you must 'cd' into
- desired action that can be performed using a one line command in the terminal
- a terminal command that is limited to
    - a single base command (cp, mv, rm, etc...) or multiple base commands chained together by pipes ( `|` )
    - a single line

#### Task 1 - downloading answers.txt from Internet ####

    Working Directory:  your home directory

    File URL:           https://github.com/Purdue-CSUSB/CS-190-F2016/raw/master/labs/lab2/answers.txt

    Desired Action:     download the answers.txt file from the URL above using the terminal
                        (may not use browser!)

    Record your answer under the Task 1 block.

Your answers.txt file is now located in your home directory at `~/answers.txt`. You can open this file up in pluma by typing the command below.

    pluma ~/answers.txt &

#### Task 2a - inconvenient text input/output ####

    Working Directory:  ~/cs190lab2/

    Command:            bash madlib

    Desired Action:     run the Bash program named 'madlib' by using the command above
                        and complete each prompt.

    You do not need to copy anything over to answers.txt for Task 2a.

#### Task 2b - convenient text input/output####

    Working Directory:  ~/cs190lab2/

    Command:            bash madlib

    Desired Action:     run the Bash program named 'madlib' by using the command format above,
                        but you must feed the program the contents of 'input.txt' AND
                        save the output of the program to a file named 'poem.txt'.

    Record your answer under the Task 2b block.

> Once you've saved the output of MadLib in poem.txt, you can confirm there is text by
> running `cat poem.txt`.

#### Task 3 - Searching the text a file ####

    Working Directory:  ~/cs190lab2/

    Desired Action:     search through the text file "The Young Engineers.txt" for occurrences
                        of the word "horseman". Have the output line numbers of each occurrence.

                        # format of output
                        XXXX:this is the word horseman appearing in text

                        XXXX is the line number

    Record your answer under the Task 3 block.


## Part 2 - Editing the DrJava Source Code ##

Students in CS180 primarily use the application DrJava to write and edit their Java files. It is a wonderfully simple editor and is also free and open source. This means that we can download the source code of the project, edit it to fit our needs, then rebuild the application.

In the next section, we will be changing a String value within the DrJava source code that appears when quitting the application. We will then rebuild the source and test our changes to confirm it worked.


First you need to get the DrJava source code. Run:

    svn co https://drjava.svn.sourceforge.net/svnroot/drjava/trunk/drjava


#### Task 4 - Searching the text of many files ####

    Working Directory:  ~/cs190lab2/drjava

    Phrase:             "Are you sure you want to quit DrJava?"

    Desired Action:     print out the file(s) and line number where the phrase above appears
                        within the working directory. You need to search through the drjava
                        folder and ALL of its subdirectories (recursive search).

    Record your answer under the Task 4 block.

    ALSO: Record the file path (ex. drjava/src/.../filename.java) and the line number (ex. 1000)

#### Task 5 - Final Task ####

    Working Directory:  ~/cs190lab2/drjava

1. Open the FILE FOUND IN THE PREVIOUS TASK and navigate to the line number in pluma by running the command below.
    ```
    pluma <file_path> +<line_number>

    # example: open DrJava.java in pluma and scroll to line 349.
    pluma src/edu/rice/cs/drjava/DrJava.java +349 &
    ```

2. Replace the string `"Are you sure you want to quit DrJava?"` with `"DONT QUIT LOVE ME!"`
3. Save the file
4. Tell ant where Java 8 is

    ```
    export JAVA8_HOME=$(java-config --jdk-home)
    ```

5. Recompile DrJava by running the command

    ```
    cd ~/cs190lab2/drjava; ant jar
    ```

6. Run the new DrJava by running the command

    ```
    java -jar ~/cs190lab2/drjava/drjava.jar
    ```

7. Quit DrJava to see your new message!
    * You might have to enable the "Prompt Before Quit" option.
    * Check Edit > Preferences > Notifications > "Prompt Before Quit"


## Grading ##

Please load your answers.txt file in a text editor and show the TA your modified DrJava dialog box.


## End of Lab ##


*If you find any bugs within the code or misspellings in the write-up, please tell the TA. Thanks!*
