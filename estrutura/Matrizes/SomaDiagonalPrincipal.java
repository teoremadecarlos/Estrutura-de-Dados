import java.util.Scanner;

public class SomaDiagonalPrincipal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz = new int[3][3];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite os elementos da matriz: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Elemento [" + i + "] [" + j + "]: ");
				matriz[i][j] = scanner.nextInt();
			}
		}
		scanner.close();
		
		int somaDiagonal = 0;
		for (int i = 0; i < 3; i++) {
			somaDiagonal += matriz[i][i];
		}
		System.out.println("\nA soma dos elementos da Diagonal é: " + somaDiagonal);
	}
}
