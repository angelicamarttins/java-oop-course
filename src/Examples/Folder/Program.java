package Examples.Folder;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a path: ");
    String stringPath = sc.nextLine();

    File path = new File(stringPath);


    System.out.println("\nFolders:");
    File[] folders = Arrays.stream(path.listFiles())
        .filter(folder -> folder.isDirectory() && !folder.isHidden())
        .collect(Collectors.toList()).toArray(new File[0]);

    for (File folder : folders) {
      System.out.println(folder);
    }

    System.out.println("\nFiles:");
    File[] files = Arrays.stream(path.listFiles())
        .filter(folder -> folder.isFile() && !folder.isHidden())
        .collect(Collectors.toList()).toArray(new File[0]);

    for (File file : files) {
      System.out.println(file);
    }

    String newFolder = stringPath + "/newFolder";
    boolean successCreation = new File(newFolder).mkdir();
    System.out.printf("\nDirectory created successfully on path %s: %b", newFolder, successCreation);


    sc.close();
  }
}
