# 💻 Roteiro 05: Polimorfismo em Java — Flexibilidade com Variáveis, Métodos e Classes

Este roteiro apresenta exemplos de polimorfismo em Java, mostrando como objetos de diferentes classes podem ser tratados de forma uniforme através de referências, sobrescrita de métodos e conversões (upcasting/downcasting).

## 🎯 Objetivos
- Entender polimorfismo de subtipo (upcasting e downcasting).
- Praticar sobrescrita de métodos para comportamento dinâmico (binding em tempo de execução).
- Usar variáveis polimórficas e coleções para manipular objetos heterogêneos.
- Demonstrar segurança de tipos e uso de `instanceof` quando necessário.

## 🛠️ O que foi praticado
- **Variáveis polimórficas**: uma referência do tipo pai apontando para objetos filhos (`Animal a = new Cachorro()`).
- **Sobrescrita de métodos (`@Override`)**: métodos específicos em subclasses que alteram o comportamento.
- **Upcasting / Downcasting**: conversões entre supertipo e subtipo quando necessário.
- **Coleções polimórficas**: listas que armazenam a superclasse e mantêm o comportamento específico de cada instância.

## 📂 Estrutura dos Arquivos
- **src/animais/Animal.java**: classe base com métodos comuns.
- **src/animais/Cachorro.java**: subclasse que sobrescreve comportamentos de `Animal`.
- **src/animais/Gato.java**: outra subclasse demonstrando comportamento diferente.
- **src/animais/Main.java**: exemplos de uso e execuções que mostram polimorfismo.
- **src/empresa/**: pacote paralelo com `Funcionario`, `Desenvolvedor`, `Gerente` e `App.java` também contém exemplos de polimorfismo aplicados a hierarquias de funcionários.

## ▶️ Como executar
1. Acesse a pasta do roteiro:
```sh
cd Roteiro05/src
```
2. Compile os exemplos de `animais` e execute o `Main`:
```sh
javac animais/*.java
java animais.Main
```
3. Para os exemplos do pacote `empresa`:
```sh
javac empresa/*.java
java empresa.App
```

> Dica: experimente trocar referências (ex: `Animal a = new Gato()`) e chamar métodos para observar o comportamento em tempo de execução.

---
Explore variações: adicione novas subclasses, métodos específicos e testes para reforçar o conceito de polimorfismo.
