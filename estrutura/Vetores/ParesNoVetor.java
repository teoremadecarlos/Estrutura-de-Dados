import java.util.Scanner;

public class ParesNoVetor {
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

    System.out.println("Os números pares lidos foram: ");
    for (int valor : valores) {
      if (valor % 2 == 0) {
        System.out.println(valor);
      }
    }
  }
}

