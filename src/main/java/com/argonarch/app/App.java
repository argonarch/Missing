package com.argonarch.app;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.Period;
import java.util.ArrayList; 
import java.util.List; 
/**
 * Input String yearsNow, String yearsDead
 * Output time life =  years, months, days, hours, minutes
 *
 */
public class App 
{
  public static void main( String[] args )
  {	
		Instant dateNow = Instant.now();
		LocalDateTime timeNow = LocalDateTime.ofInstant(dateNow, ZoneId.systemDefault());
		Integer hourInvert = (timeNow.getHour() - 23)*-1;
		Integer minuteInvert = (timeNow.getMinute() - 59)*-1;
		Integer secondInvert = (timeNow.getSecond() - 60)*-1;
		//String clockInvert = hourInvert.toString() + "-" + minuteInvert.toString() + "-" + secondInvert.toString();
		

		LocalDate locaDeteNow = LocalDate.now();
		String dateDead = args[0];
		LocalDate date = LocalDate.parse(dateDead);
		Period p = Period.between(locaDeteNow, date);
		Integer yearInvert = p.getYears();
		Integer monthInvert = p.getMonths();
		Integer dayInvert = p.getDays();
		//String dateInvert = yearInvert.toString() + "-" + monthInvert.toString() + "-" + dayInvert.toString();
		

		
		List<Integer> resultList = new ArrayList<Integer>();
		resultList.add(yearInvert);
		resultList.add(monthInvert);
		resultList.add(dayInvert);
		resultList.add(hourInvert);
		resultList.add(minuteInvert);
		resultList.add(secondInvert);

		//String result = dateInvert + "   " + clockInvert;
		//System.out.println(result);
		System.out.println(resultList);
	}
}
