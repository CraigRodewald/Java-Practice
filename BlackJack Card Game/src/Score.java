
public class Score {
	
	public static Boolean isBusted(int number) {
		if (number > 21) {
			System.out.println("Busted!");
			return true;
		}

		return false;
	}

}
