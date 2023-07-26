package Exercises.Ex008Vetores.Ex03.entities;

public class Person {
  private int age;
  private double height;
  private String name;

  public Person(int age, double height, String name) {
    this.age = age;
    this.height = height;
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }
  public double getHeight() {
    return this.height;
  }
  public String getName() {
    return this.name;
  }
}
