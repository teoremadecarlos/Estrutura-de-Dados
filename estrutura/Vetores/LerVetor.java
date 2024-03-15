import java.util.Scanner;

public class LerVetor {
  public static void main(String[] args) {
    int[] valores = new int[200];

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite 200 valores inteiros: ");

    for (int i = 0; i < 200; i++) {
      System.out.print("Digite o valor " + i + ": ");
      valores[i] = scanner.nextInt();
    }

    scanner.close();

    System.out.println("Valores armazenados com sucesso!");
  }
}
