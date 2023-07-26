package Exercises.Ex008Vetores.Ex03.application;

import Exercises.Ex008Vetores.Ex03.entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    int quantity;

    System.out.print("Quantas pessoas serao digitadas? ");
    quantity = sc.nextInt();

    Person[] people = new Person[quantity];

    for (int i = 0; i < people.length; i++) {
      sc.nextLine();
      System.out.printf("Dados da %da pessoa:%n", i + 1);

      System.out.print("Nome: ");
      String name = sc.nextLine();

      System.out.print("Idade: ");
      int age = sc.nextInt();

      System.out.print("Altura: ");
      double height = sc.nextDouble();

      people[i] = new Person(age, height, name);
    }

    double sumHeights = 0f;
    double sumMinor = 0f;

    for (int i = 0; i < people.length; i++) {
      sumHeights += people[i].getHeight();
      if (people[i].getAge() < 16) sumMinor++;
    }

    System.out.printf("Altura média: %.2f%n", sumHeights / people.length);
    System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", sumMinor * 100 / people.length);

    for (int i = 0; i < people.length; i++) {
      if (people[i].getAge() < 16) System.out.println(people[i].getName());
    }

    sc.close();
  }
}
