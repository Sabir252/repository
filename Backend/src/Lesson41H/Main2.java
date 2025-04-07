package Lesson41H;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate localDate = LocalDate.of(2025, 04, 05);
		System.out.println(localDate.plusDays(7));
		
		LocalTime localTime = LocalTime.of(12, 30);
		System.out.println(localTime.plusMinutes(45));
	}

}
