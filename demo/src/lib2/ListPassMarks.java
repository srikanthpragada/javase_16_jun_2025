package lib2;

import java.nio.file.Files;
import java.nio.file.Path;

public class ListPassMarks {

	public static void main(String[] args) throws Exception {
		var path = Path.of("c:\\classroom\\java\\marks.txt");
		
		Files.lines(path)
		     .mapToInt(v -> Integer.parseInt(v))
		     .filter( marks ->  marks >= 50)
		     .forEach(System.out::println);
	}
}
