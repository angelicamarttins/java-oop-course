import java.util.Scanner;

public class EntradaDeDadosII {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int idade;
    String nomeCompleto;
    String profissao;
    String serieFavorita;

    idade = sc.nextInt();
    sc.nextLine();

    System.out.println("Digite seu nome: ");
    nomeCompleto = sc.nextLine();

    System.out.println("Digite sua profissão: ");
    profissao = sc.nextLine();

    System.out.println("Digite sua série favorita: ");
    serieFavorita = sc.nextLine();

    System.out.printf("Seu nome é %s, você é %s e sua série favorita é %s", nomeCompleto, profissao, serieFavorita);
    
    sc.close();
  }
}
