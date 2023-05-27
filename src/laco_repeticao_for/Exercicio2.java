package laco_repeticao_for;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		int num = 0,contador,par = 0,impar = 0;
		Scanner ler = new Scanner(System.in);
		
		for(contador = 1; contador <= 10; contador++) {
			System.out.print("Digite o " + contador + "° Número:");
			num = ler.nextInt();
		if(num % 2 == 0) {
		par = par + 1;
		}else {
			impar = impar + 1;
		}
		}
		System.out.println("Total de Número Pares: "+ par);
		System.out.println("Total de Números Ímpares: "+ impar);
	}
}
