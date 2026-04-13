package roteiro03; // Define o pacote do projeto

// A classe Aluno herda da classe Pessoa, o que significa que ela tem acesso aos atributos e métodos da classe Pessoa
class Aluno extends Pessoa {
    private String curso; // Atributo para armazenar o curso do aluno

    // Construtor da classe Aluno, que chama o construtor da classe Pessoa
    public Aluno(String nome, int idade, String curso) {
        super(nome, idade); // Chama o construtor da classe Pessoa para inicializar nome e idade
        this.curso = curso; // Inicializa o atributo curso
    }

    // Sobrescreve o método exibirDados para incluir o curso do aluno
    @Override // Anotação para indicar que este método sobrescreve um método da classe pai
    
    // O método exibirDados chama o método exibirDados da classe Pessoa para exibir o nome e a idade, e depois exibe o curso do aluno
    public void exibirDados() {
        super.exibirDados(); // Chama o método exibirDados da classe Pessoa
        System.out.println("Curso: " + curso); // Exibe o curso do aluno
    }
    
}
