package inflean.java8.datatime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) {
        /* 기계용 */
        System.out.println("=======기계용 테스트======");
        Instant instant = Instant.now();
        System.out.println(instant);        // 기준시 UTC, GMT 를 return 함
        System.out.println(instant.atZone(ZoneId.of("UTC")));

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());  //
        System.out.println(zonedDateTime);

        /* 사람용 */
        System.out.println("=======사람용 테스트======");
        LocalDateTime now = LocalDateTime.now();        // 동작하는 곳의 시간 (만약 서버가 외국에있다면 외국의 시간으로)
        System.out.println(now);

        ZonedDateTime nowInKorea = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        System.out.println(nowInKorea);

        /* 기계용 비교 */
        System.out.println("=======기계용 비교 테스트======");
        Instant now2 = Instant.now();
        Instant plus = now2.plus(10, ChronoUnit.SECONDS);
        Duration between  = Duration.between(now2, plus);
        System.out.println(between.getSeconds());

        /* 사람용 비교 */
        System.out.println("=======사람용 비교 테스트======");
        LocalDate today = LocalDate.now();
        LocalDate thisYearBirthDay = LocalDate.of(2020,Month.JUNE, 20);

        Period period = Period.between(today,thisYearBirthDay);
        System.out.println(period.getDays());

        /* 포멧 변경 */
        System.out.println("=======포멧 변경 테스트======");
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter MMddyyyy = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(localDate.format(MMddyyyy));

        LocalDate parse = LocalDate.parse("06/20/1992", MMddyyyy);
        System.out.println(parse);
    }
}
