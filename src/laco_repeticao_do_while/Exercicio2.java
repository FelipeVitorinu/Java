package laco_repeticao_do_while;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		int numero, contador=0, soma=0;
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número: ");
			numero = ler.nextInt();
			
			if(numero %3 == 0 && numero != 0) {
				contador++;
			}
			if(numero %3 == 0) {
				soma = soma + numero;
			}
		}while(numero != 0);
		
		System.out.println("A Média Entre os Números Divisíveis por 3 é: " + (soma/contador));
	}
	
}
