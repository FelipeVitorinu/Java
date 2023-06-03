package poo;

public class Funcionario {
	private String nome;
	private String cargo;
	private int idade;
	private float salario;
	private String turno;
	
	public Funcionario(String nome, String cargo, int idade, float salario, String turno) {
		this.nome = nome;
		this.cargo = cargo;
		this.idade = idade;
		this.salario = salario;
		this.turno = turno;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public void visualizar() {
		System.out.println("Nome do Funcionário:" + nome);
		System.out.println("Cargo:" + cargo);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
		System.out.println("Turno: " + turno);
	}
}
