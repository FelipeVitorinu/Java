package laco_condicional_if;
import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Dê um valor para X:");
		x = leia.nextInt();
		
		if(x > 0) {
		 if(x % 2 == 0) {
			 System.out.println("O valor é PAR e POSITIVO!");
		 } else {
			 System.out.println("O valor é ÍMPAR e POSITIVO!");
		 }
		}
		if(x < 0) {
			if(x % 2 == 0) {
				 System.out.println("O valor é PAR e NEGATIVO!");
			 } else {
				 System.out.println("O valor é ÍMPAR e NEGATIVO!");
			 }	
		}
		
	
	}

}
