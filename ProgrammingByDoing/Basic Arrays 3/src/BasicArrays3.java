import java.util.Random;

public class BasicArrays3 {
	public static void main(String[] args) {
		Random r = new Random();
		int[] slot = new int[1000];
		
		int number;
		
		for (int i = 0; i < slot.length; i++) {
				System.out.println("");
			for (int j = 0; j < 21; j++) {
				number = 10 + r.nextInt(89);
				System.out.print(number + "  ");
			}
		}
		//System.out.println(slot.length);
	}
}
