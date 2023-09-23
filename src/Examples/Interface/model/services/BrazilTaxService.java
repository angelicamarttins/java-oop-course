package Examples.Interface.model.services;

public class BrazilTaxService implements TaxService {
  public BrazilTaxService() {
  }

  public double tax(Double amount) {
    if (amount < 100) {
      return amount * 0.2;
    }

    return amount * 0.15;
  }
}
