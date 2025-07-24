package lib2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Time  {
	private int h, m, s;
	public Time(int h, int m, int s) {
		super();
		this.h = h;
		this.m = m;
		this.s = s;
	}

	@Override
	public String toString() {
		return this.h + ":" + this.m + ":" + this.s;
	}
	
	public int totalSeconds() {
		return this.h * 3600 + this.m * 60 + this.s;
	}
}

class CompareTimes implements Comparator<Time> {
	@Override
	public int compare(Time t1, Time t2) {
		 return t1.totalSeconds()  - t2.totalSeconds();
	}
}
public class LambdaDemo2 {

	public static void main(String[] args) {
		 ArrayList<Time> times = new ArrayList<Time>();
		 times.add(new Time(10,20,30));
		 times.add(new Time(1,2,3));
		 times.add(new Time(10,5,50));
		 
		 //Collections.sort(times, new CompareTimes() );
		
		 Collections.sort(times, (Time t1, Time t2) -> t1.totalSeconds() - t2.totalSeconds());
		 for(var t : times)
			 System.out.println(t);
		 

	}

}
