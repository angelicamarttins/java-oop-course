package Examples.Comparator;

import Examples.Comparator.model.entities.Product;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
  @Override
  public int compare(Product product, Product otherProduct) {
    return product.getName().toUpperCase().compareTo(otherProduct.getName().toUpperCase());
  }
}
