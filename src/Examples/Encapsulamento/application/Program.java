package Examples.Encapsulamento.application;

import Examples.Encapsulamento.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Account account, x;

    System.out.print("Enter account number: ");
    int accountNumber = sc.nextInt();

    System.out.print("Enter account holder: ");
    sc.nextLine();
    String accountHolder = sc.nextLine();

    System.out.print("Is there na initial deposit (y/n)? ");
    char hasInitialDeposit = sc.next().charAt(0);

    if (hasInitialDeposit == 'y') {
      System.out.print("Enter initial deposit value: ");
      double initialDeposit = sc.nextDouble();
      account = new Account(accountNumber, accountHolder, initialDeposit);
    } else {
      account = new Account(accountNumber, accountHolder);
      x = account;
      System.out.println(x.getHolder()); // Angelica
      account.setHolder("Lacraia");
      System.out.println(x.getHolder()); // Lacraia
    }

    System.out.println(account.toString(false));

    System.out.print("Enter a deposit value: ");
    account.deposit(sc.nextDouble());
    System.out.println(account.toString(true));

    System.out.print("Enter a withdraw value: ");
    account.withdraw(sc.nextDouble());
    System.out.println(account.toString(true));

    sc.close();
  }
}
