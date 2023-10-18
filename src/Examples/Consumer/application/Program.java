package Examples.Consumer.application;

import Examples.Consumer.UpdatePrice;
import Examples.Consumer.entities.Product;
import Examples.Predicate.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    List<Product> products = new ArrayList<>();

    products.add(new Product("Headphone", 300.00));
    products.add(new Product("Mouse", 40.00));
    products.add(new Product("Teclado", 100.00));

    products.forEach(new UpdatePrice());

    products.forEach(System.out::println);

    products.clear();

    products.add(new Product("Monitor", 300.00));
    products.add(new Product("HDMI", 40.00));
    products.add(new Product("Fonte de alimentação", 50.00));

    products.forEach(Product::staticProductConsumer);

    System.out.println();
    products.forEach(System.out::println);

    products.clear();

    products.add(new Product("Caixa de som", 99.00));
    products.add(new Product("Caderno", 20.00));
    products.add(new Product("Luminária", 90.00));

    products.forEach(Product::nonStaticProductConsumer);

    System.out.println();
    products.forEach(System.out::println);

    products.clear();

    products.add(new Product("Impressora", 1000.00));
    products.add(new Product("Cartucho", 95.00));
    products.add(new Product("Folha de sulfite", 45.00));

    Consumer<Product> predicate = product -> product.setPrice(product.getPrice() * 1.1);

    products.forEach(predicate);

    System.out.println();
    products.forEach(System.out::println);

    products.clear();

    products.add(new Product("Lousa", 100.00));
    products.add(new Product("Giz", 50.00));
    products.add(new Product("Apagador", 25.00));


    products.forEach(product -> product.setPrice(product.getPrice() * 1.1));

    System.out.println();
    products.forEach(System.out::println);
  }
}
