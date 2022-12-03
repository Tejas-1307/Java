package Java8;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateAndTime {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(dateTimeFormatter.format(localDate));

        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());

        System.out.println(localDate.plusDays(4));
        System.out.println(localDate.minusDays(4));

        System.out.println(localDate.getEra());
        System.out.println(localDate.getChronology());

        ZoneId zoneId = ZoneId.of("America/Phoenix");

        LocalDate localDate1 = LocalDate.now(zoneId);
        System.out.println(localDate1);

        LocalTime localTime = LocalTime.now(zoneId);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.of(2021,2,3,14,3);
        LocalDateTime localDateTime1 = LocalDateTime.of(2022,12,3,12,3);
        Duration duration = Duration.between(localDateTime,localDateTime1);
        System.out.println(duration);

        LocalDate localDate2 = LocalDate.of(2021,12,3);
        LocalDate localDate3 = LocalDate.now();
        Period period = Period.between(localDate2,localDate3);
        System.out.println(period.getDays());

    }
}
