package Exercises.Ex008Vetores.Ex11.application;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);
    double minorHeight = 0f;
    double majorHeight = 0f;
    double avgHeightWomen;
    double heightWomen = 0f;
    int numberMen = 0;
    int numberWomen = 0;

    System.out.print("Quantas pessoas serão digitadas? ");
    int quantity = sc.nextInt();
    sc.nextLine();

    double[] heights = new double[quantity];
    char[] genres = new char[quantity];

    for (int i = 0; i < quantity; i++) {
      int position = i + 1;

      System.out.printf("Altura da %da pessoa: ", position);
      heights[i] = sc.nextDouble();
      minorHeight = heights[i];

      System.out.printf("Gênero da %da pessoa: ", position);
      sc.nextLine();
      genres[i] = sc.next().charAt(0);
    }

    for (int i = 0; i < quantity; i++) {
      if (heights[i] < minorHeight) minorHeight = heights[i];

      if (heights[i] > majorHeight) majorHeight = heights[i];

      if (genres[i] == 'm' || genres[i] == 'M') {
        numberMen += 1;
      } else {
        numberWomen += 1;
        heightWomen += heights[i];
      }
    }

    avgHeightWomen = heightWomen / numberWomen;

    System.out.printf("Menor altura = %.2f%n", minorHeight);
    System.out.printf("Maior altura = %.2f%n", majorHeight);
    System.out.printf("Média das alturas das mulheres = %.2f%n", avgHeightWomen);
    System.out.printf("Número de homens = %d%n", numberMen);

    sc.close();
  }
}
