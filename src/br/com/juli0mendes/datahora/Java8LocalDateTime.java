package br.com.juli0mendes.datahora;

import static java.time.Month.NOVEMBER;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author Julio Cesar Mendes
 * 
 * The Class DataHora8.
 */
public class Java8LocalDateTime {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		LocalDate localDateOf = LocalDate.of(1990, NOVEMBER, 20);
		
		LocalTime localTimeOf = LocalTime.of(11, 10, 01, 100000);		
		
		/** LocalDateTime - representa data+hora: 06/08/2019 11:40:00  */
		LocalDateTime localDateTimeNow = LocalDateTime.now();
		System.out.println("\nlocalDateTimeNow: " + localDateTimeNow);
		
		LocalDateTime localDateTimeOf = LocalDateTime.of(localDateOf, localTimeOf);
		System.out.println("localDateTimeOf: " + localDateTimeOf);
		
		LocalDateTime localDateTimePlusDaysAndPlusHours = localDateTimeOf.plusDays(5).plusHours(5);
		System.out.println("localDateTimePlusDaysAndPlusHours: " + localDateTimePlusDaysAndPlusHours);
		
		LocalDateTime localDateTimeMinusDaysAndMinusMinutes = localDateTimeOf.minusDays(2).minusMinutes(30);
		System.out.println("localDateTimeMinusDaysAndMinusMinutes: " + localDateTimeMinusDaysAndMinusMinutes);
	}
}
