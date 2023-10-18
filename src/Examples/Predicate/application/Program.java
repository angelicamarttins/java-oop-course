package Examples.Predicate.application;

import Examples.Comparator.ProductComparator;
import Examples.Predicate.ProductPredicate;
import Examples.Predicate.entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Program {
  public static void main(String[] args) {
    List<Product> products = new ArrayList<>();

    products.add(new Product("Headphone", 300.00));
    products.add(new Product("Mouse", 40.00));
    products.add(new Product("Teclado", 100.00));

    products.removeIf(new ProductPredicate());

    for (Product product : products) {
      System.out.println(product);
    }

    products.clear();

    products.add(new Product("Monitor", 300.00));
    products.add(new Product("HDMI", 40.00));
    products.add(new Product("Fonte de alimentação", 50.00));

    products.removeIf(Product::staticProductPredicate);

    System.out.println();
    for (Product product : products) {
      System.out.println(product);
    }

    products.clear();

    products.add(new Product("Caixa de som", 99.00));
    products.add(new Product("Caderno", 20.00));
    products.add(new Product("Luminária", 90.00));

    products.removeIf(Product::nonStaticProductPredicate);

    System.out.println();
    for (Product product : products) {
      System.out.println(product);
    }

    products.clear();

    products.add(new Product("Impressora", 1000.00));
    products.add(new Product("Cartucho", 95.00));
    products.add(new Product("Folha de sulfite", 45.00));

    Predicate<Product> predicate = product -> product.getPrice() >= 100.00;

    products.removeIf(predicate);

    System.out.println();
    for (Product product : products) {
      System.out.println(product);
    }

    products.clear();

    products.add(new Product("Lousa", 100.00));
    products.add(new Product("Giz", 50.00));
    products.add(new Product("Apagador", 25.00));


    products.removeIf(product -> product.getPrice() >= 100.00);

    System.out.println();
    for (Product product : products) {
      System.out.println(product);
    }
  }
}
