package Examples.Set2.entities;

import java.time.LocalDateTime;
import java.util.Objects;

public class User {
  private String name;
  private LocalDateTime date;

  public User(String name, LocalDateTime date) {
    this.name = name;
    this.date = date;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDateTime getDate() {
    return date;
  }

  public void setDate(LocalDateTime date) {
    this.date = date;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof User)) return false;
    User user = (User) o;
    return Objects.equals(getName(), user.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName());
  }
}
