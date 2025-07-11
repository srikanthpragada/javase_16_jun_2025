package oop;

public class TestCounter {

	public static void main(String[] args) {
		Counter c; // object reference

		c = new Counter(100); // Object

		// Call methods 
		c.inc();
		c.inc(5);
		System.out.println(c.getValue());
		
		c.reset();
		System.out.println(c.getValue());

		
		Counter c2 = new Counter();   // starts with 0
		System.out.println(c2.getValue());
		
		try {
			c2.dec();
		} catch (InvalidCounterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
