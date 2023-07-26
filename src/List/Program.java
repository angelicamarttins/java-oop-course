package List;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>();

    names.add("Angélica");
    names.add("Mayara");
    for (String name : names) {
      System.out.println(name); // Angélica / Mayara
    }

    System.out.println("--------------");

    names.add(1, "Caetano");
    for (String name : names) {
      System.out.println(name); // Angélica / Caetano / Mayara
    }

    System.out.println("--------------");

    names.remove("Caetano");
    for (String name : names) {
      System.out.println(name); // Angélica / Mayara
    }

    System.out.println("--------------");

    names.remove(0);
    for (String name : names) {
      System.out.println(name); // Mayara
    }

    names.add("Angélica");
    names.add("Caetano");
    names.add("Carminha");

    names.removeIf(element -> element.charAt(0) == 'C');

    System.out.println("--------------");

    for (String name : names) {
      System.out.println(name); // Mayara / Angélica
    }

    System.out.println("--------------");

    System.out.println("Index of Angelica: " + names.indexOf("Angélica"));
    System.out.println("Index of Caetano: " + names.indexOf("Caetano"));

    System.out.println("--------------");

    List<String> filteredNames = names.stream().filter(x -> x.charAt(0) == 'Z').collect(Collectors.toList());

    System.out.println(filteredNames.size());

    for (String name : filteredNames) {
      System.out.println(name);
    }
  }
}
