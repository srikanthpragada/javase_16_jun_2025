package oop2;

import java.util.Arrays;
import java.util.Comparator;

class MyCircle {
	private double radius;
	
    // constructor 
	public MyCircle(double radius) {
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


class CompareMyCircle implements Comparator<MyCircle> {
	@Override
	public int compare(MyCircle c1, MyCircle c2) {
		 return (int) (c1.getRadius() - c2.getRadius());
	}
}

public class SortCircles {

	public static void main(String[] args) {
	    MyCircle [] circles = {
	    		new MyCircle(10),
	    		new MyCircle(15),
	    		new MyCircle(5)
	    };
	    
	    // Array, Comparator
	    Arrays.sort(circles, new CompareMyCircle());
	    
	    // Lambda Expression 
	    Arrays.sort(circles, 
	    		(c1, c2) ->  (int) (c1.getRadius() - c2.getRadius()));
     
	}

}
