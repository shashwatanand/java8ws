package com.sha.java8.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Set;
import java.util.function.Predicate;

public class TimeZoneMain {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dtf.format(dt));
		
		ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT+0"));
		System.out.println(dtf.format(gmt));
		
		ZonedDateTime munich = ZonedDateTime.now(ZoneId.of("GMT+2"));
		System.out.println(dtf.format(munich));
		
		Set<String> zones = ZoneId.getAvailableZoneIds();
		//zones.forEach(z -> System.out.println(z));
		
		Predicate<String> condition = str -> str.contains("New_York");
		zones.stream().filter(condition).forEach(z -> System.out.println(z));
		
		zones.forEach(z -> {
			if (condition.test(z)) {
				System.out.println(z);
			}
		});
	}
}
