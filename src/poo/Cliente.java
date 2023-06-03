package poo;

public class Cliente {
	private String nome;
	private String endereço;
	private String email;
	private String telefone;
	private int idade;
	
	public Cliente(String nome, String endereço, String email, String telefone, int idade) {
		this.nome = nome;
		this.endereço = endereço;
		this.email = email;
		this.telefone = telefone;
		this.idade = idade;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void visualizar() {
		System.out.println("Nome: " + nome);
		System.out.println("Endereço: " + endereço);
		System.out.println("E-mail: " + email);
		System.out.println("Telefone: " + telefone);
		System.out.println("Idade: " + idade);
	
	}

}
