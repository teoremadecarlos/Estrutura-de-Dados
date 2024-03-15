import java.util.Scanner;

public class ProdutoPrimeiraLinha {
  public static void main(String[] args) {
    int[][] matriz = new int[3][3];

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite os elementos da matriz: ");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j ++) {
        System.out.println("Elemento [" + i + "] [" + j + "]: ");
        matriz[i][j] = scanner.nextInt();
      }
    }
    scanner.close();

    int produtoPrimeiraLinha = 0;
    for (int j = 0; j < 3; j++) {
      produtoPrimeiraLinha += matriz[0][j];
    }
    System.out.println("\nO produto dos elementos da primeira linha é: " + produtoPrimeiraLinha);
  }
}
