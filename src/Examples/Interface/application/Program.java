package Examples.Interface.application;

import Examples.Interface.model.entities.CarRental;
import Examples.Interface.model.entities.Vehicle;
import Examples.Interface.model.services.BrazilTaxService;
import Examples.Interface.model.services.RentalCarService;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

import static Utils.DateUtils.fullYearHourMask;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Entre com os dados do aluguel");

    System.out.print("Modelo do carro: ");
    String carName = sc.nextLine();

    System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
    LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fullYearHourMask());

    System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
    LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fullYearHourMask());

    System.out.print("Entre com o preço por hora: ");
    double pricePerHour = sc.nextDouble();

    System.out.print("Entre com o preço por dia: ");
    double pricePerDay = sc.nextDouble();

    RentalCarService rentalCarService =
        new RentalCarService(pricePerHour, pricePerDay, new BrazilTaxService());

    CarRental carRental = new CarRental(start, finish, new Vehicle(carName));

    rentalCarService.processInvoice(carRental);

    System.out.println("\nFATURA:");
    System.out.printf("Pagamento básico: %.2f\n",
        carRental.getInvoice().getBasicPayment());
    System.out.printf("Imposto: %.2f\n",
        carRental.getInvoice().getTax());
    System.out.printf("Pagamento total: %.2f\n",
        carRental.getInvoice().getTotalPayment());

    sc.close();
  }
}
