package laco_condicional_if;
import java.util.Scanner;

public class Exercício4 {
	public static void main(String[] args) {
		
        String class1, class2, class3 = "Hello World";
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Defina Class1: ");
		class1 = ler.next();
		System.out.println("Defina Class2: ");
		class2 = ler.next();
		System.out.println("Defina Class3: ");
		class3 = ler.next();
		
		if(class1.equalsIgnoreCase("Vertebrado") 
				&& (class2.equalsIgnoreCase("Ave") 
						&& (class3.equalsIgnoreCase("Carnívoro")))) {
			System.out.println("Águia");
		}else if(class1.equalsIgnoreCase("Vertebrado") 
				&& (class2.equalsIgnoreCase("Ave") 
						&& (class3.equalsIgnoreCase("Onívoro")))) {
			System.out.println("Pomba");
		}else if(class1.equalsIgnoreCase("Vertebrado") 
				&& (class2.equalsIgnoreCase("Mamifero") 
						&& (class3.equalsIgnoreCase("Onivoro")))) {
			System.out.println("Homem");
		}else if(class1.equalsIgnoreCase("Vertebrado") 
				&& (class2.equalsIgnoreCase("Mamifero") 
						&& (class3.equalsIgnoreCase("Herbivoro")))) {
			System.out.println("Vaca");
		}else if(class1.equalsIgnoreCase("Invertebrado") 
				&& (class2.equalsIgnoreCase("Inseto") 
						&& (class3.equalsIgnoreCase("Hematofago")))) {
			System.out.println("Pulga");
		}else if(class1.equalsIgnoreCase("Invertebrado") 
				&& (class2.equalsIgnoreCase("Inseto") 
						&& (class3.equalsIgnoreCase("Herbivoro")))) {
			System.out.println("Lagarta");
		}else if(class1.equalsIgnoreCase("Invertebrado") 
				&& (class2.equalsIgnoreCase("Anelideo") 
						&& (class3.equalsIgnoreCase("Hematofago")))) {
			System.out.println("Sanguessuga");
		}else if(class1.equalsIgnoreCase("Invertebrado") 
				&& (class2.equalsIgnoreCase("Anelideo") 
						&& (class3.equalsIgnoreCase("Onivoro")))) {
			System.out.println("Minhoca");
		}else {
			System.out.println("Informação Incorreta!");
		}
	}
}

