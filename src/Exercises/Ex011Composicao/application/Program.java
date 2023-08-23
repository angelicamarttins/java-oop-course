package Exercises.Ex011Composicao.application;

import Examples.Enums.entities.enums.OrderStatus;
import Exercises.Ex011Composicao.entities.Client;
import Exercises.Ex011Composicao.entities.Order;
import Exercises.Ex011Composicao.entities.OrderItem;
import Exercises.Ex011Composicao.entities.Product;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    DateTimeFormatter birthDateMask = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    System.out.println("Enter client data: ");

    System.out.print("Name: ");
    String name = sc.nextLine();

    System.out.print("Email: ");
    String email = sc.nextLine();

    System.out.print("Birth date (DD/MM/YYYY): ");
    LocalDate birthDate = LocalDate.parse(sc.nextLine(), birthDateMask);

    System.out.println("Enter order data:");
    System.out.print("Status: ");
    OrderStatus status = OrderStatus.valueOf(sc.nextLine().toUpperCase());

    Order order = new Order(LocalDateTime.now(), status, new Client(name, email, birthDate));

    System.out.print("How many items to this order? ");
    int quantityOfItems = sc.nextInt();

    for (int i = 1; i <= quantityOfItems; i++) {
      System.out.printf("Enter #%d item data:\n", i);
      sc.nextLine();

      System.out.print("Product name: ");
      String productName = sc.nextLine();

      System.out.print("Product price: ");
      double productPrice = sc.nextDouble();

      System.out.print("Quantity: ");
      int productQuantity = sc.nextInt();

      OrderItem orderItem =
          new OrderItem(productQuantity, productPrice, new Product(productName, productPrice));

      order.addItem(orderItem);
    }

    System.out.println(order.toString());

    sc.close();
  }
}
