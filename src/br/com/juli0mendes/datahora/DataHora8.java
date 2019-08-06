package br.com.juli0mendes.datahora;

import static java.time.Month.NOVEMBER;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author Julio Cesar Mendes
 * 
 * The Class DataHora8.
 */
public class DataHora8 {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		/** LocalDate - representa uma data: 06/08/2019 */
		LocalDate localDateNow = LocalDate.now();
		System.out.println("localDateNow: " + localDateNow);
		
		LocalDate localDateOf = LocalDate.of(1990, NOVEMBER, 20);
		System.out.println("localDateOf: " + localDateOf);
		
		LocalDate localDatePlusWeeks = localDateOf.plusWeeks(2);
		System.out.println("localDatePlusWeeks: " + localDatePlusWeeks);
		
		LocalDate localDateMinusWeeks = localDateOf.minusWeeks(2);
		System.out.println("localDateMinusWeeks: " + localDateMinusWeeks);
		
		
		/** LocalTime - representa uma hora: 11:40:00  */
		LocalTime localTimeNow = LocalTime.now();
		System.out.println("\nlocalTimeNow: " + localTimeNow);
		
		LocalTime localTimeOf = LocalTime.of(11, 10, 01, 100000);
		System.out.println("localTimeOf: " + localTimeOf);
		
		LocalTime localTimePlusHours = localTimeOf.plusHours(5);
		System.out.println("localTimePlusHours: " + localTimePlusHours);
		
		LocalTime localTimeMinusHours = localTimeOf.minusHours(5);
		System.out.println("localTimeMinusHours: " + localTimeMinusHours);
		
		
		/** LocalDateTime - representa data+hora: 06/08/2019 11:40:00  */
		LocalDateTime localDateTimeNow = LocalDateTime.now();
		System.out.println("\nlocalDateTimeNow: " + localDateTimeNow);
		
		LocalDateTime localDateTimeOf = LocalDateTime.of(localDateOf, localTimeOf);
		System.out.println("localDateTimeOf: " + localDateTimeOf);
		
		LocalDateTime localDateTimePlusDaysAndPlusHours = localDateTimeOf.plusDays(5).plusHours(5);
		System.out.println("localDateTimePlusDaysAndPlusHours: " + localDateTimePlusDaysAndPlusHours);
		
		LocalDateTime localDateTimeMinusDaysAndMinusMinutes = localDateTimeOf.minusDays(2).minusMinutes(30);
		System.out.println("localDateTimeMinusDaysAndMinusMinutes: " + localDateTimeMinusDaysAndMinusMinutes);
		
		
		/** Instant - representa um instante/momento na linha do tempo (milissegundos a partir de 01/01/1970 00:00:00) */
		Instant instantNow = Instant.now();
		System.out.println("\ninstantNow: " + instantNow);
		
		Instant instantOfEpochMilli = Instant.ofEpochMilli(500000000000L);
		System.out.println("instantOfEpochMilli: " + instantOfEpochMilli);
		
		/** ZonedDateTime - LocalDatetime com TimeZone (fuso horário) */
		ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
		System.out.println("\nzonedDateTimeNow: " + zonedDateTimeNow);
		
		ZoneId zoneId = ZoneId.of("America/Montevideo");
		ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(localDateTimeOf, zoneId);
		System.out.println("zonedDateTimeOf: " + zonedDateTimeOf);
	}
}
