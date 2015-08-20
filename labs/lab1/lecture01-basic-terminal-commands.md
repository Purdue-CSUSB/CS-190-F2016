# lecture1 #

## Basic Terminal Commands ##

Below, I have listed examples of the many common commands and practices of the
shell. If you want to know more about specific commands, you can use ''man'' to
find out more information.


```bash
# will return the man page about ls.
Press 'q' to get out of this page
man ls
```

### Navigating Directories/Files ###

#### ls - list directory contents ####

```bash
# list contents of current working directory
ls

# list contents of random directory
ls cs180

# list contents with hidden files
ls -a

# list contents in long format (more details about files)
ls -l

# list contents with most recently modified first
ls -t

# all arguments applied
ls -alt
```

#### cd - change directory ####

```bash
# navigate into a directory
cd folder
cd cs180/lab01

# navigate to the parent directory of the current working directory
cd ..

# navigate to the current users home directory
cd

# navigate to the previous directory.
# example
# cd cs180/projects/project2
# cd cs190lab1
# cd -   (this puts you back to cs190lab1)
cd -
```

#### pwd - print working directory ####

```bash
# print the working directory
pwd

# output
/homes/kkohlmor/cs180/lab01
```

### Manipulating Files and Folders ###
#### mv - move (rename) files ####

```bash
# move a file or directory (.txt is the file extension)
mv file.txt new/location/file.txt
mv folder new/location/folder

# rename a file or directory
mv oldname.txt newname.txt

# combining the two
mv file.txt new/location/newname.txt
```

#### cp - copy files and directories ####
```bash
# copy a file
cp file.txt filecopy.txt

# copy a directory
cp -r folder foldercopy
```

#### rm - remove files or directories ####

```bash
# remove a file
rm file.txt
rm path/to/file.txt

# remove a directory
rm -r folder
rm -r path/to/folder
```

#### mkdir - make directories ####

```bash
# make a directory
mkdir newfolder

# make a directory and all necessary parent directories
# the folders /cs180/labs/ will be created if they don't exist already
mkdir -p ~/cs180/labs/lab01
```

### File Path Tips ###
#### * - wildcard ####
This, when placed in a file path, essentially matches any number of characters. It is best explained through a few examples. The * symbol works predictably for many commands such as, but not limited to, ls, mv, cp, rm, scp.

```bash
# move all files in /folder/ into /another_folder
mv folder/* another_folder/

# copy all files beginning with "cs" into /folder
cp cs* folder/

# remove all files ending in .DS_Store
rm *.DS_Store
```

#### .. and . - previous and working directory  ####

''..'' = one directory up

''.'' = current working directory

```bash
# navigate to the parent directory of the current working directory
cd ..

# move file.txt from the parent directory to the current working directory
mv ../file.txt .
```

#### ~ - home directory of the current user  ####

```bash
# navigate to the home directory of the current user
cd ~

# move the folder "project1" into the folder "cs180", which is located at the root of the user's home directory
mv project1 ~/cs180
```

#### '\ ' - proper space escape ####

```bash
# I have a folder named "CS 180 Labs" at the root of my home directory.
# I want to cd into that directory.
cd ~/CS\ 180\ Labs
# or
cd "~/CS 180 Labs"
# or
cd ~/"CS 180 Labs"
```


#### Let's add it all together ####
```bash
# move all .java files from the parent directory to the current directory
mv ../*.java .

# remove all .class, .txt, and all files beginning with old within the current directory
rm *.class *.txt old*

# list details of files in /usr/bin that start with the letter l
ls -l cs180/l*

# move file1.txt, file2.txt, and file3.txt to the the users home directory
mv file1.txt file2.txt file3.txt ~/
```


### Other fun tips ###

#### Tab Autocomplete ####
If you click tab after you type a few letters of the file or folder you want to give as an argument, the terminal will autocomplete.

- If the file or folder shares a substring with one or more other files or folders, then it will autocomplete as much as possible.
- You may tap tab twice to see the possible autocomplete choices if there are more than two with the same substring.

#### History ####
You can navigate the history of commands by pressing up and down on the arrow keys.

You can search the history by pressing CTRL+R, then typing in a few characters that match a previous command.

- To cycle through the filtered items, you can click CTRL+R again.
- To execute a command, press ENTER
