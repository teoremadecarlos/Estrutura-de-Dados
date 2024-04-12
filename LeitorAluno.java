import java.util.Scanner;

// Definição do registro Endereço
class Endereco {
    String rua;
    String bairro;
    String cidade;
}

// Definição do registro Aluno
class Aluno {
    String nome;
    int semestre;
    String sala;
    String curso;
    double[] notas = new double[4]; // Array para armazenar as 4 notas do aluno
    Endereco endereco = new Endereco(); // Objeto Endereco dentro do registro Aluno
}

public class LeitorAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        Aluno[] alunos = new Aluno[0]; // Inicialmente, nenhum aluno cadastrado

        while (continuar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar novos alunos");
            System.out.println("2. Listar alunos cadastrados");
            System.out.println("3. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    alunos = cadastrarAlunos(scanner, alunos);
                    break;
                case 2:
                    listarAlunos(alunos);
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }

        // Fechando o scanner
        scanner.close();
    }

    public static Aluno[] cadastrarAlunos(Scanner scanner, Aluno[] alunos) {
        System.out.println("Quantos alunos deseja cadastrar?");
        int numAlunosNovos = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        Aluno[] novosAlunos = new Aluno[alunos.length + numAlunosNovos];
        // Copiando os alunos já cadastrados para o novo array
        System.arraycopy(alunos, 0, novosAlunos, 0, alunos.length);

        // Cadastro dos novos alunos
        for (int i = alunos.length; i < novosAlunos.length; i++) {
            System.out.println("Informe os dados do aluno " + (i - alunos.length + 1) + ":");

            Aluno aluno = new Aluno();

            System.out.print("Nome: ");
            aluno.nome = scanner.nextLine();

            System.out.print("Semestre: ");
            aluno.semestre = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            System.out.print("Sala: ");
            aluno.sala = scanner.nextLine();

            System.out.print("Curso: ");
            aluno.curso = scanner.nextLine();

            System.out.println("Notas (separadas por espaço):");
            for (int j = 0; j < 4; j++) {
                aluno.notas[j] = scanner.nextDouble();
            }

            scanner.nextLine(); // Limpa o buffer

            System.out.println("Informe o endereço do aluno:");

            System.out.print("Rua: ");
            aluno.endereco.rua = scanner.nextLine();

            System.out.print("Bairro: ");
            aluno.endereco.bairro = scanner.nextLine();

            System.out.print("Cidade: ");
            aluno.endereco.cidade = scanner.nextLine();

            novosAlunos[i] = aluno;
        }

        System.out.println("Alunos cadastrados com sucesso.");
        return novosAlunos;
    }

    public static void listarAlunos(Aluno[] alunos) {
        if (alunos.length == 0) {
            System.out.println("Nenhum aluno cadastrado ainda.");
            return;
        }

        System.out.println("\nAlunos cadastrados:");
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.nome);
            System.out.println("Semestre: " + aluno.semestre);
            System.out.println("Sala: " + aluno.sala);
            System.out.println("Curso: " + aluno.curso);
            System.out.println("Notas: ");
            for (int i = 0; i < 4; i++) {
                System.out.print(aluno.notas[i] + " ");
            }
            System.out.println("\nEndereço:");
            System.out.println("Rua: " + aluno.endereco.rua);
            System.out.println("Bairro: " + aluno.endereco.bairro);
            System.out.println("Cidade: " + aluno.endereco.cidade);
            System.out.println();
        }
    }
}
