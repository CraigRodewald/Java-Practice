import java.util.Scanner;

public class MoreData {

	public static void main(String[] args) {
		// Declare variables
		 String firstName;
		 String lastName;
		 String loginName;
		 int grade;
		 int studentID;
		 double gpa;
		 
		 // Initialize Scanner for user input
		 Scanner userInput = new Scanner(System.in);
		 
		 // Get user input
		 System.out.println("Please enter the following information so I can selll it for a profit!\n");
		 
		 System.out.print("First Name: ");
		 firstName = userInput.nextLine();
		 
		 System.out.print("Last Name: ");
		 lastName = userInput.nextLine();
		 
		 System.out.print("Grade (9-12): ");
		 grade = userInput.nextInt();
		 
		 System.out.print("Student ID: ");
		 studentID = userInput.nextInt();
		 
		// System.out.print("Login: ");
		// loginName = userInput.nextLine();
		 
		 System.out.print("GPA: ");
		 gpa = userInput.nextDouble();
		 
		 // Display info
		 System.out.println("Your information:");
		 System.out.println("\tLogin:\t" + lastName.toLowerCase() + "_" + studentID);
		 System.out.println("\tID:\t" + studentID);
		 System.out.println("\tName:\t" + lastName + ", " + firstName);
		 System.out.println("\tGPA:\t" + gpa);
		 System.out.println("\tGrade:\t" + grade);
		 

	}

}
