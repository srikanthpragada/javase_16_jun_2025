package oop;

public class TestCounter {

	public static void main(String[] args) {
		Counter c; // object reference

		c = new Counter(); // Object

		// Call methods 
		c.inc();
		c.inc();

		System.out.println(c.getValue());
		//System.out.println(c.value);
		
		Counter c2 = new Counter();
		System.out.println(c2.getValue());
	}

}
