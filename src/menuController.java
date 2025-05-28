public class MenuController {
	private boolean selecionado;
	private boolean comprado;
		
	public boolean isSelecionado() {
		return selecionado;
	}

	public void setSelecionado(boolean selecionado) {
		this.selecionado = selecionado;
	}

	public boolean isComprado() {
		return comprado;
	}

	public void setComprado(boolean comprado) {
		this.comprado = comprado;
	}

	public void selecionarFilme() {
		this.selecionado = true;
	}
	
	public void comprarIngresso() {
		this.comprado = true;
	}

	public String detalhes() {
		return "MenuController [selecionado=" + selecionado + ", comprado=" + comprado + "]";
	}
	
	
}