package Exercises.Ex012Polimorfismo.application;

import Exercises.Ex012Polimorfismo.entities.ImportedProduct;
import Exercises.Ex012Polimorfismo.entities.Product;
import Exercises.Ex012Polimorfismo.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    DateTimeFormatter brazilianDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    List<Product> products = new ArrayList<>();

    System.out.print("Enter the number of products: ");
    int numberOfProducts = sc.nextInt();

    for (int i = 1; i <= numberOfProducts; i++) {
      System.out.printf("Product #%d data:\n", i);

      System.out.print("Common, used or imported (c/u/i)? ");
      char productType = Character.toLowerCase(sc.next().charAt(0));
      sc.nextLine();

      System.out.print("Name: ");
      String name = sc.nextLine();

      System.out.print("Price: ");
      double price = sc.nextDouble();

      switch (productType) {
        case 'c':
          products.add(new Product(name, price));
          break;

        case 'u':
          System.out.print("Manufacture date (DD/MM/YYYY): ");
          LocalDate manufactureDate = LocalDate.parse(sc.next(), brazilianDate);

          products.add(new UsedProduct(name, price, manufactureDate));
          break;

        case 'i':
          System.out.print("Customs fee: ");
          double customsFee = sc.nextDouble();

          products.add(new ImportedProduct(name, price, customsFee));
          break;
      }
    }

    System.out.println("\nPRICES TAGS:");

    for (Product product : products) {
      System.out.println(product.priceTag());
    }

    sc.close();
  }
}
