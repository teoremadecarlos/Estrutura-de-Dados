import java.util.Scanner;

public class MenorValor {
  public static void main(String[] args) {
    int[] valores = new int[200];

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite 200 valores inteiros: ");

    for (int i = 0; i < 200; i++) {
      System.out.print("Digite o valor " + i + ": ");
      valores[i] = scanner.nextInt();
    }

    scanner.close();

    int menorValor = valores[0];
    for (int i = 1; i < valores.length; i++) {
      if (valores[i] < menorValor) {
        menorValor = valores[i];
      }
    }

    System.out.println("O menor valor no vetor é: " + menorValor);
  }
}
