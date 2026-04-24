package roteiro04;

import java.util.Scanner;

// Classe principal do sistema
public class App {
    public static void main(String[] args) throws Exception {
        // Scanner para ler dados digitados no terminal
        Scanner entrada = new Scanner(System.in);

        // Objeto responsável por gerenciar a lista de alunos
        CadastroAluno cadastro = new CadastroAluno();
        // Controla o loop do menu
        boolean executando = true;

        // Menu interativo: repete enquanto executando for true
        do {
            System.out.println("\n1 - Adicionar Aluno");
            System.out.println("2 - Listar Alunos");
            System.out.println("3 - Editar Aluno");
            System.out.println("4 - Remover Aluno");
            System.out.println("5 - Sair");

            // Lê a opção escolhida pelo usuário
            System.out.print("\nEscolha uma opção: ");
            int opcao = entrada.nextInt();
            entrada.nextLine(); // Limpa o Enter pendente do nextInt()

            // Decide a ação com base na opção escolhida
            switch (opcao) {
                case 1:
                    // Cadastro de um novo aluno
                    System.out.println("\nCadastro de Aluno:");
                    System.out.print("Nome: ");
                    String nome = entrada.nextLine();

                    System.out.print("Idade: ");
                    int idade = entrada.nextInt();
                    entrada.nextLine(); // Limpa o Enter pendente

                    System.out.print("Curso: ");
                    String curso = entrada.nextLine();

                    // Cria objeto Aluno e adiciona ao cadastro
                    Aluno aluno = new Aluno(nome, idade, curso);
                    cadastro.adicionarAlunos(aluno);
                    break;

                case 2:
                    // Exibe todos os alunos cadastrados
                    System.out.println("\nLista de alunos cadastrados:");
                    cadastro.listarAlunos();
                    break;

                case 3:
                    System.out.print("Digite o índice do aluno que deseja editar: ");
                    int indice = entrada.nextInt();
                    entrada.nextLine();

                    System.out.print("Novo nome: ");
                    String novoNome = entrada.nextLine();

                    System.out.print("Nova idade: ");
                    int novaIdade = entrada.nextInt();
                    entrada.nextLine();

                    System.out.print("Novo curso: ");
                    String novoCurso = entrada.nextLine();

                    if (cadastro.editarAluno(indice, novoNome, novaIdade, novoCurso)) {
                        System.out.println("Aluno atualizado com sucesso.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 4:
                    // Encerra o loop do menu
                    executando = false;
                    System.out.println("Encerrando o programa. Até logo!");
                    break;

                default:
                    // Tratamento para opção inválida
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        } while (executando);

        // Fecha o scanner ao terminar o programa
        entrada.close();
    }
}
