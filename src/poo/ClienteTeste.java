package poo;

public class ClienteTeste {
	
		public static void main(String[] args) {
			Cliente cliente1 = new Cliente("João", "Rua Estados Unidos, 123", "joaodasilva123@hotmail.com", "(11) 91234-5678", 25);
			Cliente cliente2 = new Cliente("Maria", "Rua Alemanha, 321", "mariadasilva123@hotmail.com", "(11) 98765-4321", 21);
			
			cliente1.visualizar();
			System.out.println("");
			cliente2.visualizar();
		}
}
