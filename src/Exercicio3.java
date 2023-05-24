import java.util.Scanner;

public class Exercicio3 {
	public static void main (String[] args) {
		float sb, an, he, d, sl;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Qual o seu Salário Bruto? ");
		sb = leia.nextFloat();
		System.out.println("Qual o valor do Adicional Noturno? ");
		an = leia.nextFloat();
		System.out.println("Qual o valor da Hora Extra?");
		he = leia.nextFloat();
		System.out.println("Qual o valor total de Descontos?");
		d = leia.nextFloat();
		
		sl = sb + an + (he * 5) - d;
		
		System.out.println("O Valor do seu Salário Líquido é de: " + sl);
		
	}
	

}
