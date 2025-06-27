package oop;

class Employee {
	protected String name, email;

	public Employee(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.email);
	}
}

class Consultant extends Employee {
	protected int hours, rate;

	public Consultant(String name, String email, int hours, int rate) {
		super(name, email);
		this.hours = hours;
		this.rate = rate;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.hours);
		System.out.println(this.rate);
	}

	public int getHours() {
		return hours;
	}

	public int getRate() {
		return rate;
	}

	public int getPay() {
		return this.hours * this.rate;
	}

}

public class TestEmployee {

	public static void main(String[] args) {
		var c = new Consultant("Scott", "scott@gmail.com", 10, 1000);

		System.out.println(c.getName());
		System.out.println(c.getPay());

	}

}
