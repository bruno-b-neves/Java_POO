package roteiro03; // Define o pacote do projeto
import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class App {
    public static void main(String[] args) throws Exception {
        boolean repeat = true;
        Scanner entrada = new Scanner(System.in);

        while (repeat) {
            System.out.println("1. Cadastrar Gerente");
            System.out.println("2. Cadastrar Estagiário");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            switch (entrada.nextInt()) {
                case 1:
                    System.out.print("Digite o nome do gerente: ");
                    String nomeGerente = entrada.next();
                    System.out.print("Digite o salário do gerente: ");
                    double salarioGerente = entrada.nextDouble();
                    System.out.print("Digite o bônus do gerente: ");
                    double bonusGerente = entrada.nextDouble();

                    Gerente gerente = new Gerente(nomeGerente, salarioGerente, bonusGerente);
                    System.out.println("\nDados do Gerente:");
                    gerente.exibirDados();
                    break;

                case 2:
                    System.out.print("Digite o nome do estagiário: ");
                    String nomeEstagiario = entrada.next();
                    System.out.print("Digite o salário do estagiário: ");
                    double salarioEstagiario = entrada.nextDouble();
                    System.out.print("Digite o curso do estagiário: ");
                    String cursoEstagiario = entrada.next();
                    System.out.print("Digite o semestre do estagiário: ");
                    int semestreEstagiario = entrada.nextInt();
                    System.out.print("Digite o tempo de contrato do estagiário (em meses): ");
                    int tempoContratoEstagiario = entrada.nextInt();

                    Estagiario estagiario = new Estagiario(nomeEstagiario, salarioEstagiario, cursoEstagiario, semestreEstagiario, tempoContratoEstagiario);
                    System.out.println("\nDados do Estagiário:");
                    estagiario.exibirDados();
                    break;

                case 3:
                    System.out.println("Saindo do programa...");
                    repeat = false;
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
        
        // Cria um objeto do tipo Gerente e exibe seus dados
        System.out.println("Dados do Gerente:"); // Exibe uma mensagem indicando que os dados do gerente serão exibidos
        
        // Cria um objeto do tipo Gerente
        Gerente gerente = new Gerente("João", 3000.0, 100.0); 
        
        // O método exibirDados do objeto, gerente é chamado para exibir o nome, 
        // o salário e o bônus do gerente
        gerente.exibirDados();
        
        // Cria um objeto do tipo Estagiário e exibe seus dados
        System.out.println("\nDados do Estagiário:");

        // Cria um objeto do tipo Estagiário
        Estagiario estagiario = new Estagiario("Bruno", 1650.0, "Engenharia de Software", 5, 12);
        
        // O método exibirDados do objeto, estagiário é chamado para exibir o nome, 
        // o salário, o curso, o semestre e o tempo de contrato do estagiário
        estagiario.exibirDados();
    }
}
