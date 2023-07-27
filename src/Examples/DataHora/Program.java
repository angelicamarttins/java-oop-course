package Examples.DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
  public static void main(String[] args) {
    // Data local sem hora
    LocalDate localDate = LocalDate.now();
    System.out.println("localDate " + localDate);

    // De ISO para data local sem hora
    LocalDate isoToLocalDate = LocalDate.parse("1991-11-19");
    System.out.println("isoToLocalDate " + isoToLocalDate);

    // Data local com hora e sem fuso horário
    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println("localDateTime " + localDateTime);

    // De ISO para data local com hora e sem fuso horário
    LocalDateTime isoToLocalDateTime = LocalDateTime.parse("1991-11-19T15:00");
    System.out.println("isoToLocalDateTime " + isoToLocalDateTime);

    // Data-hora global com fuso horário negativo
    ZonedDateTime zonedDateTime = ZonedDateTime.now();
    System.out.println("zonedDateTime " + zonedDateTime);

    // De ISO para data-hora global com fuso horário negativo
    ZonedDateTime isoToZonedDateTime = ZonedDateTime.parse("1991-11-19T15:00-03:00");
    System.out.println("isoToZonedDateTime " + isoToZonedDateTime);

    // Data-hora global com fuso horário positivo
    ZonedDateTime zonedDateTimeId = ZonedDateTime.now(ZoneId.of("Asia/Magadan"));
    System.out.println("zonedDateTimeId " + zonedDateTimeId);

    // De ISO para data-hora global com fuso horário positivo
    ZonedDateTime isoToZonedDateTimeId = ZonedDateTime.parse("1991-11-19T15:00+12:00");
    System.out.println("isoToZonedDateTimeId " + isoToZonedDateTimeId);

    // Data-hora global com fuso horário Z (Londres)
    Instant instant = Instant.now();
    System.out.println("instant " + instant);

    // De ISO para data-hora global com fuso horário Z (Londres)
    Instant isoToInstant = Instant.parse("1991-11-19T15:00:24Z");
    System.out.println("isoToInstant " + isoToInstant);

//    Instant isoToInstantDifferentZone = Instant.parse("1991-11-19T15:00:24Z");
//    System.out.println("isoToInstantDifferentZone " + isoToInstantDifferentZone);

    // Texto customizado para data-hora
    DateTimeFormatter brazilianPattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate brazilianToLocalDate = LocalDate.parse("19/11/1991", brazilianPattern);
    System.out.println("brazilianToLocalDate " + brazilianToLocalDate);

    DateTimeFormatter brazilianPatternWithHours = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    LocalDateTime brazilianWithHoursToLocalDate =
        LocalDateTime.parse("19/11/1991 15:45", brazilianPatternWithHours);
    System.out.println("brazilianWithHoursToLocalDate " + brazilianWithHoursToLocalDate);

    LocalDate isolatedLocalDate = LocalDate.of(1991, 11, 19);
    System.out.println("isolatedLocalDate " + isolatedLocalDate);

    LocalDateTime isolatedLocalDateTime =
        LocalDateTime.of(1991, 11, 19, 15, 45);
    System.out.println("isolatedLocalDateTime " + isolatedLocalDateTime);

    ZonedDateTime isolatedZonedDateTime =
        ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Asia/Magadan"));
    System.out.println("isolatedZonedDateTime " + isolatedZonedDateTime);

    // Data-hora para texto customizado
    System.out.println(localDateTime.format(brazilianPattern));
    System.out.println(localDateTime.format(brazilianPatternWithHours));
    System.out.println(brazilianPattern.format(localDate));

    // Instant para texto customizado
    DateTimeFormatter customInstant = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
        .withZone(ZoneId.systemDefault());
    System.out.println("custom instant " + customInstant.format(instant));

//    for (String zoneId : ZoneId.getAvailableZoneIds()) {
//      System.out.println(zoneId);
//    }

    // Data-hora global para local
    LocalDate instantToLocalDate = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
    LocalDateTime instantToLocalDateTime = LocalDateTime.ofInstant(Instant.now(), ZoneId.of("Portugal"));
    System.out.println("instantToLocalDate " + instantToLocalDate);
    System.out.println("instantToLocalDateTime " + instantToLocalDateTime);

    // Valores específicos da data
    System.out.println("Dia " + localDate.getDayOfMonth());
    System.out.println("Mês (nome) " + localDate.getMonth());
    System.out.println("Mês (número) " + localDate.getMonth());
    System.out.println("Ano " + localDate.getYear());
    System.out.println("Dia na contagem geral do ano (1 a 365) " +
        LocalDate.of(2023, 01, 01).getDayOfYear());
    System.out.println("Dia na contagem geral do ano (1 a 365) " +
        LocalDate.of(2023, 12, 31).getDayOfYear());
    System.out.println("Hora " + localDateTime.getHour());
    System.out.println("Minuto " + localDateTime.getMinute());
    System.out.println("Segundo " + localDateTime.getSecond());
    System.out.println("Milissegundo " + localDateTime.getNano());
  }

}
