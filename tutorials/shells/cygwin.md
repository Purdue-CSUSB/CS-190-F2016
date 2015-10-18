# Cygwin
Copyright 2015 [Jay Hankins](http://jayhankins.me)

## What is it?
From the [Cygwin](http://cygwin.org) homepage, Cygwin is:
- a large collection of GNU and Open Source tools which provide functionality similar to a Linux distribution on Windows.
- a DLL (cygwin1.dll) which proides substantial POSIX API functionality.

Basically, it's a way get some of the great features of a GNU/Linux terminal to your Windows system. Bring your favorite Linux programs, like `ls`, `grep`, and `ssh` to Command Prompt.

## Why do I want it?
Once you get used to some of the great console features of a UNIX-like operating system, you might get frustrated with the out-of-the-box limitations of the Windows Command Prompt. If you're the person who gets frustrated at having to type `dir` instead of `ls` when you're on Windows, Cygwin is just what you need. Of course, you could run a virtualized Linux distribution, but booting up a VM whenever you need access to simple Linux tools seems like overkill, doesn't it? Cygwin runs these tools natively, right in Windows Command Prompt.

## How do I get it?
1. Go to the [Cygwin homepage](http://cygwin.org), scroll down, and download the latest `setup.exe` appropriate for your architecture (most should choose 64-bit).
2. Run the installer that you just downloaded. Accept the User Account Control dialog if it appears.
3. Click "Next", choose to install from the internet, and click "Next" twice to accept the root install and local package directories. Click "Next" to accept your internet connection settings.
4. Select any package download site from the list. Click "Next" to download the packages from the mirror download site.
- At this screen, you can search and select packages to install. I recommend `curl`, `wget`, `openssh`, `git`, and `vim` to get started. You can expand package categories using the `+` to the left of the category name. ![Package List](https://raw.githubusercontent.com/jay-hankins/CSToolsCourse/master/tutorials/shells/cygwin_screenshots/Packages.PNG)
- Mark a package to be downloaded by clicking the `⟳` to the left of "Skip". ![Marked package to install](https://github.com/jay-hankins/CSToolsCourse/raw/master/tutorials/shells/cygwin_screenshots/search_openssh.PNG)
- Click "Next" when you've selected your desired packages, and "Next" again to download and install them. Wait patiently while the Cygwin installer downloads and installs the packages and their dependencies.
- Click "Finish" to complete the installation.

## How do I use it?
This is the easy part. Run the Cygwin terminal (called "Cygwin64 Terminal" on 64-bit installations). A Cygwin terminal will open, ready to take your commands.

![Cygwin64 Terminal](https://github.com/Purdue-CSUSB/CSToolsCourse/raw/master/tutorials/shells/cygwin_screenshots/successful_installation.PNG)

Try a few commands, like `ls` or `sed` to make sure it's working correctly. If `ls` simply returns a blank line, you can assume Cygwin is working correctly.

## What next?
Well, Cygwin lets you run practically any Linux tool. To install additional packages after your initial installation, just re-run `setup.exe` with the same path options as the first time.
- **Tip:** I recommend installing [apt-cyg](https://github.com/transcode-open/apt-cyg) to get `apt-get`-like functionality in Cygwin, letting you install packages much more easily.

## Summary
1. Download [Cygwin](http://cygwin.org).
2. Run the installer and choose the tools you want installed.
3. Use the "Cygwin Terminal" shortcut to use the tools.

## I have more questions or comments.
<sup><sub>~~Keep them to yourself.~~ :wink:</sub></sup>

You can talk to us during your CS 190 lab, or email me at [JH@purdue.edu](mailto:JH@purdue.edu) for a quicker response.
