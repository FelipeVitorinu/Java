package laco_repeticao_while;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		int idade,maior = 0, menor = 0;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite uma Idade: ");
		idade = ler.nextInt();
		
		while(idade > 0) {
			if(idade < 21) {
				menor = menor + 1;
			}else if(idade > 50) {
				maior = maior + 1;
			}	
			System.out.print("Digite uma Idade: ");
			idade = ler.nextInt();
			
			}
		System.out.println("Total de Pessoas Menores de 21: " + menor);
		System.out.println("Total de Pessoas Maiores de 50: " + maior);
		}
	}

