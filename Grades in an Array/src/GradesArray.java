import java.nio.file.Files;
import java.util.Random;
import java.util.Scanner;

public class GradesArray {

	public static void main(String[] args) {
		// Initialize variables
		String userName;
		String fileName;
		
		int[] grade = new int[5];
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		//Files file = new Files();
		
		// Get user input
		System.out.print("Name (first last) ");
		userName = scan.nextLine();
		
		System.out.print("Filename: ");
		fileName = scan.nextLine();
		
		System.out.println();
		
		for (int i = 0; i < grade.length; i++) {
			grade[i] = rand.nextInt(100)+1; 
		}
		
		System.out.println("Here are your randomly-selected grades (hope you pass): ");
		
		for (int i = 0; i < grade.length; i++) {
			System.out.println("Grade " + (i+1) + " : " + grade[i]);
		}
		
		System.out.println("\nData saved in '" + fileName + "'.");
		
		
	}

}
