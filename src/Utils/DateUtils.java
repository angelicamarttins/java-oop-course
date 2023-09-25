package Utils;

import java.time.format.DateTimeFormatter;

public class DateUtils {
  public static DateTimeFormatter fullYearMask() {
    return DateTimeFormatter.ofPattern("dd/MM/yyyy");
  }

  public static DateTimeFormatter fullYearHourMask() {
    return DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
  }
}
