package Examples.Consumer;

import Examples.Consumer.entities.Product;

import java.util.function.Consumer;

public class UpdatePrice implements Consumer<Product> {
  @Override
  public void accept(Product product) {
    product.setPrice(product.getPrice() * 1.1);
  }
}
