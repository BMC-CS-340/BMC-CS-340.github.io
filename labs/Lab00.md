---
layout: default
title: "CS Lab Machines 101: Command Line"
type: Lab
number: 00
active_tab: lab
release_date: 2024-01-17

---

<!-- Check whether the assignment is ready to release -->
{% capture today %}{{'now' | date: '%s'}}{% endcapture %}
{% capture release_date %}{{page.release_date | date: '%s'}}{% endcapture %}
{% if release_date > today %} 
<div class="alert alert-danger">
Warning: this assignment is out of date.  It may still need to be updated for this year's class.  Check with your instructor before you start working on this assignment.
</div>
{% endif %}
<!-- End of check whether the assignment is up to date -->


<!-- Check whether the assignment is up to date -->
<!--{% capture this_year %}{{'now' | date: '%Y'}}{% endcapture %}
{% capture due_year %}{{page.due_date | date: '%Y'}}{% endcapture %}
{% if this_year != due_year %} 
<div class="alert alert-danger">
Warning: this assignment is out of date.  It may still need to be updated for this year's class.  Check with your instructor before you start working on this assignment.
</div>
{% endif %}-->
<!-- End of check whether the assignment is up to date -->



{% if page.materials %}
<div class="alert alert-info">
You can download the materials for this assignment here:
<ul>
{% for item in page.materials %}
<li><a href="{{item.url}}">{{ item.name }}</a></li>
{% endfor %}
</ul>

</div>
{% endif %}





{{page.type}} {{page.number}}: {{page.title}}
=============================================================

## Objectives:

The main goals for this lab are:

1. Get familiar with the command line
2. Set up your course directory on the CS machines
3. Start using vim

Make sure to write down your answers for each **Exercise** below. In future labs, the TAs or Instructor
will check your answers. Whenever you see **TODO**, that means there is an action item for you to complete.

### CS113 Spring '25 Students
For students who took CS113 in previous semesters, you have already completed this lab last semester
However, we recommend you complete this lab as a refresher. At the minimum, please create a
new `cs151` directory on the goldengate machines 
and set it up as described below.

After this lab, we expect you to be familiar with the command line.

## 1. CS Lab Machines & The Command Line
The computers in the lab rooms (Park 230 and 231) are dual booted with Windows 10 and Ubuntu (a version of linux). This means that you can use either the Windows or Linux operating systems (OS). For this course, we will be using Linux. 

You should have received an email from David Diaz with your credentials to the Computer Science lab machines. If you did not receive credentials from him, immediately stop by his office in Park 294.

***TODO:*** Log into the Linux (Ubuntu) OS using the credentials you received from David. **Note:** These are not your BMC/HC credentials that you normally use.

After logging in, click on the grid on the bottom left of the screen. This will launch a screen showing all the applications. In the search bar on top, type `terminal`, and then click on the application. This will launch the terminal. In this semester we will be working primarily in the terminal.  

### Understanding the Command Line
As soon as the terminal application launches, you should see a black screen. This is where you will type command line commands. For now, we haven't covered any commands in detail so just type anything into the terminal. 


