package roteiro03;

// A classe Funcionario representa um funcionário com nome e salário
class Funcionario {
    private String nome;    // Atributo para armazenar o nome do funcionário
    private double salario; // Atributo para armazenar o salário do funcionário

    // Construtor para inicializar os atributos nome e salario
    public Funcionario(String nome, double salario) {
        this.nome = nome; // Inicializa o atributo nome com o valor passado como parâmetro
        this.salario = salario; // Inicializa o atributo salario com o valor passado como parâmetro
    }

    // Getters para acessar os atributos nome e salario
    public String getNome() {
        return nome;
    }

    // Getter para acessar o atributo salario
    public double getSalario() {
        return salario;
    }

    // Setters para modificar os atributos nome
    public void setNome(String nome) {
        this.nome = nome;

        if (nome == null || nome.isEmpty() || nome.length() < 2) {
            System.out.println("Nome inválido. O nome deve conter pelo menos 2 caracteres.");
        }
    }

    // Setter para modificar o atributo salario
    public void setSalario(double salario) {
        this.salario = salario;

        if (salario < 0) {
            System.out.println("Salário inválido. O salário deve ser um valor positivo.");
        } else if (salario > 15.000) {
            System.out.println("Salário muito alto. O salário deve ser um valor razoável.");
        } else if (salario < 1.650) {
            System.out.println("Salário muito baixo. O salário deve ser um valor que permita uma vida digna.");
        }
    }



    // Método para exibir os dados do funcionário
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
    }
}
