package ClasseMembrosEstaticos.entities;

public class Product {
  public String name;
  public double price;
  public int quantity;

  public void printStockInfo(String action, int quantity) {
    System.out.printf("%s data: %s, $ %.2f, %d units, Total: $ %.2f\n", action,
        name, price, quantity, totalValueInStock());
  }

  public double totalValueInStock() {
    return price * quantity;
  }

  public void addProducts(int quantity) {
    this.quantity += quantity;

    printStockInfo("Updated", this.quantity);
  }

  public void removeProducts(int quantity) {
    this.quantity -= quantity;

    printStockInfo("Updated", this.quantity);
  }

  public String toString() {
    return name
        + ", $ "
        + String.format("%.2f", price)
        + ", "
        + quantity
        + " units, Total: $ "
        + String.format("%.2f", totalValueInStock());
  }
}
