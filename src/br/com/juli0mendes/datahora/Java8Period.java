package br.com.juli0mendes.datahora;

import static java.time.Month.NOVEMBER;

import java.time.LocalDate;
import java.time.Period;

public class Java8Period {

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
	}
}
