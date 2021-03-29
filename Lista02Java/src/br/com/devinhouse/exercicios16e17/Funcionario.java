package br.com.devinhouse.exercicios16e17;

public class Funcionario {
	private String nome, sobrenome, cpf;

	public Funcionario(String nome, String sobrenome, String cpf) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return String.format("%n%s: %s %s %n%s: %s",
				"Nome do funcionário", this.getNome(), this.getSobrenome(),
				"CPF", this.getCpf());
	}

}
/*
Crie uma superclasse Funcionario contendo os atributos: 
nome (String), sobrenome (String), CPF (String). 
Faça métodos getters e setters para esses atributos, 
bem como um construtor para a classe. 
Faça também um método toString que retorna uma string contendo os dados do funcionário. 
*/