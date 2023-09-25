package Exercises.Ex016Interface.application;

import Exercises.Ex016Interface.model.entities.Contract;
import Exercises.Ex016Interface.model.entities.Installment;
import Exercises.Ex016Interface.model.services.ContractService;
import Exercises.Ex016Interface.model.services.PaypalService;
import Utils.DateUtils;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Entre os dados do contrato:");

    System.out.print("Número: ");
    int number = sc.nextInt();
    sc.nextLine();

    System.out.print("Data (dd/MM/yyyy): ");
    LocalDate date = LocalDate.parse(sc.nextLine(), DateUtils.fullYearMask());

    System.out.print("Valor do contrato: ");
    double totalValue = sc.nextDouble();

    Contract contract = new Contract(number, date, totalValue);

    System.out.print("Entre com o numero de parcelas: ");
    int months = sc.nextInt();

    ContractService contractService = new ContractService(new PaypalService());

    contractService.processContract(contract, months);

    System.out.println("\nParcelas:");

    for (Installment installment : contract.getInstallments()) {
      System.out.println(installment);
    }

    sc.close();
  }
}
