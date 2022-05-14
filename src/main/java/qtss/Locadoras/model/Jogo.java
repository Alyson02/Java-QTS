package qtss.Locadoras.model;

public class Jogo {
	
	public Jogo(String nome, double locacao, int estoque) {
		super();
		this.nome = nome;
		this.locacao = locacao;
		this.estoque = estoque;
	}
	
	private String nome;
	private double locacao;
	private int estoque;
	private double valor;
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getLocacao() {
		return locacao;
	}
	public void setLocacao(double locacao) {
		this.locacao = locacao;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
}
