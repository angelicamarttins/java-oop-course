package Exercises.Ex008Vetores.Ex12.application;

import Exercises.Ex008Vetores.Ex12.entities.Bedroom;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Bedroom[] bedrooms = new Bedroom[10];

    System.out.print("How many rooms will be rented? ");
    int rent = sc.nextInt();

    for (int i = 0; i < rent; i++) {
      sc.nextLine();

      System.out.printf("Rent #%d:%n", i + 1);

      System.out.print("Name: ");
      String name = sc.nextLine();

      System.out.print("Email: ");
      String email = sc.nextLine();

      System.out.print("Room: ");
      int room = sc.nextInt();

      bedrooms[room] = new Bedroom(name, email, room);
    }

    System.out.println("Busy rooms:");

    for (int i = 0; i < bedrooms.length; i++) {
      if (bedrooms[i] != null) {
        System.out.println(bedrooms[i]);
      }
    }

    sc.close();
  }
}
