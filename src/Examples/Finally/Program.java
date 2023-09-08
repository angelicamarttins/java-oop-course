package Examples.Finally;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    File file = new File("/home/amartins/test.txt");
    Scanner sc = null;

    try {
      sc = new Scanner(file);

      while (sc.hasNextLine()) {
        System.out.println(sc.nextLine());
      }
    } catch (FileNotFoundException error) {
      System.out.println("Error opening file: " + error.getMessage());
    } finally {
      if (sc != null) {
        sc.close();
      }
    }
  }
}
