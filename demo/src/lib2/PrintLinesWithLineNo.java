package lib2;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class PrintLinesWithLineNo {

	public static void main(String[] args) throws IOException {
		var fr = new FileReader("c:\\classroom\\java\\names.txt");
		var lnr = new LineNumberReader(fr);
		
		while (true) {
		    var line = lnr.readLine();
		    if(line == null) // EOF 
		    	break;
		    
			System.out.printf("%03d: %s\n", lnr.getLineNumber(), line);
		}

		fr.close();
		lnr.close();
	}

}
