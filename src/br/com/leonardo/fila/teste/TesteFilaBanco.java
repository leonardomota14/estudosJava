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
		PessoaJuridica p4 = new PessoaJuridica(4, "Empresa", "01011990", false, "01234567000123");
		PessoaJuridica p5 = new PessoaJuridica(5, "EmpresaEmpresa", "01011990", true, "01234567000234");
		
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
		
		if(p4.isPrioridade())
			listaPj.inserirNoInicio(p4);
		else
			listaPj.inserir(p4);
		if(p5.isPrioridade())
			listaPj.inserirNoInicio(p5);
		else
			listaPj.inserir(p5);
		
		System.out.println(listaPf);
		System.out.println(listaPj);
	}

}
