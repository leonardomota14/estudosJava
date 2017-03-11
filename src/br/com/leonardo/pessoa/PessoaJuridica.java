package br.com.leonardo.pessoa;

public class PessoaJuridica extends Pessoa implements PessoaInterface {
	private String cnpj;	

	public PessoaJuridica(int id, String nome, String dtNasc, boolean prioridade, String cnpj) {
		super(id, nome, dtNasc, prioridade);
		// TODO Auto-generated constructor stub
		this.cnpj=cnpj;
	}

	@Override
	public boolean isPrioridade() {
		// TODO Auto-generated method stub
		return getIsPrioridade();
	}

	@Override
	public String pessoaFisicaOuJuridica() {
		// TODO Auto-generated method stub
		return "Pessoa Juridica";
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	

}
