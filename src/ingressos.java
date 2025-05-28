public class Ingressos extends Filmes implements Lanchonete {
	private float secao;
	private int ingressoInteiro = 32;
	private int ingressoMeio = 16;
	private int qntdIngresso = 0;
	
	public Ingressos(float secao) {
		this.secao = secao;
	}
	public Ingressos() {
		
	}
	public int getIngressoInteiro() {
		return ingressoInteiro;
	}
	public void setIngressoInteiro(int ingressoInteiro) {
		this.ingressoInteiro = ingressoInteiro;
	}
	public int getIngressoMeio() {
		return ingressoMeio;
	}
	public void setIngressoMeio(int ingressoMeio) {
		this.ingressoMeio = ingressoMeio;
	}
	public int getQntdIngresso() {
		return qntdIngresso;
	}
	public void setQntdIngresso(int qntdIngresso) {
		this.qntdIngresso = qntdIngresso;
	}
	public float getSecao() {
		return secao;
	}
	public void setSecao(float secao) {
		this.secao = secao;
	}
		
	@Override
	public void acessoLanchonete() {
		 System.out.println("Compre um Ingresso Vip! "); 
	}
		
}