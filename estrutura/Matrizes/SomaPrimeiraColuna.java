import java.util.Scanner;

public class SomaPrimeiraColuna {
	
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
		
		int somaPrimeiraColuna = 0;
		for (int i = 0; i < 3; i++) {
			somaPrimeiraColuna += matriz[i][0];
		}
		System.out.println("\nA soma dos elementos da primeira coluna é: " + somaPrimeiraColuna);
	}
}
