package Examples.ClasseMembrosEstaticos.application;

import Examples.ClasseMembrosEstaticos.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Product product = new Product();

    System.out.println("Enter product data: ");
    System.out.print("Name: ");
    product.name = sc.nextLine();

    System.out.print("Price: ");
    product.price = sc.nextDouble();

    System.out.print("Quantity in stock: ");
    product.quantity = sc.nextInt();

    System.out.println("Enter the number of products to be added in stocks: ");
    product.addProducts(sc.nextInt());

    System.out.println("Enter the number of products to be removed in stocks: ");
    product.removeProducts(sc.nextInt());

    System.out.println(product);

    sc.close();
  }
}
