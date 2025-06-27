# 💰 Sistema Bancário Simples

Projeto desenvolvido para a disciplina de Linguagem Orientada a Objetos, do curso de Análise e Desenvolvimento de Sistemas, pela Instituição Anhanguera.
Objetivo era aplicar os conceitos fundamentais da programação orientada a objetos em Java. A aplicação simula operações bancárias simples realizadas por um cliente.

---

## 📌 Objetivos

- Praticar a criação e instanciação de classes em Java
- Trabalhar com atributos e métodos
- Utilizar estruturas de decisão (`switch`) e repetição (`while`)
- Desenvolver um menu interativo no terminal

---

## 🛠 Tecnologias Utilizadas

- Java 21+
- NetBeans IDE (ferramenta solicitada no material da instituição)
- Visual Studio Code (publicação no GitHub)
- Git e GitHub para versionamento
- Terminal/Console para entrada e saída de dados

---

## 🚀 Funcionalidades

- Cadastro do cliente (nome, sobrenome e CPF)
- Consulta de saldo
- Realização de depósitos
- Realização de saques
- Encerramento da aplicação

---

## 📄 Estrutura do Código

- `Cliente`: classe que representa o cliente do banco, contendo:
  - Atributos: `nome`, `sobrenome`, `cpf`, `saldo`
  - Métodos: `consultarSaldo()`, `depositar(double)`, `sacar(double)`

- `GerenciaBanco`: classe principal (`main`) que:
  - Lê os dados do cliente
  - Exibe o menu de operações
  - Gerencia as interações com o cliente usando `Scanner`, `switch` e `while`

---

## ✅ Exemplo de Uso

```bash
Informe seu nome, por gentileza: Tamiris
Informe seu sobrenome, por gentileza: Rodrigues
Informe seu CPF, por gentileza: 000

Olá! Qual operação deseja realizar?
1 - Consultar saldo
2 - Depósito
3 - Saque
4 - Encerrar solicitação
1
Seu saldo atual: R$ 0.0

Olá! Qual operação deseja realizar?
1 - Consultar saldo
2 - Depósito
3 - Saque
4 - Encerrar solicitação
2
Informe o valor que deseja depositado:
8
Depósito de R$ 8.0 realizado com sucesso.

Olá! Qual operação deseja realizar?
1 - Consultar saldo
2 - Depósito
3 - Saque
4 - Encerrar solicitação
3
Informe o valor que deseja sacar:
5
Saque de R$ 5.0 realizado com sucesso.

Olá! Qual operação deseja realizar?
1 - Consultar saldo
2 - Depósito
3 - Saque
4 - Encerrar solicitação
1
Seu saldo atual: R$ 3.0

Olá! Qual operação deseja realizar?
1 - Consultar saldo
2 - Depósito
3 - Saque
4 - Encerrar solicitação
4
Encerrando solicitações, até breve!
```

---

## 📝 Licença
- Este projeto é acadêmico e foi desenvolvido com fins educativos. Uso livre para fins de estudo.
- Curso: Análise e Desenvolvimento de Sistemas - Anhanguera (2025). Disciplina: Linguagem Orientada a Objetos
