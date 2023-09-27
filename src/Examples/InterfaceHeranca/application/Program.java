package Examples.InterfaceHeranca.application;

import Examples.InterfaceHeranca.model.entities.AbstractShape;
import Examples.InterfaceHeranca.model.entities.Circle;
import Examples.InterfaceHeranca.model.entities.Rectangle;
import Examples.InterfaceHeranca.model.enums.Color;

import java.util.Locale;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    AbstractShape circle = new Circle(Color.BLACK, 2.0);
    AbstractShape rectangle = new Rectangle(Color.WHITE, 3.0, 4.0);

    System.out.printf("Cor do círculo: %s\n", circle.getColor());
    System.out.printf("Área do círculo: %.2f\n", circle.area());

    System.out.println("------------------------------");

    System.out.printf("Cor do círculo: %s\n", rectangle.getColor());
    System.out.printf("Área do retângulo: %.2f\n", rectangle.area());
  }
}
