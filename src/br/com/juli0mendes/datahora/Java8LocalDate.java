package br.com.juli0mendes.datahora;

import static java.time.Month.NOVEMBER;

import java.time.LocalDate;

/**
 * @author Julio Cesar Mendes
 * 
 * The Class DataHora8.
 */
public class Java8LocalDate {

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
	}
}