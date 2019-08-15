package br.com.juli0mendes.datahora;

import java.time.LocalTime;

/**
 * @author Julio Cesar Mendes
 * 
 * The Class DataHora8.
 */
public class Java8LocalTime {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		/** LocalTime - representa uma hora: 11:40:00  */
		LocalTime localTimeNow = LocalTime.now();
		System.out.println("\nlocalTimeNow: " + localTimeNow);
		
		LocalTime localTimeOf = LocalTime.of(11, 10, 01, 100000);
		System.out.println("localTimeOf: " + localTimeOf);
		
		LocalTime localTimePlusHours = localTimeOf.plusHours(5);
		System.out.println("localTimePlusHours: " + localTimePlusHours);
		
		LocalTime localTimeMinusHours = localTimeOf.minusHours(5);
		System.out.println("localTimeMinusHours: " + localTimeMinusHours);
	}
}
