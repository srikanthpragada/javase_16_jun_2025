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

class SalariedEmployee extends Employee {
	protected int salary;

	public SalariedEmployee(String name, String email, int salary) {
		super(name, email);
		this.salary = salary;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.salary);
	}

	public int getSalary() {
		return this.salary;
	}

	public int getPay() {
		return this.salary;
	}
}

public class TestEmployee {

	public static void main(String[] args) {
		Employee e = new Consultant("Scott", "scott@gmail.com", 10, 1000);
		e.print(); // Runtime Polymorphism 
		
	    e = new SalariedEmployee("Mark", "mark@microsoft.com", 300000);
	    e.print();
	}

}
