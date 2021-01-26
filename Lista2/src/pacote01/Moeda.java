package pacote01;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Moeda {
	
	private BigDecimal valor;
	private static final String UNIDADE_MONETARIA = "R$";
	private static final DecimalFormat FORMATO = 
			new DecimalFormat (UNIDADE_MONETARIA + " #,###,##0.00");
	
	public Moeda(String valor) {
		this.valor = new BigDecimal(valor);
	}
	
	public void somar(String valorASomar) {
		this.valor = this.valor.add(new BigDecimal(valorASomar));
	}
	
	public void subtrair(String valorASubtrair) {
		this.valor = this.valor.subtract(new BigDecimal(valorASubtrair));
	}
	public void multiplicar(String valorAMultiplicar) {
		this.valor = this.valor.multiply(new BigDecimal(valorAMultiplicar));
	}
	
	public void dividir(BigDecimal valorADividir) {
		if (valorADividir.compareTo(BigDecimal.ZERO) == 0) {
			System.out.println("Não é possível dividir por 0");
		} else {
		this.valor = this.valor.divide(valorADividir, 2, RoundingMode.HALF_EVEN);
		}
	}
	
	public BigDecimal getValor() {	
		return valor;
	}
	
	public String getValorFormatado() {
		return FORMATO.format(valor);
	}
}