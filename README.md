# cinema-basico
Sistema de Gerenciamente de Ingresos para Cinema com Java POO

Descrição: Desenvolvi um sistema de gerenciamento de ingressos para cinema utilizando Java POO. O projeto é composto por várias classes que representam diferentes aspectos do sistema, como filmes, ingressos, seções e lanchonetes. Este projeto simula a experiência de escolher filmes, selecionar seções, comprar ingressos (normais e VIPs) e acessar a lanchonete do cinema.
Principais Funcionalidades:
•	Classe Filmes: Representa os filmes disponíveis no cinema, armazenando informações como título, descrição, duração, gênero, diretor e se o filme é em 3D.
•	Classe Ingressos: Herda de Filmes e implementa a interface Lanchonete. Representa os ingressos disponíveis para cada filme e seção, armazenando o preço dos ingressos inteiros e meios.
•	Classe IngressoVip: Extende Ingressos para incluir preços de ingressos VIP e acesso especial à lanchonete.
•	Classe Lanchonete: Interface que define o método para acessar a lanchonete.
•	Classe MenuController: Controla a seleção e compra de ingressos, gerenciando o fluxo de seleção de filmes e seções.
•	Classe Principal: Ponto de entrada do programa que simula a interação do usuário com o sistema, permitindo escolher filmes, seções, ingressos e calcular o total a pagar.
Desenvolvimento:
•	Utilização dos conceitos de herança e polimorfismo para modelar as classes de forma eficiente.
•	Implementação de métodos para gerenciar a seleção e compra de ingressos, bem como o acesso à lanchonete para ingressos VIP.
•	Uso de arrays para armazenar filmes e seções, facilitando a interação e seleção pelo usuário.
•	Integração de Scanner para capturar entradas do usuário e simular um sistema interativo.
Destaques Técnicos:
•	Aplicação de boas práticas de programação orientada a objetos, como encapsulamento, herança e polimorfismo.
•	Estruturação do código de forma modular e organizada, facilitando a manutenção e expansão futura.
•	Implementação de uma interface simples e intuitiva para a interação do usuário com o sistema.
Tecnologias Utilizadas:
•	Linguagem de Programação: Java
•	Paradigma: Programação Orientada a Objetos (POO)
Este projeto demonstra minha habilidade em desenvolver sistemas complexos e interativos utilizando Java POO, além de minha capacidade de aplicar conceitos avançados de programação para criar soluções eficientes e bem estruturadas.
Estrutura do Projeto
1.	Classe Filmes
o	Responsável por armazenar informações sobre os filmes, como título, descrição, duração, gênero, diretor e se o filme é em 3D.
o	Inclui métodos getters e setters para acessar e modificar os atributos.
o	Método detalhes para exibir as informações detalhadas do filme.
2.	Classe Ingressos
o	Extende a classe Filmes e implementa a interface Lanchonete.
o	Armazena informações sobre a seção, preços dos ingressos inteiros e meio, e a quantidade de ingressos.
o	Método acessoLanchonete para indicar acesso à lanchonete.
3.	Classe IngressoVip
o	Extende a classe Ingressos.
o	Adiciona atributos específicos para ingressos VIP, como preços diferenciados.
o	Sobrescreve o método acessoLanchonete para fornecer um acesso diferenciado.
4.	Interface Lanchonete
o	Define o método acessoLanchonete que é implementado pelas classes Ingressos e IngressoVip.
5.	Classe MenuController
o	Gerencia a seleção de filmes e a compra de ingressos.
o	Contém métodos para selecionar um filme e comprar um ingresso, além de métodos getters e setters para os atributos selecionado e comprado.
6.	Classe Principal
o	Contém o método main que inicializa e executa a aplicação.
o	Cria instâncias de filmes e sessões, e permite ao usuário interagir com o sistema para selecionar filmes, seções e comprar ingressos.
Aprendizado e Desenvolvimento:
Ao desenvolver este projeto, aprendi a estruturar aplicações complexas utilizando POO, implementando classes, herança e interfaces para criar um sistema coeso e funcional. A aplicação de conceitos como encapsulamento e polimorfismo foi fundamental para o sucesso do projeto. Além disso, a experiência com manipulação de dados e interação com o usuário em uma interface de console proporcionou uma compreensão mais profunda do fluxo de controle e da lógica de programação.
Código:
O código completo do projeto está disponível no meu repositório GitHub, onde você pode explorar cada classe e entender a estrutura e funcionamento da aplicação.
https://github.com/rafaelcrb/cinema-basico.git
