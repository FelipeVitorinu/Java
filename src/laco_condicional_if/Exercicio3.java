package laco_condicional_if;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		String nome, resposta;
		int idade;
        boolean pd = true;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual seu nome completo?");
        nome = leia.nextLine();
        System.out.println("Qual a sua Idade?");
        idade = leia.nextInt();
        
        if(idade >= 60 && idade <= 69) {
        	System.out.println("Essa é a sua primeira doação? (Sim/Não)");
            resposta = leia.next();
        }else {
        	resposta = "Sim";
        }
        if(resposta == "Sim") {
    	   pd = true;
       }else {
    	   pd = false;
        }if(idade > 18 && idade < 60) {
    	   System.out.println(nome + " você está apto para doar sangue.");
       }else if(idade >= 60 && idade <= 69 && pd == false) {
    	   System.out.println(nome + " você está apto para doar sangue.");
       }else {
    	   System.out.println(nome + " você não está apto para doar sangue.");
       }
	}
}