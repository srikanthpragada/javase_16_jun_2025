package lib1;

public class TotalNums {

	public static void main(String[] args) {
		String data = "89,45, 34, 22,33,44";
		
		String [] nums = data.split(",");
		
		int total = 0;
		for(var s : nums) {
			total += Integer.parseInt(s.strip());
		}

		System.out.println(total);
	}

}
