package laco_condicional_switch;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		int cod;
		float sdc=1000.0f, vo= 0.0f, op=0.0f;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Seja Bem-Vindo!");
		System.out.print("Insira o Código da Operação Desejada: ");
		cod = ler.nextInt();
	    	switch(cod) {
			case 1: 
				op = sdc;
				System.out.println("Seu SALDO atual é de: " + sdc);
				System.out.println("Final da Sessão.");
				break;
			case 2: 
				System.out.println("***** SAQUE *****");
				System.out.println("Insira o valor do SAQUE: ");
				vo = ler.nextFloat();
				if(vo > sdc) {
					System.out.println("Saldo Insuficiente para Saque");
					System.out.println("Seu saldo é de: " + sdc);
				}else {
				op = sdc - vo;
				System.out.println("Saldo Anterior: " + sdc);
				System.out.println("Saldo Atual: " + op);
				System.out.println("Fim da Sessão.");
				}
				break;
			case 3:
				System.out.println("***** DEPÓSITO *****");
				System.out.println("Insira o valor do DEPÓSITO: ");
				vo = ler.nextFloat();
				op = sdc + vo;
				System.out.println("Saldo Anterior: " + sdc);
				System.out.println("Saldo Atual: " + op);
				System.out.println("Fim da Sessão.");
	    	break;
	    	default:
	    		System.out.println("Operação Inválida!");
	    	}
		}
}