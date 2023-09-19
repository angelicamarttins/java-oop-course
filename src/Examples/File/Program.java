package Examples.File;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    File file = new File("/home/amartins/test.txt");
    Scanner sc = null;

    try {
      sc = new Scanner(file);
      System.out.println(file.exists());
      System.out.println(file.canWrite());

      while (sc.hasNextLine()) {
        System.out.println(sc.nextLine());
      }

    } catch (IOException error) {
      System.out.println(error.getMessage());
    } finally {
      if (sc != null) {
        sc.close();
      }
    }
  }
}
