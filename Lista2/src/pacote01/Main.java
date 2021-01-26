package pacote01;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		float gasto1, credito1;
		int opcao;
		Enumeradores escolha;
		LocalDate data;
		LocalTime hora;
		
		Moeda saldo1 = new Moeda("1000.00");
		
		do {	
			System.out.println("Seu saldo atual é igual a: " + 
					saldo1.getValorFormatado()); //Big Decimal
			
			System.out.println("Qual operação você planeja fazer? \n "
					+ "1-DEBITAR, 2-CREDITAR, 0-SAIR");
			opcao = input.nextInt();
			
			switch (opcao) {
			case 1:
				escolha = Enumeradores.DEBITAR;
				
				System.out.println("Você escolhou a opcao " + escolha.getValor() + " - "
						+ escolha.toString());
			
				System.out.println("O valor do gasto é de: ");
				gasto1 = input.nextFloat();
				
				data = LocalDate.now(); //Utilizando Local Date para data atual
				hora = LocalTime.now(); //Utilizando Local Time para hora atual
				
				System.out.println("Você gastou R$ " + gasto1 + " em " + data + " às " + hora);
				String gasto = String.valueOf(gasto1); //Utilizando Strings
				saldo1.subtrair(gasto); 
			break;
			
			case 2:
				
				escolha = Enumeradores.CREDITAR; //Utilizando Enumeradores
				
				System.out.println("Você escolhou a opcao " + escolha.getValor() + " - "
						+ escolha.toString());
				
				System.out.println("O valor do cŕedito é de: ");
				credito1 = input.nextFloat();
				
				data = LocalDate.now();
				hora = LocalTime.now();
				
				System.out.println("Você acrescentou R$ " + credito1 + " em " + data + " às "
				+ hora);
				String credito = String.valueOf(credito1);
				
				saldo1.somar(credito);
			break;
			
			default:
			escolha = Enumeradores.SAIR;
			
			System.out.println("Você escolhou a opcao " + escolha.getValor() + " - "
					+ escolha.toString());
			}
		
		} while (opcao == 1 || opcao == 2);
		System.out.println("O Saldo atual de seu orçamento é: " + saldo1.getValorFormatado());

	}
}

	