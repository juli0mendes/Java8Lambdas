package br.com.juli0mendes.datahora;

import static java.time.Month.NOVEMBER;

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
public class Java8LocalZoneDateTime {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		LocalDate localDateOf = LocalDate.of(1990, NOVEMBER, 20);
		
		LocalTime localTimeOf = LocalTime.of(11, 10, 01, 100000);
		
		LocalDateTime localDateTimeOf = LocalDateTime.of(localDateOf, localTimeOf);
		
		/** ZonedDateTime - LocalDatetime com TimeZone (fuso horário) */
		ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
		System.out.println("\nzonedDateTimeNow: " + zonedDateTimeNow);
		
		ZoneId zoneId = ZoneId.of("America/Montevideo");
		ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(localDateTimeOf, zoneId);
		System.out.println("zonedDateTimeOf: " + zonedDateTimeOf);
	}
}
