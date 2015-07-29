Copyright 2015 [Nicky Semenza](http://nickysemenza.com)

#SSH Keys

SSH keys are an easy and secure way of authenticating with a server, without the use of a username or password


There are two great uses for them (among others):

 * Authenticating with github (password-less pushing)
 * Authenticating with servers
 
 
##How they work

Basically, on the machine you want to connect to other servers with, you need to generate a public key file and a private key file.
You then give your public key (id_rsa.pub) to the server you want to connect to, and it adds the key to its 'whitelist', known as the authorized_keys file ***never*** give your private key to anyone, treat it like you would with a secure password.

If you lose your key (like if you've lost your computer) or it is compromised, you can just invalidate/revoke that key anywhere its used by removing the public key from the authorized_keys file on all your remote machines, from github, etc
##Generating Keys
### (OSX & Linux based Systems)
open up terminal, and run the command `ssh-keygen`
It will ask you where you want to save it, and for an optional passphrase & confirmation of passphrase. A passphrase is really only necessary for high security applications, and the main reason you are probably setting up an SSH key is for the convenience of not typing in your password. If someone ever gets ahold of your computer they would have access to your connections without typing in a passphrase/password, so you could just revoke the keys as mentioned above

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

	~ $ cd ~/.ssh
	~/.ssh $ ls
	id_rsa id_rsa.pub

`id_rsa` is your private key file, and `id_rsa.pub` is your public key. Remember not to distribute the private key!

###Windows
Go download [both PuTTY and PuTTYGen](http://www.chiark.greenend.org.uk/~sgtatham/putty/)
open PuTTYGen, click Generate, and then save the public and private keys somewhere of your choosing

##Remote Machine Setup

###OSX/Linux
In order to make it so that you don't need to type your password when you SSH into the CS machines, we need to add your public key to the server's authorized_keys file.

In one command, you can append your public key to the authorized_keys file on data.cs.purdue.edu

####Linux

`ssh-copy-id <yourusername>@data.cs.purdue.edu`
####OSX
You can either install [this port of linux's ssh-copy-id](https://github.com/beautifulcode/ssh-copy-id-for-OSX) or run this command which appends `id_rsa.pub` to ` ~/.ssh/authorized_keys` on the remote machine


`cat ~/.ssh/id_rsa.pub | ssh <yourusername>@data.cs.purdue.edu "cat >> ~/.ssh/authorized_keys"`

###Windows
For non-unix systems, just connect to `data.cs.purdue.edu` using PuTTY, open up the `~/.ssh/authorized_keys`file using vi or nano or your favorite text editor, paste the contents of the private key (located wherever you saved it from puttygen), and save it.

In the future, in the putty connection settings (Connection>SSH>Auth) you can specify to use the private key to authenticate with as opposed to password.

###hints!
One super cool thing is that since the filesystems are networked between machines, they all shared the same authorized_keys file. this means, you can `ssh user@anything.cs.purdue.edu` and instantly get in!


##Github Setup	

Go to the [ssh portion of your github account setings](https://github.com/settings/ssh), and press add key
Add the contents of your `id_rsa.pub` (cat the file and then copy it)in the key box, and give it a descriptive name.

Cool tip: if you're on a mac you can run the command `cat ~/.ssh/id_rsa.pub | pbcopy` and the contents of the file will automatically be copied to your clipboard!

Note: SSH-based authentication will only work if you clone the repository using a ssh url: [read here](https://help.github.com/articles/which-remote-url-should-i-use/) for more information
 
If you working across multiple machines (say keeping your cs180 lab in a github repository), you'll need to generate and add both your personal computer and your cs server's authorized keys to github (add a new key for each in settings)


#Summary 
1. Generate a public + private key pair (**ssh-keygen** for UNIX, **PuTTYGen** for Windows)
2. Place the public key on remote machines, github account settings, etc
3. Initiate a connection to the server! UNIX terminals will automatically use your client machine's key, you need to specify it manually for PuTTY

##Reminders
* Never share private keys!
* You can revoke/invalidate keys by removing your public key from everywhere that you placed it (ie delete it from the authorized_keys file on remote machines and from your github settings)