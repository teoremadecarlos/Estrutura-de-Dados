import java.util.Scanner;

public class Matriz24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo uma matriz 2x4
        int[][] matriz = new int[2][4];

        // Lendo valores para a matriz
        System.out.println("Digite os valores da matriz 2x4:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Imprimindo a matriz
        System.out.println("\nA matriz é:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Nova linha para a próxima linha da matriz
        }

        scanner.close();
    }
}
