package lib2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.IntStream;

public class ListHigherThanAvg {

	public static void main(String[] args) throws Exception {
		var path = Path.of("c:\\classroom\\java\\marks.txt");
		
		var avg  = Files.lines(path)
	     .mapToInt(v -> Integer.parseInt(v))
	     .average()
         .getAsDouble();
		
		System.out.println(avg);
		
		Files.lines(path)
			 .mapToInt(v -> Integer.parseInt(v))
		     .filter(marks -> marks >= avg)
		     .forEach(System.out::println);
		     
	}
}
