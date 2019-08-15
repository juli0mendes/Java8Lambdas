package br.com.juli0mendes.datahora;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Java8Discussion {

	public static void main(String[] args) {
		
		// LocalDateTime - Data + Hora sem TimeZone
		
		
		// Instant - Data + Hora + GMT
		// N�o � recomendado para fazer c�lculo de datas (per�odos)
		// � para armazenar milissegundos
		Instant instantNow = Instant.now();
		System.out.println("instantNow: " + instantNow);
		
		ZonedDateTime intantNowAtZone = instantNow.atZone(ZoneId.of("America/Sao_Paulo"));
		System.out.println("intantNowAtZone: " + intantNowAtZone);
		
		// ZonedDateTime - Data + Hora + Fuso Hor�rio
		
		
	}
}
