package Examples.Map.application;

import Examples.Map.entities.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program {
  public static void main(String[] args) {
    Map<String, String> users = new TreeMap<>();
    Map<Product, Integer> stockProducts = new HashMap<>();

    users.put("Angélica", "Martins");
    users.put("Mayara", "Martins");
    users.put("Caetano", "Martins");

    for (String name : users.keySet()) {
      System.out.println(name);
    }

    for (String lastName : users.values()) {
      System.out.println(lastName);
    }

    System.out.println(users.get("Angélica"));
    System.out.println(users.getOrDefault("Clodovil", "Martins"));
    users.replace("Mayara", "Martins", "Letícia");
    System.out.println(users.get("Mayara"));

    Product p1 = new Product("Tv", 3000.00);
    Product p2 = new Product("Playstation", 4000.00);

    stockProducts.put(p1, 10);
    stockProducts.put(p2, 20);

    System.out.println(stockProducts.containsKey(p1));
    System.out.println(stockProducts.containsValue(20));
    System.out.println(stockProducts.containsValue(30));
  }
}
