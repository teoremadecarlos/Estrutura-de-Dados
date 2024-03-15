import java.util.Scanner;

public class MenorQueMedia {
  public static void main(String[] args) {
    int[] valores = new int[200];

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite 200 valores inteiros: ");

    for (int i = 0; i < 200; i++) {
      System.out.print("Digite o valor " + i + ": ");
      valores[i] = scanner.nextInt();
    }

    scanner.close();

    double soma = 0;
    for (int valor : valores) {
      soma += valor;
    }
    double media = soma / valores.lenght;

    for (int valor : valores) {
      if (valor < media) {
        menorQueMedia =+;
      }
    }

    System.out.println("A média dos valores é: " + media);
    System.out.println("Quantidade de valores menores que a média: " + menorQueMedia);
  }
}
