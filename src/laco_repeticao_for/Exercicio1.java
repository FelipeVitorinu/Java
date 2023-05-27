package laco_repeticao_for;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		int intervalo1=0, intervalo2=0, contador;
		boolean res1 = true, res2 = true;
		
	Scanner leia = new Scanner(System.in);
	
	System.out.print("Digite o primeiro número do intervalo: ");
	intervalo1 = leia.nextInt();
	System.out.print("Digite o último número do intervalo: ");
	intervalo2 = leia.nextInt();
	
	if(intervalo1 > intervalo2) {
		System.out.println("Intervalo Inválido!");
	}else{ for (contador = intervalo1; contador <= intervalo2; contador++) {
	if((contador % 3 == 0) && (contador % 5 == 0) && (contador != 0)) {
		System.out.println(contador + " é múltiplo de 3 e 5.");
}
}
	}
	}
}




