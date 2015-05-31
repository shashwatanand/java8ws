package com.sha.java8.eg.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class Eg2 {
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter df = DateTimeFormatter.ISO_DATE;
		System.out.println(df.format(currentDate));
		
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter tf = DateTimeFormatter.ISO_TIME;
		System.out.println(tf.format(currentTime));
		
		LocalDateTime current = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE_TIME;
		System.out.println(dtf.format(current));
		
		DateTimeFormatter frLong = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println(frLong.format(current));
		
		DateTimeFormatter frShort = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(frShort.format(current));
		
		String longStr = frLong.withLocale(Locale.GERMAN).format(current);
		String stortStr = frShort.withLocale(Locale.GERMAN).format(current);
		
		System.out.println(longStr);
		System.out.println(stortStr);
		
		DateTimeFormatterBuilder builder = new DateTimeFormatterBuilder()
			.appendValue(ChronoField.MONTH_OF_YEAR)
			.appendLiteral("/")
			.appendValue(ChronoField.DAY_OF_MONTH)
			.appendLiteral("/")
			.appendValue(ChronoField.YEAR);
		DateTimeFormatter formatter = builder.toFormatter();
		System.out.println(formatter.format(current));
	}
}
