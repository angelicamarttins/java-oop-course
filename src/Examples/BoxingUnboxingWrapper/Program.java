package Examples.BoxingUnboxingWrapper;

public class Program {
  public static void main(String[] args) {
    int x = 10;
    System.out.println(x);

    Object boxing = x;
    System.out.println(boxing);

    int unboxing = (int) boxing;
    System.out.println(unboxing);

    /*
    *  String unboxingDiffType = (String) boxing;
    *  System.out.println(unboxingDiffType); // Erro, pois em sua origem, o valor é int e não String
    */

    int a = 20;
    System.out.println(a);

    Integer boxingA = a;
    System.out.println(boxingA);

    int unboxingA = boxingA;
    System.out.println(unboxingA * 2); // Casting não é necessário, pois o tipo da classe Integer também é int
  }
}
