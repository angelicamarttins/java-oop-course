package Exercises.Ex009List.entities;

public class Employee {
  private Integer id;
  private String name;
  private Double salary;

  public Employee(Integer id, String name, Double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public Integer getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public Double getSalary() {
    return this.salary;
  }

  public void increaseSalary(double percentage) {
    this.salary += salary * (percentage / 100);
  }

  public String toString() {
    return getId()
        + ", "
        + getName()
        +", "
        + String.format("%.2f%n", getSalary());
  }
}
