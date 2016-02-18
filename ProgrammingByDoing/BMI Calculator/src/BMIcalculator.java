import java.util.Scanner;

public class BMIcalculator {
	public static void main(String[] args) {
		// Initialize variables
		int heightFeet;
		int heightInches;
		double weightLbs;
		double bmi;
		
		Scanner userInput = new Scanner(System.in);
		
		// Get user input
		System.out.print("Your height (feet only): ");
		heightFeet = userInput.nextInt();
		
		System.out.print("Your height (inches only): ");
		heightInches = userInput.nextInt();
		
		System.out.print("Your weight in pounds: ");
		weightLbs = userInput.nextDouble();
		
		// Do math conversions
		double heightMeters = ((heightFeet * 12) + heightInches) * 0.0254;
		double weightKg = weightLbs * 0.453592;
		
		// Do BMI calculation: mass/(height * height)
		bmi = weightKg/(heightMeters * heightMeters);
		
		System.out.println("Your BMI is " + String.format("%.6f", bmi));  //".6f" formats double to 6 decimal places
	}
}
