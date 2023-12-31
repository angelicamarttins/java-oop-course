package Exercises.Ex016Interface.model.services;

public class PaypalService implements OnlinePaymentService {
  @Override
  public Double paymentFee(Double amount) {
    return amount * 0.02;
  }

  @Override
  public Double interest(Double amount, Integer month) {
    return amount * 0.01 * month;
  }
}
