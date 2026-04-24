# 💻 Roteiro 04: Herança, Sobrescrita e CRUD de Alunos

Neste pacote estão os códigos referentes ao quarto roteiro de laboratório. O objetivo aqui foi praticar conceitos de Programação Orientada a Objetos com herança e sobrescrita, além de montar um sistema simples de cadastro de alunos no terminal.

## 🎯 Objetivos
- Aplicar herança entre classes (`Usuario` e `Aluno`).
- Utilizar sobrescrita de método para exibir dados específicos do aluno.
- Trabalhar com `ArrayList` para armazenar objetos em memória.
- Implementar operações de cadastro, listagem, edição e remoção de alunos.
- Praticar menu interativo com `Scanner` e `switch-case`.

## 🛠️ O que foi praticado
- **Herança**: a classe `Aluno` herda atributos e comportamentos de `Usuario`.
- **Sobrescrita (`@Override`)**: `Aluno` redefine `exibirDados()` para incluir o curso.
- **Encapsulamento**: atributos privados com getters e setters nas classes de domínio.
- **Coleções (`ArrayList`)**: armazenamento dinâmico da lista de alunos.
- **Sobrecarga de métodos**: em `CadastroAluno`, métodos `adicionarAlunos` e `removerAluno` possuem variações de assinatura.
- **Validação de índice**: checagem de limites nas operações de edição e remoção por posição.

## 📂 Estrutura dos Arquivos
- **src/roteiro04/App.java**: classe principal com menu interativo e fluxo do programa.
- **src/roteiro04/Usuario.java**: classe base com `nome`, `idade` e método de exibição.
- **src/roteiro04/Aluno.java**: classe filha que adiciona o atributo `curso`.
- **src/roteiro04/CadastroAluno.java**: gerenciamento da lista de alunos (adicionar, listar, editar e remover).

## ▶️ Como executar
1. Acesse a pasta raiz do roteiro:
```sh
cd Roteiro04/src
```
2. Compile os arquivos Java do pacote:
```sh
javac roteiro04/*.java
```
3. Execute a classe principal:
```sh
java roteiro04.App
```

## 🧪 Funcionalidades do menu
- `1`: adicionar aluno.
- `2`: listar alunos cadastrados.
- `3`: editar aluno por índice.
- `4`: encerrar o programa.

---
Sinta-se à vontade para testar novas validações, ajustar o fluxo de remoção e evoluir este cadastro para fixar os conceitos de POO.
