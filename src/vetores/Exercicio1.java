package vetores;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		int indice, numeroInserido, vetor[] = {2,5,1,3,4,9,7,8,10,6}; 
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o Número que você deseja encontrar: ");
		numeroInserido = ler.nextInt();
		
		for(indice = 0; indice <= 9; indice++) {
			if(vetor[indice] == numeroInserido) {
				System.out.println("O número " + numeroInserido + " Está Localizado na Posição: " + indice);
			}
		}
		if(numeroInserido > 9) {
			System.out.println("o Número " + numeroInserido + " Não Foi Encontrado!");
		}
	}
}
