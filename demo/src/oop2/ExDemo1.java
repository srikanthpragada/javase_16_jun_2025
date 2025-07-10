package oop2;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ExDemo1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter date in YYYY-MM-DD format:");
		String input = s.nextLine();

		try {
			LocalDate ld = LocalDate.parse(input);
			System.out.println(ld.toString());
		} catch (DateTimeParseException ex) {
			System.out.println("Sorry! Invalid date entered. Please enter valid date!");
		} finally {
			s.close();
		}

	}

}
