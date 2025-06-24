package oop;

public class Counter {
    // instance variables
	private int value;
	
	// methods 
	public void inc() {
		value ++;
	}
	
	public void inc(int step) {
		value += step;
	}
	
	public void dec() {
		value --;
	}
	
	public int getValue() {
		return value;
	}
	
	public void reset() {
		value = 0;
	}
}
