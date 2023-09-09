package Examples.Exception.application;

import Examples.Exception.model.entities.Reservation;
import Examples.Exception.model.exception.InvalidCheckoutException;
import Examples.Exception.model.exception.InvalidReservationException;
import Utils.Utils;

import java.time.LocalDate;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    try {
      Reservation reservation = saveReservation(sc);
      updateReservation(sc, reservation);
    } catch (InvalidReservationException error) {
      System.out.println(error.getMessage());
    } catch (InvalidCheckoutException error) {
      System.out.println(error.getMessage());
    } catch (RuntimeException error) {
      System.out.println("Unexpected error");
    } finally {
      sc.close();
    }
  }

  public static Reservation saveReservation(
      Scanner sc
  ) throws InvalidCheckoutException, InvalidReservationException {
    System.out.print("Room number: ");
    int roomNumber = sc.nextInt();

    System.out.print("Check-in date (dd/MM/yyyy): ");
    LocalDate checkin = LocalDate.parse(sc.next(), Utils.fullYearMask());

    System.out.print("Check-out date (dd/MM/yyyy): ");
    LocalDate checkout = LocalDate.parse(sc.next(), Utils.fullYearMask());

    Reservation reservation =
        new Reservation(roomNumber, checkin, checkout);

    System.out.println(reservation + "\n");

    return reservation;
  }

  public static void updateReservation(
      Scanner sc,
      Reservation reservation
  ) throws InvalidCheckoutException, InvalidReservationException {
    System.out.println("Enter data to update the reservation:");

    System.out.print("Check-in date (dd/MM/yyyy): ");
    LocalDate checkin = LocalDate.parse(sc.next(), Utils.fullYearMask());

    System.out.print("Check-out date (dd/MM/yyyy): ");
    LocalDate checkout = LocalDate.parse(sc.next(), Utils.fullYearMask());

    reservation.updateDates(checkin, checkout);
    System.out.println(reservation);
  }
}
