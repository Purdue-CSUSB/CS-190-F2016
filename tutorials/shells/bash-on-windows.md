# Bash on Windows

## What is it?
In the Windows 10 Anniversary Update, Microsoft released a developer feature called [Bash on Ubuntu on Windows](https://msdn.microsoft.com/en-us/commandline/wsl/about), which allows you to run a native UNIX Bash shell on Windows using the Windows Subsystem for Linux. This is helpful for developers, because it allows you to use Linux tools like `grep`, `ssh`, `awk`, etc, or use technologies such as [Ruby](https://www.ruby-lang.org/) and [Python](https://www.python.org/), which has typically been difficult on Windows, or has had to be done using external software like [Cygwin](https://www.cygwin.com).

Bash on Windows is native to to Windows 10 Anniversary Update and works by running a Ubuntu user-mode image. This means that programs designed for Linux will just *work* on Windows (using commands like `apt-get` to download and install). That being said, Bash on Windows acts as a toolset--it's not a full virtual machine. So you won't be able to perform things like hosting servers, which you typically can on Linux.

## Installation
To install Bash on Windows, you must ensure you've installed the Windows 10 Anniversary Update, and are running a 64-bit build of it. After you've done that, complete the following steps:

**Enable Developer mode**

Open the Settings app, then go to `Update and Security`->`For developers`. Select the `Developer mode` radio button.

![Developer Mode](https://github.com/shanedewael/CS-190-F2016/blob/master/tutorials/shells/bashonwindows_screenshots/bash-on-windows-devmode.png)

**Turn on Windows Subsystem for Linux**

Next, go to `Control Panel`->`Programs`->`Turn Windows Features On or Off`. From here, you can enable it by selecting the `Windows Subsystem for Linux (Beta)` checkbox, and then clicking OK.

![Windows Features](https://github.com/shanedewael/CS-190-F2016/blob/master/tutorials/shells/bashonwindows_screenshots/bash-on-windows-features.png)

You should be prompted to restart your computer at this point, which will complete the installation.

## Running Bash on Windows
After your computer restarts, you can search "bash" using the start menu, and hitting enter. This will start bash.exe. After you accept the terms of service, you'll be able to run Bash on Ubuntu on Windows.

![Bash on Ubuntu on Windows](https://github.com/shanedewael/CS-190-F2016/blob/master/tutorials/shells/bashonwindows_screenshots/bash-on-windows-bashshell.png)

You can try some simple terminal commands like `ls`, `cd`, and `ssh` for instant gratification :)

## What's next?
Take a look at [the slides for week 1](http://purdue-csusb.github.io/CS-190-F2016/slides/lecture1/#/), which cover the basics of using Bash shell and terminal.



