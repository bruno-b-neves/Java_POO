
# 💻 Roteiro 03: Encapsulamento, Construtores, Sobrecarga, Herança e Sobrescrita

Este roteiro apresenta exemplos práticos de Programação Orientada a Objetos em Java, com foco em encapsulamento, construtores, sobrecarga, herança, sobrescrita de métodos e interação com o usuário via terminal.

## 🎯 Objetivos
- Praticar conceitos de herança e sobrescrita de métodos.
- Utilizar construtores e sobrecarga.
- Implementar validações e encapsulamento.
- Criar menus interativos para interação com o usuário.

## 🛠️ O que foi Praticado
- **Encapsulamento**: uso de atributos privados e métodos públicos para acesso/control.
- **Construtores**: inicialização de objetos com diferentes parâmetros.
- **Sobrecarga**: múltiplos métodos com o mesmo nome, mas parâmetros diferentes.
- **Herança**: criação de subclasses (ex: `Gerente`, `Estagiario`) a partir de uma superclasse (`Funcionario`).
- **Sobrescrita**: redefinição de métodos em subclasses para comportamento específico.
- **Menu interativo**: uso da classe `Scanner` e estruturas de repetição para interação com o usuário.

## 📂 Estrutura dos Arquivos
- **src/roteiro03/App.java**: Classe principal, responsável pelo menu e execução do programa.
- **src/roteiro03/Funcionario.java**: Superclasse com atributos e métodos comuns a todos os funcionários.
- **src/roteiro03/Gerente.java**: Subclasse de `Funcionario`, adiciona atributo bônus e sobrescreve métodos.
- **src/roteiro03/Estagiario.java**: Subclasse de `Funcionario`, adiciona atributos específicos de estagiário.

## ▶️ Como Executar
1. Acesse a pasta do roteiro:
	```sh
	cd Roteiro03/src/roteiro03
	```
2. Compile os arquivos Java:
	```sh
	javac App.java Funcionario.java Gerente.java Estagiario.java
	```
3. Execute o programa principal:
	```sh
	java roteiro03.App
	```

## 🏆 Desafio Extra
- Implementação do cálculo de salário com bônus para o gerente.
- Criação de um menu interativo para exibir dados e calcular salário total.

Exemplo de opções do menu:
```
1 - Exibir dados do gerente
2 - Exibir salário com bônus
0 - Sair
```

---
Sinta-se à vontade para explorar e modificar os exemplos para fixar os conceitos!