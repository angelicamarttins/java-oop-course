package Examples.TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    try {
      String[] names = sc.nextLine().split(" ");
      int position = sc.nextInt();

      System.out.println(names[position]);
    } catch (IndexOutOfBoundsException error) {
      System.out.println("This position does not exist");

      System.exit(0);
    } catch (InputMismatchException error) {
      System.out.println("This input is not an integer. Try again.");
      main(args);
    }

    System.out.println("End of program");

    sc.close();
  }
}
