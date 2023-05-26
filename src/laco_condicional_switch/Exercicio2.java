package laco_condicional_switch;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		String nome, car = "";
		int cod;
		float sal, rea = 0.0f;
		double ns;
		
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Qual seu nome completo: ");
		nome = ler.nextLine();
		System.out.print("Insira o código do seu cargo: ");
		cod = ler.nextInt();
		System.out.print("Insira seu salário atual: ");
		sal = ler.nextFloat();
		
		switch(cod) {
		case 1: 
			car = "Gerente";
			rea = 0.10f;
			break;
		case 2: 
			car = "Vendedor";
			rea = 0.7f;
			break;
		case 3:
			car = "Supervisor";
			rea = 0.9f;
		case 4:
			car = "Motorista";
			rea = 0.6f;
			break;
		case 5:
			car = "Estoquista";
			rea = 0.5f;
			break;
		case 6:
			car = "Técnico de TI";
			rea = 0.8f;
			break;
			default:
				System.out.println("Código Inválido!");
		}
		
		ns = sal + (rea * sal);
		
		System.out.println(nome);
		System.out.println(car);
		System.out.println("Seu novo salário é: " + ns);
		
			
		}
}

