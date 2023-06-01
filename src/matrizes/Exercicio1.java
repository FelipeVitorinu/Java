package matrizes;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		int i, j, soma1 = 0 , soma2 = 0, matriz[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		
		System.out.println("Os Elementos da Diagonal Principal São: ");
		for(i = 0;i<3;i++) {
			for(j=0;j<3;j++) {
				if(i == j) {
					soma1 += matriz[i][j];
					System.out.println(matriz[i][j]);
				}
			}
	}
		System.out.println("Os Elementos da Diagonal Secundária São: ");
		for(i=0;i<3;i++) {
			for(j=2;j>-1;j--) {
				soma2 += matriz[i][j];
				System.out.println(matriz[i][j]);
				i++;
			}
		}
		System.out.println("A Soma dos Elementos da Diagonal Principal é: " + soma1);
		System.out.println("A Soma dos Elementos da Diagonal Secundária é: " + soma2);

}
}
