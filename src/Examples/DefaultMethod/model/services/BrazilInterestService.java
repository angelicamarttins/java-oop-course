package Examples.DefaultMethod.model.services;

public class BrazilInterestService implements InterestService {
  private Double interestRate;

  public BrazilInterestService(Double interestRate) {
    this.interestRate = interestRate;
  }

  @Override
  public Double getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(Double interestRate) {
    this.interestRate = interestRate;
  }
}
