package Examples.Comparator.application;

import Examples.Comparator.ProductComparator;
import Examples.Comparator.model.entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
  public static void main(String[] args) {
    List<Product> products = new ArrayList<>();

    products.add(new Product("TV", 3000.00));
    products.add(new Product("Notebook", 4000.00));
    products.add(new Product("Tablet", 1000.00));

    products.sort(new ProductComparator());

    for (Product product : products) {
      System.out.println(product);
    }

    products.clear();

    products.add(new Product("TV", 3000.00));
    products.add(new Product("Notebook", 4000.00));
    products.add(new Product("Tablet", 1000.00));
    Comparator<Product> productComparatorVar = new Comparator<Product>() {
      @Override
      public int compare(Product product, Product otherProduct) {
        return product.getName().toUpperCase().compareTo(otherProduct.getName().toUpperCase());
      }
    };

    products.sort(productComparatorVar);

    System.out.println();
    for (Product product : products) {
      System.out.println(product);
    }

    products.clear();

    products.add(new Product("TV", 3000.00));
    products.add(new Product("Notebook", 4000.00));
    products.add(new Product("Tablet", 1000.00));

    products.sort((product, otherProduct) -> product.getName().toUpperCase().compareTo(otherProduct.getName().toUpperCase()));

    System.out.println();
    for (Product product : products) {
      System.out.println(product);
    }
  }
}
