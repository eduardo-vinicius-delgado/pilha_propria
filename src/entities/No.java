package entities;

public class No {
	private int valor;
	private No proximoNo;
	
	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public No getProximoNo() {
		return proximoNo;
	}
	
	public void setProximoNo(No proximoNo) {
		this.proximoNo = proximoNo;
	}
	
}
