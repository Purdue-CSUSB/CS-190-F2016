# CS 190 Lab 7 (2015) - Basics of Git Part 2: Remotes and GitHub

The purpose of this lab is to help you become more comfortable using GitHub for
your projects. <br>
By the end of this lab you should know how to add collaborators, fix merge
minor merge conflicts, create and clone repositories (repos), and push and
pull to repos.

**For quick reference on the git commands we covered, see the cheat sheet
[here](https://github.com/Purdue-CSUSB/CS-190-F2016/blob/master/labs/lab7/lecture07-git.md).**

## The Lab

In this lab, you will work with a partner to implement a simple command line
interface (CLI) for a four-function calculator, in Python.

The skeleton file, `calc.py`, is located in this repo.

## General Setup

This command sets your default editor (just for today's lab) to be pluma for
merge messages. <br>
You may replace "pluma" with any editor of your choice.

```bash
git config core.editor pluma
```

> Without the `--global` flag this config is only for the repo you're
> currently using

## Git Setup

```bash
git config --global push.default simple
```

The `push.default` option has been required since Git 2.0. <br>
This defines how the pushing mechanism works. <br>
`simple` is the most modern option.

## Creating, Committing, and Pushing

* Choose a partner
* Agree on who is partner #1 and partner #2.

### Do together on partner #1's computer

1. In your home directory, create a new folder named
   `cs190lab7_<your_username>`. <br>
   E.g., create a folder `cs190lab7_lpstarre`.

    ```bash
    mkdir ~/cs190lab7_$USER
    ```

2. `cd` into the directory created above and `init`ialize a new git repository.

    ```bash
    cd ~/cs190lab7_$USER
    git init
    ```

3. Download the template file [`calc.py`](./calc.py) into the repository you
   just created.

    ```bash
    wget -P ~/cs190lab7_$USER https://raw.githubusercontent.com/Purdue-CSUSB/CS-190-F2016/master/labs/lab7/calc.py
    ```

4. `git add` this file to the repo.

    ```bash
    git add <filename>
    ```

5. Commit this change.

    ```bash
    git commit -m 'Initial commit'
    ```

5. Log in to GitHub (upper right hand corner of this page).

6. Create a new repository.

    ![new repo button](https://raw.githubusercontent.com/Purdue-CSUSB/CS-190-F2016/master/labs/lab7/res/create.png)

7. Enter in a repository name. Do **not** check the box that says initialize
   with README.

8. Copy the HTTP URL from GitHub.

    ![click the copy button](https://raw.githubusercontent.com/Purdue-CSUSB/CS-190-F2016/master/labs/lab7/res/copy.png)

8. Add this as a remote and push your commits

    ```bash
    git remote add origin <URL from GitHub>
    git push -u origin master
    ```

   > Notice that these are the exact commands from GitHub!

   > Look at `man git-push` or ask your TA about the `-u`, if you're curious.

8. Go to the repository settings.

    ![settings location](https://raw.githubusercontent.com/Purdue-CSUSB/CS-190-F2016/master/labs/lab7/res/settings.png)

9. Add your partner as a collaborator (use their GitHub handle).

    ![add collaborator](https://raw.githubusercontent.com/Purdue-CSUSB/CS-190-F2016/master/labs/lab7/res/collab.png)

### To do together on Partner #2's computer

Partner 2 needs a copy of this repo. <br>
If you remember from lecture, this is exactly what `clone` does.

```bash
cd ~
git clone <remote URL>
cd <repo name>
```

For the rest of this lab, pay attention to which section you're supposed to do.

## **Both** partners independently

Go back to your own computer and do the steps below.

### Run the Script

To execute the calculator script, run the command `python calc.py`. <br>
The program will prompt you to enter input. <br>
Notice that there are 4 functions defined, `+`, `-`, `*`, and `/`.

### Implement New Operations

When you're done executing, you and your partner will have two new operators to
implement (one each, separately): modulus division and exponentiation. 

> Note: if you have any questions about Python syntax, ask your TA. However,
> it should be very straightforward.

> Be sure to test your code to make sure your functions work as intended.

1. Open up `calc.py` in your text editor.

#### Partner 1 only

2. Implement modulus division operator (`%`).
    1. Define a method, named `mod`, under the division method that will take
       two arguments (`a` and `b`) and return `a` modulo `b`. <br>
       The syntax in Python for modulus is `a % b`.

    2. Add an `elif` (else if) alongside the others that will check if the
       operator (`op`) is equal to the percent sign (`%`).

> Hint: what you're doing is very similar to the div operator.
> Instead of using `/` to do regular division, use the `%` operator to
> perform modulus division.

#### Partner 2 only
2. Implement the exponent operator (`**`).
    1. Define a method, named `exp`, under the division method that will take
       two arguments (`a` and `b`) and return `a` to the `b` power. <br>
       The syntax in Python for exponentiation is `a ** b`.

    2. Add an `elif` (else if) alongside the others that will check if the
       operator (`op`) is equal to the exponent symbol (`**`).

> Hint: what you're doing is very similar to the multiplication operator.
> Instead of using `*`, you use the `**` operator.

### Push your changes 

1. When you are done with your respective implementation, commit your changes.

    > Remember `git add` and `git commit`. Be sure to check `git status` and
    > `git log` afterwards to make sure you successfully committed the changes.

2. Run `git pull` to retrieve and attempt to merge any changes from the remote
   repository on GitHub.
    * If you are the partner to finish your implementation *first*, wait to
      help your partner with the impending merge conflict.
    * If you are the partner to finish your implementation *second*, you will
      get a merge conflict. <br>
      **Don't panic!** Get with your partner to complete the next section
      (merge conflict).

3. Run `git push` to publish your changes to GitHub so your partner can see
   them.

> Wait until the two of you have completed this part to continue.

### Merge conflict

> Do this TOGETHER on ONE computer.

If you were the second partner to `git pull`, you will receive a merge
conflict. <br>
This is because you both changed the same lines with different code. <br>
Git is stupid (see `man git`); it cannot determine how to merge "conflicting"
lines of code. So it's up to you to resolve these conflicts.

1. Open up `calc.py` in your text editor.

2. Look for the pattern of `<<<<<<<<` and `>>>>>>>>` in the code. <br>
   This is where the merge conflict exists.

    > Notice how your changes are marked by HEAD and your partner's changes
    > are marked by a commit hash (SHA) from the remote.

3. Edit the code to include both functions. Be sure to remove the merge markers
   (`<<<<<<<<` and `>>>>>>>>`), this isn't valid python and shouldn't be left
   in the file.

4. Scan through the rest of the file to see if there are any other merge
   conflicts.

5. When you are done editing, `git add` the file and commit.

6. Run `git push` to publish your changes to GitHub so your partner can pull
   them down.

7. Your partner should now run `git pull` on his/her computer to see that you
   fixed the conflict.

Now both of you should be able to run `python calc.py` on your separate
computers and have a fully functioning calculator CLI.

### Grading

* Run `git log -3` and show it to your TA.
* Ask any questions that you have.

### Bonus: Setting up SSH keys

You may have noticed that every time you pull or push to GitHub, you have to
enter your username and password. This is because you are using the HTTPS
protocol to connect to GitHub as a remote. <br>
This has a few advantages:

* It's easier and faster to set up.
* It will still work on strict firewalls and proxies such as those restricting
  all ports but port 80 and 443 (only HTTP and HTTPS traffic).

The downsides being:

* You have to enter your credentials every time you push or pull.
* Typing your password can be insecure on unfamiliar machines or HTTP
  connections

Luckily, there is another way. You can set up the remote to use SSH instead of
HTTPS.

SSH uses RSA encryption. This allows you use a "password-less log in" using a
public/private key pair.

There is a great tutorial by GitHub on how to set up and use this method
[here](https://help.github.com/articles/generating-ssh-keys/).

> Note: you will need to add an SSH key for every different machine you want
to clone on (e.g. your personal machine and the CS servers).

