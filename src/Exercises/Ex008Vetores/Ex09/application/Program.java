package Exercises.Ex008Vetores.Ex09.application;

import Exercises.Ex008Vetores.Ex09.entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    int olderAge = 0;
    String olderPerson = "";

    System.out.print("Quantos pessoas você vai digitar? ");
    Person[] people = new Person[sc.nextInt()];

    for (int i = 0; i < people.length; i++) {
      sc.nextLine();
      System.out.printf("Dados da %da pessoa:%n", i + 1);

      System.out.print("Nome: ");
      String name = sc.nextLine();

      System.out.print("Idade: ");
      int age = sc.nextInt();

      people[i] = new Person(name, age);
    }

    for (int i = 0; i < people.length; i++) {
      if (people[i].getAge() > olderAge) {
        olderAge = people[i].getAge();
        olderPerson = people[i].getName();
      }
    }

    System.out.println("PESSOA MAIS VELHA: " + olderPerson);

    sc.close();
  }
}
