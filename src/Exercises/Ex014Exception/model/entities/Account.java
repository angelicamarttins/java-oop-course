package Exercises.Ex014Exception.model.entities;

import Exercises.Ex014Exception.model.exception.ExceedsWithdrawLimitException;
import Exercises.Ex014Exception.model.exception.NoSuchBalanceToWithdrawException;

public class Account {
  private Integer number;
  private String holder;
  private Double balance = 0.0;
  private Double withdrawLimit;

  public Account() {
  }

  public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
    this.number = number;
    this.holder = holder;
    deposit(balance);
    this.withdrawLimit = withdrawLimit;
  }

  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public String getHolder() {
    return holder;
  }

  public void setHolder(String holder) {
    this.holder = holder;
  }

  public Double getBalance() {
    return balance;
  }

  public Double getWithdrawLimit() {
    return withdrawLimit;
  }

  public void setWithdrawLimit(Double withdrawLimit) {
    this.withdrawLimit = withdrawLimit;
  }

  public void deposit(Double amount) {
    balance += amount;
  }

  public void withdraw(Double amount)
      throws ExceedsWithdrawLimitException, NoSuchBalanceToWithdrawException {
    withdrawExceedsLimit(amount);
    hasBalanceToWithdraw(amount);

    balance -= amount;
  }

  public void withdrawExceedsLimit(Double amount) throws ExceedsWithdrawLimitException {
    if (amount > withdrawLimit) {
      throw new ExceedsWithdrawLimitException("Withdraw error: The amount exceeds withdraw limit");
    }
  }

  public void hasBalanceToWithdraw(Double amount) throws NoSuchBalanceToWithdrawException {
    if (amount > balance) {
      throw new NoSuchBalanceToWithdrawException("Withdraw error: Not enough balance");
    }
  }

  @Override
  public String toString() {
    return "New balance: " + String.format("%.2f", balance);
  }
}
