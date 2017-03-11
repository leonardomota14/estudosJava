package br.com.leonardo.fila;

import java.util.LinkedList;
import java.util.List;

public class Fila<T> {
	private List<T> object = new LinkedList<T>(); 
	
	public void inserir(T t){
		this.object.add(t);
	}
	
	public void inserirNoInicio(T t){
		if(vazia()){
			this.object.add(0, t);
		}
		else{
			List<T> objectAux = new LinkedList<T>();
			objectAux.add(t);
			for(int i=0; i<this.object.size(); i++){
				objectAux.add(this.object.get(i));
			}
			this.object.clear();
			this.object = objectAux;
		}
	}
		
	public T remover(){
		if(vazia()){
			throw new IllegalArgumentException("A fila está vazia");
		}
		
		return this.object.remove(0);
	}
	
	public boolean vazia(){		
		return this.object.size()==0;
	}
	
}
