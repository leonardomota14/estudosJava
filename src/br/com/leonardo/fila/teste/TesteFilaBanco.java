package br.com.leonardo.fila.teste;

import br.com.leonardo.fila.Fila;
import br.com.leonardo.pessoa.PessoaFisica;
import br.com.leonardo.pessoa.PessoaJuridica;

public class TesteFilaBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Fila<PessoaFisica> listaPf = new Fila<PessoaFisica>();
		Fila<PessoaJuridica> listaPj = new Fila<PessoaJuridica>();
		
		PessoaFisica p1 = new PessoaFisica(1,"04101989", "Leonardo", false, "12345678543", "23983746000342");
		PessoaFisica p2 = new PessoaFisica(2,"04101660", "Raimunda", true, "12345643243", "23983723000123");
		PessoaFisica p3 = new PessoaFisica(3,"04011999", "Jorge", false, "12345623323", "23983721000132");
		
		if(p1.isPrioridade())
			listaPf.inserirNoInicio(p1);
		else
			listaPf.inserir(p1);
		
		if(p2.isPrioridade())
			listaPf.inserirNoInicio(p2);
		else
			listaPf.inserir(p2);
		
		if(p3.isPrioridade())
			listaPf.inserirNoInicio(p3);
		else
			listaPf.inserir(p3);
		
		
		
		System.out.println();
	}

}
