import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		float n1, n2, n3, n4, dif;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Insira o Valor de N1: ");
		n1 = leia.nextFloat();
		System.out.println("Insira o Valor de N2: ");
		n2 = leia.nextFloat();
		System.out.println("Insira o Valor de N3: ");
		n3 = leia.nextFloat();
		System.out.println("Insira o Valor de N4: ");
		n4 = leia.nextFloat();
		
		dif = (n1 * n2) - (n3 * n4);
		System.out.println("A diferença entre os valores é de: " + dif);
				
	}

}
