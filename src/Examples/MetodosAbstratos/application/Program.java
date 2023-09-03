package Examples.MetodosAbstratos.application;

import Examples.MetodosAbstratos.entities.Circle;
import Examples.MetodosAbstratos.entities.Rectangle;
import Examples.MetodosAbstratos.entities.Shape;
import Examples.MetodosAbstratos.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<Shape> shapes = new ArrayList<>();

    System.out.print("Enter the number of shapes: ");
    int numberOfShapes = sc.nextInt();

    for (int i = 1; i <= numberOfShapes; i++) {
      System.out.printf("Shape #%d data:\n", i);


      System.out.print("Rectangle or Circle (r/c)? ");
      char shape = Character.toLowerCase(sc.next().charAt(0));
      sc.nextLine();

      System.out.print("Color (BLACK/BLUE/RED): ");
      Color color = Color.valueOf(sc.nextLine().toUpperCase());

      if (shape == 'r') {
        System.out.print("Width: ");
        double width = sc.nextDouble();

        System.out.print("Height: ");
        double height = sc.nextDouble();

        shapes.add(new Rectangle(color, width, height));
      } else {
        System.out.print("Radius: ");
        double radius = sc.nextDouble();

        shapes.add(new Circle(color, radius));
      }
    }

    System.out.println("\nSHAPE AREAS:");

    for (Shape shape : shapes) {
      System.out.println(String.format("%.2f", shape.area()));
    }

    sc.close();
  }
}
