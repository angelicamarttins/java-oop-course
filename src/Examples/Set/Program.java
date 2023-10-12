package Examples.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
  public static void main(String[] args) {
    Set<String> hashSet = new HashSet<>();
    hashSet.add("Angélica");
    hashSet.add("Mayara");
    hashSet.add("Caetano");

    System.out.println(hashSet.contains("Caetano"));
    System.out.println(hashSet.contains("Gil"));

    hashSet.remove("Mayara");

    for (String element : hashSet) {
      System.out.println(element);
    }

    System.out.println("--------------------------------------");

    Set<Integer> treeSet = new TreeSet<>();
    treeSet.add(31);
    treeSet.add(31);
    treeSet.add(5);

    treeSet.removeIf(element -> element < 30);

    System.out.println(treeSet.contains(30));
    for (Integer element : treeSet) {
      System.out.println(element);
    }

    System.out.println("--------------------------------------");

    Set<Boolean> linkedHashSet = new TreeSet<>();
    linkedHashSet.add(true);
    linkedHashSet.add(true);
    linkedHashSet.add(false);

    System.out.println(linkedHashSet.contains(false));

    for (Boolean element : linkedHashSet) {
      System.out.println(element);
    }

    System.out.println("--------------------------------------");

    Set<Integer> a = new TreeSet<>(Arrays.asList(0, 1, 2, 3, 4, 5));
    Set<Integer> b = new TreeSet<>(Arrays.asList(2, 4, 6, 8));

    Set<Integer> c = new TreeSet<>(a);
    c.addAll(b);
    System.out.println(c);

    Set<Integer> d = new TreeSet<>(a);
    d.removeAll(b);
    System.out.println(d);

    Set<Integer> e = new TreeSet<>(a);
    e.retainAll(b);
    System.out.println(e);
  }
}
