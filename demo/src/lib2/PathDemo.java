package lib2;

import java.nio.file.Files;
import java.nio.file.Path;

public class PathDemo {

	public static void main(String[] args) {
		 var p = Path.of("c:\\classroom\\java");
		 
		 System.out.println(p.getClass());
		 
		 System.out.println(Files.isDirectory(p));

	}

}
