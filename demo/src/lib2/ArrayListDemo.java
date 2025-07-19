package lib2;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		 var prices = new ArrayList<Integer>();
		 
		 prices.add(100);
		 prices.add(200);
		 prices.add(100);
		 
		 
		 System.out.println(prices.get(1));
		 prices.add(0,50);
		 System.out.println(prices.get(1));
		 prices.remove(2);
		 
		 System.out.println(prices.indexOf(200));
		 
		 
		 

	}

}
