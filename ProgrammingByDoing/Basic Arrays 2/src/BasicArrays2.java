import java.util.Random;

public class BasicArrays2 {
	public static void main(String[] args) {
		int[] slot = new int[10];
		int number;
		
		Random rand = new Random();
		
		for (int i = 0; i < slot.length; i++) {
			number = 1 + rand.nextInt(100);
			slot[i] = number;
		}
		
		for (int i = 0; i < slot.length; i++) {
			System.out.println("Slot " + i + " contains a " + slot[i]);
		}
	}
}
