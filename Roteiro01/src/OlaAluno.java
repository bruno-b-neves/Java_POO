package roteiro01;
import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class OlaAluno { // Define a classe OlaAluno
    // Cria um objeto Scanner para ler a entrada do usuário
    Scanner scanner = new Scanner(System.in);
    
    private String nome; // Declara uma variável para armazenar o nome do aluno
    private int idade; // Declara uma variável para armazenar a idade do aluno
    private String curso; // Declara uma variável para armazenar o curso do aluno

    // Define um método para apresentar o aluno e solicitar seu nome
    public void apresentacaoAluno() { 
        // Solicita ao usuário que digite seu nome
        System.out.print("Digite seu nome: ");
         // Lê o nome do aluno a partir da entrada do usuário
        nome = scanner.nextLine();
        // Imprime uma mensagem de boas-vindas personalizada
        System.out.println("Olá, " + nome + "! Bem-vindo ao mundo da programação em Java!");
    } 

    // Define um método para solicitar e exibir os dados do aluno
    public void dadosAluno() { 
        // Imprime uma linha de separação para melhor organização visual
        System.out.println("-------------------------------------------");

        // Imprime uma mensagem de saudação personalizada
        System.out.println("\nOlá, " + nome + "!");
        
        // Solicita ao usuário que digite sua idade
        System.out.print("Digite sua idade: ");
         // Lê a idade do aluno a partir da entrada do usuário
        idade = scanner.nextInt();
        // Imprime a idade do aluno
        System.out.println("Você tem " + idade + " anos."); 

        // Solicita ao usuário que digite seu curso
        System.out.print("Digite seu curso: ");
        // Lê o curso do aluno a partir da entrada do usuário
        curso = scanner.next(); 

        // Imprime uma mensagem de boas-vindas personalizada, incluindo a idade e 
        // o curso do aluno
        System.out.println("Bem-vindo(a) ao curso de programação em " + curso + "."); 

    }
}
