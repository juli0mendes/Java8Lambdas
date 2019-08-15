package br.com.juli0mendes.datahora;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;

public class Java8TimeZone {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.forLanguageTag("pt-BR"));
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
		
		LocalDate localDate = LocalDate.of(1899, 6, 6);
		LocalTime localTime = LocalTime.of(23, 59);
		ZoneId zoneId = ZoneId.of("America/Sao_Paulo");
		
		ZonedDateTime zonedDateTime = ZonedDateTime.of(localDate, localTime, zoneId);
		
		Date date = new Date(zonedDateTime.toInstant().toEpochMilli());
		
		System.out.println(dateTimeFormatter.format(zonedDateTime));
		System.out.println(dateFormat.format(date));
		
		System.out.println(zonedDateTime.getOffset());
		System.out.println(date.getTimezoneOffset());
	}
}
