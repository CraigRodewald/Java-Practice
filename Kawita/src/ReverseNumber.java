import java.util.Scanner;

public class ReverseNumber {
	// Main method instructions
    public static void main(String args[]) {
 
        // Create a new reference to a Scanner object
        // in java.util.Scanner and give System.in as an argument.
        Scanner scanner = new Scanner(System.in);
 
        // Ask user to input a number.
        System.out.println("Please enter a number to reverse and press enter : ");
 
        // Call scan.nextInt() to get and store user input number.
        int original = scanner.nextInt();
 
        // Compute what the number is in reverse.
 
        // Print out the reversed number.
        System.out.println("The reverse of the number you entered is : ");
 
    }
}
