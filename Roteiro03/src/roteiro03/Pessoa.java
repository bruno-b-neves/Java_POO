package roteiro03; // Define o pacote do projeto

class Pessoa { // Define a classe Pessoa
    private String nome;    // Atributo para armazenar o nome da pessoa
    private int idade;      // Atributo para armazenar a idade da pessoa

    // Construtor para inicializar os atributos nome e idade
    public Pessoa(String nome, int idade) { 
        this.nome = nome;       // Inicializa o atributo nome com o valor passado como parâmetro
        this.idade = idade;     // Inicializa o atributo idade com o valor passado como parâmetro
    }

    //  Getters - Retorna o valor do atributo nome
    public String getNome() { 
        return nome;
    }

    // Setters - Define o valor do atributo nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para exibir os dados da pessoa
    public void exibirDados() { 
        System.out.println("Nome: " + nome); // Exibe o nome da pessoa
        System.out.println("Idade: " + idade); // Exibe a idade da pessoa
    }
}
