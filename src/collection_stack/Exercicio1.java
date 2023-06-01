package collection_stack;
import java.util.Stack;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Stack<String> pilha = new Stack<>();
		int opcao;
		String livro;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("**************************************************");
			System.out.println("          1 - Adicionar Livro na Pilha");
			System.out.println("          2 - Listar Todos os Livros");
			System.out.println("          3 - Retirar Livro da Pilha");
			System.out.println("          4 - Sair");
			System.out.println("**************************************************");
			System.out.println("Qual a Opção Desejada? ");
			opcao = leia.nextInt(); 
			leia.nextLine();
			
			
			switch(opcao) {
			case 1:
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.print("Informe o Nome do Livro: ");
				livro = leia.nextLine();
				pilha.push(livro);
				System.out.println("Livro Adicionado a Pilha.");
				break;
			case 2: 
				System.out.println("\n\n\n\n\n\n\n\n\n");
				System.out.println("Pilha: \n" + pilha);
				System.out.println("\n\n\n\n\n\n\n\n\n");
				break;
			case 3: 
				if(pilha.isEmpty()) {
					System.out.println("Sem Livros na Pilha!");
				}else {
					    pilha.pop();
						System.out.println("\n\n\n\n\n\n\n\n\n");
						System.out.println("Pilha: \n" + pilha);
						System.out.println("O Livro foi Retirado da Pilha.");
				}break;
			case 4:
				System.out.println("\n\n\n\n\n\n\n\n\n");
				System.out.println("Programa Finalizado.");
				break;
				default: 
					System.out.println("\n\n\n\n\n\n\n\n\n");
					System.out.println("Opção Inválida!\nSelecione uma das opções abaixo."); 
			}
		} while (opcao != 4);
	}
}
