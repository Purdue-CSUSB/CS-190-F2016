# CS 190 Lab 1 (Fall 2016) - What Does the _____ Say? 

The purpose of this lab is to teach the basics of using the terminal. After you finish this lab, you will be able to manipulate files on any UNIX-like machine (including your Purdue CS account)!

## Introduction

### GitHub

GitHub (the site you're on!) is an open-source code sharing platform. It lets anyone upload their code to share with the world. (GitHub is also a lot more than just that, but we'll go over that later in the semester when we talk more specifically about git.)

We're going to use GitHub throughout the semester to share the labs with you. Every lab will have a README (which is really just a file, README.md), which will outline the lab's instructions. (Just like this one!)


#### Creating a Student GitHub Account

GitHub gives all students free education accounts. This gives you extra free private repositories.

To get a student account, go to https://education.github.com and follow the steps there.

After you've done this, be sure to give your TA your GitHub username.

### Syllabus 

The syllabus for this course can be found here: [Syllabus](https://github.com/Purdue-CSUSB/CS-190-F2016/tree/master/syllabus).

### Piazza 

Piazza is where we'll post all course announcements (deadlines, extensions, etc) and have general discussions.

1. Go to the [CSv190 Piazza](https://piazza.com/purdue/fall2016/cs190/home).

2. Create an account if you haven't already.

3. Join the class!

### BoilerMake (optional) 

You should apply to BoilerMake, Purdue's hackathon.

1. Go to [BoilerMake.org](http://boilermake.org)

2. Subscribe to email updates.

## The Lab 

Before starting the lab, please navigate to the [Lecture 1 Cheat Sheet](https://github.com/Purdue-CSUSB/CS-190-F2016/blob/master/labs/lab1/lecture01-basic-terminal-commands.md) to review all the common commands.

Throughout this lab we will give you specific environment parameters and you will have to give the appropriate command to fulfill the action we ask of you. All answers should only contain one primary command (`mv`, `cp`, `rm`, etc.). We will ask you to complete tasks based on a fresh `~/cs190lab1` folder, so it may be wise to be run the "Magic Command" before working on each task.


### The Magic Command 
    cd; curl -sL https://github.com/Purdue-CSUSB/CS-190-F2016/raw/master/labs/lab1/lab1init | bash

The command above, when run in a terminal, will create a folder structure (shown below) located within your home directory. Throughout this lab, you will be moving these files around, deleting some, and duplicating others. If at any time you want to reset to the default solder structure, you can run the "Magic Command" again. It will delete the old one and give you a new one to work with. You'll lose all your work on this lab, so use it carefully!


### Folder Structure 
Below is the folder structure that is generated from running the "Magic Command". As you can see, there are some issues. For example, dog sounds are in the cat/sounds folder. Throughout this lab, you will write terminal commands that fix some of the mistakes.

        cs190lab1/
        ├── cat/
        │   ├── famous cats/
        │   │   ├── Garfield
        │   │   ├── Grumpy Cat
        │   │   └── Tom
        │   ├── sounds/
        │   │   ├── cat_hiss
        │   │   ├── dog_bark
        │   │   ├── dog_howl
        │   │   └── dog_woof
        │   ├── cat_meow
        │   └── cat_purr
        │
        ├── dog/
        │   ├── famous cows/
        │   │   ├── Air Bud
        │   │   ├── Blue
        │   │   └── Clifford
        │   └── sounds/
        │
        ├── fox/
        │   ├── famous foxes/
        │   │   ├── Fox McCloud
        │   │   ├── Pablo the Little Red Fox
        │   │   └── Swiper
        │   └── sounds/
        │       ├── ding
        │       ├── ding ding
        │       └── ding ding ding
        │
        └── human/
            ├── famous humans/
            │   ├── Albert Einstein
            │   ├── Michael Jordan
            │   └── Kirby Kohlmorgen
            └── sounds/
                ├── human_cry
                ├── human_laugh
                └── human_whistle


## Rules and Example Task 
There are 6 tasks, and you will write 6 **one line** terminal commands that fulfill that task. Each command may only contain **ONE BASE COMMAND** (`mv`, `ls`, `cp`, `rm`, etc). You may not combine different base commands (`cd`, `mv`) into one response, and you may not combine two of the same base commands (`mv`, `mv`) into one response. Examples of this are below in the *Task 0 Example*.

All commands should be recorded in answers.txt. To download the answer sheet below, right-click on the file and click "Save File As" and save it to your **Downloads** folder.

[answers.txt Download Link](https://raw.githubusercontent.com/Purdue-CSUSB/CS-190-F2016/master/labs/lab1/answers.txt)

> NOTE: Do not save this file within `~/cs190lab1` because that folder and all of its contents will be erased each time you run the "Magic Script"


#### Example: Task 0 

    Working Directory:  ~/cs190lab1/

    Desired Action:     print out only the names of the normal folders and files in the cat/ folder and the dog/ folder

    Write the answer under the Task 0 block. Make sure not to put '#' before your answer.

#### Example: Task 0 Sample Answer 
    # -----------------
    # Task 0 Answer
    # -----------------
    ls cat dog

This above answer is allowed because it is on one line and only contains one base command, which in this case, is a single `ls`. Example invalid responses are shown below.

    # Not allowed response because it is two lines and contains two "ls" commands.
    ls cat
    ls dog

    # Not allowed response because it contains two "ls" commands.
    ls cat; ls dog

    # Not allowed because it is four lines and contains more than one base command.
    cd cat
    ls
    cd ../dog
    ls


## Assigned Tasks 

#### Task 1 

    Working Directory:  ~/cs190lab1/

    Desired Action:     remove the human/ folder from the working directory

    Write the answer under the Task 1 block. Make sure not to put '#' before your answer.

#### Task 2 

    Working Directory:  ~/cs190lab1/

    Desired Action:     create a folder named mouse/ with the subfolders [sounds] and [famous mice]  
                        (may not use MORE THAN TWO path arguments)
                        (mkdir one/ two/ three/  # this has three path arguments)

    Write the answer under the Task 2 block. Make sure not to put '#' before your answer.

#### Task 3 

    Working Directory:  ~/cs190lab1/

    Desired Action:     move the dog sounds from the cat/sounds/ folder to dog/sounds/ folder
                        (may not explicitly list files in command)

    Write the answer under the Task 3 block. Make sure not to put '#' before your answer.

#### Task 4 

    Working Directory:  ~/cs190lab1/dog

    Desired Action:     rename the folder [famous cows] to [famous dogs]

    Write the answer under the Task 4 block. Make sure not to put '#' before your answer.

#### Task 5 

    Working Directory:  ~/cs190lab1/fox/sounds

    Desired Action:     copy [ding ding ding] to a new file named [ding ding ding ding]

    Write the answer under the Task 5 block. Make sure not to put '#' before your answer.

#### Task 6 

    Working Directory:  ~/cs190lab1/cat/sounds

    Desired Action:     move files that are cat sounds from parent directory (~/cs190lab1/cat)
                        to the current working directory
                        (may not use definite paths such as ~/cs190lab1/cat)

    Write the answer under the Task 6 block. Make sure not to put '#' before your answer.


#### End of Lab 
That is the last of the tasks. You can raise your hand and get checked off, but please do the `Extra\ Fun*` sections before you leave. If you don't finish before the end of the lab, email the `answers.txt` file to your lab TAs.


## Extra Fun 
Did you realize that you made a shell script that is actually runnable? As you saw in the default folder structure, files were all over the place and things were not in the correct locations, nor did they have the correct names. If you have the correct answers, you are able to run your answers.txt file as a script and it will result in a folder structure that makes sense.

If you want to run your answers.txt as a script, run the following command in the terminal:

    bash answers.txt

Now look at the entire folder structure of your `~/cs190lab1` folder by running the following command:

    ls -al ~/cs190lab1/*/*


## More Extra Fun 
View the [source](https://github.com/Purdue-CSUSB/CS-190-F2016/blob/master/labs/lab1/lab1init) of the Magic script. You know almost everything that is going on in this script!

----

*If you find any bugs within the code or misspellings in the write-up, please email us at cs190-tas@cs.purdue.edu!*
