package laco_condicional_switch;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		int cod, qtd;
		double vu, vt;
		String prod;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira o código do produto:");
		cod = ler.nextInt();
		System.out.println("Insira a quantidade desejada:");
		qtd = ler.nextInt();
		
		switch(cod) {
		case 1: 
			prod = "Cachorro Quente";
			vu = 10.00;
			break;
		case 2:
			prod = "X-Salada";
			vu = 15.00;
			break;
		case 3: 
			prod = "X-Bacon";
			vu = 18.00;
			break;
		case 4:
			prod = "Bauru";
			vu = 12.00;
			break;
		case 5:
			prod = "Refrigerante";
			vu = 8.00;
			break;
		case 6:
			prod = "Suco de Laranja";
			vu = 13.00;
			break;
			default: 
				System.out.println("Código do Produto Inválido");
			return;
		}
		
		vt = vu * qtd;
		
		System.out.println("Produto: " + prod);
		System.out.println("Valor total: " + vt);
	}
		
		
        
	}