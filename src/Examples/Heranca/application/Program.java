package Examples.Heranca.application;

import Examples.Heranca.entities.Account;
import Examples.Heranca.entities.BusinessAccount;
import Examples.Heranca.entities.SavingsAccount;

public class Program {
  public static void main(String[] args) {
    // Upcasting
    Account acc = new BusinessAccount();

    // Downcasting
    BusinessAccount acc1 = (BusinessAccount) acc;

    // Downcasting - Exception during runtime
    Account acc2 = new SavingsAccount();
    // BusinessAccount acc3 = (BusinessAccount) acc2;

    System.out.println(acc1 instanceof BusinessAccount);
    System.out.println(acc2 instanceof BusinessAccount);
  }
}
