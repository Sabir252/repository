package Lesson41H;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date);
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		LocalDate specificDate = LocalDate.of(2023, 03, 17);
		System.out.println(specificDate);
		System.out.println(specificDate.plusMonths(2));
		System.out.println(specificDate.plusWeeks(2));
		System.out.println(specificDate);
		
		LocalTime specificTime = LocalTime.of(15, 30);
		System.out.println(specificTime);
		
		LocalTime specificTime2 = LocalTime.of(12, 30, 18);
		System.out.println(specificTime2);
		
		LocalTime specificTime3 = LocalTime.of(15, 30, 55, 23325544);
		System.out.println(specificTime3);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		LocalDateTime specificDateTime = LocalDateTime.of(2020, 06, 25, 14, 00);
		System.out.println(specificDateTime);
		
		LocalDateTime specificDateTime2 = LocalDateTime.of(specificDate, specificTime3);
		System.out.println(specificDateTime2);
		
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println(zonedDateTime);
	}

}
