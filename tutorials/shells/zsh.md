#ZSH
ZSH is one of many alternative shells. Most machines that you will encounter will come with bash installed.

ZSH makes it very easy to use plugins, make UI tweaks, and increase productivity in general

here is an example of what my terminal looks like when i run `ls`
![](zsh_resources/zsh-ls.png =450x)

At a glance, I can see the directory path that I am in, my hostname and username, the status of my git repository, and my files are color coded by type

![](zsh_resources/bash-ls.png =450x)

If i'm in bash, it takes 4 commands to see all that, and I still don't get any color coding!

##Installation
[oh-my-zsh](https://github.com/robbyrussell/oh-my-zsh) is a really nice installer that comes with 100's of great plugins. Super easy for OSX/Linux. There isn't really much support for ZSH on windows, unfortunately.


##Configuration
Settings are stored in `~/.zshrc`
If you go to the plugins section, this is where you list plugins you want to run. Just add the name to the comma seperated list

[list of plugins](https://github.com/robbyrussell/oh-my-zsh/wiki/Plugins)


###Scripting
You add scripts to your `.zshrc` to make your life easier
Here are some I have in mine:
####Compile and run a java file
Usage: **jav [filename]**
where filename.java is your file

```
jav() {
	javac "$1.java";
	java "$1";
}
```

####Make a new folder and cd into it
Usage: **mcd [foldername]**

```
mcd () {
	mkdir -p $1
	cd $1
}
```

##Summary
You can do basically anything you want with ZSH scripting. I'd recomment looking around [on github](https://github.com/search?q=.zshrc) for some inspiration from other people's config files.