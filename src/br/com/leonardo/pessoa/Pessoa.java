package br.com.leonardo.pessoa;

public abstract class Pessoa {
	private int id;
	private String nome;
	private String dtNarcimento;
	private boolean prioridade;
	
	public Pessoa(){		
	}
	
	public Pessoa(int id, String nome, String dtNasc, boolean prioridade) {
		this.id = id;
		this.nome = nome;
		this.dtNarcimento = dtNasc;
		this.prioridade = prioridade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDtNarcimento() {
		return dtNarcimento;
	}
	public void setDtNarcimento(String dtNarcimento) {
		this.dtNarcimento = dtNarcimento;
	}
	public boolean getIsPrioridade() {
		return prioridade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
			
}
