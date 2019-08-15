package br.com.juli0mendes.datahora;

import java.time.Instant;

/**
 * @author Julio Cesar Mendes
 * 
 * The Class DataHora8.
 */
public class Java8LocalInstant {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		/** Instant - representa um instante/momento na linha do tempo (milissegundos a partir de 01/01/1970 00:00:00) */
		Instant instantNow = Instant.now();
		System.out.println("\ninstantNow: " + instantNow);
		
		Instant instantOfEpochMilli = Instant.ofEpochMilli(500000000000L);
		System.out.println("instantOfEpochMilli: " + instantOfEpochMilli);		
	}
}
