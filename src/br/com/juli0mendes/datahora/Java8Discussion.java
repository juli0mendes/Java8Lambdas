package br.com.juli0mendes.datahora;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Java8Discussion {

	public static void main(String[] args) {
		
		// LocalDateTime - Data + Hora sem TimeZone
		
		
		// Instant - Data + Hora + GMT
		// Não é recomendado para fazer cálculo de datas (períodos)
		// É para armazenar milissegundos
		Instant instantNow = Instant.now();
		System.out.println("instantNow: " + instantNow);
		
		ZonedDateTime intantNowAtZone = instantNow.atZone(ZoneId.of("America/Sao_Paulo"));
		System.out.println("intantNowAtZone: " + intantNowAtZone);
		
		// ZonedDateTime - Data + Hora + Fuso Horário
		
		
	}
}
