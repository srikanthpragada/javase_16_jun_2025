package basics;

import java.util.Scanner;

public class MonthDays {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Enter month number [1-12] :");
		int month = s.nextInt();
	

		int days = switch (month) {
		case 2 -> {
			System.out.print("Enter year :");
			int year = s.nextInt();
			
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
				yield 29;
			else
				yield 28;
		}
		case 4, 6, 9, 11 -> 30;
		default -> 31;
		};
		
		System.out.println("No. of days = " + days);
	
		s.close();
	}

}
