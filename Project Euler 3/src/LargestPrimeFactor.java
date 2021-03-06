import java.util.Scanner;

public class LargestPrimeFactor {
	// This takes the number and checks whether it is prime or not
	public static boolean isPrime(int n) {
		if (n < 2)
			return false;

		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
		System.out.println("Enter a # to get all its prime factors:");
		Scanner in = new Scanner(System.in);
		
		while (in.hasNext()) {
			int n = in.nextInt();
			
			if (isPrime(n)) {
				System.out.println(n + " is itself a prime!  No prime factors! \n");
			} 
			
			else {
				int j = n;
				for (int i = 2; i < n; i++) {
					if (isPrime(i) && (j % i == 0)) {
						j = j / i;
						System.out.print(i + " * ");
						i--;
					}
				}
			}
		}
		// Closes scanner
		in.close();
	}

}
