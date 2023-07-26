package Exercises.Ex008Vetores.Ex11.entities;

public class Person {
  private double height;
  private char gender;

  public Person (double height, char gender) {
    this.height = height;
    this.gender = gender;
  }

  public double getHeight() {
    return this.height;
  }

  public char getGender() {
    return this.gender;
  }
}
