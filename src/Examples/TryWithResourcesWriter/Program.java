package Examples.TryWithResourcesWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
  public static void main(String[] args) {
    String path = "/home/amartins/test.txt";

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
      bw.write("Testando criação de arquivo");
    } catch (IOException error) {
      System.out.println("Error: " + error.getMessage());
    }
  }
}
