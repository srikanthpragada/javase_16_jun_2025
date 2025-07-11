package oop;

class InvalidCounterException extends RuntimeException {
	public InvalidCounterException() {
		super("Counter cannot be < 0");
	}
}

public class Counter {
	// instance variables
	private int value, start;

	public Counter(int v) throws InvalidCounterException {
		if (v >= 0)
		    value = start = v;
		else
			throw new InvalidCounterException();
	}

	public Counter() {
		// call another constructor
		this(0);
	}

	// methods
	public void inc() {
		value++;
	}

	public void inc(int step) {
		value += step;
	}

	public void dec() throws InvalidCounterException {
		if (value > 0)
			value--;
		else
			throw new InvalidCounterException();
	}

	public int getValue() {
		return value;
	}

	public void reset() {
		value = start;
	}
}
