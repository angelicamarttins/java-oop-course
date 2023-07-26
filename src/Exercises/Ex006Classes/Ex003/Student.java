package Exercises.Ex006Classes.Ex003;

public class Student {
  public String name;
  public double grade1, grade2, grade3;

  public double finalGrade() {
    return (grade1 + grade2 + grade3);
  }

  public String didStudentPass() {
    double finalGrade = finalGrade();

    if (finalGrade >= 60) {
      return "PASS";
    }

    return "FAILED\n"
        + "MISSING "
        + String.format("%.2f", 60 - finalGrade)
        + " POINTS";
  }

  public String toString() {
    return "FINAL GRADE = "
        + String.format("%.2f%n", finalGrade())
        + didStudentPass();
  }
}