> Note: there is a difference between the terms *terminal*, *command line*, and *shell*, but we will be using them interchangeably. See [GeekForGeeks](https://www.geeksforgeeks.org/difference-between-terminal-console-shell-and-command-line/) if you are curious about the differences.


To run a command in the terminal, click `Enter`. After typing anything into the terminal (here I mean actually mean anything), click `Enter`.

***Exercise: 1:*** After you click `Enter`, what does the terminal tell you?
<br>
<br>
<br>

#### Change your password
You can completely interact with your computer using just the terminal! When a new account is created for you on any computer system, you should always change your password.

***TODO: Change your password!*** In terminal, type the command `psswd` and then press `Enter` and then follow the instructions to change your password.

<details><summary><b style="color:DodgerBlue;">Click me for help if you get stuck</b></summary>

Yes, `psswd` is not a valid command. You should see an error message in the terminal that tells you the correct command. 
</details> 

<br>

#### Command Line Prompt
All of the text thats on the left of where you are typing commands is called the `prompt`. You should notice that there are two words in the prompt that are seperated by an `@` symbol.
For example, my prompt says `edinella@goldengte:~$` 

***Exercise 2:*** What are the two words in your prompt? What does the first word indicate (the word infront of the `@`)? What does the second word indicate (the word after the `@`)?

<details><summary><b style="color:DodgerBlue;">HINT</b></summary>

To find out what the second word represents, look around the lab computer you are using for an idea.
</details> 

<br>
<br>
<br>

#### Navigation Commands!
Now we are ready to start using command line arguments. We will be using these command lines today:
- ls
- cd
- mkdir 
- wget 
- cat
- wc

##### **`pwd` command**

The first command we'll look at is `pwd`. This command prints the __p__ath to the __w__orking __d__irectory.

Computers are sturctured in a directory hierarchy where directories can contain other directories or files. A directory is just another way of saying a folder.

**TODO:** Run the command `pwd` (this means type `pwd` in the command line and click `Enter` - we'll be moving to this terminology).

***Exercise 3:*** What gets printed out? What do you think it means?

<br>
<br>
<br>

##### **`ls` command**
The next command will look at is `ls`. Instead of us first describing this command, we'll let you try it out yourself. Run the command `ls`.

***Exercise 4:*** What do you see printed out on in the terminal? What do you think all of that means?

<details><summary><b style="color:DodgerBlue;">HINT</b></summary>
On your desktop, you likely have a folder with your username. Click on that and compare what opens up with what you see in your terminal.
</details> 

<br>
<br>
<br>

We can add arguments to the `ls` command. After typing in `ls`, type the output of the `pwd` command. For example, I would run the following command:

```
ls /home/edinella/
```

***Exercise 5:*** When you run `ls` with the path to your working directory, what do you see? Do you see anything different than before when you ran just `ls`? Why or why not?

<br>
<br>
<br>

##### Piping

We can pass the output from one command as an argument to another command by using the `|` symbol.

**TODO:** Run the following command 

```
pwd | ls
```

***Exercise 6:*** What do you see? Do you see anything different than before when you ran just `ls`?
Why or why not?

<br>
<br>
<br>

#### Home directory

So far we've used `ls` to look at the files and folders in our ***home*** directory. A home directory is where all the files and folders that belong to a specific user exists. 

***TODO:*** Look carefully again at the command line prompt. At the end of the line after the name of the machine you are working on, you should see two characters. What symbols do you see? One of those represents your home directory - which one do you think it might be?

We can answer this question by using the `ls` command.
***TODO:*** Run the ls command twice, each time add one of the characters/symbols as an argument to ls. For example, if the characters were `A` and `B` (they are not), you would run

```
ls A
ls B
```
The output of running `ls` with each character would give you a hint of which of the two symbols represents your home directory.

***Exercise 7:*** So, which of the two characters/symbols represent your home directory? 

<br>
<br>
<br>

#### Absolute vs Direct Paths

So far we used `ls` to look at files in our own directory. When we run the command `ls /home/<USERNAME>` (here `<USERNAME>` is a placeholder for your actual username), the argument was an **absolute path**. An absolute path is the path from the root (or top) of the computer/file system. We can also specify **relative paths**. These are paths that go from the current working directory to another folder that we specify. For example, when we run `ls Downloads/`, that will tell us what files and folders exist in the Downloads directory.

***Exercise 8:*** If we wanted to see what files exist in the Downloads directory but using an **absolute path**, what argument would we pass to `ls`?

<br>
<br>
<br>

#### Viewing other directories 

From `pwd`, we see that the path to our home directory was `/home/<USERNAME>`.

***Exercise 9:*** How do you think we could use `ls` to find out what other users have an account on the CS lab machines?

<details><summary><b style="color:DodgerBlue;">HINT 1</b></summary>

We can add a specific absolute path as an argument to the `ls` command

</details>

<details><summary><b style="color:DodgerBlue;">HINT 2</b></summary>

The absolute path to your home directory was `/home/<USERNAME\>/`, so what directory does your home directory live in?

</details> 

<br>


We can also use a relative path. From your own directory, run the following command:

```
ls ../
```

***Exercise 10:*** What do you think that did? What do you think `../` means?

<details><summary><b style="color:DodgerBlue;">Answer</b></summary>
That command printed out the contents of the parent directory. `../` represents that parent directory.
</details> 

<br>
<br>
<br>



##### **`cd` command**
The next command will look at is `cd`, which stands for change directory. 

Like `ls`, you can pass an argument to the `cd` command. Here the argument we pass in is the directory we want to move to.

***TODO:*** Run the command `cd Downloads/`.

***Exercise 11:*** What changed in the command line prompt? What do you think that tells us?

 <details><summary><b style="color:DodgerBlue;">Hint</b></summary>
Run the `pwd` command.
</details> 

We can also run `cd` without any arguments.

***TODO:*** Run `cd` without any arguments. 

***Exercise 12:*** Based on the prompt, what directory do you think we are now in? 

 <details><summary><b style="color:DodgerBlue;">Hint</b></summary>
Run the `pwd` command.
</details> 

<br>
<br>
<br>

***Exercise 13:*** Think about the following command: `cd cs151`. What do you think will happen if we run this command?

<br>
<br>
<br>

***Exercise 14:*** Now run `cd cs151`. Did we move into that directory, why or why not?

<br>
<br>
<br>

##### **`mkdir` command**

We can create new directories in the command line using the command `mkdir`.

 ***TODO:*** Run `mkdir` without any arguments. 

***Exercise 15:*** Were you able to create a new directory? If not, why not?
 
<br>
<br>
<br>
 
***Exercise 16:*** You should notice an error message. Read the error message. Are there any new technical terms in the error message? What do you think it means?

 <details><summary><b style="color:DodgerBlue;">Answer</b></summary>
You can think of an `operand` as an argument. Technically an operand is an object or quantity that we perform an operation on. Here, what do you think the operand is and what operation are we performing on it?
</details>

<br>
<br>
<br>

The error message should also tell you an **option** or **flag** to use with the `mkdir` that can help you figure out how to use `mkdir`. We'll use the term flag and option interchangably here.  

***Exercise 17:*** What is that specific flag?

<br>
<br>
<br>

Next, use that flag to read the instructions to figure out how to create a new directory using `mkdir`. 

There is another flag you can use when running `mkdir` that will tell us the version of `mkdir`. 
***Exercise 18:*** Based on the results from running `mkdir` with that flag, what version number is the `mkdir` on the CS lab machines? Also, who is the author? 

<br>
<br>
<br>

***Exercise 19:*** Use `mkdir` to create a new directory called `cs151`. Using a command that we've seen so far in today's lab, how can we determine that the directory `cs151` was indeed created?

<br>
<br>
<br>

### Setting up your CS151 directory.

Its a good idea to stay organized through out the course. You will be writing a lot of programs across many homeworks, labs, and in-class demo sessions. Therefore, we will now create that structure. 

***Exercise 20:*** Using `mkdir`, `cd`, and `ls`, create the following folders and subfolders in `cs151/`. Tabs indicate that a folder is within another folder.

```
cs151/
	labs/
		lab00/
		lab01/
		lab02/
		...
		lab12/
	homeworks/
		hw00/
		hw01/
		hw02/
		...
		hw12/
	demos/
```


##### **More commands**
There are many more commands that you will be using during the semester. These include `cp`, `rm`, `man`, and others. Using the `--help` flag, you can read about that in terminal. 

As the semester progresses, you will get more comfortable with and even gain mastery over the command line. Programming is a skill that can be developed like any other skill: practice, practice, practice!

## 2. VIM editor

_credit: Swarthmore CS21 Lab 0_

This semester wewill use the vim editor for editing files on our system. You will primarily use vim to create and edit files containing the python program code to run on our system.

The `vi` and `vim` (Vi IMproved) editors are available on every Unix system. `vim` is an efficient and lightweight text editor that is easy to use after learning a few basic commands, which you can learn by running though the `vimtutor` tutorial.

`vim` is particularly useful when working remotely over an ssh connection (an ssh connection is
how you will connect to the lab machines remotely).

`vim` also has many advanced features and is very configurable through, e.g., the use of a `.vimrc` file. However, just a few basic commands are enough to get you started.

<b>Vim operates in two modes:</b>
1. <b>insert mode</b>: keystrokes are interpreted as inserts into the file contents at the point of the cursor.
2. <b>command or escape mode</b>: keystrokes are interpreted as vim commands, which allow a user to do such things as saving, exiting, searching, or moving around in the file.

To switch from <i>insert mode</i> to <i>command mode</i>, press the ESC key.

There are many ways to switch from <i>command mode</i> to <i>insert mode</i>. One way is to press the `i` key.

<b>To learn the vim editor, run `vimtutor`:</b>

***Exercise 21:*** Run `cd` into your cs151/labs/lab00 subdirectory and run `vimtutor` to learn vim.

```
  $ pwd                  # list current working directory
  $ cd                   # go to home directory from current directory
  $ ls                   # list (ls) home directory contents
  $ cd cs151/labs/lab00  # cd into your cs151/labs/lab00 directory
  $ pwd                  # should list /home/you/cs151/labs/lab00
  $ ls                   # list contents of current directory
```
From within your cs151/labs/lab00 subdirectory run the vim tutorial:

```
  $  vimtutor     # start the vim tutorial
```

***Exercise 21:*** Go through the sections listed below of vimtutor (the other sections cover more obscure features that are not necessary). It will take about 30 minutes to run through these lessons:

1. All of Lesson 1 (moving around, x, i, A, :wq)
1. Lesson 2.6 (dd)
1. Lesson 2.7 (undo)
1. Lesson 3.1 (p) and 3.2 (r)
1. Lesson 4.1 (G) and 4.2 (searching)
1. Lesson 6.2 (a), 6.3 ( R ), and 6.4 (y and p)

**Some Vim Resources and Links**


## 3. OPTIONAL: Downloading and viewing files
The remaining sections of this lab are optional.

For the rest of this lab, you should be working in the `labs/lab00/` directory.
  
##### **`wget` command**
We are now going to start looking at some data. `wget` is a "non-interactive network downloader," in other words it is a command that will download files from the internet. 

***TODO:*** Run `wget` and follow the instructions to figure out how it works.

***Exercise 22:*** What argument does `wget` require?

<br>
<br>
<br>

We are going to download a book from [Project Gutenberg](https://www.gutenberg.org/), an awesome project that is dedicated to the creation and distribution of eBooks. If you are interested, I'd highly recommend reading Michael S. Hart's (the project founder) short [essay](https://www.gutenberg.org/about/background/mission_statement.html) describing the mission statement.

***TODO*** On Project Gutenberg, search for a book that you are interested in. Then use `wget` to download the book. 
***Note:*** make sure to download the plaintext version. For example, if you were downloading Dracula, you would run 

```
wget https://www.gutenberg.org/ebooks/345.txt.utf-8
```
***Exercise 23:*** What command from above could you use to determine that the file has downloaded? Then use that command to make sure that the file is indeed there.

<br>
<br>
<br>

##### **`mv` command**
`mv` is a command that can be used to move from one directory to another, or even rename files.

***TODO:*** Use `mv` to rename the file to be the name of the book. Make sure to not have any spaces in the name of the file and that the file name ends in `.txt`.

##### **`cat` command**

The last command we'll use in this lab, is `cat`.
We are going to figure out what `cat` does by playing with in.

***TODO:*** Run `cat`. Next, type a message into the command line and press `Enter`. 

***Exercise 24:*** What happened? 

Once you are finished with `cat`, hit `CTRl-C`, this will terminate the `cat` program. 

***TODO:*** Using the same way we figured out how to use other commands, use the same method to read more about `cat`.

***TODO:*** Then, use `cat` to print out the entire book.

We have included more commands for interacting with files on the <a href="{{ site.url }}{{ site.baseurl }}/bash-commands.html">course webpage</a>.

***TODO Question 2.4:*** Using a command on the course webpage, determine how many lines are in your book? Using the same command that you found on the course webpage, how many words are in your book.

<br>
<br>
<br>

## Wrap up

In the next lab we will 1) learn how to remotely access the lab machines, i.e. how to log into these machines from your own computer, 2) how to configure your terminal, and 3) write Java programs.

### Signing out
For the remaining labs, before leaving, make sure your TA/instructor have signed you out of the lab. If you finish the lab early, you are free to go.
