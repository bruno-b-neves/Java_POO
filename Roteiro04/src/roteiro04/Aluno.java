package roteiro04;

// Classe Aluno herda de Usuario (nome e idade vêm da classe pai)
public class Aluno extends Usuario {
    // Atributo específico da classe Aluno
    private String curso;

    // Construtor: recebe nome, idade e curso ao criar um aluno
    public Aluno(String nome, int idade, String curso) {
        super(nome, idade); // Chama o construtor da classe pai (Usuario)
        this.curso = curso; // Define o curso do aluno
    }

    // Getter: retorna o curso do aluno
    public String getCurso() {
        return curso;
    }

    // Setter: altera o curso do aluno
    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Sobrescrita do método exibirDados da classe pai
    @Override
    public void exibirDados() {
        super.exibirDados();
        // Exibe todos os dados do aluno em uma única linha
        System.out.print("Curso: " + curso);
    }
}
