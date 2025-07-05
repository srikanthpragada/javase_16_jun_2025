package oop2;

import java.util.Arrays;

class Player implements Comparable<Player> {
	private String name;
	private int age;

	public Player(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return this.name + " - " + this.age;
	}

	@Override
	public int compareTo(Player other) {
		 //System.out.println(" compareTo()");
		 return this.age - other.age;
	}
}

public class TestPerson2 {

	public static void main(String[] args) {
		Player players[] = {new Player("Peter", 20),
				            new Player("Larry", 25), 
				            new Player("Ellison", 23), 
				            new Player("Dave", 30),
				            new Player("Mike", 21) };

		Arrays.sort(players);

		for (var p : players)
			System.out.println(p);
	}

}
