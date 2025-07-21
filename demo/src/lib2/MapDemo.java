package lib2;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		 var customers = new HashMap<String, Integer>();
		 
		 customers.put("Andy", 30);
		 customers.put("Scott", 35);
		 customers.put("Tom", 41);
		 
		 for(var k : customers.keySet())
			 System.out.println(k + " : " + customers.get(k));
	}
}
