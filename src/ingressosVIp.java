public class IngressoVip extends Ingressos {
	private int ingressointeiroVip = 48;
	private int ingressomeioVip = 24;

	public int getIngressointeiroVip() {
		return ingressointeiroVip;
	}

	public void setIngressointeiroVip(int ingressointeroVip) {
		this.ingressointeiroVip = ingressointeroVip;
	}
	
	public int getIngressomeioVip() {
		return ingressomeioVip;
	}

	public void setIngressomeioVip(int ingressomeioVip) {
		this.ingressomeioVip = ingressomeioVip;
	}

	@Override
	public void acessoLanchonete() {
		System.out.println("Lanchonete do Cinema Liberada! " );
	}
	
}