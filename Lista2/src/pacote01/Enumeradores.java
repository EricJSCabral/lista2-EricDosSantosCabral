package pacote01;

public enum Enumeradores {
	DEBITAR(1), CREDITAR(2), SAIR(3);
	
	private int valor;
	
	Enumeradores (int valor){
		this.valor = valor;
	}
	
	public int getValor () {
		return this.valor;
	}
}


