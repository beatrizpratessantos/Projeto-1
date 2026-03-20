# 🏭 Abstract Factory - Exercícios em Java

Este repositório contém a implementação de dois exercícios utilizando o padrão de projeto **Abstract Factory**, com foco em desacoplamento e criação de famílias de objetos relacionados.

---

## 📌 Sobre o Projeto

O objetivo é demonstrar como o padrão **Abstract Factory** permite que um sistema seja independente das classes concretas utilizadas, facilitando a troca de implementações de forma dinâmica.

---

## 🧩 Padrão Utilizado

**Abstract Factory** é um padrão de projeto criacional que fornece uma interface para criar famílias de objetos relacionados sem especificar suas classes concretas.

---

## 🚀 Exercícios Implementados

### 1️⃣ Transporte Multimodal

Simula um aplicativo de mobilidade urbana que permite escolher entre diferentes tipos de transporte.

#### Tipos de transporte:

* 🚗 Terrestre

  * Carro
  * Ônibus
* ✈️ Aéreo

  * Avião
  * Helicóptero

Cada tipo de transporte possui sua própria fábrica, garantindo consistência na criação dos objetos.

---

### 2️⃣ Sistema de Pagamento Multibanco

Simula uma loja online que pode trabalhar com diferentes bancos sem depender de implementações específicas.

#### Bancos disponíveis:

* 🏦 Banco A
* 🏦 Banco B

#### Métodos de pagamento:

* 💳 Cartão de Crédito
* 🧾 Boleto

Cada banco possui sua própria fábrica, responsável por criar seus métodos de pagamento.

---

## 🛠️ Tecnologias Utilizadas

* Java
* Programação Orientada a Objetos (POO)
* Padrões de Projeto (Design Patterns)

---

## ▶️ Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/beatrizpratessantos/Projeto-1.git
```

2. Compile os arquivos:

```bash
javac *.java
```

3. Execute os programas:

### Transporte:

```bash
java AppTransporte
```

### Pagamento:

```bash
java Loja
```

---

## 🎯 Objetivos de Aprendizado

* Compreender o padrão Abstract Factory
* Aplicar boas práticas de POO
* Reduzir acoplamento entre classes
* Facilitar a escalabilidade do sistema

---

## 📚 Estrutura do Projeto

```
/src
 ├── AppTransporte.java
 ├── Loja.java
 ├── (demais classes e interfaces)
```

---

## 📄 Licença

Este projeto é apenas para fins educacionais.
