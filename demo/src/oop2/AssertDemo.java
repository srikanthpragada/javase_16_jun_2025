package oop2;

public class AssertDemo {
	public static boolean isEven(int n) {
		return  n % 2 == 0;
	}
	
	public static void main(String[] args) {
		 assert isEven(11) == false : "isEven(11) failed";
         assert isEven(10) == true : "isEven(10) failed";
	}
}
