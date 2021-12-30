package datetimes;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class DateTimesExample {

    public static void main(String[] args) {

        //creating
        System.out.println("LocalDate: " + LocalDate.now());
        System.out.println("LocalTime: " + LocalTime.now());
        System.out.println("LocalDateTime: " + LocalDateTime.now());
        System.out.println("ZonedDateTime: " + ZonedDateTime.now());

        LocalDate localDate = LocalDate.of(2012, Month.JANUARY, 10);
        System.out.println(localDate);
        LocalTime localTime = LocalTime.of(5, 30);
        System.out.println(localTime);
        LocalDateTime localDateTime = LocalDateTime.of(2012, Month.JANUARY, 10, 5, 30);
        System.out.println(localDateTime);
        ZoneId zonedId = ZoneId.of("Europe/Tirane");
        ZonedDateTime zoneDateTime = ZonedDateTime.of(2012, 1, 10, 5, 30, 0, 0, zonedId);
        System.out.println(zoneDateTime);

        //manipulating
        localDate.plus(1, ChronoUnit.DAYS);
        localTime.plus(1, ChronoUnit.HOURS);
        localDateTime.plusDays(1);
        zoneDateTime.plus(5, ChronoUnit.MONTHS);

        //formatting
        System.out.println("\n  Formatting ISO");
        System.out.println(localDate.format(DateTimeFormatter.ISO_DATE));
        System.out.println(localTime.format(DateTimeFormatter.ISO_TIME));
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println(zoneDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        System.out.println("\n Formatting Short Style");
        DateTimeFormatter shortDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(shortDate.format(localDate));
        DateTimeFormatter shortTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(shortTime.format(localTime));
        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(shortDateTime.format(localDateTime));
        System.out.println(shortDateTime.format(zoneDateTime));

        System.out.println("\n  Formatting Custom Style");
        DateTimeFormatter customDateFormatter = DateTimeFormatter.ofPattern("yyyy MMM dd");
        System.out.println(customDateFormatter.format(localDate));
        DateTimeFormatter customTimeFormatter = DateTimeFormatter.ofPattern("hh:mm");
        System.out.println(customTimeFormatter.format(localTime));
        DateTimeFormatter customDateTimeFormatter = DateTimeFormatter.ofPattern("yyyy MMMM dd  hh:mm");
        System.out.println(customDateTimeFormatter.format(localDateTime));
        System.out.println(customDateTimeFormatter.format(zoneDateTime));

        //parsing
        System.out.println("\n Parsing String to Date");
        localDate = LocalDate.parse("2018-05-05");
        System.out.println(localDate);
        localTime = LocalTime.parse("05:30:00");
        System.out.println(localTime);
        localDateTime = LocalDateTime.parse("2018-05-05T11:50:55");
        System.out.println(localDateTime);
        zoneDateTime = ZonedDateTime.parse("2012-01-10T05:30+01:00[Europe/Tirane]");
        System.out.println(zoneDateTime);
        //parsing custom date string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        ZonedDateTime zonedDateTime = ZonedDateTime.parse("2015-05-05 10:15:30 Europe/Paris", formatter);
        System.out.println(zoneDateTime);





    }


}
