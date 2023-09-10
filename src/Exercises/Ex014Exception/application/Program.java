package Exercises.Ex014Exception.application;

import Exercises.Ex014Exception.model.entities.Account;
import Exercises.Ex014Exception.model.exception.ExceedsWithdrawLimitException;
import Exercises.Ex014Exception.model.exception.NoSuchBalanceToWithdrawException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    try {
      System.out.println("Enter account data");

      System.out.print("Number: ");
      int number = sc.nextInt();
      sc.nextLine();

      System.out.print("Holder: ");
      String holder = sc.nextLine();

      System.out.print("Initial balance: ");
      double initialBalance = sc.nextDouble();

      System.out.print("Withdraw limit: ");
      double withdrawLimit = sc.nextDouble();

      Account account = new Account(number, holder, initialBalance, withdrawLimit);

      System.out.print("\nEnter amount for withdraw: ");
      double amount = sc.nextDouble();

      account.withdraw(amount);

      System.out.println(account);
    } catch (ExceedsWithdrawLimitException error) {
      System.out.println(error.getMessage());
    } catch (NoSuchBalanceToWithdrawException error) {
      System.out.println(error.getMessage());
    } finally {
      sc.close();
    }
  }
}
