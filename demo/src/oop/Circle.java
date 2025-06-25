package oop;

public class Circle {
	private double radius;
	
    // constructor 
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double r) {
		radius = r;
	}
}
