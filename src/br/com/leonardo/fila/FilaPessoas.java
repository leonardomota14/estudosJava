package br.com.leonardo.fila;

import java.util.LinkedList;
import java.util.List;

import br.com.leonardo.pessoa.Pessoa;

public class FilaPessoas {	
	private List object = new LinkedList(); 
	
	public void inserir(Object t){
		this.object.add(t);
	}
	
	public void inserirNoInicio(Object t){
		if(vazia()){
			this.object.add(0, t);
		}
		else{
			List objectAux = new LinkedList();
			objectAux.add(t);
			for(int i=0; i<this.object.size(); i++){
				objectAux.add(this.object.get(i));
			}
			this.object.clear();
			this.object = objectAux;
		}
	}
		
	public Object remover(){
		if(vazia()){
			throw new IllegalArgumentException("A fila está vazia");
		}
		
		return this.object.remove(0);
	}
	
	public boolean vazia(){		
		return this.object.size()==0;
	}
	
	public String toString(){
		if(this.vazia()){
			throw new IllegalArgumentException("Fila está vazia!");			
		}
		
		StringBuilder strbuider = new StringBuilder();
		Pessoa pessoa;
		strbuider.append("[");
		for(int i=0; i<this.object.size()-1;i++){
			pessoa = (Pessoa) this.object.get(i);
			strbuider.append(pessoa.getNome());
			strbuider.append(", "); 
		}
		pessoa = (Pessoa) this.object.get(this.object.size()-1);
		strbuider.append(pessoa.getNome());
		strbuider.append("]");
		
		return strbuider.toString();
	}

}
