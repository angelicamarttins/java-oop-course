package Examples.DefaultMethod.application;

import Examples.DefaultMethod.model.services.BrazilInterestService;
import Examples.DefaultMethod.model.services.InterestService;
import Examples.DefaultMethod.model.services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantia: ");
    double amount = sc.nextDouble();

    System.out.print("Meses: ");
    int months = sc.nextInt();

    InterestService BrazilInterestService = new BrazilInterestService(2.0);
    InterestService UsaInterestService = new UsaInterestService(1.0);

    System.out.printf("Pagamento após %d meses\n", months);
    System.out.printf("%.2f\n", BrazilInterestService.payment(amount, months));

    System.out.println();

    System.out.printf("Pagamento após %d meses\n", months);
    System.out.printf("%.2f\n", UsaInterestService.payment(amount, months));
  }
}
