package Examples.GenericBoundedWildcard.application;

import Examples.GenericBoundedWildcard.model.entities.Circle;
import Examples.GenericBoundedWildcard.model.entities.Rectangle;
import Examples.GenericBoundedWildcard.model.entities.Shape;
import Examples.GenericBoundedWildcard.model.enums.Color;

import java.util.ArrayList;
import java.util.List;

public class Program {
  public static void main(String[] args) {
    List<Object> objects = new ArrayList<>();
    objects.add("Angélica");
    objects.add(31);

    List<Shape> shapes = new ArrayList<>();

    shapes.add(new Rectangle(Color.BLACK, 2.0, 1.0));
    shapes.add(new Circle(Color.WHITE, 2.0));

    System.out.printf("Total area: %.2f\n", totalArea(shapes, objects));

    List<Shape> circles = new ArrayList<>();

    circles.add(new Circle(Color.BLACK, 3.0));
    circles.add(new Circle(Color.WHITE, 2.0));

    System.out.printf("Total area: %.2f\n", totalArea(circles, objects));
  }

  public static double totalArea(List<? extends Shape> shapes, List<? super Number> anythingList) {
    double sum = 0.0;

    for (Shape shape : shapes) {
      sum += shape.area();
    }

    for (Object anything : anythingList) {
      System.out.println(anything);
    }

    return sum;
  }
}
