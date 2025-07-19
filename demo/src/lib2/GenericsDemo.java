package lib2;

import java.util.ArrayList;

public class GenericsDemo {

	public static void main(String[] args) {
		var list = new ArrayList();  // RAW type 
		
		list.add(10);
		list.add("Abc");
		list.add(10.50);

	}

}
