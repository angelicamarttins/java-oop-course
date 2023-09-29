package Examples.DefaultMethod.model.services;

public interface InterestService {
  Double getInterestRate();

  default double payment(double amount, int months) {
    return amount * Math.pow(1 + getInterestRate() / 100, months);
  }
}
