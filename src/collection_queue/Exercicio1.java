package collection_queue;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		int opcao;
		String cliente;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("**************************************************");
			System.out.println("          1 - Adicionar Cliente na Fila");
			System.out.println("          2 - Listar Todos os Clientes");
			System.out.println("          3 - Chamar Próximo Cliente da Fila");
			System.out.println("          4 - Sair");
			System.out.println("**************************************************");
			System.out.println("Qual a Opção Desejada? ");
			opcao = leia.nextInt(); 
			
			
			switch(opcao) {
			case 1:
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.print("Informe o Nome do Cliente: ");
				cliente = leia.next();
				fila.add(cliente);
				break;
			case 2: 
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.println("Fila: \n" + fila);
				System.out.println("\n\n\n\n\n\n\n\n\n");
				break;
			case 3: 
				fila.poll();
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.println("Fila: \n" + fila);
				System.out.println("O Cliente foi Chamado.");
				break;
			case 4:
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.println("Programa Finalizado.");
				break;
				default: 
					System.out.println("\n\n\n\n\n\n\n\n\n");
					System.out.println("Opção Inválida!\nSelecione uma das opções abaixo.");
			}
		} while (opcao != 4);
		
	}
}
