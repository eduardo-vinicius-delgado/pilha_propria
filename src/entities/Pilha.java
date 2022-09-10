package entities;

public class Pilha {
	
	private int tamanho;
	private No primeiroNo = null;
	
	public void estaVazia() {
		if(primeiroNo == null) {
			System.out.println("Lista Vazia");
		}else{
			System.out.println("Lista Nao Vazia");
		}
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public void empilhar(int valor) {
		No novoNo = new No();
		novoNo.setValor(valor);
		if(primeiroNo == null) {
			primeiroNo = novoNo;
			novoNo.setProximoNo(null);
		}else {
			novoNo.setProximoNo(primeiroNo);
			primeiroNo = novoNo;
		}
		tamanho++;
	}
	
	public int desempilhar() {
		if(primeiroNo == null) {
			System.out.println("Pilha Vazia");
			return -9999;
		}else{
			No noAuxiliar  = primeiroNo;
			int dado = primeiroNo.getValor();
			primeiroNo = primeiroNo.getProximoNo();
			noAuxiliar = null;
			tamanho--;
			return dado;
		}		
	}
	
	public String mostrarPilha() {
		String retorno = "";
		No aux = primeiroNo;
		if(tamanho > 0) {
			for(int i = tamanho; i > 0 ; i--) {
				retorno += String.format("%d - ", i )
						+ aux.getValor()
						+ "\n";
				aux = aux.getProximoNo();		
			}
			return retorno;
		}else {
			return "Lista vazia";
		}
		
	}
	
}
