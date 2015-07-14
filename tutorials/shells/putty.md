PuTTY
=====

Copyright 2015 [Jay Hankins](http://jayhankins.me)

What is it?
-----------

PuTTY is an SSH and telnet client for Microsoft Windows. Basically, it allows you to remotely access the shell of systems running SSH or telnet servers.

Why do I want it?
-----------------

Why wouldn't you want it? If you're a Windows user, having PuTTY installed will make your life so much better. As a student, it will be indispensable for connecting to the Purdue lab machines so you can work on your projects.

How do I get it?
----------------

This is the easy part.

1.	Go to the [PuTTY Download Page](http://www.chiark.greenend.org.uk/~sgtatham/putty/download.html) and download the latest binary version of `putty.exe`.
	-	Note: you may also want to download `pscp.exe` for file transfers and `pageant.exe` for SSH key management.
2.	Run the `putty.exe` file you just downloaded.

How do I use it?
----------------

1.	In the main PuTTY Configuration Window, put your username and the hostname of the computer you want to connect to like: `username@hostname`.
	-	Note: `data.cs.purdue.edu` is a popular host to connect to and will allow you to access all of your files just as if you were logged onto a lab machine. That said, you can SSH in to most lab machines, such as `moore05.cs.purdue.edu` and access your files through that host as well. ![PuTTY config screen 1](https://github.com/jay-hankins/CSToolsCourse/raw/master/tutorials/shells/putty_screenshots/putty.PNG)
2.	This is all you need to do for a basic SSH session. Feel free to save the session in the Saved Sessions list.
3.	You can configure advanced options, like X11 forwarding (for using GUI applications remotely) or SSH key authentication (for more secure, password-less logons). ![PuTTY config screen 2](https://github.com/jay-hankins/CSToolsCourse/raw/master/tutorials/shells/putty_screenshots/putty2.PNG) ![PuTTY config screen 3](https://github.com/jay-hankins/CSToolsCourse/raw/master/tutorials/shells/putty_screenshots/putty3.PNG)
