package laco_condicional_switch;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		int op;
		float n1, n2, vt=0.0f;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("(1)Soma\n(2)Subtração\n(3)Multiplicação\n(4)Divisão\nEscolha o numero da Operação:");
		op = ler.nextInt();
		System.out.print("Digite o Número 1: ");
		n1 = ler.nextFloat();
		System.out.print("Digite o Número 2: ");
		n2 = ler.nextFloat();
		
		switch(op) {
		case 1: 
			vt = n1 + n2;
			break;
		case 2:
			vt = n1 - n2;
			break;
		case 3:
			vt = n1 * n2;
			break;
		case 4:
			vt = n1 / n2;
			break;
			default: 
				System.out.println("Código da Operação Inválido!");
		}
		
		System.out.println("O Resultado é: "+vt);
	}
	

}
