package Exercises.Ex007MembrosEstaticos;

public class CurrencyConverter {
  private static final double IOF = 0.06;

  public static double converter(double dollarPrice, double dollars) {
    double dollarAmount = dollars * dollarPrice;

    return dollarAmount + dollarAmount * IOF;
  }
}
