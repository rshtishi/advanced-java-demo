package datetimes;

import java.time.*;

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
        ZonedDateTime zoneDateTime = ZonedDateTime.of(2012, 1, 10, 5, 30, 0,0,zonedId);
        System.out.println(zoneDateTime);

    }


}
