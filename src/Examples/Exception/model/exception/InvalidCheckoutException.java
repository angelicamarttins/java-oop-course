package Examples.Exception.model.exception;

public class InvalidCheckoutException extends Exception {
  public InvalidCheckoutException(String errorMessage) {
    super(errorMessage);
  }
}
