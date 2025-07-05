package oop2;

class Circle implements ShapeOperations {
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}

	@Override
	public double getCircum() {
		return 2 * Math.PI * this.radius;
	}
}

class Rectangle implements ShapeOperations {
	private double length, width;

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		return this.length * this.width;
	}

	@Override
	public double getCircum() {
		return 2 * (this.length + this.width);
	}
}


public class TestShapeOperations {

	public static void main(String[] args) {
		 ShapeOperations sp = new Circle(10);
		 System.out.println(sp.getArea());
		 
		 sp = new Rectangle(10, 15);
		 System.out.println(sp.getArea());

	}

}
