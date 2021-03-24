package br.com.devinhouse.exercicio6;

public class Estudante {
	private String nome, sobrenome;
	private int cpf, matricula;
	
	public Estudante() {
		
	}
	
	public Estudante(String nome, String sobrenome, int cpf, int matricula) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.matricula = matricula;
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

	public int getCpf() {
		return cpf;
	}

	public int getMatricula() {
		return matricula;
	}
	
	
}
