package Examples.PathFile;

import java.io.File;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a file path: ");
    String stringPath = sc.nextLine();

    File path = new File(stringPath);

    System.out.println("getName = " + path.getName());
    System.out.println("getParent = " + path.getParent());
    System.out.println("getPath = " + path.getPath());

    sc.close();
  }
}
