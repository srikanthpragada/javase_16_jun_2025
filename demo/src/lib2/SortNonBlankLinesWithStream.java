package lib2;

import java.nio.file.Files;
import java.nio.file.Path;

public class SortNonBlankLinesWithStream {

	public static void main(String[] args) throws Exception {
		var path = Path.of("c:\\classroom\\java\\names.txt");
		
		Files.lines(path)
		     .filter( line -> line.strip().length() > 0)
		     .sorted()
		     .forEach( line -> System.out.println(line.toUpperCase()));
	}
}
