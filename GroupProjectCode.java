import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class GroupProjectCode {
	public static void main(String[] args) { 
		GameHub();
	}
	//GameHud. This is what you see when the code starts and allows you to select the various game modes.
	public static char GameHub(){
		Scanner input = new Scanner(System.in); 
		System.out.println("GAME HUB: PLEASE SELECT A GAME \n"
				+ "(1) Hangman - The classic game of guessing letters to spell out a word. \n"
				+ "(2) Deck of Cards Game - Play one of the most exciting and rivoting games of the 20th century! \n"
				+ "(3) Ball Drop Game - It's like Plinko but without the prizes! Or Drew Carrey.");
		//TryCatch to make sure proper inputs are put into the program
		try{
			int whichGame = input.nextInt();
			if (whichGame == 1){
				//Input Josh's code here
				for (int i = 0; i < 100; ++i) System.out.println();
				System.out.println("Console Refreshed");
				System.out.print(HangmanCustomMethod());
			}			
			if (whichGame == 2){
				String[] args = null;
				//Input Kade's code here
				gameCustomMethod(args);
			}
			if (whichGame ==3){
				//Input Lane's code here
				LaneCustomMethod();
			}
			if(whichGame >=4){
				for (int i = 0; i < 100; ++i) System.out.println();
				System.out.println("RESISTANCE IS FUTILE. INPUT A CORRECT NUMBER!");
				System.out.println("RESTARTING GAME");
				System.out.print(GameHub());
			}
			if(whichGame <= 0){
				for (int i = 0; i < 100; ++i) System.out.println();
				System.out.println("RESISTANCE IS FUTILE. INPUT A CORRECT NUMBER!");
				System.out.println("RESTARTING GAME");
				System.out.print(GameHub());	
			}
		}
		//Catches any lettered inputs and repeats the program
		catch (Exception e) {
			System.out.println("ERROR: IMPROPER DATA ENTERED. PLEASE INPUT NUMERIC VALUES ONLY.");
			for (int i = 0; i < 5; ++i) System.out.println();
			System.out.print(GameHub());
		}
		char blank = ' ';
		return blank;
	}
	//HANGMAN CODE START. GO TO LINE 2880 TO SKIP.
	public static char HangmanCustomMethod(){
		Scanner input = new Scanner(System.in); 
		System.out.println("Let's play Hangman! (Code by Joshua Haas)\nPlease choose a difficulty. (1) Easy, (2) Medium, (3) Hard, (4) Impossible, "
				+ "(5) Game Hub");
		try{
			int difficulty = input.nextInt();
			String guess = null;
			if (difficulty == 1){
				double randomizer = Math.random() * 15;
				System.out.println(EasyModeCustomMethod(guess, randomizer));
			}
			if (difficulty == 2){
				double randomizer = Math.random() * 15;
				System.out.println(MediumModeCustomMethod(guess, randomizer));
			}
			if (difficulty == 3){
				double randomizer = Math.random() *15;
				System.out.println(HardModeCustomMethod(guess,randomizer));
			}
			if (difficulty == 4){
				for (int i = 0; i < 100; ++i) System.out.println();
				System.out.println("Console Refreshed");
				double randomizer = Math.random() * 15;
				System.out.print(ImpossibleModeCustomMethod(guess, randomizer));
			}
			if (difficulty == 5){
				for (int i = 0; i < 100; ++i) System.out.println();
				System.out.println("Console Refreshed");
				System.out.println(GameHub());
			}
		}
		catch(Exception e){
			System.out.println("ERROR: IMPROPER DATA ENTERED. PLEASE INPUT NUMERIC VALUES ONLY.");
			for (int i = 0; i < 7; ++i) System.out.println();
			System.out.print(HangmanCustomMethod());
		}
		char blank = ' ';
		return blank;
	}
	//EasyMode Code Start
	public static char EasyModeCustomMethod(String guess, double randomizer){
		Scanner input = new Scanner(System.in); 
		int failurecount = 0; //gonna use this later
		int Hangman = 0;
		System.out.println("________________________________________________________________________________________");
		System.out.println("|\t\t\t\tEasy Mode Enabled\t\t\t\t\t|");
		System.out.println("|_______________________________________________________________________________________|");
		System.out.println("(Please note, this program only takes in one letter at a time)");
		//Create Array
		char[] Easy;
		Easy = null;
		//Set number of integers
		//Set Randomizer up so that different words are possible
		if (randomizer > 0){
			if (randomizer < 2.5){
				Easy = new char [3];
				//Give each set a value
				Easy[0] = 68;
				Easy[1] = 79;
				Easy[2] = 71;
				System.out.print("The word you are guessing is 3 lettered and is the name of a furry animal usually kept as a pet."
						+ "\nPlease guess a letter for: ");
			}
		}
		if (randomizer > 2.5){
			if(randomizer < 5){
				Easy = new char [3];
				//Give each set a value
				Easy[0] = 67;
				Easy[1] = 65;
				Easy[2] = 84;
				System.out.print("The word you are guessing is 3 lettered and is the name of an animal with a lot of lives and is"
						+ " usually kept as a pet. \nPlease guess a letter for: ");
			}
		}
		if (randomizer > 5){
			if (randomizer < 7.5){
				Easy = new char [3];
				//Give each set a value
				Easy[0] = 74;
				Easy[1] = 79;
				Easy[2] = 66;
				System.out.print("The word you are guessing is 3 lettered and is something where you get paid in exchange for work."
						+ "\nPlease guess a letter for: ");
			}
		}
		if (randomizer > 7.5){
			if (randomizer < 10){
				Easy = new char [3];
				//Give each set a value
				Easy[0] = 67;
				Easy[1] = 85;
				Easy[2] = 80;
				System.out.print("The word you are guessing is 3 lettered and is something you usually drink water out of. "
						+ "\nPlease guess a letter for: ");
			}
		}
		if (randomizer > 10){
			if (randomizer < 12.5){
				Easy = new char [3];
				//Give each set a value
				Easy[0] = 71;
				Easy[1] = 89;
				Easy[2] = 77;
				System.out.print("The word you are guessing is 3 lettered and is where people go to work out. "
						+ "\nPlease guess a letter for: ");
			}
		}
		if (randomizer > 12.5){
			if (randomizer < 15){
				Easy = new char [3];
				//Give each set a value
				Easy[0] = 87;
				Easy[1] = 65;
				Easy[2] = 88;
				System.out.print("The word you are guessing is 3 lettered and is something that your ear makes on daily basis "
						+ "\nPlease guess a letter for: ");
			}
		}
		int[] EasyBlank;
		//char[] Easy;
		//Easy = new char [3];
		EasyBlank = new int [3];
		EasyBlank[0] = 42;
		EasyBlank[1] = 42;
		EasyBlank[2] = 42;
		System.out.print(" *** > ");
		guess = input.next();		

		System.out.print(EasyModeBlanksCustomMethod(guess, Easy, EasyBlank, failurecount, Hangman));

		char blank = ' ';
		return blank;
	}
	//Easy Mode Code continued
	public static char EasyModeBlanksCustomMethod(String guess, char[] Easy, int[] EasyBlank, int failurecount, int Hangman){
		//System.out.println("Easy Mode Blanks");
		Scanner input = new Scanner(System.in); 
		char blank = ' ';
		guess = guess.toUpperCase();
		int EasyGuess = guess.charAt(0);

		//Check if the letter given is equal to one of the values in the array
		if (EasyGuess == Easy[0]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter for: ");
		}
		if (EasyGuess == Easy[1]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter for: ");
		}
		if (EasyGuess == Easy[2]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter for: ");
		}

		if (EasyGuess == Easy[0]){
			EasyBlank[0] = Easy[0];
			System.out.print((char) EasyBlank[0]);
			System.out.print((char) EasyBlank[1]);
			System.out.print((char) EasyBlank[2]);
			if (EasyBlank[1] == Easy[1]){
				if (EasyBlank[2] == Easy[2]){
					System.out.print(DifficultyPickerCustomMethod(failurecount));
				}
			}
			System.out.print(" > ");
			guess = input.next();	
			System.out.print(EasyModeBlanksCustomMethod(guess, Easy, EasyBlank, failurecount, Hangman));
		}
		if (EasyGuess == Easy[1]){
			EasyBlank[1] = Easy[1];
			System.out.print((char) EasyBlank[0]);
			System.out.print((char) EasyBlank[1]);
			System.out.print((char) EasyBlank[2]);
			if (EasyBlank[0] == Easy[0]){
				if (EasyBlank[2] == Easy[2]){
					System.out.print(DifficultyPickerCustomMethod(failurecount));
				}
			}
			System.out.print(" > ");
			guess = input.next();	
			System.out.print(EasyModeBlanksCustomMethod(guess, Easy, EasyBlank, failurecount, Hangman));
		}
		if (EasyGuess == Easy[2]){
			EasyBlank[2] = Easy[2];
			System.out.print((char) EasyBlank[0]);
			System.out.print((char) EasyBlank[1]);
			System.out.print((char) EasyBlank[2]);
			if (EasyBlank[0] == Easy[0]){
				if (EasyBlank[1] == Easy[1]){
					System.out.print(DifficultyPickerCustomMethod(failurecount));
				}
			}
			System.out.print(" > ");
			guess = input.next();	
			System.out.print(EasyModeBlanksCustomMethod(guess, Easy, EasyBlank, failurecount, Hangman));

		}
		int failure = 0;
		if (EasyGuess != Easy[0]){
			failure += 1;
		}
		if (EasyGuess != Easy[1]){
			failure += 1;
		}
		if (EasyGuess != Easy[2]){
			failure += 1;
		}
		if (failure <= 3){
			failurecount += 1;
			Hangman += 1;
			System.out.print(HangmanManCustomMethod(Hangman));
			System.out.print("Oh, sorry. There is no " + guess + " in the word.\nYou have failed "
					+ failurecount + " times.\nGuess again for: ");
			System.out.print((char) EasyBlank[0]);
			System.out.print((char) EasyBlank[1]);
			System.out.print((char) EasyBlank[2]);
			guess = input.next();
			System.out.print(EasyModeBlanksCustomMethod(guess, Easy, EasyBlank, failurecount, Hangman));
		}
		return blank;
	}
	//Difficulty Picker output. Allows you to pick the difficulty of words.
	private static char[] DifficultyPickerCustomMethod(int failurecount) {
		Scanner input = new Scanner(System.in); 
		System.out.println("\nHey! You got the word! "
				+ "\nThanks for playing!");
		if (failurecount > 0){
			System.out.print("You only failed " + failurecount + " Times!");
		}
		if (failurecount > 10){
			System.out.print("... You missed " + failurecount + " times... just... Wow. You must be some kinda special.");
		}
		if (failurecount == 0){
			System.out.print("HOLY CRAP! YOU DIDN'T GET A SINLGE ONE WRONG! AMAZING!");
		}
		System.out.print("\nPick another difficulty? (1) Easy, (2) Medium, (3) Hard, (4) Impossible (5) Game Hub"
				+"\nOr choose the same difficulty for a different word \n");
		try{
			int difficulty = input.nextInt();
			String guess = null;
			if (difficulty == 1){
				for (int i = 0; i < 100; ++i) System.out.println();
				System.out.println("Console Refreshed");
				double randomizer = Math.random() * 15;
				System.out.println(EasyModeCustomMethod(guess, randomizer));
			}
			if (difficulty == 2){
				for (int i = 0; i < 100; ++i) System.out.println();
				System.out.println("Console Refreshed");
				double randomizer = Math.random() * 15;
				System.out.println(MediumModeCustomMethod(guess, randomizer));
			}
			if (difficulty == 3){
				for (int i = 0; i < 100; ++i) System.out.println();
				System.out.println("Console Refreshed");
				double randomizer = Math.random() * 15;
				System.out.println(HardModeCustomMethod(guess, randomizer));
			}
			if (difficulty == 4){
				for (int i = 0; i < 100; ++i) System.out.println();
				System.out.println("Console Refreshed");
				double randomizer = Math.random() * 15;
				System.out.println(ImpossibleModeCustomMethod(guess, randomizer));
				//TO DO: ADD IMPOSSIBLE MODE
			}
			if (difficulty == 5){
				for (int i = 0; i < 100; ++i) System.out.println();
				System.out.println("Console Refreshed");
				System.out.println(GameHub());
			}
		}
		catch(Exception e){
			System.out.println("ERROR: IMPROPER DATA ENTERED. PLEASE INPUT NUMERIC VALUES ONLY.");
			for (int i = 0; i < 3; ++i) System.out.println();
			System.out.print(DifficultyPickerCustomMethod(failurecount));
		}
		return null;
	}
	//Medium Mode Code Start
	public static char MediumModeCustomMethod(String guess, double randomizer){
		Scanner input = new Scanner(System.in); 
		int failurecount = 0; //gonna use this later
		int Hangman = 0;
		//Create Array
		char[] Medium;
		Medium = null;
		System.out.println("________________________________________________________________________________________");
		System.out.println("|\t\t\t\tMedium Mode Enabled\t\t\t\t\t|");
		System.out.println("|_______________________________________________________________________________________|");
		System.out.println("(Please note, this program only takes in one letter at a time)");
		//Set number of integers
		if (randomizer > 0){
			if(randomizer < 2.5){
				Medium = new char [5];
				//Give each set a value
				Medium[0] = 80;
				Medium[1] = 73;
				Medium[2] = 90;
				Medium[3] = 90;
				Medium[4] = 65;
				System.out.print("The word you are guessing is 5 lettered and originated in Italy before transforming into an American classic typically served with toppings."
						+ "\nPlease guess a letter for: ");
			}
		}
		if (randomizer > 2.5){
			if(randomizer < 5){
				Medium = new char [5];
				//Give each set a value
				Medium[0] = 74;
				Medium[1] = 65;
				Medium[2] = 90;
				Medium[3] = 90;
				Medium[4] = 89;
				System.out.print("The word you are guessing is 5 lettered and is a word one might use to describe jazz."
						+ "\nPlease guess a letter for: ");
			}
		}
		if (randomizer > 5){
			if(randomizer < 7.5){
				Medium = new char [5];
				//Give each set a value
				Medium[0] = 68;
				Medium[1] = 73;
				Medium[2] = 90;
				Medium[3] = 90;
				Medium[4] = 89;
				System.out.print("The word you are guessing is 5 lettered and is a word one might use to describe if someone is spinning."
						+ "\nPlease guess a letter for: ");
			}
		}
		if (randomizer > 7.5){
			if(randomizer < 10){
				Medium = new char [5];
				//Give each set a value
				Medium[0] = 70;
				Medium[1] = 73;
				Medium[2] = 90;
				Medium[3] = 90;
				Medium[4] = 89;
				System.out.print("The word you are guessing is 5 lettered and is a word one might use to describe a soft drink"
						+ " with a ton of bubbles. \nPlease guess a letter for: ");
			}
		}
		if (randomizer > 10){
			if(randomizer < 12.5){
				Medium = new char [5];
				//Give each set a value
				Medium[0] = 74;
				Medium[1] = 73;
				Medium[2] = 77;
				Medium[3] = 77;
				Medium[4] = 89;
				System.out.print("The word you are guessing is 5 lettered and is the name of a character on Better Call Saul."
						+ "\nPlease guess a letter for: ");
			}
		}
		if (randomizer > 12.5){
			if(randomizer < 15){
				Medium = new char [5];
				//Give each set a value
				Medium[0] = 74;
				Medium[1] = 73;
				Medium[2] = 71;
				Medium[3] = 71;
				Medium[4] = 89;
				System.out.print("The word you are guessing is 5 lettered and is an old term for someone who is well dressed or looks good."
						+ "\nPlease guess a letter for: ");
			}
		}
		int[] MediumBlank;
		//Create Blank Array
		MediumBlank = new int [5];
		MediumBlank[0] = 42;
		MediumBlank[1] = 42;
		MediumBlank[2] = 42;
		MediumBlank[3] = 42;
		MediumBlank[4] = 42;
		System.out.print(" ***** > ");
		guess = input.next();		
		System.out.print(MediumModeBlanksCustomMethod(guess, Medium, MediumBlank, failurecount, Hangman));

		char blank = ' ';
		return blank;
	}
	//Medium Code continued
	public static char MediumModeBlanksCustomMethod(String guess, char[] Medium, int[] MediumBlank, int failurecount, int Hangman){
		//System.out.println("Medium Mode Blanks");
		Scanner input = new Scanner(System.in); 
		char blank = ' ';
		guess = guess.toUpperCase();
		int MediumGuess = guess.charAt(0);

		//Check if the letter given is equal to one of the values in the array
		if (MediumGuess == Medium[0]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter for: ");
		}
		if (MediumGuess == Medium[1]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter for: ");
		}
		if (MediumGuess == Medium[2]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter for: ");
		}
		if (MediumGuess == Medium[3]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter for: ");
		}
		if (MediumGuess == Medium[4]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter for: ");
		}
		if (MediumGuess == Medium[0]){
			MediumBlank[0] = Medium[0];
			System.out.print((char) MediumBlank[0]);
			System.out.print((char) MediumBlank[1]);
			System.out.print((char) MediumBlank[2]);
			System.out.print((char) MediumBlank[3]);
			System.out.print((char) MediumBlank[4]);
			if (MediumBlank[1] == Medium[1]){
				if (MediumBlank[2] == Medium[2]){
					if (MediumBlank[3] == Medium[3]){
						if (MediumBlank[4] == Medium[4]){
							System.out.print(DifficultyPickerCustomMethod(failurecount));	
						}
					}
				}
			}
			System.out.print(" > ");
			guess = input.next();	
			System.out.print(MediumModeBlanksCustomMethod(guess, Medium, MediumBlank, failurecount, Hangman));
		}
		if (MediumGuess == Medium[1]){
			MediumBlank[1] = Medium[1];
			System.out.print((char) MediumBlank[0]);
			System.out.print((char) MediumBlank[1]);
			System.out.print((char) MediumBlank[2]);
			System.out.print((char) MediumBlank[3]);
			System.out.print((char) MediumBlank[4]);
			if (MediumBlank[0] == Medium[0]){
				if (MediumBlank[2] == Medium[2]){
					if (MediumBlank[3] == Medium[3]){
						if (MediumBlank[4] == Medium[4]){
							System.out.print(DifficultyPickerCustomMethod(failurecount));	
						}
					}
				}
			}
			System.out.print(" > ");
			guess = input.next();	
			System.out.print(MediumModeBlanksCustomMethod(guess, Medium, MediumBlank, failurecount, Hangman));
		}
		if (MediumGuess == Medium[2]){
			MediumBlank[2] = Medium[2];
			MediumBlank[3] = Medium[3];
			System.out.print((char) MediumBlank[0]);
			System.out.print((char) MediumBlank[1]);
			System.out.print((char) MediumBlank[2]);
			System.out.print((char) MediumBlank[3]);
			System.out.print((char) MediumBlank[4]);
			if (MediumBlank[0] == Medium[0]){
				if (MediumBlank[1] == Medium[1]){
					if (MediumBlank[4] == Medium[4]){
						System.out.print(DifficultyPickerCustomMethod(failurecount));	
					}
				}
			}
			System.out.print(" > ");
			guess = input.next();	
			System.out.print(MediumModeBlanksCustomMethod(guess, Medium, MediumBlank, failurecount, Hangman));

		}
		if (MediumGuess == Medium[3]){
			MediumBlank[3] = Medium[3];
			System.out.print((char) MediumBlank[0]);
			System.out.print((char) MediumBlank[1]);
			System.out.print((char) MediumBlank[2]);
			System.out.print((char) MediumBlank[3]);
			System.out.print((char) MediumBlank[4]);
			if (MediumBlank[0] == Medium[0]){
				if (MediumBlank[1] == Medium[1]){
					if (MediumBlank[2] == Medium[2]){
						if (MediumBlank[4] == Medium[4]){
							System.out.print(DifficultyPickerCustomMethod(failurecount));	
						}
					}
				}
			}
			System.out.print(" > ");
			guess = input.next();	
			System.out.print(MediumModeBlanksCustomMethod(guess, Medium, MediumBlank, failurecount, Hangman));

		}
		if (MediumGuess == Medium[4]){
			MediumBlank[4] = Medium[4];
			System.out.print((char) MediumBlank[0]);
			System.out.print((char) MediumBlank[1]);
			System.out.print((char) MediumBlank[2]);
			System.out.print((char) MediumBlank[3]);
			System.out.print((char) MediumBlank[4]);
			if (MediumBlank[0] == Medium[0]){
				if (MediumBlank[1] == Medium[1]){
					if (MediumBlank[2] == Medium[2]){
						if (MediumBlank[3] == Medium[3]){
							System.out.print(DifficultyPickerCustomMethod(failurecount));	
						}
					}
				}
			}
			System.out.print(" > ");
			guess = input.next();	
			System.out.print(MediumModeBlanksCustomMethod(guess, Medium, MediumBlank, failurecount, Hangman));

		}
		int failure = 0;
		if (MediumGuess != Medium[0]){
			failure += 1;
		}
		if (MediumGuess != Medium[1]){
			failure += 1;
		}
		if (MediumGuess != Medium[2]){
			failure += 1;
		}
		if (MediumGuess != Medium[3]){
			failure +=1;
		}
		if (MediumGuess != Medium[4]){
			failure +=1;
		}
		if (failure <= 5){
			failurecount += 1;
			Hangman += 1;
			System.out.print(HangmanManCustomMethod(Hangman));
			System.out.print("Oh, sorry. There is no " + guess + " in the word.\nYou have failed "
					+ failurecount + " times.\nGuess again for: ");
			System.out.print((char) MediumBlank[0]);
			System.out.print((char) MediumBlank[1]);
			System.out.print((char) MediumBlank[2]);
			System.out.print((char) MediumBlank[3]);
			System.out.print((char) MediumBlank[4]);
			guess = input.next();
			System.out.print(MediumModeBlanksCustomMethod(guess, Medium, MediumBlank, failurecount, Hangman));
		}
		return blank;
	}
	//Hard Mode Code Start
	public static char HardModeCustomMethod(String guess, double randomizer){
		Scanner input = new Scanner(System.in); 
		int failurecount = 0; //gonna use this later
		int Hangman = 0;
		//Create Array
		char[] Hard;
		Hard = null;
		System.out.println("________________________________________________________________________________________");
		System.out.println("|\t\t\t\tHard Mode Enabled\t\t\t\t\t|");
		System.out.println("|_______________________________________________________________________________________|");
		System.out.println("(Please note, this program only takes in one letter at a time)");
		//Set number of integers
		//Code for word LUMBERJACK
		if (randomizer > 0){
			if(randomizer < 3.75){
				Hard = new char [10];
				//Give each set a value
				Hard[0] = 76;
				Hard[1] = 85;
				Hard[2] = 77;
				Hard[3] = 66;
				Hard[4] = 69;
				Hard[5] = 82;
				Hard[6] = 74;
				Hard[7] = 65;
				Hard[8] = 67;
				Hard[9] = 75;
				System.out.print("The word you are guessing is 10 lettered and describes someone who cuts down trees for a living."
						+ "\nPlease guess a letter for: ");
			}
		}
		//Code for word QUIZMASTER
		if (randomizer > 3.75){
			if(randomizer < 7.5){
				Hard = new char [10];
				//Give each set a value
				Hard[0] = 81;
				Hard[1] = 85;
				Hard[2] = 73;
				Hard[3] = 90;
				Hard[4] = 77;
				Hard[5] = 65;
				Hard[6] = 83;
				Hard[7] = 84;
				Hard[8] = 69;
				Hard[9] = 82;
				System.out.print("The word you are guessing is 10 lettered and is a word used to describe someone who gives questions."
						+ "\nPlease guess a letter for: ");
			}
		}
		//Code for word JARGONIZED
		if (randomizer > 7.5){
			if(randomizer < 11.25){
				Hard = new char [10];
				//Give each set a value
				Hard[0] = 74;
				Hard[1] = 65;
				Hard[2] = 82;
				Hard[3] = 71;
				Hard[4] = 79;
				Hard[5] = 78;
				Hard[6] = 73;
				Hard[7] = 90;
				Hard[8] = 69;
				Hard[9] = 68;
				System.out.print("The word you are guessing is 10 lettered and is the past tense of a word which means 'to make in a"
						+ " confused an unintelligble way."
						+ "\nPlease guess a letter for: ");
			}
		}
		//Code for word JACKLIGHTS
		if (randomizer > 11.25){
			if(randomizer < 15){
				Hard = new char [10];
				//Give each set a value
				Hard[0] = 74;
				Hard[1] = 65;
				Hard[2] = 67;
				Hard[3] = 75;
				Hard[4] = 76;
				Hard[5] = 73;
				Hard[6] = 71;
				Hard[7] = 72;
				Hard[8] = 84;
				Hard[9] = 83;
				System.out.print("The word you are guessing is 10 lettered and is... I don't even know "
						+ "how to describe this man, 'a portable cresset, oil-burning lantern' oh and it's in plural form."
						+ "\nPlease guess a letter for: ");
			}
		}
		int[] HardBlank;
		//Create Blank Array
		HardBlank = new int [10];
		HardBlank[0] = 42;
		HardBlank[1] = 42;
		HardBlank[2] = 42;
		HardBlank[3] = 42;
		HardBlank[4] = 42;
		HardBlank[5] = 42;
		HardBlank[6] = 42;
		HardBlank[7] = 42;
		HardBlank[8] = 42;
		HardBlank[9] = 42;
		System.out.print(" ********** > ");
		guess = input.next();		
		System.out.print(HardModeBlanksCustomMethod(guess, Hard, HardBlank, failurecount, Hangman));

		char blank = ' ';
		return blank;
	}
	//Hard Mode Code continued
	public static char HardModeBlanksCustomMethod(String guess, char[] Hard, int[] HardBlank, int failurecount, int Hangman){
		//System.out.println("Hard Mode Blanks");
		Scanner input = new Scanner(System.in); 
		char blank = ' ';
		guess = guess.toUpperCase();
		int HardGuess = guess.charAt(0);

		//Check if the letter given is equal to one of the values in the array
		if (HardGuess == Hard[0]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter for: ");
		}
		if (HardGuess == Hard[1]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter for: ");
		}
		if (HardGuess == Hard[2]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter for: ");
		}
		if (HardGuess == Hard[3]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter for: ");
		}
		if (HardGuess == Hard[4]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter for: ");
		}
		if (HardGuess == Hard[5]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter for: ");
		}
		if (HardGuess == Hard[6]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter for: ");
		}
		if (HardGuess == Hard[7]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter for: ");
		}
		if (HardGuess == Hard[8]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter for: ");
		}
		if (HardGuess == Hard[9]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter for: ");
		}
		if (HardGuess == Hard[0]){
			HardBlank[0] = Hard[0];
			System.out.print((char) HardBlank[0]);
			System.out.print((char) HardBlank[1]);
			System.out.print((char) HardBlank[2]);
			System.out.print((char) HardBlank[3]);
			System.out.print((char) HardBlank[4]);
			System.out.print((char) HardBlank[5]);
			System.out.print((char) HardBlank[6]);
			System.out.print((char) HardBlank[7]);
			System.out.print((char) HardBlank[8]);
			System.out.print((char) HardBlank[9]);
			if (HardBlank[1] == Hard[1]){
				if (HardBlank[2] == Hard[2]){
					if (HardBlank[3] == Hard[3]){
						if (HardBlank[4] == Hard[4]){
							if (HardBlank[5] == Hard[5]){
								if (HardBlank[6] == Hard[6]){
									if (HardBlank[7] == Hard[7]){
										if (HardBlank[8] == Hard[8]){
											if (HardBlank[9] == Hard[9]){
												System.out.print(DifficultyPickerCustomMethod(failurecount));	
											}
										}
									}
								}
							}
						}
					}
				}
			}
			System.out.print(" > ");
			guess = input.next();	
			System.out.print(HardModeBlanksCustomMethod(guess, Hard, HardBlank, failurecount, Hangman));
		}
		if (HardGuess == Hard[1]){
			HardBlank[1] = Hard[1];
			System.out.print((char) HardBlank[0]);
			System.out.print((char) HardBlank[1]);
			System.out.print((char) HardBlank[2]);
			System.out.print((char) HardBlank[3]);
			System.out.print((char) HardBlank[4]);
			System.out.print((char) HardBlank[5]);
			System.out.print((char) HardBlank[6]);
			System.out.print((char) HardBlank[7]);
			System.out.print((char) HardBlank[8]);
			System.out.print((char) HardBlank[9]);
			if (HardBlank[0] == Hard[0]){
				if (HardBlank[2] == Hard[2]){
					if (HardBlank[3] == Hard[3]){
						if (HardBlank[4] == Hard[4]){
							if (HardBlank[5] == Hard[5]){
								if (HardBlank[6] == Hard[6]){
									if (HardBlank[7] == Hard[7]){
										if (HardBlank[8] == Hard[8]){
											if (HardBlank[9] == Hard[9]){
												System.out.print(DifficultyPickerCustomMethod(failurecount));	
											}
										}
									}
								}
							}
						}
					}
				}
			}
			System.out.print(" > ");
			guess = input.next();	
			System.out.print(HardModeBlanksCustomMethod(guess, Hard, HardBlank, failurecount, Hangman));
		}
		if (HardGuess == Hard[2]){
			HardBlank[2] = Hard[2];
			System.out.print((char) HardBlank[0]);
			System.out.print((char) HardBlank[1]);
			System.out.print((char) HardBlank[2]);
			System.out.print((char) HardBlank[3]);
			System.out.print((char) HardBlank[4]);
			System.out.print((char) HardBlank[5]);
			System.out.print((char) HardBlank[6]);
			System.out.print((char) HardBlank[7]);
			System.out.print((char) HardBlank[8]);
			System.out.print((char) HardBlank[9]);
			if (HardBlank[0] == Hard[0]){
				if (HardBlank[1] == Hard[1]){
					if (HardBlank[3] == Hard[3]){
						if (HardBlank[4] == Hard[4]){
							if (HardBlank[5] == Hard[5]){
								if (HardBlank[6] == Hard[6]){
									if (HardBlank[7] == Hard[7]){
										if (HardBlank[8] == Hard[8]){
											if (HardBlank[9] == Hard[9]){
												System.out.print(DifficultyPickerCustomMethod(failurecount));	
											}
										}
									}
								}
							}
						}
					}
				}
			}
			System.out.print(" > ");
			guess = input.next();	
			System.out.print(HardModeBlanksCustomMethod(guess, Hard, HardBlank, failurecount, Hangman));

		}
		if (HardGuess == Hard[3]){
			HardBlank[3] = Hard[3];
			System.out.print((char) HardBlank[0]);
			System.out.print((char) HardBlank[1]);
			System.out.print((char) HardBlank[2]);
			System.out.print((char) HardBlank[3]);
			System.out.print((char) HardBlank[4]);
			System.out.print((char) HardBlank[5]);
			System.out.print((char) HardBlank[6]);
			System.out.print((char) HardBlank[7]);
			System.out.print((char) HardBlank[8]);
			System.out.print((char) HardBlank[9]);
			if (HardBlank[0] == Hard[0]){
				if (HardBlank[1] == Hard[1]){
					if (HardBlank[2] == Hard[2]){
						if (HardBlank[4] == Hard[4]){
							if (HardBlank[5] == Hard[5]){
								if (HardBlank[6] == Hard[6]){
									if (HardBlank[7] == Hard[7]){
										if (HardBlank[8] == Hard[8]){
											if (HardBlank[9] == Hard[9]){
												System.out.print(DifficultyPickerCustomMethod(failurecount));	
											}
										}
									}
								}
							}	
						}
					}
				}
			}
			System.out.print(" > ");
			guess = input.next();	
			System.out.print(HardModeBlanksCustomMethod(guess, Hard, HardBlank, failurecount, Hangman));

		}
		if (HardGuess == Hard[4]){
			HardBlank[4] = Hard[4];
			System.out.print((char) HardBlank[0]);
			System.out.print((char) HardBlank[1]);
			System.out.print((char) HardBlank[2]);
			System.out.print((char) HardBlank[3]);
			System.out.print((char) HardBlank[4]);
			System.out.print((char) HardBlank[5]);
			System.out.print((char) HardBlank[6]);
			System.out.print((char) HardBlank[7]);
			System.out.print((char) HardBlank[8]);
			System.out.print((char) HardBlank[9]);
			if (HardBlank[0] == Hard[0]){
				if (HardBlank[1] == Hard[1]){
					if (HardBlank[2] == Hard[2]){
						if (HardBlank[3] == Hard[3]){
							if (HardBlank[5] == Hard[5]){
								if (HardBlank[6] == Hard[6]){
									if (HardBlank[7] == Hard[7]){
										if (HardBlank[8] == Hard[8]){
											if (HardBlank[9] == Hard[9]){
												System.out.print(DifficultyPickerCustomMethod(failurecount));	
											}
										}
									}
								}
							}
						}
					}
				}
			}
			System.out.print(" > ");
			guess = input.next();	
			System.out.print(HardModeBlanksCustomMethod(guess, Hard, HardBlank, failurecount, Hangman));
		}
		if (HardGuess == Hard[5]){
			HardBlank[5] = Hard[5];
			System.out.print((char) HardBlank[0]);
			System.out.print((char) HardBlank[1]);
			System.out.print((char) HardBlank[2]);
			System.out.print((char) HardBlank[3]);
			System.out.print((char) HardBlank[4]);
			System.out.print((char) HardBlank[5]);
			System.out.print((char) HardBlank[6]);
			System.out.print((char) HardBlank[7]);
			System.out.print((char) HardBlank[8]);
			System.out.print((char) HardBlank[9]);
			if (HardBlank[0] == Hard[0]){
				if (HardBlank[1] == Hard[1]){
					if (HardBlank[2] == Hard[2]){
						if (HardBlank[3] == Hard[3]){
							if (HardBlank[4] == Hard[4]){
								if (HardBlank[6] == Hard[6]){
									if (HardBlank[7] == Hard[7]){
										if (HardBlank[8] == Hard[8]){
											if (HardBlank[9] == Hard[9]){
												System.out.print(DifficultyPickerCustomMethod(failurecount));	
											}
										}
									}
								}
							}
						}
					}
				}
			}
			System.out.print(" > ");
			guess = input.next();	
			System.out.print(HardModeBlanksCustomMethod(guess, Hard, HardBlank, failurecount, Hangman));
		}
		if (HardGuess == Hard[6]){
			HardBlank[6] = Hard[6];
			System.out.print((char) HardBlank[0]);
			System.out.print((char) HardBlank[1]);
			System.out.print((char) HardBlank[2]);
			System.out.print((char) HardBlank[3]);
			System.out.print((char) HardBlank[4]);
			System.out.print((char) HardBlank[5]);
			System.out.print((char) HardBlank[6]);
			System.out.print((char) HardBlank[7]);
			System.out.print((char) HardBlank[8]);
			System.out.print((char) HardBlank[9]);
			if (HardBlank[0] == Hard[0]){
				if (HardBlank[1] == Hard[1]){
					if (HardBlank[2] == Hard[2]){
						if (HardBlank[3] == Hard[3]){
							if (HardBlank[4] == Hard[4]){
								if (HardBlank[5] == Hard[5]){
									if (HardBlank[7] == Hard[7]){
										if (HardBlank[8] == Hard[8]){
											if (HardBlank[9] == Hard[9]){
												System.out.print(DifficultyPickerCustomMethod(failurecount));	
											}
										}
									}
								}
							}
						}
					}
				}
			}
			System.out.print(" > ");
			guess = input.next();	
			System.out.print(HardModeBlanksCustomMethod(guess, Hard, HardBlank, failurecount, Hangman));
		}
		if (HardGuess == Hard[7]){
			HardBlank[7] = Hard[7];
			System.out.print((char) HardBlank[0]);
			System.out.print((char) HardBlank[1]);
			System.out.print((char) HardBlank[2]);
			System.out.print((char) HardBlank[3]);
			System.out.print((char) HardBlank[4]);
			System.out.print((char) HardBlank[5]);
			System.out.print((char) HardBlank[6]);
			System.out.print((char) HardBlank[7]);
			System.out.print((char) HardBlank[8]);
			System.out.print((char) HardBlank[9]);
			if (HardBlank[0] == Hard[0]){
				if (HardBlank[1] == Hard[1]){
					if (HardBlank[2] == Hard[2]){
						if (HardBlank[3] == Hard[3]){
							if (HardBlank[4] == Hard[4]){
								if (HardBlank[5] == Hard[5]){
									if (HardBlank[6] == Hard[6]){
										if (HardBlank[8] == Hard[8]){
											if (HardBlank[9] == Hard[9]){
												System.out.print(DifficultyPickerCustomMethod(failurecount));	
											}
										}
									}
								}
							}
						}
					}
				}
			}
			System.out.print(" > ");
			guess = input.next();	
			System.out.print(HardModeBlanksCustomMethod(guess, Hard, HardBlank, failurecount, Hangman));
		}
		if (HardGuess == Hard[8]){
			HardBlank[8] = Hard[8];
			System.out.print((char) HardBlank[0]);
			System.out.print((char) HardBlank[1]);
			System.out.print((char) HardBlank[2]);
			System.out.print((char) HardBlank[3]);
			System.out.print((char) HardBlank[4]);
			System.out.print((char) HardBlank[5]);
			System.out.print((char) HardBlank[6]);
			System.out.print((char) HardBlank[7]);
			System.out.print((char) HardBlank[8]);
			System.out.print((char) HardBlank[9]);
			if (HardBlank[0] == Hard[0]){
				if (HardBlank[1] == Hard[1]){
					if (HardBlank[2] == Hard[2]){
						if (HardBlank[3] == Hard[3]){
							if (HardBlank[4] == Hard[4]){
								if (HardBlank[5] == Hard[5]){
									if (HardBlank[6] == Hard[6]){
										if (HardBlank[7] == Hard[7]){
											if (HardBlank[9] == Hard[9]){
												System.out.print(DifficultyPickerCustomMethod(failurecount));	
											}
										}
									}
								}
							}
						}
					}
				}
			}
			System.out.print(" > ");
			guess = input.next();	
			System.out.print(HardModeBlanksCustomMethod(guess, Hard, HardBlank, failurecount, Hangman));
		}
		if (HardGuess == Hard[9]){
			HardBlank[9] = Hard[9];
			System.out.print((char) HardBlank[0]);
			System.out.print((char) HardBlank[1]);
			System.out.print((char) HardBlank[2]);
			System.out.print((char) HardBlank[3]);
			System.out.print((char) HardBlank[4]);
			System.out.print((char) HardBlank[5]);
			System.out.print((char) HardBlank[6]);
			System.out.print((char) HardBlank[7]);
			System.out.print((char) HardBlank[8]);
			System.out.print((char) HardBlank[9]);
			if (HardBlank[0] == Hard[0]){
				if (HardBlank[1] == Hard[1]){
					if (HardBlank[2] == Hard[2]){
						if (HardBlank[3] == Hard[3]){
							if (HardBlank[4] == Hard[4]){
								if (HardBlank[5] == Hard[5]){
									if (HardBlank[6] == Hard[6]){
										if (HardBlank[7] == Hard[7]){
											if (HardBlank[8] == Hard[8]){
												System.out.print(DifficultyPickerCustomMethod(failurecount));	
											}
										}
									}
								}
							}
						}
					}
				}
			}
			System.out.print(" > ");
			guess = input.next();	
			System.out.print(HardModeBlanksCustomMethod(guess, Hard, HardBlank, failurecount, Hangman));
		}
		int failure = 0;
		if (HardGuess != Hard[0]){
			failure += 1;
		}
		if (HardGuess != Hard[1]){
			failure += 1;
		}
		if (HardGuess != Hard[2]){
			failure += 1;
		}
		if (HardGuess != Hard[3]){
			failure +=1;
		}
		if (HardGuess != Hard[4]){
			failure +=1;
		}
		if (HardGuess != Hard[5]){
			failure +=1;
		}
		if (HardGuess != Hard[6]){
			failure +=1;
		}
		if (HardGuess != Hard[7]){
			failure +=1;
		}
		if (HardGuess != Hard[8]){
			failure +=1;
		}
		if (HardGuess != Hard[9]){
			failure +=1;
		}
		if (failure <= 10){
			failurecount += 1;
			Hangman += 1;
			System.out.print(HangmanManCustomMethod(Hangman));
			System.out.print("Oh, sorry. There is no " + guess + " in the word.\nYou have failed "
					+ failurecount + " times.\nGuess again for: ");
			System.out.print((char) HardBlank[0]);
			System.out.print((char) HardBlank[1]);
			System.out.print((char) HardBlank[2]);
			System.out.print((char) HardBlank[3]);
			System.out.print((char) HardBlank[4]);
			System.out.print((char) HardBlank[5]);
			System.out.print((char) HardBlank[6]);
			System.out.print((char) HardBlank[7]);
			System.out.print((char) HardBlank[8]);
			System.out.print((char) HardBlank[9]);
			guess = input.next();
			System.out.print(HardModeBlanksCustomMethod(guess, Hard, HardBlank, failurecount, Hangman));
		}
		return blank;
	}
	//WARNING! CODE IS EXTREMELY LONG AND PROBABLY DONE THE WRONG WAY! ENTER WITH CAUTION
	public static char ImpossibleModeCustomMethod(String guess, double randomizer){
		Scanner input = new Scanner(System.in); 
		int failurecount = 0; //gonna use this later
		int Hangman = 0;
		//Create Array
		char[] Impossible;
		Impossible = null;
		System.out.println("________________________________________________________________________________________");
		System.out.println("|\t\t\t\tImpossible Mode Enabled\t\t\t\t\t|");
		System.out.println("|_______________________________________________________________________________________|");
		System.out.println("(Please note, this program only takes in one letter at a time)");
		//Set number of integers
		//Code for word PSEUDOPSEUDOHYPOPARATHYROIDISM
		if (randomizer > 0){
			if(randomizer < 15){
				Impossible = new char [30];
				//Give each set a value
				Impossible[0] = 80; //P Impossible[6] Impossible[14] Impossible[16]
				Impossible[1] = 83; //S Impossible[7] Impossible[28]
				Impossible[2] = 69; //E Impossible[8]
				Impossible[3] = 85; //U Impossible[9]
				Impossible[4] = 68; //D Impossible[10] Impossible[26]
				Impossible[5] = 79; //O Impossible[11] Impossible[15] Impossible[24]
				Impossible[6] = 80; //P --------------------------------------------
				Impossible[7] = 83; //S --------------------------------------------
				Impossible[8] = 69; //E --------------------------------------------
				Impossible[9] = 85; //U --------------------------------------------
				Impossible[10] = 68; //D -------------------------------------------
				Impossible[11] = 79; //O -------------------------------------------
				Impossible[12] = 72; //H Impossible[21]
				Impossible[13] = 89; //Y Impossible[22]
				Impossible[14] = 80; //P -------------------------------------------
				Impossible[15] = 79; //O -------------------------------------------
				Impossible[16] = 80; //P -------------------------------------------
				Impossible[17] = 65; //A Impossible[19]
				Impossible[18] = 82; //R Impossible[23]
				Impossible[19] = 65; //A -------------------------------------------
				Impossible[20] = 84; //T Impossible[20]
				Impossible[21] = 72; //H -------------------------------------------
				Impossible[22] = 89; //Y -------------------------------------------
				Impossible[23] = 82; //R -------------------------------------------
				Impossible[24] = 79; //O -------------------------------------------
				Impossible[25] = 73; //I Impossible[27]
				Impossible[26] = 68; //D -------------------------------------------
				Impossible[27] = 73; //I -------------------------------------------
				Impossible[28] = 83; //S -------------------------------------------
				Impossible[29] = 77; //M Impossible[29]


				System.out.print("The word you are guessing is 30 LETTERS LONG. There is no hint."
						+ "\nPlease guess a letter for: ");
			}
		}
		int[] ImpossibleBlank;
		//Create Blank Array
		ImpossibleBlank = new int [30];
		ImpossibleBlank[0] = 42;
		ImpossibleBlank[1] = 42;
		ImpossibleBlank[2] = 42;
		ImpossibleBlank[3] = 42;
		ImpossibleBlank[4] = 42;
		ImpossibleBlank[5] = 42;
		ImpossibleBlank[6] = 42;
		ImpossibleBlank[7] = 42;
		ImpossibleBlank[8] = 42;
		ImpossibleBlank[9] = 42;
		ImpossibleBlank[10] = 42;
		ImpossibleBlank[11] = 42;
		ImpossibleBlank[12] = 42;
		ImpossibleBlank[13] = 42;
		ImpossibleBlank[14] = 42;
		ImpossibleBlank[15] = 42;
		ImpossibleBlank[16] = 42;
		ImpossibleBlank[17] = 42;
		ImpossibleBlank[18] = 42;
		ImpossibleBlank[19] = 42;
		ImpossibleBlank[20] = 42;
		ImpossibleBlank[21] = 42;
		ImpossibleBlank[22] = 42;
		ImpossibleBlank[23] = 42;
		ImpossibleBlank[24] = 42;
		ImpossibleBlank[25] = 42;
		ImpossibleBlank[26] = 42;
		ImpossibleBlank[27] = 42;
		ImpossibleBlank[28] = 42;
		ImpossibleBlank[29] = 42;

		System.out.print(" ****************************** > ");
		guess = input.next();		
		System.out.print(ImpossibleModeBlanksCustomMethod(guess, Impossible, ImpossibleBlank, failurecount, Hangman));

		char blank = ' ';
		return blank;
	}
	//WARNING! CODE IS EXTREMELY LONG AND PROBABLY DONE THE WRONG WAY! ENTER WITH CAUTION
	public static char ImpossibleModeBlanksCustomMethod(String guess, char[] Impossible, int[] ImpossibleBlank, int failurecount, int Hangman){
		//System.out.println("Impossible Mode Blanks");
		Scanner input = new Scanner(System.in); 
		char blank = ' ';
		guess = guess.toUpperCase();
		int ImpossibleGuess = guess.charAt(0);

		//Check if the letter given is equal to one of the values in the array
		if (ImpossibleGuess == Impossible[0]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter for: ");
		}
		if (ImpossibleGuess == Impossible[1]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter for: ");
		}
		if (ImpossibleGuess == Impossible[2]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter for: ");
		}
		if (ImpossibleGuess == Impossible[3]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter for: ");
		}
		if (ImpossibleGuess == Impossible[4]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter for: ");
		}
		if (ImpossibleGuess == Impossible[5]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter for: ");
		}
		if (ImpossibleGuess == Impossible[6]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter : ");
		}
		if (ImpossibleGuess == Impossible[7]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter : ");
		}
		if (ImpossibleGuess == Impossible[8]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter : ");
		}
		if (ImpossibleGuess == Impossible[9]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter : ");
		}
		if (ImpossibleGuess == Impossible[10]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter : ");
		}
		if (ImpossibleGuess == Impossible[11]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter : ");
		}
		if (ImpossibleGuess == Impossible[12]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter : ");
		}
		if (ImpossibleGuess == Impossible[13]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter : ");
		}
		if (ImpossibleGuess == Impossible[14]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter : ");
		}
		if (ImpossibleGuess == Impossible[15]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter : ");
		}
		if (ImpossibleGuess == Impossible[16]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter : ");
		}
		if (ImpossibleGuess == Impossible[17]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter : ");
		}
		if (ImpossibleGuess == Impossible[18]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter : ");
		}
		if (ImpossibleGuess == Impossible[19]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter : ");
		}
		if (ImpossibleGuess == Impossible[20]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter : ");
		}
		if (ImpossibleGuess == Impossible[21]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter : ");
		}
		if (ImpossibleGuess == Impossible[22]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter : ");
		}
		if (ImpossibleGuess == Impossible[23]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter : ");
		}
		if (ImpossibleGuess == Impossible[24]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter : ");
		}
		if (ImpossibleGuess == Impossible[25]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter : ");
		}
		if (ImpossibleGuess == Impossible[26]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter : ");
		}
		if (ImpossibleGuess == Impossible[27]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter : ");
		}
		if (ImpossibleGuess == Impossible[28]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter : ");
		}
		if (ImpossibleGuess == Impossible[29]){
			System.out.println("Correct! There is a " + guess + "!");
			System.out.print("Please guess a letter : ");
		}
		if (ImpossibleGuess == Impossible[0]){ //P Impossible[6] Impossible[14] Impossible[16]
			ImpossibleBlank[0] = Impossible[0];
			ImpossibleBlank[6] = Impossible[6];
			ImpossibleBlank[14] = Impossible[14];
			ImpossibleBlank[16] = Impossible[16];
			System.out.print((char) ImpossibleBlank[0]);
			System.out.print((char) ImpossibleBlank[1]);
			System.out.print((char) ImpossibleBlank[2]);
			System.out.print((char) ImpossibleBlank[3]);
			System.out.print((char) ImpossibleBlank[4]);
			System.out.print((char) ImpossibleBlank[5]);
			System.out.print((char) ImpossibleBlank[6]);
			System.out.print((char) ImpossibleBlank[7]);
			System.out.print((char) ImpossibleBlank[8]);
			System.out.print((char) ImpossibleBlank[9]);
			System.out.print((char) ImpossibleBlank[10]);
			System.out.print((char) ImpossibleBlank[11]);
			System.out.print((char) ImpossibleBlank[12]);
			System.out.print((char) ImpossibleBlank[13]);
			System.out.print((char) ImpossibleBlank[14]);
			System.out.print((char) ImpossibleBlank[15]);
			System.out.print((char) ImpossibleBlank[16]);
			System.out.print((char) ImpossibleBlank[17]);
			System.out.print((char) ImpossibleBlank[18]);
			System.out.print((char) ImpossibleBlank[19]);
			System.out.print((char) ImpossibleBlank[20]);
			System.out.print((char) ImpossibleBlank[21]);
			System.out.print((char) ImpossibleBlank[22]);
			System.out.print((char) ImpossibleBlank[23]);
			System.out.print((char) ImpossibleBlank[24]);
			System.out.print((char) ImpossibleBlank[25]);
			System.out.print((char) ImpossibleBlank[26]);
			System.out.print((char) ImpossibleBlank[27]);
			System.out.print((char) ImpossibleBlank[28]);
			System.out.print((char) ImpossibleBlank[29]);
			if (ImpossibleBlank[0] == Impossible[0]){
				if (ImpossibleBlank[1] == Impossible[1]){
					if (ImpossibleBlank[2] == Impossible[2]){
						if (ImpossibleBlank[3] == Impossible[3]){
							if (ImpossibleBlank[4] == Impossible[4]){
								if (ImpossibleBlank[5] == Impossible[5]){
									if (ImpossibleBlank[6] == Impossible[6]){
										if (ImpossibleBlank[7] == Impossible[7]){
											if (ImpossibleBlank[8] == Impossible[8]){
												if (ImpossibleBlank[9] == Impossible[9]){
													if (ImpossibleBlank[10] == Impossible[10]){
														if (ImpossibleBlank[11] == Impossible[11]){
															if (ImpossibleBlank[12] == Impossible[12]){
																if (ImpossibleBlank[13] == Impossible[13]){
																	if (ImpossibleBlank[14] == Impossible[14]){
																		if (ImpossibleBlank[15] == Impossible[15]){
																			if (ImpossibleBlank[16] == Impossible[16]){
																				if (ImpossibleBlank[17] == Impossible[17]){
																					if (ImpossibleBlank[18] == Impossible[18]){
																						if (ImpossibleBlank[19] == Impossible[19]){
																							if (ImpossibleBlank[20] == Impossible[20]){
																								if (ImpossibleBlank[21] == Impossible[21]){
																									if (ImpossibleBlank[22] == Impossible[22]){
																										if (ImpossibleBlank[23] == Impossible[23]){
																											if (ImpossibleBlank[24] == Impossible[24]){
																												if (ImpossibleBlank[25] == Impossible[25]){
																													if (ImpossibleBlank[26] == Impossible[26]){
																														if (ImpossibleBlank[27] == Impossible[27]){
																															if (ImpossibleBlank[28] == Impossible[28]){
																																if (ImpossibleBlank[29] == Impossible[29]){
																																	System.out.print(DifficultyPickerCustomMethod(failurecount));	
																																}	
																															}	
																														}	
																													}	
																												}	
																											}	
																										}
																									}	
																								}
																							}
																						}	
																					}	
																				}
																			}
																		}
																	}	
																}
															}
														}
													}	
												}
											}	
										}	
									}
								}
							}
						}
					}
				}
			}
			System.out.print(" > ");
			guess = input.next();	
			System.out.print(ImpossibleModeBlanksCustomMethod(guess, Impossible, ImpossibleBlank, failurecount, Hangman));
		}
		if (ImpossibleGuess == Impossible[1]){ //S Impossible[7] Impossible[28]
			ImpossibleBlank[1] = Impossible[1];
			ImpossibleBlank[7] = Impossible[7];
			ImpossibleBlank[28] = Impossible[28];
			System.out.print((char) ImpossibleBlank[0]);
			System.out.print((char) ImpossibleBlank[1]);
			System.out.print((char) ImpossibleBlank[2]);
			System.out.print((char) ImpossibleBlank[3]);
			System.out.print((char) ImpossibleBlank[4]);
			System.out.print((char) ImpossibleBlank[5]);
			System.out.print((char) ImpossibleBlank[6]);
			System.out.print((char) ImpossibleBlank[7]);
			System.out.print((char) ImpossibleBlank[8]);
			System.out.print((char) ImpossibleBlank[9]);
			System.out.print((char) ImpossibleBlank[10]);
			System.out.print((char) ImpossibleBlank[11]);
			System.out.print((char) ImpossibleBlank[12]);
			System.out.print((char) ImpossibleBlank[13]);
			System.out.print((char) ImpossibleBlank[14]);
			System.out.print((char) ImpossibleBlank[15]);
			System.out.print((char) ImpossibleBlank[16]);
			System.out.print((char) ImpossibleBlank[17]);
			System.out.print((char) ImpossibleBlank[18]);
			System.out.print((char) ImpossibleBlank[19]);
			System.out.print((char) ImpossibleBlank[20]);
			System.out.print((char) ImpossibleBlank[21]);
			System.out.print((char) ImpossibleBlank[22]);
			System.out.print((char) ImpossibleBlank[23]);
			System.out.print((char) ImpossibleBlank[24]);
			System.out.print((char) ImpossibleBlank[25]);
			System.out.print((char) ImpossibleBlank[26]);
			System.out.print((char) ImpossibleBlank[27]);
			System.out.print((char) ImpossibleBlank[28]);
			System.out.print((char) ImpossibleBlank[29]);
			if (ImpossibleBlank[0] == Impossible[0]){
				if (ImpossibleBlank[1] == Impossible[1]){
					if (ImpossibleBlank[2] == Impossible[2]){
						if (ImpossibleBlank[3] == Impossible[3]){
							if (ImpossibleBlank[4] == Impossible[4]){
								if (ImpossibleBlank[5] == Impossible[5]){
									if (ImpossibleBlank[6] == Impossible[6]){
										if (ImpossibleBlank[7] == Impossible[7]){
											if (ImpossibleBlank[8] == Impossible[8]){
												if (ImpossibleBlank[9] == Impossible[9]){
													if (ImpossibleBlank[10] == Impossible[10]){
														if (ImpossibleBlank[11] == Impossible[11]){
															if (ImpossibleBlank[12] == Impossible[12]){
																if (ImpossibleBlank[13] == Impossible[13]){
																	if (ImpossibleBlank[14] == Impossible[14]){
																		if (ImpossibleBlank[15] == Impossible[15]){
																			if (ImpossibleBlank[16] == Impossible[16]){
																				if (ImpossibleBlank[17] == Impossible[17]){
																					if (ImpossibleBlank[18] == Impossible[18]){
																						if (ImpossibleBlank[19] == Impossible[19]){
																							if (ImpossibleBlank[20] == Impossible[20]){
																								if (ImpossibleBlank[21] == Impossible[21]){
																									if (ImpossibleBlank[22] == Impossible[22]){
																										if (ImpossibleBlank[23] == Impossible[23]){
																											if (ImpossibleBlank[24] == Impossible[24]){
																												if (ImpossibleBlank[25] == Impossible[25]){
																													if (ImpossibleBlank[26] == Impossible[26]){
																														if (ImpossibleBlank[27] == Impossible[27]){
																															if (ImpossibleBlank[28] == Impossible[28]){
																																if (ImpossibleBlank[29] == Impossible[29]){
																																	System.out.print(DifficultyPickerCustomMethod(failurecount));	
																																}	
																															}	
																														}	
																													}	
																												}	
																											}	
																										}
																									}	
																								}
																							}
																						}	
																					}	
																				}
																			}
																		}
																	}	
																}
															}
														}
													}	
												}
											}	
										}	
									}
								}
							}
						}
					}
				}
			}
			System.out.print(" > ");
			guess = input.next();	
			System.out.print(ImpossibleModeBlanksCustomMethod(guess, Impossible, ImpossibleBlank, failurecount, Hangman));
		}
		if (ImpossibleGuess == Impossible[2]){ //E Impossible[8]
			ImpossibleBlank[2] = Impossible[2];
			ImpossibleBlank[8] = Impossible[8];
			System.out.print((char) ImpossibleBlank[0]);
			System.out.print((char) ImpossibleBlank[1]);
			System.out.print((char) ImpossibleBlank[2]);
			System.out.print((char) ImpossibleBlank[3]);
			System.out.print((char) ImpossibleBlank[4]);
			System.out.print((char) ImpossibleBlank[5]);
			System.out.print((char) ImpossibleBlank[6]);
			System.out.print((char) ImpossibleBlank[7]);
			System.out.print((char) ImpossibleBlank[8]);
			System.out.print((char) ImpossibleBlank[9]);
			System.out.print((char) ImpossibleBlank[10]);
			System.out.print((char) ImpossibleBlank[11]);
			System.out.print((char) ImpossibleBlank[12]);
			System.out.print((char) ImpossibleBlank[13]);
			System.out.print((char) ImpossibleBlank[14]);
			System.out.print((char) ImpossibleBlank[15]);
			System.out.print((char) ImpossibleBlank[16]);
			System.out.print((char) ImpossibleBlank[17]);
			System.out.print((char) ImpossibleBlank[18]);
			System.out.print((char) ImpossibleBlank[19]);
			System.out.print((char) ImpossibleBlank[20]);
			System.out.print((char) ImpossibleBlank[21]);
			System.out.print((char) ImpossibleBlank[22]);
			System.out.print((char) ImpossibleBlank[23]);
			System.out.print((char) ImpossibleBlank[24]);
			System.out.print((char) ImpossibleBlank[25]);
			System.out.print((char) ImpossibleBlank[26]);
			System.out.print((char) ImpossibleBlank[27]);
			System.out.print((char) ImpossibleBlank[28]);
			System.out.print((char) ImpossibleBlank[29]);
			if (ImpossibleBlank[0] == Impossible[0]){
				if (ImpossibleBlank[1] == Impossible[1]){
					if (ImpossibleBlank[2] == Impossible[2]){
						if (ImpossibleBlank[3] == Impossible[3]){
							if (ImpossibleBlank[4] == Impossible[4]){
								if (ImpossibleBlank[5] == Impossible[5]){
									if (ImpossibleBlank[6] == Impossible[6]){
										if (ImpossibleBlank[7] == Impossible[7]){
											if (ImpossibleBlank[8] == Impossible[8]){
												if (ImpossibleBlank[9] == Impossible[9]){
													if (ImpossibleBlank[10] == Impossible[10]){
														if (ImpossibleBlank[11] == Impossible[11]){
															if (ImpossibleBlank[12] == Impossible[12]){
																if (ImpossibleBlank[13] == Impossible[13]){
																	if (ImpossibleBlank[14] == Impossible[14]){
																		if (ImpossibleBlank[15] == Impossible[15]){
																			if (ImpossibleBlank[16] == Impossible[16]){
																				if (ImpossibleBlank[17] == Impossible[17]){
																					if (ImpossibleBlank[18] == Impossible[18]){
																						if (ImpossibleBlank[19] == Impossible[19]){
																							if (ImpossibleBlank[20] == Impossible[20]){
																								if (ImpossibleBlank[21] == Impossible[21]){
																									if (ImpossibleBlank[22] == Impossible[22]){
																										if (ImpossibleBlank[23] == Impossible[23]){
																											if (ImpossibleBlank[24] == Impossible[24]){
																												if (ImpossibleBlank[25] == Impossible[25]){
																													if (ImpossibleBlank[26] == Impossible[26]){
																														if (ImpossibleBlank[27] == Impossible[27]){
																															if (ImpossibleBlank[28] == Impossible[28]){
																																if (ImpossibleBlank[29] == Impossible[29]){
																																	System.out.print(DifficultyPickerCustomMethod(failurecount));	
																																}	
																															}	
																														}	
																													}	
																												}	
																											}	
																										}
																									}	
																								}
																							}
																						}	
																					}	
																				}
																			}
																		}
																	}	
																}
															}
														}
													}	
												}
											}	
										}	
									}
								}
							}
						}
					}
				}
			}
			System.out.print(" > ");
			guess = input.next();	
			System.out.print(ImpossibleModeBlanksCustomMethod(guess, Impossible, ImpossibleBlank, failurecount, Hangman));
		}
		if (ImpossibleGuess == Impossible[3]){ //U Impossible[9]
			ImpossibleBlank[3] = Impossible[3];
			ImpossibleBlank[9] = Impossible[9];
			System.out.print((char) ImpossibleBlank[0]);
			System.out.print((char) ImpossibleBlank[1]);
			System.out.print((char) ImpossibleBlank[2]);
			System.out.print((char) ImpossibleBlank[3]);
			System.out.print((char) ImpossibleBlank[4]);
			System.out.print((char) ImpossibleBlank[5]);
			System.out.print((char) ImpossibleBlank[6]);
			System.out.print((char) ImpossibleBlank[7]);
			System.out.print((char) ImpossibleBlank[8]);
			System.out.print((char) ImpossibleBlank[9]);
			System.out.print((char) ImpossibleBlank[10]);
			System.out.print((char) ImpossibleBlank[11]);
			System.out.print((char) ImpossibleBlank[12]);
			System.out.print((char) ImpossibleBlank[13]);
			System.out.print((char) ImpossibleBlank[14]);
			System.out.print((char) ImpossibleBlank[15]);
			System.out.print((char) ImpossibleBlank[16]);
			System.out.print((char) ImpossibleBlank[17]);
			System.out.print((char) ImpossibleBlank[18]);
			System.out.print((char) ImpossibleBlank[19]);
			System.out.print((char) ImpossibleBlank[20]);
			System.out.print((char) ImpossibleBlank[21]);
			System.out.print((char) ImpossibleBlank[22]);
			System.out.print((char) ImpossibleBlank[23]);
			System.out.print((char) ImpossibleBlank[24]);
			System.out.print((char) ImpossibleBlank[25]);
			System.out.print((char) ImpossibleBlank[26]);
			System.out.print((char) ImpossibleBlank[27]);
			System.out.print((char) ImpossibleBlank[28]);
			System.out.print((char) ImpossibleBlank[29]);
			if (ImpossibleBlank[0] == Impossible[0]){
				if (ImpossibleBlank[1] == Impossible[1]){
					if (ImpossibleBlank[2] == Impossible[2]){
						if (ImpossibleBlank[3] == Impossible[3]){
							if (ImpossibleBlank[4] == Impossible[4]){
								if (ImpossibleBlank[5] == Impossible[5]){
									if (ImpossibleBlank[6] == Impossible[6]){
										if (ImpossibleBlank[7] == Impossible[7]){
											if (ImpossibleBlank[8] == Impossible[8]){
												if (ImpossibleBlank[9] == Impossible[9]){
													if (ImpossibleBlank[10] == Impossible[10]){
														if (ImpossibleBlank[11] == Impossible[11]){
															if (ImpossibleBlank[12] == Impossible[12]){
																if (ImpossibleBlank[13] == Impossible[13]){
																	if (ImpossibleBlank[14] == Impossible[14]){
																		if (ImpossibleBlank[15] == Impossible[15]){
																			if (ImpossibleBlank[16] == Impossible[16]){
																				if (ImpossibleBlank[17] == Impossible[17]){
																					if (ImpossibleBlank[18] == Impossible[18]){
																						if (ImpossibleBlank[19] == Impossible[19]){
																							if (ImpossibleBlank[20] == Impossible[20]){
																								if (ImpossibleBlank[21] == Impossible[21]){
																									if (ImpossibleBlank[22] == Impossible[22]){
																										if (ImpossibleBlank[23] == Impossible[23]){
																											if (ImpossibleBlank[24] == Impossible[24]){
																												if (ImpossibleBlank[25] == Impossible[25]){
																													if (ImpossibleBlank[26] == Impossible[26]){
																														if (ImpossibleBlank[27] == Impossible[27]){
																															if (ImpossibleBlank[28] == Impossible[28]){
																																if (ImpossibleBlank[29] == Impossible[29]){
																																	System.out.print(DifficultyPickerCustomMethod(failurecount));	
																																}	
																															}	
																														}	
																													}	
																												}	
																											}	
																										}
																									}	
																								}
																							}
																						}	
																					}	
																				}
																			}
																		}
																	}	
																}
															}
														}
													}	
												}
											}	
										}	
									}
								}
							}
						}
					}
				}
			}
			System.out.print(" > ");
			guess = input.next();	
			System.out.print(ImpossibleModeBlanksCustomMethod(guess, Impossible, ImpossibleBlank, failurecount, Hangman));
		}
		if (ImpossibleGuess == Impossible[4]){ //D Impossible[10] Impossible[26]
			ImpossibleBlank[4] = Impossible[4];
			ImpossibleBlank[10] = Impossible[10];
			ImpossibleBlank[26] = Impossible[26];
			System.out.print((char) ImpossibleBlank[0]);
			System.out.print((char) ImpossibleBlank[1]);
			System.out.print((char) ImpossibleBlank[2]);
			System.out.print((char) ImpossibleBlank[3]);
			System.out.print((char) ImpossibleBlank[4]);
			System.out.print((char) ImpossibleBlank[5]);
			System.out.print((char) ImpossibleBlank[6]);
			System.out.print((char) ImpossibleBlank[7]);
			System.out.print((char) ImpossibleBlank[8]);
			System.out.print((char) ImpossibleBlank[9]);
			System.out.print((char) ImpossibleBlank[10]);
			System.out.print((char) ImpossibleBlank[11]);
			System.out.print((char) ImpossibleBlank[12]);
			System.out.print((char) ImpossibleBlank[13]);
			System.out.print((char) ImpossibleBlank[14]);
			System.out.print((char) ImpossibleBlank[15]);
			System.out.print((char) ImpossibleBlank[16]);
			System.out.print((char) ImpossibleBlank[17]);
			System.out.print((char) ImpossibleBlank[18]);
			System.out.print((char) ImpossibleBlank[19]);
			System.out.print((char) ImpossibleBlank[20]);
			System.out.print((char) ImpossibleBlank[21]);
			System.out.print((char) ImpossibleBlank[22]);
			System.out.print((char) ImpossibleBlank[23]);
			System.out.print((char) ImpossibleBlank[24]);
			System.out.print((char) ImpossibleBlank[25]);
			System.out.print((char) ImpossibleBlank[26]);
			System.out.print((char) ImpossibleBlank[27]);
			System.out.print((char) ImpossibleBlank[28]);
			System.out.print((char) ImpossibleBlank[29]);
			if (ImpossibleBlank[0] == Impossible[0]){
				if (ImpossibleBlank[1] == Impossible[1]){
					if (ImpossibleBlank[2] == Impossible[2]){
						if (ImpossibleBlank[3] == Impossible[3]){
							if (ImpossibleBlank[4] == Impossible[4]){
								if (ImpossibleBlank[5] == Impossible[5]){
									if (ImpossibleBlank[6] == Impossible[6]){
										if (ImpossibleBlank[7] == Impossible[7]){
											if (ImpossibleBlank[8] == Impossible[8]){
												if (ImpossibleBlank[9] == Impossible[9]){
													if (ImpossibleBlank[10] == Impossible[10]){
														if (ImpossibleBlank[11] == Impossible[11]){
															if (ImpossibleBlank[12] == Impossible[12]){
																if (ImpossibleBlank[13] == Impossible[13]){
																	if (ImpossibleBlank[14] == Impossible[14]){
																		if (ImpossibleBlank[15] == Impossible[15]){
																			if (ImpossibleBlank[16] == Impossible[16]){
																				if (ImpossibleBlank[17] == Impossible[17]){
																					if (ImpossibleBlank[18] == Impossible[18]){
																						if (ImpossibleBlank[19] == Impossible[19]){
																							if (ImpossibleBlank[20] == Impossible[20]){
																								if (ImpossibleBlank[21] == Impossible[21]){
																									if (ImpossibleBlank[22] == Impossible[22]){
																										if (ImpossibleBlank[23] == Impossible[23]){
																											if (ImpossibleBlank[24] == Impossible[24]){
																												if (ImpossibleBlank[25] == Impossible[25]){
																													if (ImpossibleBlank[26] == Impossible[26]){
																														if (ImpossibleBlank[27] == Impossible[27]){
																															if (ImpossibleBlank[28] == Impossible[28]){
																																if (ImpossibleBlank[29] == Impossible[29]){
																																	System.out.print(DifficultyPickerCustomMethod(failurecount));	
																																}	
																															}	
																														}	
																													}	
																												}	
																											}	
																										}
																									}	
																								}
																							}
																						}	
																					}	
																				}
																			}
																		}
																	}	
																}
															}
														}
													}	
												}
											}	
										}	
									}
								}
							}
						}
					}
				}
			}
			System.out.print(" > ");
			guess = input.next();	
			System.out.print(ImpossibleModeBlanksCustomMethod(guess, Impossible, ImpossibleBlank, failurecount, Hangman));
		}
		if (ImpossibleGuess == Impossible[5]){ //O Impossible[11] Impossible[15] Impossible[24]
			ImpossibleBlank[5] = Impossible[5];
			ImpossibleBlank[11] = Impossible[11];
			ImpossibleBlank[15] = Impossible[15];
			ImpossibleBlank[24] = Impossible[24];
			System.out.print((char) ImpossibleBlank[0]);
			System.out.print((char) ImpossibleBlank[1]);
			System.out.print((char) ImpossibleBlank[2]);
			System.out.print((char) ImpossibleBlank[3]);
			System.out.print((char) ImpossibleBlank[4]);
			System.out.print((char) ImpossibleBlank[5]);
			System.out.print((char) ImpossibleBlank[6]);
			System.out.print((char) ImpossibleBlank[7]);
			System.out.print((char) ImpossibleBlank[8]);
			System.out.print((char) ImpossibleBlank[9]);
			System.out.print((char) ImpossibleBlank[10]);
			System.out.print((char) ImpossibleBlank[11]);
			System.out.print((char) ImpossibleBlank[12]);
			System.out.print((char) ImpossibleBlank[13]);
			System.out.print((char) ImpossibleBlank[14]);
			System.out.print((char) ImpossibleBlank[15]);
			System.out.print((char) ImpossibleBlank[16]);
			System.out.print((char) ImpossibleBlank[17]);
			System.out.print((char) ImpossibleBlank[18]);
			System.out.print((char) ImpossibleBlank[19]);
			System.out.print((char) ImpossibleBlank[20]);
			System.out.print((char) ImpossibleBlank[21]);
			System.out.print((char) ImpossibleBlank[22]);
			System.out.print((char) ImpossibleBlank[23]);
			System.out.print((char) ImpossibleBlank[24]);
			System.out.print((char) ImpossibleBlank[25]);
			System.out.print((char) ImpossibleBlank[26]);
			System.out.print((char) ImpossibleBlank[27]);
			System.out.print((char) ImpossibleBlank[28]);
			System.out.print((char) ImpossibleBlank[29]);
			if (ImpossibleBlank[0] == Impossible[0]){
				if (ImpossibleBlank[1] == Impossible[1]){
					if (ImpossibleBlank[2] == Impossible[2]){
						if (ImpossibleBlank[3] == Impossible[3]){
							if (ImpossibleBlank[4] == Impossible[4]){
								if (ImpossibleBlank[5] == Impossible[5]){
									if (ImpossibleBlank[6] == Impossible[6]){
										if (ImpossibleBlank[7] == Impossible[7]){
											if (ImpossibleBlank[8] == Impossible[8]){
												if (ImpossibleBlank[9] == Impossible[9]){
													if (ImpossibleBlank[10] == Impossible[10]){
														if (ImpossibleBlank[11] == Impossible[11]){
															if (ImpossibleBlank[12] == Impossible[12]){
																if (ImpossibleBlank[13] == Impossible[13]){
																	if (ImpossibleBlank[14] == Impossible[14]){
																		if (ImpossibleBlank[15] == Impossible[15]){
																			if (ImpossibleBlank[16] == Impossible[16]){
																				if (ImpossibleBlank[17] == Impossible[17]){
																					if (ImpossibleBlank[18] == Impossible[18]){
																						if (ImpossibleBlank[19] == Impossible[19]){
																							if (ImpossibleBlank[20] == Impossible[20]){
																								if (ImpossibleBlank[21] == Impossible[21]){
																									if (ImpossibleBlank[22] == Impossible[22]){
																										if (ImpossibleBlank[23] == Impossible[23]){
																											if (ImpossibleBlank[24] == Impossible[24]){
																												if (ImpossibleBlank[25] == Impossible[25]){
																													if (ImpossibleBlank[26] == Impossible[26]){
																														if (ImpossibleBlank[27] == Impossible[27]){
																															if (ImpossibleBlank[28] == Impossible[28]){
																																if (ImpossibleBlank[29] == Impossible[29]){
																																	System.out.print(DifficultyPickerCustomMethod(failurecount));	
																																}	
																															}	
																														}	
																													}	
																												}	
																											}	
																										}
																									}	
																								}
																							}
																						}	
																					}	
																				}
																			}
																		}
																	}	
																}
															}
														}
													}	
												}
											}	
										}	
									}
								}
							}
						}
					}
				}
			}
			System.out.print(" > ");
			guess = input.next();	
			System.out.print(ImpossibleModeBlanksCustomMethod(guess, Impossible, ImpossibleBlank, failurecount, Hangman));
		}
		if (ImpossibleGuess == Impossible[12]){ //H Impossible[21]
			ImpossibleBlank[12] = Impossible[12];
			ImpossibleBlank[21] = Impossible[21];
			System.out.print((char) ImpossibleBlank[0]);
			System.out.print((char) ImpossibleBlank[1]);
			System.out.print((char) ImpossibleBlank[2]);
			System.out.print((char) ImpossibleBlank[3]);
			System.out.print((char) ImpossibleBlank[4]);
			System.out.print((char) ImpossibleBlank[5]);
			System.out.print((char) ImpossibleBlank[6]);
			System.out.print((char) ImpossibleBlank[7]);
			System.out.print((char) ImpossibleBlank[8]);
			System.out.print((char) ImpossibleBlank[9]);
			System.out.print((char) ImpossibleBlank[10]);
			System.out.print((char) ImpossibleBlank[11]);
			System.out.print((char) ImpossibleBlank[12]);
			System.out.print((char) ImpossibleBlank[13]);
			System.out.print((char) ImpossibleBlank[14]);
			System.out.print((char) ImpossibleBlank[15]);
			System.out.print((char) ImpossibleBlank[16]);
			System.out.print((char) ImpossibleBlank[17]);
			System.out.print((char) ImpossibleBlank[18]);
			System.out.print((char) ImpossibleBlank[19]);
			System.out.print((char) ImpossibleBlank[20]);
			System.out.print((char) ImpossibleBlank[21]);
			System.out.print((char) ImpossibleBlank[22]);
			System.out.print((char) ImpossibleBlank[23]);
			System.out.print((char) ImpossibleBlank[24]);
			System.out.print((char) ImpossibleBlank[25]);
			System.out.print((char) ImpossibleBlank[26]);
			System.out.print((char) ImpossibleBlank[27]);
			System.out.print((char) ImpossibleBlank[28]);
			System.out.print((char) ImpossibleBlank[29]);
			if (ImpossibleBlank[0] == Impossible[0]){
				if (ImpossibleBlank[1] == Impossible[1]){
					if (ImpossibleBlank[2] == Impossible[2]){
						if (ImpossibleBlank[3] == Impossible[3]){
							if (ImpossibleBlank[4] == Impossible[4]){
								if (ImpossibleBlank[5] == Impossible[5]){
									if (ImpossibleBlank[6] == Impossible[6]){
										if (ImpossibleBlank[7] == Impossible[7]){
											if (ImpossibleBlank[8] == Impossible[8]){
												if (ImpossibleBlank[9] == Impossible[9]){
													if (ImpossibleBlank[10] == Impossible[10]){
														if (ImpossibleBlank[11] == Impossible[11]){
															if (ImpossibleBlank[12] == Impossible[12]){
																if (ImpossibleBlank[13] == Impossible[13]){
																	if (ImpossibleBlank[14] == Impossible[14]){
																		if (ImpossibleBlank[15] == Impossible[15]){
																			if (ImpossibleBlank[16] == Impossible[16]){
																				if (ImpossibleBlank[17] == Impossible[17]){
																					if (ImpossibleBlank[18] == Impossible[18]){
																						if (ImpossibleBlank[19] == Impossible[19]){
																							if (ImpossibleBlank[20] == Impossible[20]){
																								if (ImpossibleBlank[21] == Impossible[21]){
																									if (ImpossibleBlank[22] == Impossible[22]){
																										if (ImpossibleBlank[23] == Impossible[23]){
																											if (ImpossibleBlank[24] == Impossible[24]){
																												if (ImpossibleBlank[25] == Impossible[25]){
																													if (ImpossibleBlank[26] == Impossible[26]){
																														if (ImpossibleBlank[27] == Impossible[27]){
																															if (ImpossibleBlank[28] == Impossible[28]){
																																if (ImpossibleBlank[29] == Impossible[29]){
																																	System.out.print(DifficultyPickerCustomMethod(failurecount));	
																																}	
																															}	
																														}	
																													}	
																												}	
																											}	
																										}
																									}	
																								}
																							}
																						}	
																					}	
																				}
																			}
																		}
																	}	
																}
															}
														}
													}	
												}
											}	
										}	
									}
								}
							}
						}
					}
				}
			}
			System.out.print(" > ");
			guess = input.next();	
			System.out.print(ImpossibleModeBlanksCustomMethod(guess, Impossible, ImpossibleBlank, failurecount, Hangman));
		}
		if (ImpossibleGuess == Impossible[13]){ //Y Impossible[22]
			ImpossibleBlank[13] = Impossible[13];
			ImpossibleBlank[22] = Impossible[22];
			System.out.print((char) ImpossibleBlank[0]);
			System.out.print((char) ImpossibleBlank[1]);
			System.out.print((char) ImpossibleBlank[2]);
			System.out.print((char) ImpossibleBlank[3]);
			System.out.print((char) ImpossibleBlank[4]);
			System.out.print((char) ImpossibleBlank[5]);
			System.out.print((char) ImpossibleBlank[6]);
			System.out.print((char) ImpossibleBlank[7]);
			System.out.print((char) ImpossibleBlank[8]);
			System.out.print((char) ImpossibleBlank[9]);
			System.out.print((char) ImpossibleBlank[10]);
			System.out.print((char) ImpossibleBlank[11]);
			System.out.print((char) ImpossibleBlank[12]);
			System.out.print((char) ImpossibleBlank[13]);
			System.out.print((char) ImpossibleBlank[14]);
			System.out.print((char) ImpossibleBlank[15]);
			System.out.print((char) ImpossibleBlank[16]);
			System.out.print((char) ImpossibleBlank[17]);
			System.out.print((char) ImpossibleBlank[18]);
			System.out.print((char) ImpossibleBlank[19]);
			System.out.print((char) ImpossibleBlank[20]);
			System.out.print((char) ImpossibleBlank[21]);
			System.out.print((char) ImpossibleBlank[22]);
			System.out.print((char) ImpossibleBlank[23]);
			System.out.print((char) ImpossibleBlank[24]);
			System.out.print((char) ImpossibleBlank[25]);
			System.out.print((char) ImpossibleBlank[26]);
			System.out.print((char) ImpossibleBlank[27]);
			System.out.print((char) ImpossibleBlank[28]);
			System.out.print((char) ImpossibleBlank[29]);
			if (ImpossibleBlank[0] == Impossible[0]){
				if (ImpossibleBlank[1] == Impossible[1]){
					if (ImpossibleBlank[2] == Impossible[2]){
						if (ImpossibleBlank[3] == Impossible[3]){
							if (ImpossibleBlank[4] == Impossible[4]){
								if (ImpossibleBlank[5] == Impossible[5]){
									if (ImpossibleBlank[6] == Impossible[6]){
										if (ImpossibleBlank[7] == Impossible[7]){
											if (ImpossibleBlank[8] == Impossible[8]){
												if (ImpossibleBlank[9] == Impossible[9]){
													if (ImpossibleBlank[10] == Impossible[10]){
														if (ImpossibleBlank[11] == Impossible[11]){
															if (ImpossibleBlank[12] == Impossible[12]){
																if (ImpossibleBlank[13] == Impossible[13]){
																	if (ImpossibleBlank[14] == Impossible[14]){
																		if (ImpossibleBlank[15] == Impossible[15]){
																			if (ImpossibleBlank[16] == Impossible[16]){
																				if (ImpossibleBlank[17] == Impossible[17]){
																					if (ImpossibleBlank[18] == Impossible[18]){
																						if (ImpossibleBlank[19] == Impossible[19]){
																							if (ImpossibleBlank[20] == Impossible[20]){
																								if (ImpossibleBlank[21] == Impossible[21]){
																									if (ImpossibleBlank[22] == Impossible[22]){
																										if (ImpossibleBlank[23] == Impossible[23]){
																											if (ImpossibleBlank[24] == Impossible[24]){
																												if (ImpossibleBlank[25] == Impossible[25]){
																													if (ImpossibleBlank[26] == Impossible[26]){
																														if (ImpossibleBlank[27] == Impossible[27]){
																															if (ImpossibleBlank[28] == Impossible[28]){
																																if (ImpossibleBlank[29] == Impossible[29]){
																																	System.out.print(DifficultyPickerCustomMethod(failurecount));	
																																}	
																															}	
																														}	
																													}	
																												}	
																											}	
																										}
																									}	
																								}
																							}
																						}	
																					}	
																				}
																			}
																		}
																	}	
																}
															}
														}
													}	
												}
											}	
										}	
									}
								}
							}
						}
					}
				}
			}
			System.out.print(" > ");
			guess = input.next();	
			System.out.print(ImpossibleModeBlanksCustomMethod(guess, Impossible, ImpossibleBlank, failurecount, Hangman));
		}
		if (ImpossibleGuess == Impossible[17]){ //A Impossible[19]
			ImpossibleBlank[17] = Impossible[17];
			ImpossibleBlank[19] = Impossible[19];
			System.out.print((char) ImpossibleBlank[0]);
			System.out.print((char) ImpossibleBlank[1]);
			System.out.print((char) ImpossibleBlank[2]);
			System.out.print((char) ImpossibleBlank[3]);
			System.out.print((char) ImpossibleBlank[4]);
			System.out.print((char) ImpossibleBlank[5]);
			System.out.print((char) ImpossibleBlank[6]);
			System.out.print((char) ImpossibleBlank[7]);
			System.out.print((char) ImpossibleBlank[8]);
			System.out.print((char) ImpossibleBlank[9]);
			System.out.print((char) ImpossibleBlank[10]);
			System.out.print((char) ImpossibleBlank[11]);
			System.out.print((char) ImpossibleBlank[12]);
			System.out.print((char) ImpossibleBlank[13]);
			System.out.print((char) ImpossibleBlank[14]);
			System.out.print((char) ImpossibleBlank[15]);
			System.out.print((char) ImpossibleBlank[16]);
			System.out.print((char) ImpossibleBlank[17]);
			System.out.print((char) ImpossibleBlank[18]);
			System.out.print((char) ImpossibleBlank[19]);
			System.out.print((char) ImpossibleBlank[20]);
			System.out.print((char) ImpossibleBlank[21]);
			System.out.print((char) ImpossibleBlank[22]);
			System.out.print((char) ImpossibleBlank[23]);
			System.out.print((char) ImpossibleBlank[24]);
			System.out.print((char) ImpossibleBlank[25]);
			System.out.print((char) ImpossibleBlank[26]);
			System.out.print((char) ImpossibleBlank[27]);
			System.out.print((char) ImpossibleBlank[28]);
			System.out.print((char) ImpossibleBlank[29]);
			if (ImpossibleBlank[0] == Impossible[0]){
				if (ImpossibleBlank[1] == Impossible[1]){
					if (ImpossibleBlank[2] == Impossible[2]){
						if (ImpossibleBlank[3] == Impossible[3]){
							if (ImpossibleBlank[4] == Impossible[4]){
								if (ImpossibleBlank[5] == Impossible[5]){
									if (ImpossibleBlank[6] == Impossible[6]){
										if (ImpossibleBlank[7] == Impossible[7]){
											if (ImpossibleBlank[8] == Impossible[8]){
												if (ImpossibleBlank[9] == Impossible[9]){
													if (ImpossibleBlank[10] == Impossible[10]){
														if (ImpossibleBlank[11] == Impossible[11]){
															if (ImpossibleBlank[12] == Impossible[12]){
																if (ImpossibleBlank[13] == Impossible[13]){
																	if (ImpossibleBlank[14] == Impossible[14]){
																		if (ImpossibleBlank[15] == Impossible[15]){
																			if (ImpossibleBlank[16] == Impossible[16]){
																				if (ImpossibleBlank[17] == Impossible[17]){
																					if (ImpossibleBlank[18] == Impossible[18]){
																						if (ImpossibleBlank[19] == Impossible[19]){
																							if (ImpossibleBlank[20] == Impossible[20]){
																								if (ImpossibleBlank[21] == Impossible[21]){
																									if (ImpossibleBlank[22] == Impossible[22]){
																										if (ImpossibleBlank[23] == Impossible[23]){
																											if (ImpossibleBlank[24] == Impossible[24]){
																												if (ImpossibleBlank[25] == Impossible[25]){
																													if (ImpossibleBlank[26] == Impossible[26]){
																														if (ImpossibleBlank[27] == Impossible[27]){
																															if (ImpossibleBlank[28] == Impossible[28]){
																																if (ImpossibleBlank[29] == Impossible[29]){
																																	System.out.print(DifficultyPickerCustomMethod(failurecount));	
																																}	
																															}	
																														}	
																													}	
																												}	
																											}	
																										}
																									}	
																								}
																							}
																						}	
																					}	
																				}
																			}
																		}
																	}	
																}
															}
														}
													}	
												}
											}	
										}	
									}
								}
							}
						}
					}
				}
			}
			System.out.print(" > ");
			guess = input.next();	
			System.out.print(ImpossibleModeBlanksCustomMethod(guess, Impossible, ImpossibleBlank, failurecount, Hangman));
		}
		if (ImpossibleGuess == Impossible[18]){ //R Impossible[23]
			ImpossibleBlank[18] = Impossible[18];
			ImpossibleBlank[23] = Impossible[23];
			System.out.print((char) ImpossibleBlank[0]);
			System.out.print((char) ImpossibleBlank[1]);
			System.out.print((char) ImpossibleBlank[2]);
			System.out.print((char) ImpossibleBlank[3]);
			System.out.print((char) ImpossibleBlank[4]);
			System.out.print((char) ImpossibleBlank[5]);
			System.out.print((char) ImpossibleBlank[6]);
			System.out.print((char) ImpossibleBlank[7]);
			System.out.print((char) ImpossibleBlank[8]);
			System.out.print((char) ImpossibleBlank[9]);
			System.out.print((char) ImpossibleBlank[10]);
			System.out.print((char) ImpossibleBlank[11]);
			System.out.print((char) ImpossibleBlank[12]);
			System.out.print((char) ImpossibleBlank[13]);
			System.out.print((char) ImpossibleBlank[14]);
			System.out.print((char) ImpossibleBlank[15]);
			System.out.print((char) ImpossibleBlank[16]);
			System.out.print((char) ImpossibleBlank[17]);
			System.out.print((char) ImpossibleBlank[18]);
			System.out.print((char) ImpossibleBlank[19]);
			System.out.print((char) ImpossibleBlank[20]);
			System.out.print((char) ImpossibleBlank[21]);
			System.out.print((char) ImpossibleBlank[22]);
			System.out.print((char) ImpossibleBlank[23]);
			System.out.print((char) ImpossibleBlank[24]);
			System.out.print((char) ImpossibleBlank[25]);
			System.out.print((char) ImpossibleBlank[26]);
			System.out.print((char) ImpossibleBlank[27]);
			System.out.print((char) ImpossibleBlank[28]);
			System.out.print((char) ImpossibleBlank[29]);
			if (ImpossibleBlank[0] == Impossible[0]){
				if (ImpossibleBlank[1] == Impossible[1]){
					if (ImpossibleBlank[2] == Impossible[2]){
						if (ImpossibleBlank[3] == Impossible[3]){
							if (ImpossibleBlank[4] == Impossible[4]){
								if (ImpossibleBlank[5] == Impossible[5]){
									if (ImpossibleBlank[6] == Impossible[6]){
										if (ImpossibleBlank[7] == Impossible[7]){
											if (ImpossibleBlank[8] == Impossible[8]){
												if (ImpossibleBlank[9] == Impossible[9]){
													if (ImpossibleBlank[10] == Impossible[10]){
														if (ImpossibleBlank[11] == Impossible[11]){
															if (ImpossibleBlank[12] == Impossible[12]){
																if (ImpossibleBlank[13] == Impossible[13]){
																	if (ImpossibleBlank[14] == Impossible[14]){
																		if (ImpossibleBlank[15] == Impossible[15]){
																			if (ImpossibleBlank[16] == Impossible[16]){
																				if (ImpossibleBlank[17] == Impossible[17]){
																					if (ImpossibleBlank[18] == Impossible[18]){
																						if (ImpossibleBlank[19] == Impossible[19]){
																							if (ImpossibleBlank[20] == Impossible[20]){
																								if (ImpossibleBlank[21] == Impossible[21]){
																									if (ImpossibleBlank[22] == Impossible[22]){
																										if (ImpossibleBlank[23] == Impossible[23]){
																											if (ImpossibleBlank[24] == Impossible[24]){
																												if (ImpossibleBlank[25] == Impossible[25]){
																													if (ImpossibleBlank[26] == Impossible[26]){
																														if (ImpossibleBlank[27] == Impossible[27]){
																															if (ImpossibleBlank[28] == Impossible[28]){
																																if (ImpossibleBlank[29] == Impossible[29]){
																																	System.out.print(DifficultyPickerCustomMethod(failurecount));	
																																}	
																															}	
																														}	
																													}	
																												}	
																											}	
																										}
																									}	
																								}
																							}
																						}	
																					}	
																				}
																			}
																		}
																	}	
																}
															}
														}
													}	
												}
											}	
										}	
									}
								}
							}
						}
					}
				}
			}
			System.out.print(" > ");
			guess = input.next();	
			System.out.print(ImpossibleModeBlanksCustomMethod(guess, Impossible, ImpossibleBlank, failurecount, Hangman));
		}
		if (ImpossibleGuess == Impossible[20]){ //T Impossible[20]
			ImpossibleBlank[20] = Impossible[20];
			System.out.print((char) ImpossibleBlank[0]);
			System.out.print((char) ImpossibleBlank[1]);
			System.out.print((char) ImpossibleBlank[2]);
			System.out.print((char) ImpossibleBlank[3]);
			System.out.print((char) ImpossibleBlank[4]);
			System.out.print((char) ImpossibleBlank[5]);
			System.out.print((char) ImpossibleBlank[6]);
			System.out.print((char) ImpossibleBlank[7]);
			System.out.print((char) ImpossibleBlank[8]);
			System.out.print((char) ImpossibleBlank[9]);
			System.out.print((char) ImpossibleBlank[10]);
			System.out.print((char) ImpossibleBlank[11]);
			System.out.print((char) ImpossibleBlank[12]);
			System.out.print((char) ImpossibleBlank[13]);
			System.out.print((char) ImpossibleBlank[14]);
			System.out.print((char) ImpossibleBlank[15]);
			System.out.print((char) ImpossibleBlank[16]);
			System.out.print((char) ImpossibleBlank[17]);
			System.out.print((char) ImpossibleBlank[18]);
			System.out.print((char) ImpossibleBlank[19]);
			System.out.print((char) ImpossibleBlank[20]);
			System.out.print((char) ImpossibleBlank[21]);
			System.out.print((char) ImpossibleBlank[22]);
			System.out.print((char) ImpossibleBlank[23]);
			System.out.print((char) ImpossibleBlank[24]);
			System.out.print((char) ImpossibleBlank[25]);
			System.out.print((char) ImpossibleBlank[26]);
			System.out.print((char) ImpossibleBlank[27]);
			System.out.print((char) ImpossibleBlank[28]);
			System.out.print((char) ImpossibleBlank[29]);
			if (ImpossibleBlank[0] == Impossible[0]){
				if (ImpossibleBlank[1] == Impossible[1]){
					if (ImpossibleBlank[2] == Impossible[2]){
						if (ImpossibleBlank[3] == Impossible[3]){
							if (ImpossibleBlank[4] == Impossible[4]){
								if (ImpossibleBlank[5] == Impossible[5]){
									if (ImpossibleBlank[6] == Impossible[6]){
										if (ImpossibleBlank[7] == Impossible[7]){
											if (ImpossibleBlank[8] == Impossible[8]){
												if (ImpossibleBlank[9] == Impossible[9]){
													if (ImpossibleBlank[10] == Impossible[10]){
														if (ImpossibleBlank[11] == Impossible[11]){
															if (ImpossibleBlank[12] == Impossible[12]){
																if (ImpossibleBlank[13] == Impossible[13]){
																	if (ImpossibleBlank[14] == Impossible[14]){
																		if (ImpossibleBlank[15] == Impossible[15]){
																			if (ImpossibleBlank[16] == Impossible[16]){
																				if (ImpossibleBlank[17] == Impossible[17]){
																					if (ImpossibleBlank[18] == Impossible[18]){
																						if (ImpossibleBlank[19] == Impossible[19]){
																							if (ImpossibleBlank[20] == Impossible[20]){
																								if (ImpossibleBlank[21] == Impossible[21]){
																									if (ImpossibleBlank[22] == Impossible[22]){
																										if (ImpossibleBlank[23] == Impossible[23]){
																											if (ImpossibleBlank[24] == Impossible[24]){
																												if (ImpossibleBlank[25] == Impossible[25]){
																													if (ImpossibleBlank[26] == Impossible[26]){
																														if (ImpossibleBlank[27] == Impossible[27]){
																															if (ImpossibleBlank[28] == Impossible[28]){
																																if (ImpossibleBlank[29] == Impossible[29]){
																																	System.out.print(DifficultyPickerCustomMethod(failurecount));	
																																}	
																															}	
																														}	
																													}	
																												}	
																											}	
																										}
																									}	
																								}
																							}
																						}	
																					}	
																				}
																			}
																		}
																	}	
																}
															}
														}
													}	
												}
											}	
										}	
									}
								}
							}
						}
					}
				}
			}
			System.out.print(" > ");
			guess = input.next();	
			System.out.print(ImpossibleModeBlanksCustomMethod(guess, Impossible, ImpossibleBlank, failurecount, Hangman));
		}
		if (ImpossibleGuess == Impossible[25]){ //I Impossible[27]
			ImpossibleBlank[25] = Impossible[25];
			ImpossibleBlank[27] = Impossible[27];
			System.out.print((char) ImpossibleBlank[0]);
			System.out.print((char) ImpossibleBlank[1]);
			System.out.print((char) ImpossibleBlank[2]);
			System.out.print((char) ImpossibleBlank[3]);
			System.out.print((char) ImpossibleBlank[4]);
			System.out.print((char) ImpossibleBlank[5]);
			System.out.print((char) ImpossibleBlank[6]);
			System.out.print((char) ImpossibleBlank[7]);
			System.out.print((char) ImpossibleBlank[8]);
			System.out.print((char) ImpossibleBlank[9]);
			System.out.print((char) ImpossibleBlank[10]);
			System.out.print((char) ImpossibleBlank[11]);
			System.out.print((char) ImpossibleBlank[12]);
			System.out.print((char) ImpossibleBlank[13]);
			System.out.print((char) ImpossibleBlank[14]);
			System.out.print((char) ImpossibleBlank[15]);
			System.out.print((char) ImpossibleBlank[16]);
			System.out.print((char) ImpossibleBlank[17]);
			System.out.print((char) ImpossibleBlank[18]);
			System.out.print((char) ImpossibleBlank[19]);
			System.out.print((char) ImpossibleBlank[20]);
			System.out.print((char) ImpossibleBlank[21]);
			System.out.print((char) ImpossibleBlank[22]);
			System.out.print((char) ImpossibleBlank[23]);
			System.out.print((char) ImpossibleBlank[24]);
			System.out.print((char) ImpossibleBlank[25]);
			System.out.print((char) ImpossibleBlank[26]);
			System.out.print((char) ImpossibleBlank[27]);
			System.out.print((char) ImpossibleBlank[28]);
			System.out.print((char) ImpossibleBlank[29]);
			if (ImpossibleBlank[0] == Impossible[0]){
				if (ImpossibleBlank[1] == Impossible[1]){
					if (ImpossibleBlank[2] == Impossible[2]){
						if (ImpossibleBlank[3] == Impossible[3]){
							if (ImpossibleBlank[4] == Impossible[4]){
								if (ImpossibleBlank[5] == Impossible[5]){
									if (ImpossibleBlank[6] == Impossible[6]){
										if (ImpossibleBlank[7] == Impossible[7]){
											if (ImpossibleBlank[8] == Impossible[8]){
												if (ImpossibleBlank[9] == Impossible[9]){
													if (ImpossibleBlank[10] == Impossible[10]){
														if (ImpossibleBlank[11] == Impossible[11]){
															if (ImpossibleBlank[12] == Impossible[12]){
																if (ImpossibleBlank[13] == Impossible[13]){
																	if (ImpossibleBlank[14] == Impossible[14]){
																		if (ImpossibleBlank[15] == Impossible[15]){
																			if (ImpossibleBlank[16] == Impossible[16]){
																				if (ImpossibleBlank[17] == Impossible[17]){
																					if (ImpossibleBlank[18] == Impossible[18]){
																						if (ImpossibleBlank[19] == Impossible[19]){
																							if (ImpossibleBlank[20] == Impossible[20]){
																								if (ImpossibleBlank[21] == Impossible[21]){
																									if (ImpossibleBlank[22] == Impossible[22]){
																										if (ImpossibleBlank[23] == Impossible[23]){
																											if (ImpossibleBlank[24] == Impossible[24]){
																												if (ImpossibleBlank[25] == Impossible[25]){
																													if (ImpossibleBlank[26] == Impossible[26]){
																														if (ImpossibleBlank[27] == Impossible[27]){
																															if (ImpossibleBlank[28] == Impossible[28]){
																																if (ImpossibleBlank[29] == Impossible[29]){
																																	System.out.print(DifficultyPickerCustomMethod(failurecount));	
																																}	
																															}	
																														}	
																													}	
																												}	
																											}	
																										}
																									}	
																								}
																							}
																						}	
																					}	
																				}
																			}
																		}
																	}	
																}
															}
														}
													}	
												}
											}	
										}	
									}
								}
							}
						}
					}
				}
			}
			System.out.print(" > ");
			guess = input.next();	
			System.out.print(ImpossibleModeBlanksCustomMethod(guess, Impossible, ImpossibleBlank, failurecount, Hangman));
		}
		if (ImpossibleGuess == Impossible[29]){ //M Impossible[29]
			ImpossibleBlank[29] = Impossible[29];
			System.out.print((char) ImpossibleBlank[0]);
			System.out.print((char) ImpossibleBlank[1]);
			System.out.print((char) ImpossibleBlank[2]);
			System.out.print((char) ImpossibleBlank[3]);
			System.out.print((char) ImpossibleBlank[4]);
			System.out.print((char) ImpossibleBlank[5]);
			System.out.print((char) ImpossibleBlank[6]);
			System.out.print((char) ImpossibleBlank[7]);
			System.out.print((char) ImpossibleBlank[8]);
			System.out.print((char) ImpossibleBlank[9]);
			System.out.print((char) ImpossibleBlank[10]);
			System.out.print((char) ImpossibleBlank[11]);
			System.out.print((char) ImpossibleBlank[12]);
			System.out.print((char) ImpossibleBlank[13]);
			System.out.print((char) ImpossibleBlank[14]);
			System.out.print((char) ImpossibleBlank[15]);
			System.out.print((char) ImpossibleBlank[16]);
			System.out.print((char) ImpossibleBlank[17]);
			System.out.print((char) ImpossibleBlank[18]);
			System.out.print((char) ImpossibleBlank[19]);
			System.out.print((char) ImpossibleBlank[20]);
			System.out.print((char) ImpossibleBlank[21]);
			System.out.print((char) ImpossibleBlank[22]);
			System.out.print((char) ImpossibleBlank[23]);
			System.out.print((char) ImpossibleBlank[24]);
			System.out.print((char) ImpossibleBlank[25]);
			System.out.print((char) ImpossibleBlank[26]);
			System.out.print((char) ImpossibleBlank[27]);
			System.out.print((char) ImpossibleBlank[28]);
			System.out.print((char) ImpossibleBlank[29]);
			if (ImpossibleBlank[0] == Impossible[0]){
				if (ImpossibleBlank[1] == Impossible[1]){
					if (ImpossibleBlank[2] == Impossible[2]){
						if (ImpossibleBlank[3] == Impossible[3]){
							if (ImpossibleBlank[4] == Impossible[4]){
								if (ImpossibleBlank[5] == Impossible[5]){
									if (ImpossibleBlank[6] == Impossible[6]){
										if (ImpossibleBlank[7] == Impossible[7]){
											if (ImpossibleBlank[8] == Impossible[8]){
												if (ImpossibleBlank[9] == Impossible[9]){
													if (ImpossibleBlank[10] == Impossible[10]){
														if (ImpossibleBlank[11] == Impossible[11]){
															if (ImpossibleBlank[12] == Impossible[12]){
																if (ImpossibleBlank[13] == Impossible[13]){
																	if (ImpossibleBlank[14] == Impossible[14]){
																		if (ImpossibleBlank[15] == Impossible[15]){
																			if (ImpossibleBlank[16] == Impossible[16]){
																				if (ImpossibleBlank[17] == Impossible[17]){
																					if (ImpossibleBlank[18] == Impossible[18]){
																						if (ImpossibleBlank[19] == Impossible[19]){
																							if (ImpossibleBlank[20] == Impossible[20]){
																								if (ImpossibleBlank[21] == Impossible[21]){
																									if (ImpossibleBlank[22] == Impossible[22]){
																										if (ImpossibleBlank[23] == Impossible[23]){
																											if (ImpossibleBlank[24] == Impossible[24]){
																												if (ImpossibleBlank[25] == Impossible[25]){
																													if (ImpossibleBlank[26] == Impossible[26]){
																														if (ImpossibleBlank[27] == Impossible[27]){
																															if (ImpossibleBlank[28] == Impossible[28]){
																																if (ImpossibleBlank[29] == Impossible[29]){
																																	System.out.print(DifficultyPickerCustomMethod(failurecount));	
																																}	
																															}	
																														}	
																													}	
																												}	
																											}	
																										}
																									}	
																								}
																							}
																						}	
																					}	
																				}
																			}
																		}
																	}	
																}
															}
														}
													}	
												}
											}	
										}	
									}
								}
							}
						}
					}
				}
			}
			System.out.print(" > ");
			guess = input.next();	
			System.out.print(ImpossibleModeBlanksCustomMethod(guess, Impossible, ImpossibleBlank, failurecount, Hangman));
		}
		int failure = 0;
		if (ImpossibleGuess != Impossible[0]){
			failure += 1;
		}
		if (ImpossibleGuess != Impossible[1]){
			failure += 1;
		}
		if (ImpossibleGuess != Impossible[2]){
			failure += 1;
		}
		if (ImpossibleGuess != Impossible[3]){
			failure +=1;
		}
		if (ImpossibleGuess != Impossible[4]){
			failure +=1;
		}
		if (ImpossibleGuess != Impossible[5]){
			failure +=1;
		}
		if (ImpossibleGuess != Impossible[6]){
			failure +=1;
		}
		if (ImpossibleGuess != Impossible[7]){
			failure +=1;
		}
		if (ImpossibleGuess != Impossible[8]){
			failure +=1;
		}
		if (ImpossibleGuess != Impossible[9]){
			failure +=1;
		}
		if (ImpossibleGuess != Impossible[10]){
			failure +=1;
		}
		if (ImpossibleGuess != Impossible[11]){
			failure +=1;
		}
		if (ImpossibleGuess != Impossible[12]){
			failure +=1;
		}
		if (ImpossibleGuess != Impossible[13]){
			failure +=1;
		}
		if (ImpossibleGuess != Impossible[14]){
			failure +=1;
		}
		if (ImpossibleGuess != Impossible[15]){
			failure +=1;
		}
		if (ImpossibleGuess != Impossible[16]){
			failure +=1;
		}
		if (ImpossibleGuess != Impossible[17]){
			failure +=1;
		}
		if (ImpossibleGuess != Impossible[18]){
			failure +=1;
		}
		if (ImpossibleGuess != Impossible[19]){
			failure +=1;
		}
		if (ImpossibleGuess != Impossible[20]){
			failure +=1;
		}
		if (ImpossibleGuess != Impossible[21]){
			failure +=1;
		}
		if (ImpossibleGuess != Impossible[22]){
			failure +=1;
		}
		if (ImpossibleGuess != Impossible[23]){
			failure +=1;
		}
		if (ImpossibleGuess != Impossible[24]){
			failure +=1;
		}
		if (ImpossibleGuess != Impossible[25]){
			failure +=1;
		}
		if (ImpossibleGuess != Impossible[26]){
			failure +=1;
		}
		if (ImpossibleGuess != Impossible[27]){
			failure +=1;
		}
		if (ImpossibleGuess != Impossible[28]){
			failure +=1;
		}
		if (ImpossibleGuess != Impossible[29]){
			failure +=1;
		}
		if (failure <= 30){
			failurecount += 1;
			Hangman += 1;
			System.out.print(HangmanManCustomMethod(Hangman));
			System.out.print("Oh, sorry. There is no " + guess + " in the word.\nYou have failed "
					+ failurecount + " times.\nGuess again for: ");
			System.out.print((char) ImpossibleBlank[0]);
			System.out.print((char) ImpossibleBlank[1]);
			System.out.print((char) ImpossibleBlank[2]);
			System.out.print((char) ImpossibleBlank[3]);
			System.out.print((char) ImpossibleBlank[4]);
			System.out.print((char) ImpossibleBlank[5]);
			System.out.print((char) ImpossibleBlank[6]);
			System.out.print((char) ImpossibleBlank[7]);
			System.out.print((char) ImpossibleBlank[8]);
			System.out.print((char) ImpossibleBlank[9]);
			System.out.print((char) ImpossibleBlank[10]);
			System.out.print((char) ImpossibleBlank[11]);
			System.out.print((char) ImpossibleBlank[12]);
			System.out.print((char) ImpossibleBlank[13]);
			System.out.print((char) ImpossibleBlank[14]);
			System.out.print((char) ImpossibleBlank[15]);
			System.out.print((char) ImpossibleBlank[16]);
			System.out.print((char) ImpossibleBlank[17]);
			System.out.print((char) ImpossibleBlank[18]);
			System.out.print((char) ImpossibleBlank[19]);
			System.out.print((char) ImpossibleBlank[20]);
			System.out.print((char) ImpossibleBlank[21]);
			System.out.print((char) ImpossibleBlank[22]);
			System.out.print((char) ImpossibleBlank[23]);
			System.out.print((char) ImpossibleBlank[24]);
			System.out.print((char) ImpossibleBlank[25]);
			System.out.print((char) ImpossibleBlank[26]);
			System.out.print((char) ImpossibleBlank[27]);
			System.out.print((char) ImpossibleBlank[28]);
			System.out.print((char) ImpossibleBlank[29]);
			guess = input.next();
			System.out.print(ImpossibleModeBlanksCustomMethod(guess, Impossible, ImpossibleBlank, failurecount, Hangman));
		}
		return blank;
	}
	public static char HangmanManCustomMethod(int Hangman){
		if (Hangman == 0){
			System.out.println("\t ________________");
			System.out.println("\t |\t\t|");
			System.out.println("\t |\t\t|");
			System.out.println("\t \t\t|");
			System.out.println("\t \t\t|");
			System.out.println("\t \t\t|");
			System.out.println("\t \t\t|");
			System.out.println("\t \t\t|");
			System.out.println("________________________|_______");
		}
		if (Hangman == 1){
			System.out.println("\t ________________");
			System.out.println("\t |\t\t|");
			System.out.println("\t |\t\t|");
			System.out.println("\t O \t\t|");
			System.out.println("\t \t\t|");
			System.out.println("\t \t\t|");
			System.out.println("\t \t\t|");
			System.out.println("\t \t\t|");
			System.out.println("________________________|_______");
		}
		if (Hangman == 2){
			System.out.println("\t ________________");
			System.out.println("\t |\t\t|");
			System.out.println("\t |\t\t|");
			System.out.println("\t O \t\t|");
			System.out.println("\t | \t\t|");
			System.out.println("\t |\t\t|");
			System.out.println("\t \t\t|");
			System.out.println("\t \t\t|");
			System.out.println("________________________|_______");
		}
		if (Hangman == 3){
			System.out.println("\t ________________");
			System.out.println("\t |\t\t|");
			System.out.println("\t |\t\t|");
			System.out.println("\t O \t\t|");
			System.out.println("\t |/ \t\t|");
			System.out.println("\t |\t\t|");
			System.out.println("\t \t\t|");
			System.out.println("\t \t\t|");
			System.out.println("________________________|_______");
		}
		if (Hangman == 4){
			System.out.println("\t ________________");
			System.out.println("\t |\t\t|");
			System.out.println("\t |\t\t|");
			System.out.println("\t O \t\t|");
			System.out.println("\t\\|/ \t\t|");
			System.out.println("\t |\t\t|");
			System.out.println("\t \t\t|");
			System.out.println("\t \t\t|");
			System.out.println("________________________|_______");
		}
		if (Hangman == 5){
			System.out.println("\t ________________");
			System.out.println("\t |\t\t|");
			System.out.println("\t |\t\t|");
			System.out.println("\t O \t\t|");
			System.out.println("\t\\|/ \t\t|");
			System.out.println("\t |\t\t|");
			System.out.println("\t/ \t\t|");
			System.out.println("\t \t\t|");
			System.out.println("________________________|_______");
		}
		if (Hangman == 6){
			System.out.println("\t ________________");
			System.out.println("\t |\t\t|");
			System.out.println("\t |\t\t|");
			System.out.println("\t O \t\t|");
			System.out.println("\t\\|/ \t\t|");
			System.out.println("\t |\t\t|");
			System.out.println("\t/ \\\t\t|");
			System.out.println("\t \t\t|");
			System.out.println("________________________|_______");
			System.out.println("Aw! Looks like you guessed wrong too many timess! Better Luck next time! "
					+ "(You can keep guessing but just know you lost)");
		}
		char blank = ' ';
		return blank;
	}
	//HANGMAN CODE END.
	//DECK OF CARDS GAME START. GO TO LINE 2948 TO SKIP.
	public static void gameCustomMethod(String[] args){
		//initialize everything
		int[] cardDeck = new int[52];
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		List<String> pickedCards = new ArrayList<String>();

		//initialize the cards
		for(int i = 0; i< cardDeck.length; i ++)
			cardDeck[i] = i;

		//shuffle the cards
		for(int i = 0; i < cardDeck.length; i++){

			//generate an index randomly
			int index = (int)(Math.random() * cardDeck.length);
			int temp = cardDeck[i];
			cardDeck[i] = cardDeck[index];
			cardDeck[index] = temp;
		}

		//display the four cards
		for(int i = 0; i < 4; i++){
			String suit = suits[cardDeck[i] / 13];
			String rank = ranks[cardDeck[i] % 13];
			System.out.println(rank + " of " + suit);
			pickedCards.add(rank);
		}

		//create variable for Ace, King, Queen, Jack
		int Ace, Jack, Queen, King;

		//Assign a point vale to each
		int[] points = {Ace = 1, Jack = 11, Queen = 12, King = 13};

		//add the cards together and show sum
		int sum = 0;
		int jack = 11;
		int queen = 12;
		int king = 13;
		int ace = 1;
		Iterator<String> iterator = pickedCards.iterator();
		while(iterator.hasNext()) {

			String rank = iterator.next();
			System.out.println(rank);
			if(rank.equalsIgnoreCase("Jack")){
				sum = sum+jack;
			}
			else if(rank.equalsIgnoreCase("Queen")){
				sum = sum+queen;
			}
			else if(rank.equalsIgnoreCase("King")){
				sum = sum+king;
			}
			else if(rank.equalsIgnoreCase("Ace")){
				sum = sum+ace;
			} 
			else {
				sum = sum+Integer.parseInt(rank);
			}
		}
		System.out.println("Sum of picked cards is : "+sum);
		//Parts below were added to keep with the rest of the game format
		System.out.print("Play again? (1) Yes. (2) No, return to Game Hub.");
		Scanner input = new Scanner(System.in); 
		int repeator = input.nextInt();
		try{
			if(repeator <= 0){
				System.out.println("Choice not specified, returning to Game Hub.");
				GameHub();
			}
			if (repeator == 1){
				gameCustomMethod(args);
			}
			if (repeator == 2){
				GameHub();
			}
			if (repeator >= 3){
				System.out.println("Choice not specified, returning to Game Hub.");
				GameHub();
			}
		}
		catch (Exception e){
			System.out.println("There was an error in your input, please enter a numeric value");
		}

	}
	//DECK OF CARDS GAME END.
	//LANE CODE START. GO TO LINE 3023 TO SKIP.
	//Constantly looking this up frustrates me.
	//Keep balls dropped under the number of slots, otherwise code won't work.
	//Hard to visualize as there is no physical model for this, save for the textbook example.912 
	public static void LaneCustomMethod() {
		int NoB;//Number of Balls
		int NoS;//Number of Slots
		System.out.println("How many balls will you drop? ");
		Scanner input = new Scanner(System.in);
		NoB= input.nextInt();
		System.out.println("How many slots will you have? ");
		NoS = input.nextInt();
		char[] Array = new char[NoS-1];
		for (int BD = 0; BD < NoB; BD++) {//BD = Ball Drop
			System.out.println();
			for (int ab = 0; ab < NoS-1; ab++) {
				double Chance = Math.random();
				if (Chance < .5)
					Array[BD] = 'L';
				else if (Chance >= .5)
					Array[BD] = 'R';
				System.out.print(Array[BD]);
			}
		}//Thank you past Ponapto Recordings.

		//Parts below were added to keep with the rest of the game format
		System.out.print("\nPlay again? (1) Yes. (2) No, return to Game Hub.");
		int repeator = input.nextInt();
		try{
			if(repeator <= 0){
				System.out.println("Choice not specified, returning to Game Hub.");
				GameHub();
			}
			if (repeator == 1){
				LaneCustomMethod();
			}
			if (repeator == 2){
				GameHub();
			}
			if (repeator >= 3){
				System.out.println("Choice not specified, returning to Game Hub.");
				GameHub();
			}
		}
		catch (Exception e){
			System.out.println("There was an error in your input, please enter a numeric value");
		}
	}
	//LANE CODE END.
}