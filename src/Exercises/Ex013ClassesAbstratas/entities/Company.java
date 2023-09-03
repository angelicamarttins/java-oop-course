package Exercises.Ex013ClassesAbstratas.entities;

public class Company extends TaxPayer {
  private static final double MINOR_TAX = 0.14;
  private static final double MAJOR_TAX = 0.14;
  private static final int MIN_EMPLOYEES_MIN_TAX = 10;
  private int numberOfEmployees;

  public Company() {
  }

  public Company(String name, Double annualIncome, int numberOfEmployees) {
    super(name, annualIncome);
    this.numberOfEmployees = numberOfEmployees;
  }

  public int getNumberOfEmployees() {
    return numberOfEmployees;
  }

  public void setNumberOfEmployees(int numberOfEmployees) {
    this.numberOfEmployees = numberOfEmployees;
  }

  @Override
  public double tax() {
    if (numberOfEmployees > MIN_EMPLOYEES_MIN_TAX) {
      return annualIncome * MINOR_TAX;
    }

    return annualIncome * MAJOR_TAX;
  }
}
