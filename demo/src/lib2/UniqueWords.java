package lib2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class UniqueWords {

	public static void main(String[] args) throws IOException {
		 var path = Path.of("c:\\classroom\\java\\text.txt");
		 var contents = Files.readString(path);
		 var separator = Pattern.compile("[\\s,.:;]+");
		 
		 var words = separator.split(contents);
		 
		 var sortedWords = new TreeSet<String>(Arrays.asList(words));
		 
		 for(var w : sortedWords)
			 System.out.println(w);
	}
}
