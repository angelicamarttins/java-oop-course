package Examples.Function.entities;

import java.util.function.Function;

public class UppercaseFunction implements Function<Product, String> {
  @Override
  public String apply(Product product) {
    return product.getName().toUpperCase();
  }
}
