import java.util.Scanner; 
//Constantly looking this up frustrates me.
//Keep balls dropped under the number of slots, otherwise code won't work.
public class GP1 {
	//Hard to visualize as there is no physical model for this, save for the textbook example.912 
	public static void main(String[] args) {
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
		}
	}
}//Thank you past Ponapto Recordings.
/*<?xml version="1.0" encoding="UTF-8"?>
<classpath>
	<classpathentry kind="src" path="src"/>
	<classpathentry kind="con" path="org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.8"/>
	<classpathentry kind="output" path="bin"/>
</classpath>*/