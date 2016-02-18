import java.util.Scanner;

public class AskingQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		
		int age;
		int heightFeet;
		int heightInches;
		double weight;
		
		System.out.print("How old are you? ");
		age = userInput.nextInt();
		
		System.out.print("How many feet tall are you? ");
		heightFeet = userInput.nextInt();
		
		System.out.print("And how many inches? ");
		heightInches = userInput.nextInt();
		
		System.out.print("How much do you weight? ");
		weight = userInput.nextDouble();
		
		System.out.println("So you're " + age + " years old, " + heightFeet + "'" + heightInches + "\" and " + weight + "lbs.");

	}

}
