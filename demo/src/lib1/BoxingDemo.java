package lib1;

public class BoxingDemo {

	public static void process(Object obj) {
		System.out.println(obj.getClass());
	}

	public static void main(String[] args) {

		process("Abc");
		process(new Integer(10)); // Boxing
		process(10); 			  // AutoBoxing
		process(false);
		
		Integer iobj = 10;  // AutoBoxing 
		int n = iobj;       // AutoUnboxing 
	

	}

}
