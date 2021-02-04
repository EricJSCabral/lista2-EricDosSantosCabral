package pacote01;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Orcamento {
    private LocalDateTime data;
    private BigDecimal valor;
    private String descricao;
    private TipoTransacao tipo;
    
    public Orcamento(LocalDateTime d, String s, TipoTransacao t, BigDecimal v) {
    	   this.setData(d);
    	   this.setDescricao(s);
    	   this.setTipo(t);
    	   this.setValor(v);
    }

    public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor; 
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoTransacao getTipo() {
		return tipo;
	}

	public void setTipo(TipoTransacao tipo) {
		this.tipo = tipo;
	}

	public void status() {
		System.out.println("\nTipo: " + this.getTipo());
		System.out.println("Descrição: " + this.getDescricao());
	    System.out.println("R$: " + this.getValor() + " Em: " + this.getData());
	}


}
