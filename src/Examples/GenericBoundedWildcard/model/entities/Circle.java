package Examples.GenericBoundedWildcard.model.entities;


import Examples.GenericBoundedWildcard.model.enums.Color;

public class Circle extends AbstractShape {
  private static final double PI = 3.14159;

  private Double radius;

  public Circle(Color color) {
    super(color);
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
