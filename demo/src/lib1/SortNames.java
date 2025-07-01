package lib1;

import java.util.Arrays;
import java.util.Scanner;

public class SortNames {

	public static void main(String[] args) {
		String[] names = new String[5];

		Scanner s = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("Enter name :");
			names[i] = s.nextLine();
		}

		s.close();

		Arrays.sort(names);

		for (var n : names)
			System.out.println(n);

	}

}
