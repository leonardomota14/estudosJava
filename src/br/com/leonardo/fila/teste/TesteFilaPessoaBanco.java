package br.com.leonardo.fila.teste;

import br.com.leonardo.fila.FilaPessoas;
import br.com.leonardo.pessoa.Pessoa;
import br.com.leonardo.pessoa.PessoaFisica;
import br.com.leonardo.pessoa.PessoaJuridica;

public class TesteFilaPessoaBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilaPessoas listaPf = new FilaPessoas();
		//Fila<PessoaJuridica> listaPj = new Fila<PessoaJuridica>();
		
		PessoaFisica p1 = new PessoaFisica(1,"04101989", "Leonardo", false, "12345678543", "23983746000342");
		PessoaFisica p2 = new PessoaFisica(2,"04101660", "Raimunda", true, "12345643243", "23983723000123");
		PessoaFisica p3 = new PessoaFisica(3,"04011999", "Jorge", false, "12345623323", "23983721000132");
		PessoaJuridica p4 = new PessoaJuridica(4, "Empresa", "01011990", false, "23234234000123");
		
		if(p1.isPrioridade()){
			listaPf.inserirNoInicio(p1);
		}
		else{
			listaPf.inserir(p1);			
		}
		if(p2.isPrioridade()){
			listaPf.inserirNoInicio(p2);
		}
		else{
			listaPf.inserir(p2);			
		}
		if(p3.isPrioridade()){
			listaPf.inserirNoInicio(p3);
		}
		else{
			listaPf.inserir(p3);			
		}
		if(p4.isPrioridade()){
			listaPf.inserirNoInicio(p4);
		}else{
			listaPf.inserir(p4);
		}	
		
		Pessoa pessoa = (Pessoa) listaPf.remover();
		if(pessoa != p1){
			System.out.println("Erro: Pessoa removida diferente da inserida!");
		}
		if(!listaPf.vazia())
			System.out.println("A fila não está vazia");
		
		System.out.println(listaPf);
	}

}
