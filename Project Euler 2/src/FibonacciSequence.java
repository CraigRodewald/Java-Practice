import java.util.ArrayList;

public class FibonacciSequence {
	public static void main(String[] args) {
		int number = 1;
		int maxValue = 4000000;
		int index = 0;
		int total = 0;
		ArrayList<Integer> obj = new ArrayList<Integer>();
		
		while (number < maxValue) {
			obj.add(number);
			
			if (obj.size()>1) {
				number = number + obj.get(index-1);
			} else {
				number = number + obj.get(index);
			}
			index++;
		}
		for (int i = 0; i < obj.size(); i++) {
			if (obj.get(i) % 2 == 0) {
				total = total + obj.get(i);
			}
		}
		System.out.println(total);
	}
}
