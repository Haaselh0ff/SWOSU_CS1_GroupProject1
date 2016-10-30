Joshua Haas:
	Revision1 - Initialized Project and tested Git.
	Revision2 - Unpublished, tested Easy Mode and Medium Modes
	Revision3 - Added Hard mode
	Revision4 - Relatively finished with code, added Impossible Mode. Need other's code to finish.
	Revision5 - Added the actual "Hangman" to the code. Don't know how I could forget this...
	Revision6 - Simple test so that we can begin adding each others work.
	Revision7 - Final test
	Revision8 - Redid Impossible Mode with some massively long code and gave it a new 30 letter word.
	Revision9 - Kade's Code added. All is well.

How to:

Get "Git Bash" from interwebs, download that garbage. Right click Desktop,
click Git Bash Here

git clone https://github.com/Haaselh0ff/SWOSU_CS1_GroupProject1.git
(This will clone the repo to the desktop)

Add your .java file from Eclipse (this is in the src file
(for example, C:\Users\LAB\Desktop\Repo\Project1\src/code.java)

Right click the cloned folder and Git Bash Here

git init
(Initializes the file)

git status
(Makes sure your file was added, if it shows red then it means you got stuff that can be commited)

git add .

(Adds all new files, alternatively just type git add filename.java)

git commit -m "Your message here"
(This commits the code to your repository, I think it may ask for a
username and password at this point but idk just enter whatever it wants and you'll be good)

(When you push for the first time)
git remote add origin https://github.com/Haaselh0ff/SWOSU_CS1_GroupProject1.git

(Pushes under the newly defined place)
git push -u origin master

(After first push you can just type this)
git push 