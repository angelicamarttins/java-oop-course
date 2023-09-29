package Examples.ClassesAbstratas.application;

import Examples.ClassesAbstratas.entities.Account;
import Examples.ClassesAbstratas.entities.BusinessAccount;

import java.util.ArrayList;
import java.util.List;

public class Program {
  public static void main(String[] args) {
    double sum = 0.0;
    List<Account> allAccounts = new ArrayList<>();

    for (int i = 1; i <= 3; i++) {
      allAccounts.add(new BusinessAccount(
          13,
          "Angélica",
          10000.0 * i,
          20000.0
      ));
    }

    for (Account account : allAccounts) {
      account.deposit(10.0);
      sum += account.getBalance();

      System.out.printf("%s = %.2f\n", account.getHolder(), account.getBalance());
    }

    System.out.printf("Sum of all accounts = %.2f", sum);
  }
}
