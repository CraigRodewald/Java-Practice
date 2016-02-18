import java.util.Scanner;

public class Calculator {
	
	public static String getOperation(Scanner userInput){
		//Initialize variables
		
		String operation;
		
		// Get user input
		System.out.println("Enter the operation you want to perform:");
		System.out.println("Seperate the opperand and numbers with spaces:");
		operation = userInput.nextLine();
		
		return operation;
	}
	
	public static class Numeric
	{
		public static boolean isNumeric( String s )
		{
			return ( isDouble(s) || isInteger(s) );
		}

		public static boolean isDouble( String s )
		{
			double n = 0;
			try
			{
				n = Double.valueOf( s );
			}

			catch ( NumberFormatException e )
			{
				return false;
			}

			return true;
		}

		public static boolean isInteger( String s )
		{
			int n = 0;
			try
			{
				n = Integer.valueOf( s );
			}

			catch ( NumberFormatException e )
			{
				return false;
			}

			return true;
		}
	}
	
	public static String[] convertToArray(String equation){
		// Splits the string into an array by using whitespace as the splitter
		String[] equationArray = equation.split(" ");
		
		return equationArray;
	}

	public static void main(String[] args) {
		// Initialize variables
		String equation;
		String[] equationArray;
		Scanner userInput = new Scanner(System.in);
		
		// Get user input
		equation = getOperation(userInput);
		//System.out.println(equation);  //Prints the return to screen for debug
		
		equationArray = convertToArray(equation);
		//boolean number1 = Numeric.isNumeric(equationArray[0]);
		if (Numeric.isNumeric(equationArray[0]) == true) {
			number1 = Numeric.isInteger(equationArray[0]);
		}
		
		if (number1 == true) {
			int firstNumber = Numeric.valueOf();
		}
		System.out.println(number1);
		
		// Close Scanner and return variable
		userInput.close();
	}

}
