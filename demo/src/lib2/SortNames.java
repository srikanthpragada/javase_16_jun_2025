package lib2;

import java.util.TreeSet;

public class SortNames {

	public static void main(String[] args) {
		var names = new TreeSet<String>();

		names.add("George");
		names.add("Stephen");
		names.add("Garry");
		names.add("Garry");
		names.add("Kevin");

		for (var name : names) {
			System.out.println(name);
		}
	}

}
