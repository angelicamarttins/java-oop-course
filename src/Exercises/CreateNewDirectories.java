package Exercises;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CreateNewDirectories {
  public static void main(String[] args) {
    String stringPath = "/home/amartins/estudos/curso-java-nelio/src/Exercises";
    File path = new File(stringPath);

    for (int i = 1; i <= 5; i++) {
      String prefix = "Ex00" + i;

      String nameFolders = Arrays
          .stream(path.listFiles())
          .filter(file -> file.getName().contains(prefix))
          .map(file -> file.getName().substring(0, file.getName().indexOf(".java")))
          .collect(Collectors.toList())
          .toString();

      String newFolder = stringPath + "/" + nameFolders.substring(1, nameFolders.length() - 1);
      boolean successfullyCreated = new File(newFolder).mkdir();

      System.out.printf("Folder created %s? %b\n", newFolder, successfullyCreated);
    }

  }
}
