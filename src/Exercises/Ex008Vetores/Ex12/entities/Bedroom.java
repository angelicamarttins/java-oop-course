package Exercises.Ex008Vetores.Ex12.entities;

public class Bedroom {
  private String name;
  private String email;
  private int bedroom;

  public Bedroom(String name, String email, int bedroom) {
    this.name = name;
    this.email = email;
    this.bedroom = bedroom;
  }

  public String getName() {
    return this.name;
  }

  public String getEmail() {
    return this.email;
  }

  public int getBedroom() {
    return this.bedroom;
  }

  public String toString() {
    return getBedroom()
        + ": "
        + getName()
        + ", "
        + getEmail();
  }
}
