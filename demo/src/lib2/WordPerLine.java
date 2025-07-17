package lib2;

import java.io.FileReader;
import java.util.Scanner;

public class WordPerLine {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);

		System.out.print("Enter filename :");
		String filename = s.nextLine();

		FileReader fr = new FileReader(filename);

		while (true) {
			var ch = fr.read();
			if(ch == -1)
				break;
			
			if (ch == ' ')
				System.out.print('\n');
			else
				System.out.print((char) ch);
		}

		fr.close();
		s.close();
	}

}
