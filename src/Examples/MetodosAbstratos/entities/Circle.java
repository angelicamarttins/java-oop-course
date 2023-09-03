package Examples.MetodosAbstratos.entities;

import Examples.MetodosAbstratos.entities.enums.Color;

public class Circle extends Shape {
  private static final double PI = 3.14159;

  private Double radius;

  public Circle() {
    super();
  }

  public Circle(Color color, Double radius) {
    super(color);
    this.radius = radius;
  }

  public Double getRadius() {
    return radius;
  }

  public void setRadius(Double radius) {
    this.radius = radius;
  }

  public double area() {
    return PI * Math.pow(radius, 2);
  }
}
