package Exercises.Ex014Exception.model.exception;

public class ExceedsWithdrawLimitException extends Exception {
  public ExceedsWithdrawLimitException(String errorMessage) {
    super(errorMessage);
  }
}
