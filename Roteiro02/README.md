# Roteiro 2: Controle de Fluxo em Java Estrutura Condicionais e Estruturas de Repetição

Este roteiro prática estruturas condicionais e de repeticao com entrada de dados no terminal.

O programa possui duas partes principais:
- Parte inicial: lê nome, idade e nota de um aluno e mostra validações básicas.
- Menu interativo: permite executar desafios com repetição até escolher sair.

## Objetivos praticados
- Leitura de dados com Scanner
- Condicionais com if, else if e operador ternario
- Controle de fluxo com switch-case
- Repeticao com for e while
- Validacao de entrada para idade e notas
- Calculo de média
- Contagem de alunos aprovados

## Estrutura do roteiro
- src/App.java: fluxo principal do programa e menu
- src/Aluno.java: classe simples com nome, idade e nota

## Funcionalidades implementadas
1. Verificar idade
- Lê uma idade
- Mostra se o aluno e maior de idade
- Valida/invalida idade  (menor ou igual a zero)

2. Calcular média
- Lê 4 notas
- Valida cada nota (intervalo de 0 a 10)
- Relê a nota quando invalida
- Calcula e exibe a média final

3. Verificar aprovados
- Lê dados de 5 alunos
- Para cada aluno, lê 4 notas validas
- Calcula a média de cada aluno
- Conta quantos tiveram média maior ou igual a 7
- Exibe o total de aprovados

4. Sair
- Encerra o menu interativo

## Como executar
Na pasta Roteiro02/src:

1. Compilar
javac App.java Aluno.java

2. Executar
java App

## Observacoes
- Para nomes compostos, o codigo atual usa next(), que lê apenas a primeira palavra.
- O encerramento do programa fecha o Scanner ao final da execucao.