package Examples.VetoresTipoReferencia.application;

import Examples.VetoresTipoReferencia.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite a quantidade de produtos que serão cadastrados: ");
    int n = sc.nextInt();
    Product[] products = new Product[n];

    for (int i = 0; i < n; i++) {
      sc.nextLine();
      System.out.print("Digite o nome do produto: ");
      String name = sc.nextLine();

      System.out.print("Digite o preço do produto: ");
      double price = sc.nextDouble();

      products[i] = new Product(name, price);
    }

    double sum = 0.0;

    for (int i = 0; i < n; i++) {
      sum += products[i].getPrice();
    }

    double avg = sum / n;

    System.out.printf("AVERAGE PRICE: %.2f%n", avg);
    System.out.println(products.length);

    sc.close();
  }
}
