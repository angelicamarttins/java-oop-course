package Examples.HashCodeEquals.application;

import Examples.HashCodeEquals.entities.Client;

public class Program {
  public static void main(String[] args) {
    String a = "Angélica";
    Integer b = 1;
    Integer c = 1;
    String d = "Angélica";

    System.out.println(a.equals(b));
    System.out.println(c.equals(b));
    System.out.println(d.equals(a));

    System.out.println();
    System.out.println(a.hashCode());
    System.out.println(b.hashCode());
    System.out.println(c.hashCode());
    System.out.println(d.hashCode());

    Client c1 = new Client("Angélica", "marttinsangelica@gmail.com");
    Client c2 = new Client("Mayara", "mayaraleticiadasilva@hotmail.com");
    Client c3 = c2;

    System.out.println();
    System.out.println(c1.hashCode());
    System.out.println(c2.hashCode());
    System.out.println(c1.equals(c2));
    System.out.println(c1 == c2);
    System.out.println(c2 == c3);
  }
}
