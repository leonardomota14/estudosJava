package br.com.leonardo.pessoa;

public class PessoaFisica extends Pessoa implements PessoaInterface {
	
	private String cpf;
	private String rg;
	
	public PessoaFisica(int id, String dtNasc, String nome, boolean prioridade, String cpf, String rg) {
		// TODO Auto-generated constructor stub
		super(id, nome, dtNasc, prioridade);
		this.cpf=cpf;
		this.rg=rg;
	}
	
	@Override
	public boolean isPrioridade() {
		return getIsPrioridade();
	}

	@Override
	public String pessoaFisicaOuJuridica() {
		// TODO Auto-generated method stub
		return "Pessoa Fisica";
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	

}
