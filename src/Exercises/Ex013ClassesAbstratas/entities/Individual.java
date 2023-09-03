package Exercises.Ex013ClassesAbstratas.entities;

public class Individual extends TaxPayer {
  private Double healthExpenditures;
  private static final double HEALTH_DISCOUNT = 0.5;
  private static final double MINOR_TAX = 0.15;
  private static final double MAJOR_TAX = 0.25;
  private static final int MINOR_ANNUAL_INCOME = 20_000;

  public Individual() {
    super();
  }

  public Individual(String name, Double annualIncome, Double healthExpenditures) {
    super(name, annualIncome);
    this.healthExpenditures = healthExpenditures;
  }

  public Double getHealthExpenditures() {
    return healthExpenditures;
  }

  public void setHealthExpenditures(Double healthExpenditures) {
    this.healthExpenditures = healthExpenditures;
  }

  @Override
  public double tax() {
    if (annualIncome < MINOR_ANNUAL_INCOME) {
      return (annualIncome * MINOR_TAX) - (healthExpenditures * HEALTH_DISCOUNT);
    }

    return (annualIncome * MAJOR_TAX) - (healthExpenditures * HEALTH_DISCOUNT);
  }
}
