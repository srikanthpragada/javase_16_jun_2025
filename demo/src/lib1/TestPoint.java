package lib1;

class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "X=" + this.x + ",Y=" + this.y;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point other)
			return this.x == other.x && this.y == other.y;
		else
			return false;
	}
	
	@Override 
	public int hashCode() {
		return  1; 
	}
}

public class TestPoint {

	public static void main(String[] args) {
		var p1 = new Point(10, 20);
		var p2 = new Point(10, 20);
		var p3 = new Point(10, 10);

		System.out.println(p1.toString());
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals("Abc"));
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}

}
