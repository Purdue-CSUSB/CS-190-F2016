Copyright 2015 [Nicky Semenza](http://nickysemenza.com)

#SSH Keys

SSH keys are an easy and secure way of authenticating with a server, without the use of a username or password


There are two great uses for them (among others):

 * Authenticating with github (password-less pushing)
 * Authenticating with servers
 
 
##How they work

Basically, on the machine you want to connect to other servers with, you need to generate a public key file and a private key file.
You then give your public key (id_rsa.pub) to the server you want to connect to, and it adds the key to its 'whitelist', known as the authorized_keys file ***never*** give your private key to anyone, treat it like you would with a secure password.
##Generating Keys (OSX & Linux based Systems)
open up terminal, and run the command `ssh-keygen`
It will ask you where you want to save it, and for an optional passphrase & confirmation of passphrase.

You can just press enter 3 times to accept the defaults.

The output should be similar to this:

	Generating public/private rsa key pair.
	Enter file in which to save the key (/home/nickysemenza/.ssh/id_rsa):
	Created directory '/home/nickysemenza/.ssh'.
	Enter passphrase (empty for no passphrase):
	Enter same passphrase again:
	Your identification has been saved in /home/nickysemenza/.ssh/id_rsa.
	Your public key has been saved in /home/nickysemenza/.ssh/id_rsa.pub.
	The key fingerprint is:
	f4:55:64:37:72:23:96:28:9c:58:9f:72:7e:39:b6:2b nickysemenza@ubuntu
	The key's randomart image is:
	+--[ RSA 2048]----+
	|        +.. .==+.|
	|       . +..o++.o|
	|        ...+.    |
	|       . .+.  .  |
	|        S .. =   |
	|            o o  |
	|             .   |
	|           E  .  |
	|            ..   |
	+-----------------+
	+-----------------+

Now, if you cd into `~/.ssh` and list the files (`ls`), you should see at least 2 files

	~/.ssh » ls                                                                                                                                                                                           
	id_rsa  id_rsa.pub

`id_rsa` is your private key file, and `id_rsa.pub` is your public key. Remember not to distribute the private key!

##Generating Keys on windows
Go download [PuTTYGen](http://www.chiark.greenend.org.uk/~sgtatham/putty/)
![image](http://	)


##Remote Machine Setup

In order to make it so that you don't need to type your password when you SSH into the CS machines, we need to add your public key to the server's authorized_keys file.

In one command, you can append your public key to the authorized_keys file on data.cs.purdue.edu

`cat ~/.ssh/id_rsa.pub | ssh <yourusername>@data.cs.purdue.edu "cat >> ~/.ssh/authorized_keys"`

For non-unix systems, just connect using PuTTY, open up the file using vi or nano or your favorite text editor, paste the contents of the private key, and save it

One super cool thing is that since the filesystems are networked between machines, they all shared the same authorized_keys file. this means, you can `ssh user@anything.cs.purdue.edu` and instantly get in!


##Github Setup	

Go to the [ssh portion of your github account setings](https://github.com/settings/ssh), and press add key
Add the contents of your `id_rsa.pub` (cat the file and then copy it)in the key box, and give it a descriptive name.

Cool tip: if you're on a mac you can run the command `cat ~/.ssh/id_rsa.pub | pbcopy` and the contents of the file will automatically be copied to your clipboard!

Note: SSH-based authentication will only work if you clone the repository using a ssh url: [read here](https://help.github.com/articles/which-remote-url-should-i-use/) for more information
 
If you working across multiple machines (say keeping your cs180 lab in a github repository), you'll need to generate and add both your personal computer and your cs server's authorized keys to github (add a new key for each in settings)


 