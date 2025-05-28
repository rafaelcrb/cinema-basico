public class Principal {

	public static void main(String[] args) {
		Filmes[] filmes = new Filmes[5]; 
		Ingressos [] secao = new Ingressos[6];
		Ingressos i = new Ingressos();
		IngressoVip ivip = new IngressoVip();
		secao [0] = new Ingressos(09.45f);
		secao [1] = new Ingressos(11.35f);
		secao [2] = new Ingressos(13.25f);
		secao [3] = new Ingressos(15.35f);
		secao [4] = new Ingressos(17.25f);
		secao [5] = new Ingressos(19.35f);
		
		
		filmes[0] = new Filmes("Adão Negro ", " O poderoso Adão Negro é libertado de sua tumba para lançar sua justiça cruel sobre a Terra. ",
							" 02:14 M ", " Ação/Aventura ", " Jaume Collet-Serra ", false);
		
		filmes[1] = new Filmes("O Preço do Amanhã ", "Uma empolgante narrativa sobre os impactos da tecnologia em nossa sociedade de hierarquias econômicas. ", 
							"01:49 M ", "Ficção Cientifica/Ação ", "Andrew Niccol ", false);

		filmes[2] = new Filmes("Avatar ", "No exuberante mundo alienígena de Pandora vivem os Na'vi, seres que parecem ser primitivos, mas são altamente evoluídos. ",
							"02:42 M ", "Aventura/Ficção ", "James Cameron ", false);
		
		filmes[3] = new Filmes("A Maldição do Quarto 203", "Melhores amigos se mudam para um apartamento com um vitral assustador e se convencem de que espíritos malignos assombram sua nova casa. ",
							"01:43", "Terror", "Ben Jagger", true);
		
		filmes[4] = new Filmes("Noite Infeliz ", "Uma equipe de elite de mercenários invade um complexo familiar na véspera de Natal, deixando todos reféns. ",
							"01:41 ", "Ação", "Tommy Wirkola ", true);
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		int opc;
		
		System.out.println("|----------Filmes Disponivel-----------|");
		System.out.println("[ 1 ] " + filmes[0].getTitulo());
		System.out.println("[ 2 ] " + filmes[1].getTitulo());
		System.out.println("[ 3 ] " + filmes[2].getTitulo());
		System.out.println("|------- Filmes 3D Disponivel --------|");
		System.out.println("[ 4 ] " + filmes[3].getTitulo());
		System.out.println("[ 5 ] " + filmes[4].getTitulo());
		System.out.println("DIGITE '0' PARA SAIR! ");
		System.out.println("Digite o Número do Filme Desejado: ");
		opc = sc.nextInt();		
		System.out.println("Opção: " + opc);
			
		while (opc != 0 ) {
			if (opc == 1) {
				System.out.println("Filme Selecionado: " + filmes[0].getTitulo() + "\nDescrição: " + filmes[0].getDescricao());
				System.out.println("|------- Selecione a Seção -------|");
				System.out.println("Sala [1] " + secao[0].getSecao());
				System.out.println("Sala [2] " + secao[1].getSecao());
				System.out.println("Sala [3] " + secao[2].getSecao());
				System.out.println("Sala [4] " + secao[3].getSecao());
				System.out.println("Sala [5] " + secao[4].getSecao());
				System.out.println("Sala [6] " + secao[5].getSecao());
				break;
			}else if (opc == 2) {
				System.out.println("Filme Selecionado: " + filmes[1].getTitulo() + "\nDescrição: " + filmes[1].getDescricao());
				System.out.println("|------- Selecione a Seção -------|");
				System.out.println("Sala [1] " + secao[0].getSecao());
				System.out.println("Sala [2] " + secao[1].getSecao());
				System.out.println("Sala [3] " + secao[2].getSecao());
				System.out.println("Sala [4] " + secao[3].getSecao());
				System.out.println("Sala [5] " + secao[4].getSecao());
				System.out.println("Sala [6] " + secao[5].getSecao());
				break;
			}else if (opc == 3) {
				System.out.println("Filme Selecionado: " + filmes[2].getTitulo () + "\nDescrição: " + filmes[2].getDescricao());
				System.out.println("|------- Selecione a Seção -------|");
				System.out.println("Sala [1] " + secao[0].getSecao());
				System.out.println("Sala [2] " + secao[1].getSecao());
				System.out.println("Sala [3] " + secao[2].getSecao());
				System.out.println("Sala [4] " + secao[3].getSecao());
				System.out.println("Sala [5] " + secao[4].getSecao());
				System.out.println("Sala [6] " + secao[5].getSecao());
				break;
			}else if (opc == 4) {
				System.out.println("Filme 3D Selecionado: " + filmes[3].getTitulo () + "\nDescrição: " + filmes[3].getDescricao());
				System.out.println("|------- Selecione a Seção -------|");
				System.out.println("Sala [1] " + secao[0].getSecao());
				System.out.println("Sala [2] " + secao[1].getSecao());
				System.out.println("Sala [3] " + secao[2].getSecao());
				System.out.println("Sala [4] " + secao[3].getSecao());
				System.out.println("Sala [5] " + secao[4].getSecao());
				System.out.println("Sala [6] " + secao[5].getSecao());
				break;
			}else if (opc == 5) {
				System.out.println("Filme 3D Selecionado: " + filmes[4].getTitulo () + "\nDescrição: " + filmes[4].getDescricao());
				System.out.println("|------- Selecione a Seção -------|");
				System.out.println("Sala [1] " + secao[0].getSecao());
				System.out.println("Sala [2] " + secao[1].getSecao());
				System.out.println("Sala [3] " + secao[2].getSecao());
				System.out.println("Sala [4] " + secao[3].getSecao());
				System.out.println("Sala [5] " + secao[4].getSecao());
				System.out.println("Sala [6] " + secao[5].getSecao());
				break;
			}else {
				System.out.println("Opção Inexistente! ");
			}
		}
		
		int sala;
		System.out.println("Digite a Seção Desejada: ");
		sala = sc.nextInt();
		System.out.println("Sala: " + sala);
		
		if (sala == 1) {
			System.out.println("Horário " + secao[0].getSecao());
		}else if (sala == 2) {
			System.out.println("Horário " + secao[1].getSecao());
		}else if (sala == 3) {
			System.out.println("Horário " + secao[2].getSecao());
		}else if (sala == 4 ) {
			System.out.println("Horário " + secao[3].getSecao());
		}else if (sala == 5 ) {
			System.out.println("Horário " + secao[4].getSecao());
		}else if (sala == 6 ) {
			System.out.println("Horário " + secao[5].getSecao());
		}else {
			System.out.println("Secão Inexistente! ");
		}
		
		int qntdIngresso;
		int ingresso;
		if (opc == 1 || opc == 2 || opc == 3) {
			System.out.println("|------- Selecione o Ingresso -------|");
			System.out.println("[1] Ingresso Inteiro: " + i.getIngressoInteiro());
			System.out.println("[2] Ingresso Meio: " + i.getIngressoMeio());
		}else {
			System.out.println("|------- Selecione o Ingresso -------|");
			System.out.println("[1] Ingresso Inteiro: " + i.getIngressoInteiro());
			System.out.println("[2] Ingresso Meio: " + i.getIngressoMeio());
			System.out.println("[3] Ingresso Inteiro Vip: " + ivip.getIngressointeiroVip());
			System.out.println("[4] Ingresso Meio Vip: " + ivip.getIngressomeioVip());
			System.out.println("Digite o Número do Ingresso desejado: ");
		}
		ingresso = sc.nextInt();
		System.out.println("Ingresso: " + ingresso);
		System.out.println("Quantidade: " );
		qntdIngresso = sc.nextInt();		
		
		if (ingresso == 1) {
			int calc;
			System.out.println("Ingresso Inteiro R$ " + i.getIngressoInteiro());
			calc = i.getIngressoInteiro() * qntdIngresso;
			System.out.println("Total a pagar: R$ " + calc);
			System.out.println("--------------------------");
		}else if (ingresso == 2) {
			int calc;
			System.out.println("Ingresso Meio R$ " + i.getIngressoMeio());
			calc = i.getIngressoMeio() * qntdIngresso;
			System.out.println("Total a pagar: R$ " + calc);
			System.out.println("--------------------------");
		}else if (ingresso == 3) {
			int calc;
			System.out.println("Ingresso Inteiro Vip R$ " + ivip.getIngressointeiroVip());
			calc = ivip.getIngressointeiroVip() * qntdIngresso;
			System.out.println("Total a pagar: R$ " + calc);
			System.out.println("--------------------------");
		}else if (ingresso == 4) {
			int calc;
			System.out.println("Ingresso Meio Vip R$ " + ivip.getIngressomeioVip());
			calc = ivip.getIngressomeioVip() * qntdIngresso;
			System.out.println("Total a pagar: R$ " + calc);
			System.out.println("--------------------------");
		}else {
			System.out.println("Opção Inválida! ");
		}
		
		if (ingresso == 3 || ingresso == 4) {
			int lanche;
			System.out.println("Deseja fazer um Lanche? Digite: [1]Sim / [2]Não ");
			lanche = sc.nextInt();
			if (lanche == 1) {
				ivip.acessoLanchonete();
			}else {
				System.out.println("Obrigado, Volte Sempre! ");
			}
		}	
		
		if (ingresso == 1 || ingresso == 2) {
			int lanche;
			System.out.println("Deseja fazer um Lanche? Digite: [1]Sim / [2]Não ");
			lanche = sc.nextInt();
			if (lanche == 1) {
				i.acessoLanchonete();
			}else {
				System.out.println("Obrigado, Volte Sempre! ");
			}
		}
		System.out.println("---------------------------------");
		System.out.println("");
		System.out.println(" Detalhes dos Filmes ");
		System.out.println(filmes[0].detalhes());
		System.out.println(filmes[1].detalhes());
		System.out.println(filmes[2].detalhes());
		System.out.println(filmes[3].detalhes());
		System.out.println(filmes[4].detalhes());
		
		
		
		sc.close();
	
	
	}
	
	
}