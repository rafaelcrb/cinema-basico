public class Filmes {
	protected String titulo;
	protected String descricao;
	protected String duracao;
	protected String genero;
	protected String diretor;
	protected boolean filme3D;
	
	
	public Filmes() {
		
	}
	public Filmes(String titulo, String descricao, String duracao, String genero, String diretor, boolean filme3D) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.duracao = duracao;
		this.genero = genero;
		this.diretor = diretor;
		this.filme3D = filme3D;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	
		
	public String detalhes() {
		System.out.println("");
		return "Titulo: " + titulo + "\n Descricao: " + descricao + "\n Duração: " + duracao + "\n Gênero: " + genero
				+ "\n Diretor: " + diretor + "\n3D: " + filme3D;
	}
	
}