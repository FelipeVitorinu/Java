package collection_arraylist;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Exercicio1 {
	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<String>();
		Scanner ler = new Scanner(System.in);
		String cor;
		
		
		for(int contador=0;contador<5;contador++) {
			System.out.print("Insira uma Cor: ");
			cores.add(cor= ler.next());
		}
		System.out.println("\nListar todas as Cores: \n");
		for(String color : cores) {
			System.out.println(color);
		}
		System.out.println("\nOrdenas as Cores: \n");
		Collections.sort(cores);
		for(String color : cores) {
			System.out.println(color);
		}
	}
	
}
