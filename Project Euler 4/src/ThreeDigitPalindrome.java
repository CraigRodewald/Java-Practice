
public class ThreeDigitPalindrome {
	public static void main(String[] args) {
		// Initialize variables
		int number1 = 100;
		int number2 = 100;
		int total = 0;
		String palindrome;
		boolean check;
		
		while(number1 > 1000){
			while(number2 > 1000) {
				System.out.println(number2);
				total = number1 * number2;
				palindrome = String.valueOf(total);
				check = checkPalindrome(palindrome);
				if (check) {
					System.out.println(total);
				}
				number2++;
			}
			number1++;
		}
	}
	
	public static boolean checkPalindrome(String number) {
		String number1;
		String number2;
		
		number1 = number.substring(0, 3);
		number2 = number.substring(3, number.length());
		
		System.out.println(number1);
		System.out.println(number2);
		
		
		return (number1 == number2);
	}
}