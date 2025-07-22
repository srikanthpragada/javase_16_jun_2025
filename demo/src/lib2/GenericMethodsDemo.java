package lib2;

public class GenericMethodsDemo {
	/*
	public static void print(int a[]) {
		for (var v : a)
			System.out.println(v);
	}
	public static void print(String a[]) {
		for (var v : a)
			System.out.println(v);
	}
    */
	
	// Generic Method 
	public static <T> void print(T a[]) {
		for (var v : a)
			System.out.println(v);
	}
	
	
	public static void main(String[] args) {

		Integer a[] = new Integer[5];
		String s[] = new String[5];

		print(a);
		print(s);

	}

}
