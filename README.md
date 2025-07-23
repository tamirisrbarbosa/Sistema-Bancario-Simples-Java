# 💳 Sistema Bancário Simples em Java

Este projeto simula um sistema bancário básico em linha de comando, permitindo cadastro de clientes, visualização de saldo e movimentações como depósitos e saques. Desenvolvido com **Java e Programação Orientada a Objetos (POO)**, é ideal para praticar lógica, estruturação de classes e fluxo de controle em aplicações back-end.

> 📚 Projeto desenvolvido como exercício acadêmico na disciplina de Linguagem de Programação Orientada a Objetos, no curso de Análise e Desenvolvimento de Sistemas.

---

## 🎯 Funcionalidades

- Cadastro de cliente com CPF e saldo inicial
- Consulta de saldo atual
- Realização de depósitos e saques
- Validações de saldo mínimo e insuficiente
- Menu interativo via terminal

---

## 🧱 Estrutura do Projeto
```
📦 Sistema-Bancario-Java
├── GerenciaBanco.java # Classe principal que gerencia menu, entradas e interações
├── Cliente.java # Classe com atributos e métodos da entidade Cliente
└── README.md # Documentação do projeto
```

---

## 🔍 Tecnologias Utilizadas

- **Java 21+**
- Programação Orientada a Objetos (POO)
- Entrada/saída via terminal
- Lógica de negócios simples
- Boas práticas de estruturação de código

---

## 🚀 Como Executar

1. Clone o repositório:
```
git clone https://github.com/tamirisrbarbosa/sistema-bancario-oo-java.git
```
2. Compile os arquivos:
```
javac GerenciaBanco.java
```
3. Execute a aplicação:
```
java GerenciaBanco
```
---

## 📸 Demonstração (via terminal)

```
[1]

📥
Informe seu nome, por gentileza: Tamiris
Informe seu sobrenome, por gentileza: Rodrigues
Informe seu CPF, por gentileza: 123.456.789-00


[2]

📋 Olá! Qual operação deseja realizar?
1 - Consultar saldo
2 - Depósito
3 - Saque
4 - Encerrar solicitação
 1

📊Seu saldo atual: R$ 0.0


[3]

📋 Olá! Qual operação deseja realizar?
1 - Consultar saldo
2 - Depósito
3 - Saque
4 - Encerrar solicitação
 2

Informe o valor que deseja depositado:
 8

💰 Depósito de R$ 8.0 realizado com sucesso.


[4]

📋 Olá! Qual operação deseja realizar?
1 - Consultar saldo
2 - Depósito
3 - Saque
4 - Encerrar solicitação
 3

Informe o valor que deseja sacar:
 5

💸 Saque de R$ 5.0 realizado com sucesso.


[5]

📋 Olá! Qual operação deseja realizar?
1 - Consultar saldo
2 - Depósito
3 - Saque
4 - Encerrar solicitação
 1

📊 Seu saldo atual: R$ 3.0


[6]

📋 Olá! Qual operação deseja realizar?
1 - Consultar saldo
2 - Depósito
3 - Saque
4 - Encerrar solicitação
 4

🔚  Encerrando solicitações, até breve!
```

---

## 🧠 O que aprendi

- Organização de código com múltiplas classes Java
- Aplicação prática de conceitos de POO (atributos, métodos, encapsulamento)
- Validação de entrada e lógica de fluxo
- Simulação de regras de negócio simples em terminal
- Leitura de dados com Scanner e controle com switch/case

---

## 🛠️ Possíveis Melhorias Futuras
- Persistência de dados com arquivos (FileWriter, FileReader) ou SQLite
- Interface gráfica com JavaFX ou Swing
- Implementação de autenticação simples por CPF
- Adição de testes unitários com JUnit

---

## 👩‍💻 Sobre Mim
Sou Tamiris Barbosa, estudante de Análise e Desenvolvimento de Sistemas em transição de carreira para a área de desenvolvimento.

🔗 [Meu LinkedIn](https://www.linkedin.com/in/tamirisrodriguesbarbosa)

🐙 [Meu GitHub](https://github.com/tamirisrbarbosa)

---

## 📘 Licença
Este projeto está sob a licença MIT.

---

## 💡 Créditos
Projeto desenvolvido como parte da disciplina de Linguagem Orientada a Objetos - Anhanguera Educacional.

Curso: Análise e Desenvolvimento de Sistemas

---

> 🧩 Palavras-chave: Java, Sistema Bancário, Orientação a Objetos, POO, Backend, Terminal, ADS

