package oop;

public class Counter {
    // instance variables
	private int value, start;
	
	public Counter(int v) {
		value = start = v;
	}
	
	public Counter() {
		// call another constructor
		this(0);
	}
	
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
		value = start;
	}
}
