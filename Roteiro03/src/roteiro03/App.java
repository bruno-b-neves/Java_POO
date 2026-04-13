package roteiro03; // Define o pacote do projeto
public class App {
    public static void main(String[] args) throws Exception {
        // Cria um objeto do tipo Aluno e exibe seus dados
        Aluno aluno = new Aluno("Maria", 20, "ADS");
        
        // O método exibirDados do objeto aluno é chamado para exibir o nome, 
        // a idade e o curso do aluno
        aluno.exibirDados();

        // Cria um objeto do tipo Gerente e exibe seus dados
        Gerente gerente = new Gerente("João", 3000.0, 72000.0);
        
        // O método exibirDados do objeto gerente é chamado para exibir o nome, 
        // o salário e o bônus do gerente
        gerente.exibirDados();
    }
}
