package com.cts.jf;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class App07DateTimeAPI {

	public static void main(String[] args) {
	
		LocalTime startTime = LocalTime.now();
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate independence = LocalDate.of(1947, Month.AUGUST, 15);
		System.out.println(independence);
		
		Period freeIndia = Period.between(independence, today);
		
		System.out.println(String.format(
				"Its been %d years, %d months and %d days since India is free.", 
				freeIndia.getYears(),
				freeIndia.getMonths(),
				freeIndia.getDays()));
		
		LocalTime endTime = LocalTime.now();
		
		Duration progDur = Duration.between(startTime, endTime);
		
		System.out.println("It took "+ progDur.toMillis() +" milli secs to excute this application.");
	}

}
