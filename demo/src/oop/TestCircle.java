package oop;

public class TestCircle {

	public static void main(String[] args) {
		 Circle c = new Circle(12.5);
		 
		 System.out.println(c.getArea());
		 c.setRadius(15);
		 System.out.println(c.getArea());
		 
		 Circle c2 = new Circle(10);

	}

}
