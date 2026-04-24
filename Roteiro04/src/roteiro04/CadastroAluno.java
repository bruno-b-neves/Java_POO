package roteiro04;

import java.util.ArrayList;

// Classe responsável por guardar e manipular a lista de alunos
public class CadastroAluno {
    // Lista onde os alunos cadastrados serão armazenados
    private ArrayList<Aluno> lista = new ArrayList<>();
    
    // Adiciona um objeto Aluno já pronto na lista
    public void adicionarAlunos(Aluno aluno) {
        lista.add(aluno);
    }

    // Sobrecarga do método adicionarAlunos
    // Recebe os dados separados, cria o aluno e adiciona na lista
    public void adicionarAlunos(String nome, int idade, String curso) {
        Aluno aluno = new Aluno(nome, idade, curso);
        lista.add(aluno);
    }

    public boolean editarAluno(int indice, String novoNome, int novaIdade, String novoCurso) {
        if (indice < 0 || indice >= lista.size()) {
            return false; // Índice inválido
        }

        Aluno alunoAtualizado = new Aluno(novoNome, novaIdade, novoCurso);
        lista.set(indice, alunoAtualizado); // Substitui o aluno na posição informada
        return true; // Informa que a edição deu certo
    }

    // Remove um aluno pelo nome
    // Retorna true se encontrar e remover, ou false se não encontrar
    public boolean removerAluno(String nome) {
        for (int i = 0; i < lista.size(); i++) {
            // Compara o nome informado com o nome do aluno da lista
            if (lista.get(i).getNome().equals(nome)) {
                lista.remove(i); // Remove o aluno encontrado
                return true;     // Informa que a remoção deu certo
            }
        }
        return false; // Nenhum aluno com esse nome foi encontrado
    }

    // Sobrecarga do método removerAluno
    // Remove um aluno pelo índice informado
    public boolean removerAluno(int indice) {
        if (indice < 0 || indice >= lista.size()) {
            return false; // Índice inválido
        }

        lista.remove(indice); // Remove o aluno da posição informada
        return true; // Informa que a remoção deu certo
    }

    // Mostra todos os alunos cadastrados
    public void listarAlunos() {
        // Se não houver alunos, avisa o usuário
        if (lista.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        // Percorre a lista e exibe os dados de cada aluno
        for (Aluno aluno : lista) {
            aluno.exibirDados();
        }
    }
}
