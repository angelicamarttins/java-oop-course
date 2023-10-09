package Examples.GenericBoundedWIldcard2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
  public static void main(String[] args) {
    List<Integer> ints = Arrays.asList(1, 2, 3);
    List<Double> doubles = Arrays.asList(0.1, 0.2, 0.3);
    List<Object> finalList = new ArrayList<>();

    copy(ints, finalList);
    System.out.println();
    copy(doubles, finalList);
  }

  public static void copy(List<? extends Number> source, List<? super Number> destiny) {
    for (Number number : source) {
      destiny.add(number);
    }

    System.out.println(destiny);
  }
}
