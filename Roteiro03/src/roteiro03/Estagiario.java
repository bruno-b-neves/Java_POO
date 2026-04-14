package roteiro03; // Define o pacote do projeto

// A classe Estagiario herda da classe Funcionario, 
// o que significa que ela tem acesso aos atributos e métodos da classe Funcionario
class Estagiario extends Funcionario {
    private String curso;   // Atributo para armazenar o curso do estagiário
    private int semestre;   // Atributo para armazenar o semestre do estagiário
    private int timeContrato; // Atributo para armazenar o tempo de contrato do estagiário

    // Construtor da classe Estagiario, que chama o construtor da classe Funcionario
    public Estagiario(String nome, double salario, String curso, int semestre, int timeContrato) {
        // Chama o construtor da classe Funcionario para inicializar nome e salário
        super(nome, salario); 
        this.curso = curso; // Inicializa o atributo curso com o valor passado como parâmetro
        this.semestre = semestre; // Inicializa o atributo semestre com o valor passado como parâmetro
        this.timeContrato = timeContrato; // Inicializa o atributo timeContrato com o valor passado como parâmetro
    }

    // Getters para acessar os atributos curso, semestre e timeContrato
    public String getCurso() {
        return curso;
    }

    // Getters para acessar os atributos semestre e timeContrato
    public int getSemestre() {
        return semestre;
    }

    // Getter para acessar o atributo timeContrato
    public int getTimeContrato() {
        return timeContrato;
    }

    // Setters para modificar os atributos curso, semestre e timeContrato
    public void setCurso(String curso) {
        // Inicializa o atributo curso com o valor passado como parâmetro
        this.curso = curso; 
    
        // Valida o curso para garantir que ele não seja nulo ou vazio
        if (curso == null || curso.isEmpty()) {
            System.out.println("Curso inválido. O curso não pode ser vazio.");
        }
    }

    public void setSemestre(int semestre) {
        // Inicializa o atributo semestre com o valor passado como parâmetro
        this.semestre = semestre;

        // Valida o semestre para garantir que ele esteja dentro do intervalo válido
        if (semestre < 1 || semestre > 10) {
            System.out.println("Semestre inválido. O semestre deve ser um valor entre 1 e 10.");
        }
    }

    public void setTimeContrato(int timeContrato) {
        // Inicializa o atributo timeContrato com o valor passado como parâmetro
        this.timeContrato = timeContrato;

        // Valida o tempo de contrato para garantir que ele seja um valor positivo e razoável
        if (timeContrato < 0) {
            System.out.println("Tempo de contrato inválido. O tempo de contrato deve ser um valor positivo.");
        } else if (timeContrato > 24) {
            System.out.println("Tempo de contrato muito longo. O tempo de contrato deve ser um valor razoável.");
        }
    }

    // Sobrescreve o método exibirDados para incluir o curso do aluno
    @Override

    // Sobrescreve o método exibirDados para incluir o curso do aluno
    public void exibirDados() {
        super.exibirDados(); // Chama o método exibirDados da classe Funcionario para exibir o nome e o salário
        System.out.println("Curso: " + curso); // Exibe o curso do estagiário
        System.out.println("Semestre: " + semestre); // Exibe o semestre do estagiário
        System.out.println("Tempo de Contrato: " + timeContrato + " meses"); // Exibe o tempo de contrato do estagiário
    }
}
