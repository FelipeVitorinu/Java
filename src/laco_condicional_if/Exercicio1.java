package laco_condicional_if;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
        int A, B, C;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite o valor de A:");
		A = ler.nextInt();
		
		System.out.println("Digite o valor de B:");
		B = ler.nextInt();
		
		System.out.println("Digite o valor de C:");
		C = ler.nextInt();
		
		if(A + B > C) {
			System.out.println("A Soma de A + B é maior que C.");
		}else if(A + B < C) {
			System.out.println("A Soma de A + B é menor que C.");
		}else if (A + B == C){
			System.out.println("A Soma de A + B é igual a C.");
		}
			
		
	}
		
		

	}


