package Examples.Encapsulamento.entities;

public class Account {
  private static final double TAX = 5f;
  private int number;
  private String holder;
  private double balance;

  public Account() {
  }

  public Account(int number, String holder) {
    this.number = number;
    this.holder = holder;
  }

  public Account(int number, String holder, double balance) {
    this.number = number;
    this.holder = holder;
    deposit(balance);
  }

  public int getNumber() {
    return number;
  }

  public String getHolder() {
    return holder;
  }

  public void setHolder(String holder) {
    this.holder = holder;
  }

  public double getBalance() {
    return balance;
  }

  public void deposit(double amount) {
    balance += amount;
  }

  public void withdraw(double amount) {
    balance -= amount + TAX;
  }

  public String toString(boolean updatedData) {
    String header = updatedData
        ? "Updated account data:\n"
        : "Account data:\n";

    return header
        + "Account: "
        + getNumber()
        + ", Holder: "
        + getHolder()
        + ", Balance: $ "
        + String.format("%.2f", getBalance());
  }
}
