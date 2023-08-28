package Examples.Heranca.application;

import Examples.Heranca.entities.Account;
import Examples.Heranca.entities.BusinessAccount;
import Examples.Heranca.entities.SavingsAccount;

public class Program {
  public static void main(String[] args) {
    // Upcasting
    Account acc = new BusinessAccount(13, "Angélica", 1000.0, 250.0);

    // Downcasting
    BusinessAccount acc1 = (BusinessAccount) acc;

    // Downcasting - Exception during runtime
    Account acc2 = new SavingsAccount(1313, "Angélica", 1000.0, 0.1);
    Account acc3 = new BusinessAccount(14, "Mayara", 1000.0, 250.0);
    // BusinessAccount acc3 = (BusinessAccount) acc2;

    System.out.println(acc1 instanceof BusinessAccount);
    System.out.println(acc2 instanceof BusinessAccount);

    acc.withdraw(200);
    acc2.withdraw(200);
    acc3.withdraw(100);

    System.out.println("Account withdraw: " + acc.getBalance());
    System.out.println("Savings Account withdraw: " + acc2.getBalance());
    System.out.println("Business Account withdraw: " + acc3.getBalance());
  }
}
