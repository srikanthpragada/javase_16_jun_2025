package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteNonBlank {

	public static void main(String[] args) throws IOException {
		var path = Path.of("c:\\classroom\\java\\names.txt");
		var lines = Files.readAllLines(path);

		for (var line : lines) {
			if (line.length() > 0)
				System.out.println(line);
		}
		
		

	}

}
