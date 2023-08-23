package Exercises.Ex011Composicao.entities;

public class OrderItem {
  private Integer quantity;
  private Double price;
  private Product product;

  public OrderItem() {
  }

  public OrderItem(Integer quantity, Double price, Product product) {
    this.quantity = quantity;
    this.price = price;
    this.product = product;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Product getProduct() {
    return product;
  }

  public Double subTotal() {
    return price * quantity;
  }

  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();

    stringBuilder.append(product.getName() + ", ");
    stringBuilder.append(String.format("$%.2f", price));
    stringBuilder.append(", Quantity: " + quantity);
    stringBuilder.append(String.format(", Subtotal: $%.2f\n", subTotal()));

    return stringBuilder.toString();
  }
}
