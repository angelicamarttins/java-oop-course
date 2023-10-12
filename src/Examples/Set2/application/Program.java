package Examples.Set2.application;

import Examples.Set2.entities.User;
import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Set<User> users = new HashSet<>();

    System.out.print("Enter file full path: \n");
    String path = sc.nextLine();

    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
      String line = bufferedReader.readLine();

      while (line != null) {
        String[] splittedLine = line.split(" ");

        users.add(new User(
            splittedLine[0],
            LocalDateTime.parse(splittedLine[1], DateTimeFormatter.ISO_DATE_TIME)
        ));

        line = bufferedReader.readLine();
      }

      System.out.println("Total users: " + users.size());

    } catch (IOException error) {
      System.out.println("Error: " + error.getMessage());
    }
  }
}
