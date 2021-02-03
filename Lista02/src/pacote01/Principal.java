package pacote01;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Principal {

    public static void main(String[] args) {
     
    	//Instanciando objeto salário.
      Orcamento salario = new Orcamento(); 
      salario.setData(LocalDateTime.now());
      salario.setDescricao("Salário");
      salario.setTipo(TipoTransacao.RECEITA);
      salario.setValor(new BigDecimal("3000.00"));
      
      System.out.println("\nTipo: " + salario.getTipo() + "\nDescrição: " + salario.getDescricao() +
      		   " - R$: " + salario.getValor() + " Em: " + salario.getData());
      
      BigDecimal saldo = salario.getValor(); //saldo inicial = valor do salário
      System.out.println("Saldo Inicial: R$ " + saldo);
    	
    	
      //instanciando o objeto supermercado e atribuindo valores pelos métodos setters.
      Orcamento mercado = new Orcamento();  
      mercado.setData(LocalDateTime.now());
      mercado.setDescricao("Gastos com a compra do mês no mercado Extra");
      mercado.setTipo(TipoTransacao.DESPESA);
      mercado.setValor(new BigDecimal("500.00"));
      
      saldo = saldo.subtract(mercado.getValor());

      System.out.println("\nTipo: " + mercado.getTipo() + "\nDescrição: " + mercado.getDescricao() +
    		   " - R$: " + mercado.getValor() + " Em: " + mercado.getData());
      
      System.out.println("Seu saldo atual é: R$ " + saldo);
      
      //instnaciando objeto ContaLuz
      Orcamento contaLuz = new Orcamento();
      contaLuz.setData(LocalDateTime.now());
      contaLuz.setDescricao("Pagamento da conta de Luz");
      contaLuz.setTipo(TipoTransacao.DESPESA);
      contaLuz.setValor(new BigDecimal("150.00"));
      
      saldo = saldo.subtract(contaLuz.getValor());
      
      System.out.println("\nTipo: " + contaLuz.getTipo() + "\nDescrição: " + contaLuz.getDescricao() +
   		   " - R$: " + contaLuz.getValor() + " Em: " + contaLuz.getData());
     
     System.out.println("Seu saldo atual é: R$ " + saldo);

    }

}
