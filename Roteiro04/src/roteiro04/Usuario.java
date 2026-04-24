package roteiro04;

// Classe pai com dados comuns de um usuário
public class Usuario {
    // Atributos do usuário
    private String nome;
    private int idade;

    // Construtor: inicializa nome e idade ao criar um objeto Usuario
    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getter: retorna o nome do usuário
    public String getNome() {
        return nome;
    }

    // Getter: retorna a idade do usuário
    public int getIdade() {
        return idade;
    }

    // Setter: altera o nome do usuário
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Setter: altera a idade do usuário
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método para exibir os dados do usuário
    public void exibirDados() {
        System.out.print("Nome: " + nome + " | ");
        System.out.print("Idade: " + idade + " | ");
    }
}
