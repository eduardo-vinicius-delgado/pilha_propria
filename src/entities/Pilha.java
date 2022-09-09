package entities;

public class Pilha {
	
	private int tamanho;
	private No primeiroNo = null;
	
	public boolean estaVazia() {
		if(primeiroNo == null) {
			return true;
		}else{
			return false;
		}
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	private void acrescentarTamanho() {
		tamanho++;
	}
	
	private void reduzirTamanho() {
		tamanho--;
	}
	
	public void mostrarPilha(){
		if(primeiroNo == null) {
			System.out.println("Vazia");
		}else{	
			No no = new No();
			no = primeiroNo;
			while(no != null) {
				System.out.println(no.getValor());
				no = no.getProximoNo();
			}
		}	
	}
	
	public int empilhar(int valor) {
		No novoNo = new No();
		novoNo.setValor(valor);
		if(primeiroNo == null) {
			primeiroNo = novoNo;
			novoNo.setProximoNo(null);
		}else {
			novoNo.setProximoNo(primeiroNo);
			primeiroNo = novoNo;
		}
		acrescentarTamanho();
		return 1;
	}
	
	public int desempilhar() {
		if(primeiroNo == null) {
			reduzirTamanho();
			return -1;
		}else{
			No noAuxiliar  = primeiroNo;
			int dado = primeiroNo.getValor();
			primeiroNo = primeiroNo.getProximoNo();
			noAuxiliar.setProximoNo(null);
			reduzirTamanho();
			return dado;
		}		
	}
	
	public int mostrarValor(int posicao) {
		No noAuxiliar = primeiroNo;
		for(int i = 0; i < posicao ; i++) {
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		return noAuxiliar.getValor();
	}
	
}
