

public class SumMultiplesof3or5 {
	public static void main(String[] args) {
		// Initialize variables
		int maxValue = 1000;
		int index = 0;
		int total = 0;
		int[] multiple = new int[maxValue];
		
		for (int i = 0; i < maxValue; i++) {
			if (i % 3 == 0 || i % 5 == 0 ) {
				multiple[index] = i;
				index++;
			}
		}
		for (int j = 0; j < multiple.length; j++) {
			total = total + multiple[j];
			//System.out.println(multiple[j]);
		}
		
		System.out.println(total);
	}

}
