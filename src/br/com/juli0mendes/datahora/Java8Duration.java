package br.com.juli0mendes.datahora;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class Java8Duration {

	public static void main(String[] args) {
		
		/** Duration apenas tempo (hora, minuto, segundo e milessegundo */
		Duration durationOfDays = Duration.ofDays(1);
		System.out.println("\ndurationOfDays: " + durationOfDays);
		
		Duration durationOfHours = Duration.ofHours(1);
		System.out.println("durationOfHours: " + durationOfHours);
		
		Duration durationOfMinutes = Duration.ofMinutes(500);
		System.out.println("durationOfMinutes: " + durationOfMinutes);
		
		Duration durationOfSeconds = Duration.ofSeconds(10, 5000);
		System.out.println("durationOfSeconds: " + durationOfSeconds);
		
		LocalTime lt1 = LocalTime.now();
		LocalTime lt2 = LocalTime.of(13, 00, 00, 100000);
		Duration durationBetween = Duration.between(lt2, lt1);
		System.out.println("durationBetween: " + durationBetween);
		
		Duration durationPlusMinutes = durationBetween.plusMinutes(1);
		System.out.println("durationPlusMinutes: " + durationPlusMinutes);
		
		LocalDate birth = LocalDate.of(1990, Month.NOVEMBER, 20);
		LocalDate today = LocalDate.now();
		Period age = Period.between(birth, today);
		System.out.println("age: " + age.getYears());
		System.out.println("months: " + age.getMonths());
		System.out.println("days: " + age.getDays());
	}
}
