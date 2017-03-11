package br.com.leonardo.pessoa.teste;

import br.com.leonardo.pessoa.PessoaFisica;
import br.com.leonardo.pessoa.PessoaJuridica;

public class TestePessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PessoaJuridica pj = new PessoaJuridica(1,"Leonardo Mota LTDA", "04101989", false, "1234567890");
		PessoaFisica pf = new PessoaFisica(1,"22031990", "Pedro",false, "123456789", "32435465");	
		
		System.out.println(pf.pessoaFisicaOuJuridica());
		System.out.println("Dados "+pf.pessoaFisicaOuJuridica()+": Nome: "+pf.getNome()+", CPF: "+pf.getCpf());
		
		System.out.println(pj.pessoaFisicaOuJuridica());
		System.out.println("Dados da "+pj.pessoaFisicaOuJuridica()+": Nome: "+pj.getNome()+", CNPJ: "+pj.getCnpj());
		System.out.println(pj);

	}

}
