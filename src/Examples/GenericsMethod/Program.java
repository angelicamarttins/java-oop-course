package Examples.GenericsMethod;

import java.util.Arrays;
import java.util.List;

public class Program {
  public static void main(String[] args) {
    String a = "Angélica";
    int b = 31;
    List<Boolean> c = Arrays.asList(true, false);
    List<String> d = Arrays.asList("Mayara");

    print(a, b, c);

    print(a, b, d);
  }

  private static <T, K extends Number> void print(T a, K b, List<?> c) {
    System.out.println(a);
    System.out.println(b);
    System.out.println(c.get(0));
  }
}
