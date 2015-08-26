# PuTTY
Copyright 2015 [Jay Hankins](http://jayhankins.me)

## What is it?
PuTTY is an SSH and telnet client for Microsoft Windows. Basically, it allows you to remotely access the shell of systems running SSH or telnet servers.

## Why do I want it?
Why wouldn't you want it? If you're a Windows user, having PuTTY installed will make your life so much better. As a student, it will be indispensable for connecting to the Purdue lab machines so you can work on your projects.

## How do I get it?
This is the easy part.
1. Go to the [PuTTY Download Page](http://www.chiark.greenend.org.uk/~sgtatham/putty/download.html) and download the latest binary version of `putty.exe`.
  - Note: you may also want to download `pscp.exe` for file transfers and `pageant.exe` for SSH key management.

2. Run the `putty.exe` file you just downloaded.

## How do I use it to connect to a remote computer?
- In the main PuTTY Configuration Window, put your username and the hostname of the computer you want to connect to like: `username@hostname`.
  - Note: `data.cs.purdue.edu` is a popular host to connect to and will allow you to access all of your files just as if you were logged onto a lab machine. That said, you can SSH in to most lab machines, such as `moore05.cs.purdue.edu` and access your files through that host as well.
  - ![PuTTY config screen 1](https://raw.githubusercontent.com/Purdue-CSUSB/CSToolsCourse/raw/master/tutorials/shells/putty_screenshots/putty.PNG)

- Click "Open" at the bottom of the window. PuTTY will begin the session. This is all you need to do for a basic SSH session. Feel free to save the session in the Saved Sessions list.
- You can configure advanced options, like X11 forwarding (for using GUI applications remotely) or SSH key authentication (for more secure, password-less logons).
  - ![PuTTY config screen 2](https://raw.githubusercontent.com/Purdue-CSUSB/CSToolsCourse/raw/master/tutorials/shells/putty_screenshots/putty2.PNG)
  - ![PuTTY config screen 3](https://raw.githubusercontent.com/Purdue-CSUSB/CSToolsCourse/raw/master/tutorials/shells/putty_screenshots/putty3.png)

## How do I use it to connect to hardware?
There's another use case for PuTTY, which is a little more advanced, but still very useful. PuTTY can be used as a terminal emulator to connect to hardware on a serial port. This is useful for configuring hardware devices, such as an Arduino board or a Cisco router.

 - In the PuTTY configuration window, go to the "Serial" settings under "Connections." Enter the serial port number inside the "Serial line to connect to" field.
 - Correctly configure the Speed (baud), Data bits, Stop bits, Parity, and Flow control values.
 - Go back to the "Session" settings at the top of the PuTTY categories selector. Click the "Serial" radio button, making sure the correct serial port and speed (baud) are listed in the window. 
 - Click "Open." PuTTY begins the session.

## What's next?
Infinity and beyond, dear reader. Seriously. With PuTTY you can connect to basically any machine running an SSH server. You'll find this indispensable throughout your studies and career.

## Summary
1. Download and Run [PuTTY](http://www.chiark.greenend.org.uk/~sgtatham/putty/download.html).
2. Configure it to connect to the desired computer.
3. Use the terminal as if you are sitting at the computer locally.

## I have more questions or comments.
<sup><sub>~~Keep them to yourself.~~ :wink:</sub></sup>

You can talk to us during your CS 190 lab, or email me at [JH@purdue.edu](mailto:JH@purdue.edu) for a quicker response.
