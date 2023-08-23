package Exercises.Ex011Composicao.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {
  private String name;
  private String email;
  private LocalDate birthDate;

  public Client() {
  }

  public Client(String name, String email, LocalDate birthDate) {
    this.name = name;
    this.email = email;
    this.birthDate = birthDate;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    DateTimeFormatter birthDateMask = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    stringBuilder.append(name + " ");
    stringBuilder.append("(" + birthDate.format(birthDateMask) + ") - ");
    stringBuilder.append(email + "\n");

    return stringBuilder.toString();
  }
}
