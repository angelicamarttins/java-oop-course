package Examples.Exception.model.entities;

import Examples.Exception.model.exception.InvalidCheckoutException;
import Examples.Exception.model.exception.InvalidReservationException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {
  private Integer roomNumber;
  private LocalDate checkin;
  private LocalDate checkout;

  public Reservation() {
  }

  public Reservation(
      Integer roomNumber, LocalDate checkin, LocalDate checkout
  ) throws InvalidReservationException, InvalidCheckoutException {
    isCheckoutValid(checkin, checkout);

    this.roomNumber = roomNumber;
    this.checkin = checkin;
    this.checkout = checkout;
  }

  public Integer getRoomNumber() {
    return roomNumber;
  }

  public void setRoomNumber(Integer roomNumber) {
    this.roomNumber = roomNumber;
  }

  public LocalDate getCheckin() {
    return checkin;
  }

  public LocalDate getCheckout() {
    return checkout;
  }

  public long duration() {
    return ChronoUnit.DAYS.between(checkin, checkout);
  }

  public void updateDates(
      LocalDate checkin, LocalDate checkout
  ) throws InvalidReservationException, InvalidCheckoutException {
    isDateValid(checkin, checkout);
    isCheckoutValid(checkin, checkout);

    this.checkin = checkin;
    this.checkout = checkout;
  }

  public void isDateValid(
      LocalDate checkin,
      LocalDate checkout
  ) throws InvalidReservationException {
    if (checkin.isBefore(LocalDate.now()) || checkout.isBefore(LocalDate.now())) {
      throw new InvalidReservationException("Error in reservation: Reservation dates for update" +
          " must be future dates");
    }
  }

  public void isCheckoutValid(
      LocalDate checkin,
      LocalDate checkout
  ) throws InvalidCheckoutException {
    if (checkout.isBefore(checkin)) {
      throw new InvalidCheckoutException("Error in reservation: Check-out date must be after " +
          "check-in date");
    }
  }

  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    DateTimeFormatter fullYearMask = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    stringBuilder.append("Reservation: ");
    stringBuilder.append("Room " + roomNumber + ", ");
    stringBuilder.append("check-in: " + checkin.format(fullYearMask) + ", ");
    stringBuilder.append("check-out: " + checkout.format(fullYearMask) + ", ");
    stringBuilder.append(duration() + " night" + (duration() > 1 ? "s" : ""));

    return stringBuilder.toString();
  }

}
