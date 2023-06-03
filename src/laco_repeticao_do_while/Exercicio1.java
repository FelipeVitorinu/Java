package laco_repeticao_do_while;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		int numero, soma=0;
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("Digite um Número (Ou 0 para Somar os Positivos)");
			numero = ler.nextInt();
			if(numero > 0);
			soma += numero;
			
	}while(numero != 0);
		System.out.println("A soma dos número positivos é: "+soma);
}
}