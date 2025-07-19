package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SortNamesFromFile {

	public static void main(String[] args) throws IOException {
		var path = Path.of("c:\\classroom\\java\\names.txt");
		var lines = Files.readAllLines(path);
		
		lines.sort(null); // sort using default comparison
		
		for(var line : lines)
			System.out.println(line);
	}

}
