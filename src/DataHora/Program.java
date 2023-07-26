package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
  public static void main(String[] args) {
    LocalDate localDate = LocalDate.now(); // Data local sem hora
    System.out.println("localDate " + localDate);

    LocalDate isoToLocalDate = LocalDate.parse("1991-11-19"); // De ISO para data local sem hora
    System.out.println("isoToLocalDate " + isoToLocalDate);

    LocalDateTime localDateTime = LocalDateTime.now(); // Data local com hora e sem fuso horário
    System.out.println("localDateTime " + localDateTime);

    LocalDateTime isoToLocalDateTime = LocalDateTime.parse("1991-11-19T15:00"); // De ISO para data local com hora e sem fuso horário
    System.out.println("isoToLocalDateTime " + isoToLocalDateTime);

    ZonedDateTime zonedDateTime = ZonedDateTime.now(); // Data-hora global com fuso horário negativo
    System.out.println("zonedDateTime " + zonedDateTime);

    ZonedDateTime isoToZonedDateTime = ZonedDateTime.parse("1991-11-19T15:00-03:00"); // De ISO para data-hora global com fuso horário negativo
    System.out.println("isoToZonedDateTime " + isoToZonedDateTime);

    ZonedDateTime zonedDateTimeId = ZonedDateTime.now(ZoneId.of("Asia/Magadan")); // Data-hora global com fuso horário positivo
    System.out.println("zonedDateTimeId " + zonedDateTimeId);

    ZonedDateTime isoToZonedDateTimeId = ZonedDateTime.parse("1991-11-19T15:00+12:00"); // De ISO para data-hora global com fuso horário positivo
    System.out.println("isoToZonedDateTimeId " + isoToZonedDateTimeId);

    Instant instant = Instant.now(); // Data-hora global com fuso horário Z (Londres)
    System.out.println("instant " + instant);

    Instant isoToInstant = Instant.parse("1991-11-19T15:00:24Z"); // De ISO para data-hora global com fuso horário Z (Londres)
    System.out.println("isoToInstant " + isoToInstant);

//    Instant isoToInstantDifferentZone = Instant.parse("1991-11-19T15:00:24Z");
//    System.out.println("isoToInstantDifferentZone " + isoToInstantDifferentZone);

    DateTimeFormatter brazilianPattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate brazilianToLocalDate = LocalDate.parse("19/11/1991", brazilianPattern);
    System.out.println("brazilianToLocalDate " + brazilianToLocalDate);

    DateTimeFormatter brazilianPatternWithHours = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    LocalDateTime brazilianWithHoursToLocalDate = LocalDateTime.parse("19/11/1991 15:45", brazilianPatternWithHours);
    System.out.println("brazilianWithHoursToLocalDate " + brazilianWithHoursToLocalDate);

    LocalDate isolatedLocalDate = LocalDate.of(1991, 11, 19);
    System.out.println("isolatedLocalDate " + isolatedLocalDate);

    LocalDateTime isolatedLocalDateTime = LocalDateTime.of(1991, 11, 19, 15, 45);
    System.out.println("isolatedLocalDateTime " + isolatedLocalDateTime);

    ZonedDateTime isolatedZonedDateTime = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Asia/Magadan"));
    System.out.println("isolatedZonedDateTime " + isolatedZonedDateTime);
  }
}
