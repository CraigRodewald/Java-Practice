import java.util.Scanner;

public class FiveYears {

	public static void main(String[] args) {
		// Initialize variables
		String name;
		int age;
		int futureAge;
		int pastAge;
		
		//Initialize Scanner for user input
		Scanner userInput = new Scanner(System.in);
		
		//Get user input
		System.out.print("Hello.  What is your name? ");
		name = userInput.nextLine();
		
		System.out.print("\nHi, " + name + "!  How old are you? ");
		age = userInput.nextInt();
		
		// Do math
		futureAge = age + 5;
		
		pastAge = age - 5;
		
		// Output
		System.out.print("\nDid you know that in five years you will be " + futureAge + " years old?\n");
		System.out.print("And five years ago you were " + pastAge + "!  Imagine that!");

	}

}
