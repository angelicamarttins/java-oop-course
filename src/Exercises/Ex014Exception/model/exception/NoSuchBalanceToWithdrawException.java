package Exercises.Ex014Exception.model.exception;

public class NoSuchBalanceToWithdrawException extends Exception {
  public NoSuchBalanceToWithdrawException(String errorMessage) {
    super(errorMessage);
  }
}
