package Examples.InterfaceComparable;

import Examples.InterfaceComparable.model.entities.Employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    List<String> names = new ArrayList<>();
    List<Employee> employees = new ArrayList<>();

    String stringTextPath = "/home/amartins/estudos/curso-java-nelio/src/Examples/InterfaceComparable" +
        "/in/names.txt";
    File textPath = new File(stringTextPath);

    String stringCsvPath = "/home/amartins/estudos/curso-java-nelio/src/Examples/InterfaceComparable" +
        "/in/employees.csv";

    try (BufferedReader text = new BufferedReader(new FileReader(textPath));
         BufferedReader csv = new BufferedReader(new FileReader(stringCsvPath))) {
      String textLine = text.readLine();
      String csvLine = csv.readLine();

      while (textLine != null) {
        names.add(textLine);

        textLine = text.readLine();
      }

      while (csvLine != null) {
        String[] splitLine = csvLine.split(",");
        employees.add(new Employee(splitLine[0], Double.valueOf(splitLine[1])));

        csvLine = csv.readLine();
      }

      Collections.sort(names);
      Collections.sort(employees);

      for (String name : names) {
        System.out.println(name);
      }

      System.out.println();
      System.out.println("-----------------");
      System.out.println();

      for (Employee employee : employees) {
        System.out.printf("%s, R$%.2f\n", employee.getName(), employee.getSalary());
      }


    } catch (IOException error) {
      System.out.println(error.getMessage());
    }
  }
}
