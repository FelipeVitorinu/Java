import java.util.Scanner;

public class Exercicio2 {
	

        public static void main (String[] args) {
		
		float nota1, nota2, nota3, nota4, media;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Insira a Nota 1: ");
		nota1 = leia.nextFloat();
		System.out.println("Insira a Nota 2: ");
		nota2 = leia.nextFloat();
		System.out.println("Insisra a Nota 3: ");
		nota3 = leia.nextFloat();
		System.out.println("Insira a Nota 4: ");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println("Sua média é: " + media);
	
	}

}
