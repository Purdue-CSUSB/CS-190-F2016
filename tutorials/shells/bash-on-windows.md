# Bash on Windows

## What is it?
In the Anniversary update of Windows 10, Microsoft released a developer feature called [Bash on Ubuntu on Windows](https://msdn.microsoft.com/en-us/commandline/wsl/about), which allows you to run a native Bash shell on Windows using the Windows Subsystem for Linux. This is helpful for developers, because it allows you to use command-line tools like `grep`, `ssh`, `apt-get`, etc., which has typically been difficult or impossible on Windows.

## Installing Bash on Windows
To install Bash on Windows, you must ensure you've installed the Windows 10 Anniversary Update, and are running it on a 64-bit build. After you've done that, you need to complete the following steps:

**Enable Developer mode**

Open the Settings app, then go to `Update and Security`->`For developers`. Select the `Developer mode` radio button.

![Developer Mode](https://github.com/shanedewael/CS-190-F2016/blob/master/tutorials/shells/bashonwindows_screenshots/bash-on-windows-devmode.png)

**Turn on Windows Subsystem for Linux**

Next, go to `Control Panel`->`Programs`->`Turn Windows Features On or Off`. From here, you can enable it by selecting the `Windows Subsystem for Linux (Beta)` checkbox, and then clicking OK.

![Windows Features](https://github.com/shanedewael/CS-190-F2016/blob/master/tutorials/shells/bashonwindows_screenshots/bash-on-windows-features.png)

You should be prompted to restart your computer at this point, which will complete the installation.

## Running Bash on Windows
After your computer restarts, you can search "bash" using the start menu, and hitting enter. After you accept the terms of service, you'll be able to run Bash on Ubuntu on Windows.

![Bash on Ubuntu on Windows](https://github.com/shanedewael/CS-190-F2016/blob/master/tutorials/shells/bashonwindows_screenshots/bash-on-windows-bashshell.png)

## What's next?
Take a look at [the slides for week 1](http://purdue-csusb.github.io/CS-190-F2016/slides/lecture1/#/), which cover the basics of using a Bash shell.



