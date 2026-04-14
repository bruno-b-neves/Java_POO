package roteiro03; // Define o pacote do projeto
public class App {
    public static void main(String[] args) throws Exception {
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
