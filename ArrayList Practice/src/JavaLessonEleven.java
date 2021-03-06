import java.util.ArrayList;

public class JavaLessonEleven {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();

		names.add("Craig Rodewald");
		names.add("Nichole Ray");
		names.add("Haley Rodewald");
		names.add("Trent Ray");
		names.add("Chase Rodewald");
		names.add("Tyler Ray");

		if (names.isEmpty()) {
			System.out.println("Empty");
		} else {
			for (int i = 0; i < names.size(); i++) {
				System.out.println(names.get(i));
			}
		}
		System.out.println(names.size());

		do {
			System.out.println("Removing " + names.get(0));
			names.remove(0);
		} while (names.size() > 0);

		if (names.isEmpty()) {
			System.out.println("Empty");
		} else {
			for (int i = 0; i < names.size(); i++) {
				System.out.println(names.get(i));
			}
		}
	}
}
