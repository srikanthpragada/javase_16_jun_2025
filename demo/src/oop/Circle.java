package oop;

public class Circle {
	private double radius;
	
    // constructor 
	public Circle(double r) {
		radius = r;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double r) {
		radius = r;
	}
}
