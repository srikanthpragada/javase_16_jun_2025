package lib1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TestDates {

	public static void main(String[] args) {
		var cd = LocalDate.now();
		System.out.println(cd);
		
		var ct = LocalTime.now();
		var st = LocalTime.now(ZoneId.of("Asia/Singapore"));
		System.out.println(ct);
		System.out.println(st);
		
		var sdt = LocalDateTime.now();
		System.out.println(sdt);
		
		var df = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println(df.format(sdt));
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMM-uuuu H:m:s");
		System.out.println(format.format(sdt));
	

	}

}
