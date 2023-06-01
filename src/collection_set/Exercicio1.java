package collection_set;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exercicio1 {
	public static void main(String[] args) {
		int num, i;
		Scanner ler = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();
		
		for(i=0;i<10;i++) {
			System.out.print("Digite um Número: ");
			numeros.add(num = ler.nextInt());
		}
		
		Iterator<Integer> iNum = numeros.iterator();
		System.out.println("\n\nListar os Dados do Set: ");
		while(iNum.hasNext()) {
			System.out.println(iNum.next());
		}
	}

}
