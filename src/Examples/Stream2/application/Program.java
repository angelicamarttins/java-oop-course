package Examples.Stream2.application;

import Examples.Stream2.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);
    List<Product> products = new ArrayList<>();

    System.out.print("Enter full file path: ");
    String filePath = scanner.nextLine();

    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
      String line = bufferedReader.readLine();

      while (line != null) {
        String[] lineFields = line.split(",");
        String name = lineFields[0];
        double price = Double.valueOf(lineFields[1]);

        products.add(new Product(name, price));

        line = bufferedReader.readLine();
      }

      double averageProducts = products
          .stream()
          .map(product -> product.getPrice())
          .reduce(0.0, (product1, product2) -> product1 + product2) / products.size();

      Comparator<String> comparator = Comparator.comparing(String::toUpperCase);

      List<String> sortedProducts = products
          .stream()
          .filter(product -> product.getPrice() < averageProducts)
          .map(product -> product.getName())
          .sorted(comparator.reversed())
          .collect(Collectors.toList());


      System.out.printf("Average price: %.2f\n", averageProducts);

      sortedProducts.forEach(System.out::println);

    } catch (IOException error) {
      System.out.println("Error: " + error.getMessage());
    }
  }
}
///home/amartins/estudos/curso-java-nelio/src/Exercises/Ex019Stream/csv/products.csv