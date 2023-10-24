package Examples.Function.application;

import Examples.Function.entities.Product;
import Examples.Function.entities.UppercaseFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
  public static void main(String[] args) {
    List<Product> products = new ArrayList<>();

    products.add(new Product("Headphone", 300.00));
    products.add(new Product("Mouse", 40.00));
    products.add(new Product("Teclado", 100.00));

    List<String> listFromInterfaceImplementation =
        products
            .stream()
            .map(new UppercaseFunction())
            .collect(Collectors.toList());

    listFromInterfaceImplementation.forEach(System.out::println);

    System.out.println();
    List<String> listFromStatic =
        products
            .stream()
            .map(Product::staticProductFunction)
            .collect(Collectors.toList());

    listFromStatic.forEach(System.out::println);

    System.out.println();
    List<String> listFromNonStatic =
        products
            .stream()
            .map(Product::nonStaticProductFunction)
            .collect(Collectors.toList());

    listFromNonStatic.forEach(System.out::println);

    System.out.println();
    Function<Product, String> functionExpression = product -> product.getName().toUpperCase();

    List<String> listFromLambdaExpression =
        products
            .stream()
            .map(functionExpression)
            .collect(Collectors.toList());

    listFromLambdaExpression.forEach(System.out::println);

    System.out.println();
    List<String> listFromLambdaInline =
        products
            .stream()
            .map(product -> product.getName().toUpperCase())
            .collect(Collectors.toList());

    listFromLambdaInline.forEach(System.out::println);
  }
}
