package Examples.EntradaProcessamentoSaidaDeDados;

public class ProcessamentoDados {
  public static void main(String[] args) {
    int x, y;

    x = 5;
    y = 2 * x;

    System.out.println(x);
    System.out.println(y);

    double b, B, area;
    float h;

    b = 6.0;
    B = 8.0;
    h = 5F;

    area = (b + B) / 2.0 * h;

    System.out.println(area);

    int c, d;
    double resultado1, resultado2;

    c = 5;
    d = 2;

    resultado1 = c / d;
    resultado2 = (double) c / d;

    System.out.println(resultado1); // 2.0
    System.out.println(resultado2); // 2.5

    double n;
    int m;

    n = 5.9;
    m = (int) n;

    System.out.println(m); // 5
  }
}
