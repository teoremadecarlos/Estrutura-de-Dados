import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Parte 1: Ler 200 valores inteiros
        int[] valores = new int[200];
        for (int i = 0; i < 200; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();
        }

        // Parte 2: Emitir relatório com números pares
        System.out.println("\nNúmeros pares lidos:");
        for (int valor : valores) {
            if (valor % 2 == 0) {
                System.out.println(valor);
            }
        }

        // Parte 3: Determinar o menor valor no vetor
        int menorValor = valores[0];
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] < menorValor) {
                menorValor = valores[i];
            }
        }
        System.out.println("\nMenor valor: " + menorValor);

        // Parte 4: Contar valores maiores que a média
        int soma = 0;
        for (int valor : valores) {
            soma += valor;
        }
        double media = (double) soma / valores.length;

        int maioresQueMedia = 0;
        for (int valor : valores) {
            if (valor > media) {
                maioresQueMedia++;
            }
        }
        System.out.println("Quantidade de valores maiores que a média: " + maioresQueMedia);

        scanner.close();
    }
}

