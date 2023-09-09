package Examples.Exception.model.exception;

public class InvalidReservationException extends Exception {
  public InvalidReservationException(String errorMessage) {
    super(errorMessage);
  }
}
