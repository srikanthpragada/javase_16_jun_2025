package lib2;

import java.io.FileWriter;
import java.io.IOException;

public class WriteNames {

	public static void main(String[] args) throws IOException {
		String[] names = { "Java", "C#", "Python", "SQL", "JavaScript" };

		var fw = new FileWriter("c:\\classroom\\java\\names.txt");

		for (var name : names) {
			fw.write(name + "\n");
		}

		fw.close();
	}

}
