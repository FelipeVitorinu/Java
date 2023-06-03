package laco_repeticao_while;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int idade = 0, sexo = 0, categoria = 0;
		int contadorBackEnd = 0;
		int contadorMulheresFrontEnd = 0;
		int contadorHomensMobile40 = 0;
		int contadorMulheresFullstack30 = 0;
		int continuar = 1;
		
		while(continuar == 1) {
			System.out.println("Informe a sua idade: ");
		    idade = ler.nextInt();
			System.out.println("Informe o sexo: ");
			sexo = ler.nextInt();
			if(sexo > 3) {
				System.out.println("Opção de SEXO não confere. Começe Novamente!");
			}
			System.out.println("Informe a sua categoria: ");
			categoria = ler.nextInt();
			if(categoria > 4) {
				System.out.println("Opção de CATEGORIA não confere. Começe Novamente!");
			}
			System.out.println("");
			System.out.println("Deseja Continuar?\n(1) Sim\n(2) Não");
			continuar = ler.nextInt();
		
			if(categoria == 1) {
				contadorBackEnd++;
			}if(categoria == 2 && sexo == 2) {
				contadorMulheresFrontEnd++;
			}if(categoria == 3 && sexo == 1 && idade > 40) {
				contadorHomensMobile40++;
			}if(categoria == 4 && sexo == 2 && idade < 30) {
				contadorMulheresFullstack30++;
			}
		}
		System.out.println("Número de Pessoas Desenvolvedoras Backend: " + contadorBackEnd);
		System.out.println("Número de Mulheres Desenvolvedoras Frontend: " + contadorMulheresFrontEnd);
		System.out.println("Número de Homens Desenvolvedores Mobile maiores de 40 anos: " + contadorHomensMobile40);
		System.out.println("Número de Mulheres Desenvolvedoras Fullstack menores de 30 anos: " + contadorMulheresFullstack30);
}
}
