package application;

import entities.Pilha;

public class Main {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
	}
	
	private static void apresentarVazia(Pilha pilha) {
		if(pilha.estaVazia() == true) {
			System.out.println("A lista está vazia");
		}else{
			System.out.println("A lista não está vazia");
		}
	}
	
	private static void mostrarTamanho(Pilha pilha) {
		System.out.println("Tamanho da lista: " + pilha.getTamanho());
	}

	private static void checarIncremento(Pilha pilha, int valor) {
		if(pilha.empilhar(valor) == 1) {
			System.out.println("No inserido com sucesso.");
		}
	}
	
	private static void checarReducao(Pilha pilha) {
		if(pilha.desempilhar() == 0) {
			System.out.println("Lista vazia");
		}else{
			System.out.println("No removido com sucesso.");
		}
	}
	
	private static void checarPosicao(Pilha pilha, int posicao) {
		if(posicao >= pilha.getTamanho() || posicao<0) {
			System.out.println("Posição inválida");
		}else {
			System.out.println("Posição: " + posicao + " -> Valor: " + pilha.mostrarValor(posicao));
		}
	}
	
}
