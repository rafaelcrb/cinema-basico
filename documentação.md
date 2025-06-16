# Documentação Técnica - Sistema Básico de Cinema

## 1. Visão Geral

Este projeto implementa um sistema básico de gerenciamento de cinema em Java. Ele simula funcionalidades como a venda de ingressos (normais e VIP), gerenciamento de filmes, e um menu de lanchonete. O sistema é estruturado em classes que representam as entidades e a lógica de negócio.

## 2. Estrutura do Projeto

A estrutura do projeto é organizada em um diretório `src` que contém os arquivos `.java`:

```
cinema-basico/
├── src/                        # Código fonte Java
│   ├── filme.java              # Classe para representar filmes
│   ├── ingressos.java          # Classe para gerenciar ingressos normais
│   ├── ingressosVIp.java       # Classe para gerenciar ingressos VIP
│   ├── lanchonete.java         # Classe para gerenciar itens da lanchonete
│   ├── menuController.java     # Classe para controlar o fluxo do menu e interações
│   └── principal.java          # Classe principal com o método main para iniciar o sistema
└── README.md                   # Arquivo de documentação do projeto
```

## 3. Tecnologias Utilizadas

*   **Java**: Linguagem de programação principal.

## 4. Funcionalidades Principais

### Classes e Suas Responsabilidades

*   **`filme.java`**: Representa um filme com atributos como título, gênero, duração, etc.
*   **`ingressos.java`**: Gerencia a venda e informações de ingressos normais.
*   **`ingressosVIp.java`**: Gerencia a venda e informações de ingressos VIP, possivelmente com funcionalidades adicionais.
*   **`lanchonete.java`**: Gerencia os produtos disponíveis na lanchonete do cinema, incluindo preços e estoque.
*   **`menuController.java`**: Orquestra as interações do usuário, apresentando menus e chamando as funcionalidades das outras classes.
*   **`principal.java`**: Contém o método `main` que inicia a execução do programa, criando instâncias das classes necessárias e chamando o controlador do menu.

## 5. Fluxo de Operação

1.  O programa inicia através da classe `principal.java`.
2.  O `menuController.java` é invocado para exibir as opções ao usuário (comprar ingresso, ir à lanchonete, etc.).
3.  Com base na escolha do usuário, as classes `filme.java`, `ingressos.java`, `ingressosVIp.java`, ou `lanchonete.java` são utilizadas para realizar as operações solicitadas.
4.  O sistema interage com o usuário via console, solicitando entradas e exibindo resultados.

## 6. Configuração e Execução

Para configurar e executar o projeto em seu ambiente local, siga os passos abaixo:

### Pré-requisitos

*   Java Development Kit (JDK) instalado (versão 8 ou superior recomendada).

### Instalação

1.  Clone o repositório:
    ```bash
    git clone https://github.com/rafaelcrb/cinema-basico.git
    cd cinema-basico
    ```

### Compilação e Execução

1.  Navegue até o diretório `src`:
    ```bash
    cd src
    ```
2.  Compile os arquivos Java:
    ```bash
    javac *.java
    ```
3.  Execute a classe principal:
    ```bash
    java principal
    ```

## 7. Considerações de Desenvolvimento

*   Este é um projeto console-based, ideal para demonstrar conceitos básicos de programação orientada a objetos em Java.
*   Não há persistência de dados; todas as informações são perdidas ao encerrar o programa.
*   Pode ser expandido para incluir um banco de dados, interface gráfica (GUI), e funcionalidades mais complexas como seleção de assentos, horários de sessão, etc.


