package Examples.ForEach;

public class Program {
  public static void main(String[] args) {
    String[] names = new String[] {"Angelica", "Mayara", "Caetano"};

    System.out.println(names.length);

    for (String name : names) {
      System.out.println(name);
    }

//    names[3] = "Leleco";
//    System.out.println(names[3]);
  }
}
