package Exercises.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Set<Student> students = new HashSet<>();
    List<Character> courses = Arrays.asList('A', 'B', 'C');

    repeatQuestions(sc, students, courses);

    System.out.println("Total students: " + students.size());

    sc.close();
  }

  public static void repeatQuestions(Scanner sc, Set<Student> students, List<Character> courses) {
    courses.forEach(course -> {
      System.out.printf("How many students for course %s? ", course);
      repeatStudentInsertion(sc.nextInt(), sc, students);
    });
  }

  public static void repeatStudentInsertion(int numberOfStudents, Scanner sc, Set<Student> students) {
    for (int i = 0; i < numberOfStudents; i++) {
      System.out.print("Enter student registration: ");
      int registration = sc.nextInt();

      students.add(new Student(registration));
    }
  }
}
