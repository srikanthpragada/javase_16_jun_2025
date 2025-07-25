package lib2;

import java.nio.file.Files;
import java.nio.file.Path;

public class ListHigherThanAvgV2 {

	public static void main(String[] args) throws Exception {
		var path = Path.of("c:\\classroom\\java\\marks.txt");
		var lines  = Files.readAllLines(path);
		
		var avg =
		  lines.stream()
		  .mapToInt(v -> Integer.parseInt(v))// List to Stream 
	      .average()
          .getAsDouble();
		
		
		lines.stream()
			 .mapToInt(v -> Integer.parseInt(v))
		     .filter(marks -> marks >= avg)
		     .forEach(System.out::println);
		     
	}
}
