package oop2;

import java.util.Arrays;

class Person implements Comparable<Person> {
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public int compareTo(Person other) {
		 return this.name.compareTo(other.name);
	}
}

public class TestPerson {

	public static void main(String[] args) {
		Person people[] = { new Person("Peter"),
				            new Person("Larry"), 
				            new Person("Ellison"), 
				            new Person("Dave"),
				            new Person("Mike") };

		Arrays.sort(people);

		for (var p : people)
			System.out.println(p);
	}

}
