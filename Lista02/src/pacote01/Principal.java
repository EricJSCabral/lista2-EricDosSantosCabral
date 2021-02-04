package pacote01;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Principal {

    public static void main(String[] args) {
     
    	//Instanciando objeto salário.
      Orcamento salario = new Orcamento(LocalDateTime.now(), "Salário", TipoTransacao.RECEITA, new BigDecimal("3000")); 
      BigDecimal saldo = salario.getValor();

      salario.status();
      System.out.println("Saldo Inicial: R$ " + saldo);
      
         	
    	
      //instanciando o objeto supermercado e atribuindo valores pelos métodos setters.
      Orcamento mercado = new Orcamento(LocalDateTime.now(), "Gastos com a compra do mês no mercado Extra", TipoTransacao.DESPESA, 
    		  new BigDecimal("500.00") );  
      saldo = saldo.subtract(mercado.getValor());
      mercado.status();
      System.out.println("Seu saldo atual é: R$ " + saldo);
            
      //instnaciando objeto ContaLuz
      Orcamento contaLuz = new Orcamento(LocalDateTime.now(),"Pagamento da conta de Luz", TipoTransacao.DESPESA, new BigDecimal("150.00"));    
      saldo = saldo.subtract(contaLuz.getValor());
      contaLuz.status();
      System.out.println("Seu saldo atual é: R$ " + saldo);
     

    }
    
  

}
