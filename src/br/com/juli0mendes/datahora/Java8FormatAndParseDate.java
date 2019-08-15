package br.com.juli0mendes.datahora;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

public class Java8FormatAndParseDate {
	
	public static void main(String[] args) {
		
		LocalDateTime localDateTimeNow = LocalDateTime.now();
		
		// Classes antigas: DateFormat e SimpleDateFormat
		// Nova classe: DateTimeFormatterDate
		
		DateTimeFormatter dateTimeFormatterIsoDateTime = DateTimeFormatter.ISO_DATE_TIME;
		String formatIsoDateTime = dateTimeFormatterIsoDateTime.format(localDateTimeNow);
		System.out.println("formatIsoDateTime: " + formatIsoDateTime);
		
		DateTimeFormatter dateTimeFormatterIsoDate = DateTimeFormatter.ISO_DATE;
		String formatIsoDate = dateTimeFormatterIsoDate.format(localDateTimeNow);
		System.out.println("formatIsoDate: " + formatIsoDate);
		
		DateTimeFormatter dateFormatterFull = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter dateFormatterLong = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter dateFormatterMedium = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter dateFormatterShort = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		
		String formatterDateFormatFull = dateFormatterFull.format(localDateTimeNow);
		System.out.println("\nformatterDateFormatFull: " + formatterDateFormatFull);
		
		String formatterFormatDateLong = dateFormatterLong.format(localDateTimeNow);
		System.out.println("formatterFormatDateLong: " + formatterFormatDateLong);
		
		String formatterFormatDateMedium = dateFormatterMedium.format(localDateTimeNow);
		System.out.println("formatterFormatDateMedium: " + formatterFormatDateMedium);
		
		String formatterFormatDateShort = dateFormatterShort.format(localDateTimeNow);
		System.out.println("formatterFormatDateShort: " + formatterFormatDateShort);
		
		ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
		
		DateTimeFormatter dateTimeFormatterFull = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL); // só funciona se possuir Time Zone
		DateTimeFormatter dateTimeFormatterLong = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG); // só funciona se possuir Time Zone
		DateTimeFormatter dateTimeFormatterMedium = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		DateTimeFormatter dateTimeFormatterShort = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		
		String formatterFormatDateTimeFull = dateTimeFormatterFull.format(zonedDateTimeNow);
		System.out.println("\nformatterFormatDateTimeFull: " + formatterFormatDateTimeFull);
		
		String formatterFormatDateTimeLong = dateTimeFormatterLong.format(zonedDateTimeNow);
		System.out.println("formatterFormatDateTimeLong: " + formatterFormatDateTimeLong);
		
		String formatterFormatDateTimeMedium = dateTimeFormatterMedium.format(localDateTimeNow);
		System.out.println("formatterFormatDateTimeMedium: " + formatterFormatDateTimeMedium);
		
		String formatterFormatDateTimeShort = dateTimeFormatterShort.format(localDateTimeNow);
		System.out.println("formatterFormatDateTimeShort: " + formatterFormatDateTimeShort);
		
		
		DateTimeFormatter dateTimeFormatterofPattern = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatterFormatDateTimeOfPattern = dateTimeFormatterofPattern.format(localDateTimeNow);
		System.out.println("\nformatterFormatDateTimeOfPattern: " + formatterFormatDateTimeOfPattern);

		System.out.println("invertido: " + localDateTimeNow.format(dateTimeFormatterofPattern));
		
		TemporalAccessor parse = dateTimeFormatterofPattern.parse("20-11-1990 00:00:00");
		LocalDateTime from = LocalDateTime.from(parse);
		System.out.println("from: " + from);
		
		
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("HH:mm:ss");
		TemporalAccessor temporalAccessor = ofPattern.parse("12:20:22");
		LocalTime from2 = LocalTime.from(temporalAccessor);
		System.out.println("from2: " + from2);
		
	}
}