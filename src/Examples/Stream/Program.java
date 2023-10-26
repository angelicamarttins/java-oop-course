package Examples.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

    Stream<Integer> stream1 = numbers.stream().map(number -> number * 10);
    System.out.println(Arrays.toString(stream1.toArray()));

    Stream<String> stream2 = Stream.of("Angélica, Mayara, Caetano");
    System.out.println(Arrays.toString(stream2.toArray()));

    Stream<Integer> stream3 = Stream.iterate(1, number -> number + 1);
    System.out.println(Arrays.toString(stream3.limit(5).toArray()));

    Stream<Long> stream4 =
        Stream.iterate(new Long[]{0L, 1L}, num -> new Long[]{num[1], num[0] + num[1]})
            .map(num -> {
              System.out.println(num[0] + " " + num[1]);
              return num[0];
            });

    System.out.println("FORA" + Arrays.toString(stream4.limit(5).toArray()));
  }
}
