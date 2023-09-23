package Examples.Interface.model.services;

import Examples.Interface.model.entities.CarRental;
import Examples.Interface.model.entities.Invoice;

import java.time.Duration;

public class RentalCarService {
  private Double pricePerHour;
  private Double pricePerDay;
  private CarRental carRental;
  private Invoice invoice;
  private TaxService taxService;

  public RentalCarService() {
  }

  public RentalCarService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
    this.pricePerHour = pricePerHour;
    this.pricePerDay = pricePerDay;
    this.taxService = taxService;
  }

  public Double getPricePerHour() {
    return pricePerHour;
  }

  public void setPricePerHour(Double pricePerHour) {
    this.pricePerHour = pricePerHour;
  }

  public Double getPricePerDay() {
    return pricePerDay;
  }

  public void setPricePerDay(Double pricePerDay) {
    this.pricePerDay = pricePerDay;
  }

  public CarRental getCarRental() {
    return carRental;
  }

  public void setCarRental(CarRental carRental) {
    this.carRental = carRental;
  }

  public Invoice getInvoice() {
    return invoice;
  }

  public void setInvoice(Invoice invoice) {
    this.invoice = invoice;
  }

  public void processInvoice(CarRental carRental) {
    Double basicPayment;
    Double rentalDuration = calculateRentalDurationInHours(carRental);

    if (rentalDuration <= 12) {
      basicPayment = pricePerHour * rentalDuration;
    } else {
      basicPayment = pricePerDay * calculateRentalDurationInDays(rentalDuration);
    }

    carRental.setInvoice(new Invoice(basicPayment, taxService.tax(basicPayment)));
  }

  private double calculateRentalDurationInHours(CarRental carRental) {
    Long duration = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();

    return Math.ceil(Double.valueOf(duration) / 60);
  }

  private double calculateRentalDurationInDays(double rentalDurationInHours) {
    return Math.ceil(rentalDurationInHours / 24);
  }
}
