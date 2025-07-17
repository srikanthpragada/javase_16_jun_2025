package lib2;

import java.io.FileReader;
import java.io.FileWriter;

public class TwoIntoOne {
	
	public static void copy(FileWriter fw, FileReader fr) 
			 throws Exception {
	   
		 while(true) {
			 int ch = fr.read();
			 if (ch == -1)
				 break;
			 
			 fw.write(ch);
		 }
	}

	public static void main(String[] args) throws Exception {

		var sourceFilename1 = "c:\\classroom\\java\\names.txt";
		var sourceFilename2 = "c:\\classroom\\java\\names2.txt";
		var targetFilename = "c:\\classroom\\java\\new_names.txt";
		
		FileReader fr = new FileReader(sourceFilename1);
		FileWriter fw = new FileWriter(targetFilename);
		
		copy(fw,fr);
		
		fr.close();
		
		fr = new FileReader(sourceFilename2);
		copy(fw,fr);
		
		fr.close();
		fw.close();
		
		System.out.println("Copied!");
		 
	}

}
