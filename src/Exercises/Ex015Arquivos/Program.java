package Exercises.Ex015Arquivos;

import Exercises.Ex015Arquivos.model.entities.Product;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    String basePath = "/home/amartins/estudos/curso-java-nelio/src/Exercises/Ex015Arquivos/data";
    String newFolder = basePath + "/out";
    String inPath = basePath + "/in/products.csv";
    String outPath = newFolder + "/summary.csv";

    new File(newFolder).mkdir();

    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inPath));
         BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outPath))) {

      String line = bufferedReader.readLine();
      List<Product> products = new ArrayList<>();

      while (line != null) {
        String[] productInfo = line.split(",");

        Product product = new Product(
            productInfo[0],
            Double.valueOf(productInfo[1]),
            Integer.valueOf(productInfo[2])
        );
        products.add(product);

        line = bufferedReader.readLine();
      }

      for (Product product : products) {
        bufferedWriter.write(product.toString());
      }

    } catch (IOException error) {
      System.out.println("ERROR: " + error.getMessage());
      error.printStackTrace();
    }
  }
}
