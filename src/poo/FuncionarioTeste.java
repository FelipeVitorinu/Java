package poo;

public class FuncionarioTeste {
	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario("Pedro", "Auxiliar Administrativo", 20, 2000.0f,"Diurno/Estágio");
		Funcionario funcionario2 = new Funcionario("Jaime", "Supervisor de Operações", 32, 4700.0f,"Integral");
		
		funcionario1.visualizar();
		System.out.println("");
		funcionario2.visualizar();
	}
}
