package lib1;

record Time(int h, int m, int s) {
	public int totalSeconds() {
		return  this.h * 3600 + this.m * 60 + this.s;
	}
}

public class TestTime {
	public static void main(String[] args) {
		var t1 = new Time(10, 20, 10);
		var t2 = new Time(10, 20, 10);
		
		System.out.println(t1);
		System.out.println(t1.equals(t2));
		
		System.out.println(t1.m());
		
		System.out.println(t1.totalSeconds());

	}

}
