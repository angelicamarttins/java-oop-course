package Exercises.Ex018Map.application;


import Exercises.Ex018Map.entities.Candidate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Map<String, Candidate> candidates = new TreeMap<>();
    int finalVotes;

    System.out.print("Enter file full path: ");
    String path = sc.nextLine();

    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
      String line = bufferedReader.readLine();

      while (line != null) {
        String[] splittedLine = line.split(",");
        String name = splittedLine[0];
        int votes = Integer.valueOf(splittedLine[1]);

        finalVotes = candidates.containsKey(name) ? votes + candidates.get(name).getVotes() : votes;
        candidates.put(name, new Candidate(name, finalVotes));

        line = bufferedReader.readLine();
      }

      for (Candidate candidate : candidates.values()) {
        System.out.printf("%s: %d\n", candidate.getName(), candidate.getVotes());
      }
    } catch (IOException error) {
      System.out.println("Error: " + error.getMessage());
    }
  }
}