package roteiro03;

// A classe Gerente herda da classe Funcionario, o que significa que ela tem acesso aos atributos e métodos da classe Funcionario
class Gerente extends Funcionario {
    private double bonus; // Atributo para armazenar o bônus do gerente

    // Construtor da classe Gerente, que chama o construtor da classe Funcionario
    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario); // Chama o construtor da classe Funcionario para inicializar nome e salário
        this.bonus = bonus; // Inicializa o atributo bônus
    }

    // Getter para acessar o atributo bonus
    public double getBonus() {
        return bonus;
    }

    // Setter para modificar o atributo bonus
    public void setBonus(double bonus) {
        this.bonus = bonus;

        if (bonus < 0) {
            System.out.println("Bônus inválido. O bônus deve ser um valor positivo.");
        } else if (bonus > (getSalario() * 0.10)) {
            System.out.println("Bônus muito alto. O bônus deve ser um valor razoável.");
        }
    }

    // Setter para modificar o atributo bonus com uma mensagem de validação
    public void setBonus(double bonus, boolean mensagem) {
        this.bonus = bonus;

        if (mensagem) {
            System.out.println("Bônus inválido. O bônus deve ser um valor positivo.");
        }
    }

    // Sobrescreve o método exibirDados para incluir o bônus do gerente
    @Override

    // O método exibirDados chama o método exibirDados da classe Funcionario 
    // para exibir o nome e o salário, e depois exibe o bônus do gerente
    public void exibirDados() {
        super.exibirDados(); // Chama o método exibirDados da classe Funcionario para exibir o nome e o salário
        System.out.println("Bônus: " + bonus); // Exibe o bônus do gerente
    }

    // Sobrescreve o método exibirDados para incluir o bônus do gerente com uma mensagem de validação
    public void exibirDados(boolean mensagem) {
        super.exibirDados(); // Chama o método exibirDados da classe Funcionario para exibir o nome e o salário
        System.out.println("Bônus: " + bonus); // Exibe o bônus do gerente

        if (mensagem) {
            System.out.println("Bônus inválido. O bônus deve ser um valor positivo.");
        }
    }
}
