import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class Main {
    public static void main(String[] args) {

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        System.out.println(ZonedDateTime.now());

        System.out.println(LocalDate.of(2019, 6, 16));
        System.out.println(LocalDate.of(2019, Month.SEPTEMBER, 1));

        System.out.println(LocalTime.of(14, 30));
        System.out.println(LocalTime.parse("21:30:00"));

        System.out.println(ZonedDateTime.now());
        System.out.println(ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]"));

        System.out.println(ZoneId.of("Europe/Paris"));
        System.out.println(ZoneId.systemDefault());

        LocalDate today = LocalDate.now();

        System.out.println(today.plus(1, ChronoUnit.DAYS));
        System.out.println(today.plus(1, ChronoUnit.WEEKS));
        System.out.println(today.plus(1, ChronoUnit.MONTHS));
        System.out.println(today.plus(1, ChronoUnit.YEARS));
        System.out.println(today.plus(1, ChronoUnit.DECADES));
        System.out.println(today.plus(1, ChronoUnit.CENTURIES));

        LocalTime now = LocalTime.now();
        System.out.println(now.plus(1, ChronoUnit.SECONDS));
        System.out.println(now.plus(1, ChronoUnit.MINUTES));
        System.out.println(now.plus(1, ChronoUnit.HOURS));
        System.out.println(now.plus(1, ChronoUnit.HALF_DAYS));

        System.out.println(today.with(TemporalAdjusters.firstDayOfMonth()));
        System.out.println(today.with(TemporalAdjusters.firstDayOfNextMonth()));
        System.out.println(today.with(TemporalAdjusters.firstDayOfNextYear()));
        System.out.println(today.with(TemporalAdjusters.lastDayOfMonth()));
        System.out.println(today.with(TemporalAdjusters.next(DayOfWeek.MONDAY)));
        System.out.println(today.with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY)));

        now.plus(Duration.ofMinutes(35));
        now.plus(Duration.ofDays(5));
        now.plus(Duration.ofHours(12));

        LocalDate start = LocalDate.of(2019, 6, 10);
        LocalDate end = LocalDate.of(2019, 6, 17);

        System.out.println(Period.between(start, end));

        System.out.println(Period.between(start, end).getDays());

        System.out.println(LocalDate.parse("1990-09-01").getDayOfWeek());

        System.out.println(LocalDate.of(2019, 1, 1).getDayOfWeek());
        System.out.println(LocalDate.of(2019, 12, 31).getDayOfWeek());

        for (String zone : ZoneId.getAvailableZoneIds()) {
            System.out.println(zone);
        }
    }
}
