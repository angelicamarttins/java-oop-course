package Exercises.Ex008Vetores.Ex10.application;

import Exercises.Ex008Vetores.Ex10.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos alunos serão digitados: ");
    Student[] students = new Student[sc.nextInt()];

    for (int i = 0; i < students.length; i++) {
      sc.nextLine();
      System.out.printf("Digite nome, primeira e segunda nota do %do aluno: ", i + 1);
      String name = sc.nextLine();
      double grade1 = sc.nextDouble();
      double grade2 = sc.nextDouble();

      students[i] = new Student(name, grade1, grade2);
    }

    System.out.println("Alunos aprovados: ");

    for (int i = 0; i < students.length; i++) {
      double studentAvg = students[i].getGrade1() + students[i].getGrade2() / 2;

      if (studentAvg >= 6) {
        System.out.println(students[i].getName());
      }
    }

    sc.close();
  }
}
