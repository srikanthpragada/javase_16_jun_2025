package lib2;

import java.util.ArrayList;

public class GenericsDemo {

	public static void main(String[] args) {
		var list = new ArrayList();  // RAW type 
		
		var names = new ArrayList<String>(); // Type-safe
		
		list.add(10);
		list.add("Abc");
		list.add(10.50);
		
		String s = (String) list.get(0);  
		
		names.add("Bill");
		//names.add(10);
		String st = names.get(0);
		
		
		
		
		

	}

}
