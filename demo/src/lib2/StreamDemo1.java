package lib2;

import java.util.Arrays;

public class StreamDemo1 {

	public static void main(String[] args) {
		 int [] nums = {10,5,33,4,55,60,20,100};
		 
		 Arrays.stream(nums)
		       .filter(n -> n % 2 == 0)   // intermediate
		       .sorted()   // intermediate
		       //.forEach( obj -> System.out.println(obj));  // term
		       .forEach(System.out::println);  // terminal

	}

}
