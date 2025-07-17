package lib2;

import java.nio.file.Files;
import java.nio.file.Path;

public class ConvertToUpper {

	public static void main(String[] args) throws Exception {
		 var sp = Path.of("c:\\classroom\\java\\names.txt");
		 var tp = Path.of("c:\\classroom\\java\\uppernames.txt");
		 
		 String contents = Files.readString(sp);
		 Files.writeString(tp, contents.toUpperCase()); 
	}

}
