package Examples.EntradaProcessamentoSaidaDeDados;

import java.util.Scanner;

public class EntradaDeDadosI {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String nome;
    int idade;
    double salario;
    char genero;

    System.out.println("Digite seu nome: ");
    nome = sc.next();

    System.out.println("Digite sua idade: ");
    idade = sc.nextInt();

    System.out.println("Digite seu salaŕio: ");
    salario = sc.nextDouble();

    System.out.println("Digite seu gênero (F/M/B): ");
    genero = sc.next().charAt(0);

    System.out.printf("Seu nome é %s, tem %d anos, seu gênero é %s e ganha R$ %.2f.", nome, idade, genero, salario);

    sc.close();
  }
}


