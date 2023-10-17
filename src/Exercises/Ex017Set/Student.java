package Exercises.Ex017Set;

import java.util.Objects;

public class Student {
  private Integer registration;

  public Student(Integer registration) {
    this.registration = registration;
  }

  public Integer getRegistration() {
    return registration;
  }

  public void setRegistration(Integer registration) {
    this.registration = registration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Student)) return false;
    Student student = (Student) o;
    return Objects.equals(getRegistration(), student.getRegistration());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getRegistration());
  }
}
