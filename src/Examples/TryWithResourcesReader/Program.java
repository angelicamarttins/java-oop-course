package Examples.TryWithResourcesReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
  public static void main(String[] args) {
    String path = "/home/amartins/test.txt";

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      String line = br.readLine();

      while (line != null) {
        System.out.println(line);
        line = br.readLine();
      }
    } catch (IOException error) {
      System.out.println("Error: " + error.getMessage());
    }
  }
}
