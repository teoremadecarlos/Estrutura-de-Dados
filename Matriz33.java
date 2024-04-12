import java.util.Scanner;

public class Matriz33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        // Lendo valores para a matriz
        System.out.println("Digite os valores da matriz 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Calculando a soma dos elementos da primeira coluna
        int somaPrimeiraColuna = 0;
        for (int i = 0; i < 3; i++) {
            somaPrimeiraColuna += matriz[i][0];
        }
        System.out.println("Soma dos elementos da primeira coluna: " + somaPrimeiraColuna);

        // Calculando o produto dos elementos da primeira linha
        int produtoPrimeiraLinha = 1;
        for (int j = 0; j < 3; j++) {
            produtoPrimeiraLinha *= matriz[0][j];
        }
        System.out.println("Produto dos elementos da primeira linha: " + produtoPrimeiraLinha);

        // Calculando a soma de todos os elementos da matriz
        int somaTotal = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                somaTotal += matriz[i][j];
            }
        }
        System.out.println("Soma de todos os elementos da matriz: " + somaTotal);

        // Calculando a soma dos elementos da diagonal principal
        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < 3; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }
        System.out.println("Soma dos elementos da diagonal principal: " + somaDiagonalPrincipal);

        scanner.close();
    }
}
