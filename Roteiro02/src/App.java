import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Aluno msg = new Aluno(); // Cria um objeto da classe Aluno
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário

        // Desafio Principal 
        String nome = msg.nome;
        int idadeAluno = msg.idade;
        double notaAluno2 = msg.nota;

        System.out.print("Digite o nome do aluno: ");
        nome = scanner.nextLine(); // Lê o nome do aluno a partir da entrada
        System.out.print("Digite a idade do aluno: ");
        idadeAluno = scanner.nextInt(); // Lê a idade do aluno a partir da entrada
        System.out.print("Digite a nota do aluno: ");
        notaAluno2 = scanner.nextDouble(); // Lê a nota do aluno a partir da entrada

        if (idadeAluno >= 18) { // 
            System.out.println("Maior de Idade: Sim - (" + idadeAluno + " ano(s))" ); // exibe se o aluno é maior ou menor de idade
        } else {
            System.out.println("Maior de Idade: Não - (" + msg.idade + " ano(s))" ); // exibe se o aluno é maior ou menor de idade
        }

        if ( notaAluno2 >= 7) {
            System.out.println("Aprovado.");
        } else if (notaAluno2 >= 5) {
            System.out.println("Recuperação.");
        } else if (notaAluno2 < 5) {
            System.out.println("Reprovado.");
        }

        for (int i = 0; i <= idadeAluno; i++) { // Loop para contar de 0 até a idade do aluno
            System.out.print(i + " "); // Exibe o número atual da contagem
        }
        
        System.out.println("\nNome: " + nome); // Exibe uma mensagem indicando que a contagem foi concluída
        System.out.println("Maior de Idade: " + idadeAluno); // Exibe a idade do aluno
        System.out.println("Situação: " + notaAluno2); // Exibe a nota do aluno
        System.out.println("\n");

        // Ampliação da atividade - Desafio 2, 3, 4 e 5 - Menu interativo para verificar idade, calcular média e contar alunos aprovados
        boolean repeat = true; // Variável para controlar o loop de repetição
        while (repeat) { // Desafio 3 - Repetição com controle
            System.out.println("1. Verificar Idade");
            System.out.println("2. Calcular Media");
            System.out.println("3. Verificar Aprovados");
            System.out.println("4. Sair");

            System.out.println("\nEscolha uma opção: "); // Solicita ao usuário que escolha uma opção

            switch (scanner.nextInt()) { // Desafio 2 - Menu interativo
                case 1: // Desafio 3
                    System.out.println("Digite a idade do aluno: "); // Solicita ao usuário que digite a idade do aluno
                    msg.idade = scanner.nextInt(); // Lê a idade do aluno a partir da entrada do usuário

                    String maiorDeIdade;
                    maiorDeIdade = (msg.idade >= 18) ? "Sim" : "Não"; // Verifica se o aluno é maior ou menor de idade e atribui a mensagem correspondente à variável maiorDeIdade
                    
                    if (msg.idade <= 0) { // Verifica se a idade é inválida (menor ou igual a 0 ou maior que 150)
                        System.out.println("Idade inválida. Por favor, insira uma idade válida.");
                    } else {
                        System.out.println("Maior de Idade: " + maiorDeIdade + " - (" + msg.idade + " ano(s))" ); // exibe se o aluno é maior ou menor de idade
                    }
                    break;

                case 2: // Desafio 4 - Loop para ler as notas do aluno a partir da entrada do usuário
                    double soma = 0; // Variável para armazenar a soma das notas do aluno
                    double nota; // Lê a nota do aluno a partir da entrada do usuário
                    
                    for (int i = 1; i <= 4; i++) {// Loop para ler as notas do aluno a partir da entrada do usuário
                        System.out.println("Digite a nota " + i + ":"); // Solicita ao usuário que digite a nota do aluno
                        nota = scanner.nextDouble(); // Lê a nota do aluno a partir da entrada do usuário
                        
                        if (nota >= 0 && nota <= 10) { // Verifica se a nota é inválida (menor ou igual a 0 ou maior que 10)
                            soma = soma + nota; // Adiciona a nota à soma
                        } else if (nota < 0 || nota > 10) { // Verifica se a nota é inválida (menor ou igual a 0 ou maior que 10)
                            System.out.println("Nota inválida. Por favor, insira uma nota entre 0 e 10.");
                            i--; // Decrementa o contador para repetir a leitura da nota inválida
                        }
                    }
                    
                    Double resultadoMedia = soma / 4; // Calcula a média das notas do aluno e atribui o resultado à variável resultadoMedia
                    System.out.println("Média é: " + resultadoMedia); // Exibe o resultado da média do aluno

                    break;
                case 3: // Desafio 5 -  Criar Sistema que leia 5 alunos e mostre o total de aprovados                                        
                    int aproved = 0;
                    
                    for (int i = 1; i <= 5; i++) {
                        double somaNotas = 0; // Variável para armazenar a soma das notas do aluno
                        
                        System.out.print("Digite o nome do aluno " + i + ": ");
                        msg.nome = scanner.next(); // Lê o nome do aluno a partir da entrada do usuário                 
                        
                        for (int j = 1; j <= 4; j++) { // Loop para ler as notas do aluno a partir da entrada do usuário
                            System.out.print("Nota " + j + ": "); // Solicita ao usuário que digite a nota do aluno
                            double notaAluno = scanner.nextDouble();  // Lê a nota do aluno a partir da entrada do usuário
                    
                            if (notaAluno >= 0 && notaAluno <= 10) { // Verifica se a nota é válida (entre 0 e 10)
                                somaNotas += notaAluno; // Adiciona a nota do aluno à soma total das notas
                            } else if (notaAluno < 0 || notaAluno > 10) { // Verifica se a nota é inválida (menor ou igual a 0 ou maior que 10)
                                System.out.println("Nota inválida. Por favor, insira uma nota entre 0 e 10.");
                                j--; // Decrementa o contador para repetir a leitura da nota inválida
                            }
                        }
                        
                        double mediaAluno = somaNotas / 4; // Calcula a média do aluno depois de ler as 4 notas
                       
                        if (mediaAluno >= 7) {
                            aproved++; // Incrementa o contador de alunos aprovados
                        }
                    }
                    System.out.println("\nTotal de alunos aprovados: " + aproved + "\n");
                    break;
                case 4: 
                    System.out.println("Saindo do programa...");
                    repeat = false;
                    break;
            }
        }
        scanner.close();
    }
}
