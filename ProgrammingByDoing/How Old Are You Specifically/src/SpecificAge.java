import java.util.Scanner;

public class SpecificAge {

	public static void main(String[] args) {
		// Initialize variables
		String name;
		int age;
		
		// Get user input
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Hey, What is your name? ");
		name = userInput.nextLine();
		
		System.out.print("\nOk, " + name + " how old are you? ");
		age = userInput.nextInt();
		
		if (age < 16) {
			System.out.println("You can't drive, " + name);
		}
		
		if (age < 18 && age >= 16) {
			System.out.println("You can drive but not vote, " + name);
		}
		
		if (age < 25 && age >= 18) {
			System.out.println("You can vote but not rent a car, " + name);
		}
		
		if (age >= 25) {
			System.out.println("You can do pretty much anything, " + name);
		}

	}

}
