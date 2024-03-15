import java.util.Scanner;

public class Matriz {
  public static void main(String[] args) {
    
    int[][] matriz = new int[2][4];
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite os elementos da matriz: ");
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print("Elemento [" + i + "] [" + j + "] : ");
        matriz[i][j] = scanner.nextInt();
      }
    }

    scanner.close();

    System.out.println("\nA matriz informada é:");
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print(matriz[i][j] + " ");
      }
    System.out.println();
    }
  }
}
