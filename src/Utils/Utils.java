package Utils;

import java.time.format.DateTimeFormatter;

public class Utils {
  public static DateTimeFormatter fullYearMask() {
    return DateTimeFormatter.ofPattern("dd/MM/yyyy");
  }
}
