# 💻 Roteiro 06: Modificadores de Comportamento em Java — `final`, `static` e `abstract`

Este roteiro explora modificadores que alteram o comportamento de classes, métodos e variáveis em Java: `final`, `static` e `abstract`. Os exemplos mostram como e quando usar cada um desses modificadores em hierarquias de classes.

## 🎯 Objetivos
- Entender o papel de `final` em variáveis, métodos e classes.
- Praticar o uso de `static` para membros compartilhados e métodos utilitários.
- Compreender classes e métodos `abstract` e como definir contratos para subclasses.
- Verificar interações entre estes modificadores em uma hierarquia de `Funcionario`.

## 🛠️ O que foi praticado
- **`final`**: constantes (`final` em atributos), impedir sobrescrita (`final` em métodos) e impedir herança (`final` em classes).
- **`static`**: campos e métodos de classe, uso de constantes compartilhadas e métodos utilitários.
- **`abstract`**: classes abstratas e métodos abstratos que obrigam subclasses a implementar comportamentos.
- **Combinações**: exemplos de quando usar `static final` para constantes e como uma classe abstrata define o contrato para subclasses concretas.

## 📂 Estrutura dos Arquivos
- **src/empresa/App.java**: classe principal que demonstra uso dos modificadores.
- **src/empresa/Funcionario.java**: superclasse (provavelmente abstrata) com definições de comportamento comum.
- **src/empresa/Desenvolvedor.java** e **src/empresa/Gerente.java**: subclasses que implementam/estendem o comportamento.

## ▶️ Como executar
1. Acesse a pasta do roteiro:
```sh
cd Roteiro06/src
```
2. Compile os arquivos Java:
```sh
javac empresa/*.java
```
3. Execute a aplicação principal:
```sh
java empresa.App
```

---
Sinta-se à vontade para transformar métodos em `abstract`, adicionar constantes `static final` e observar o efeito de `final` em métodos/classes para consolidar o aprendizado.
