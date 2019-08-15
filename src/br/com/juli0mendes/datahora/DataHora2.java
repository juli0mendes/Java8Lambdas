package br.com.juli0mendes.datahora;

import static java.time.Month.NOVEMBER;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class DataHora2 {

	public static void main(String[] args) {
		
		/** Period - apenas para datas (dia, mês e ano) */		
		Period periodOf = Period.of(1, 5, 3);
		System.out.println("periodOf: " + periodOf);
		
		Period periodOfDays = Period.ofDays(5);
		System.out.println("periodOf: " + periodOfDays);
		
		Period periodOfWeeks = Period.ofWeeks(3);
		System.out.println("periodOfWeeks: " + periodOfWeeks);
		
		Period periodOfYears = Period.ofYears(5);
		System.out.println("periodOfWeeks: " + periodOfYears);
		
		LocalDate ld1 = LocalDate.of(1990, NOVEMBER, 20);
		LocalDate ld2 = ld1.plusWeeks(2);
		
		Period periodBetween = Period.between(ld1, ld2);
		System.out.println("periodBetween: " + periodBetween);
		
		Period periodMinusDays = periodBetween.minusDays(2);
		System.out.println("minusDays: " + periodMinusDays);
		
		Period periodUntil = ld1.until(ld2);
		System.out.println("periodUntil: " + periodUntil);
		
		LocalDate localDatePlusWithPeriod = ld1.plus(periodOfYears);
		System.out.println("localDatePlusWithPeriod: " + localDatePlusWithPeriod);
		
		
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
