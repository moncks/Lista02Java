package br.com.devinhouse.exercicio8a11;

public class Funcionario {
	private String nome, sobrenome, cpf;
	protected double salario, bonus = 10;

	public Funcionario() {
		}
	
	public Funcionario(String nome, String sobrenome, String cpf, double salario, double bonus) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.salario = salario;
		this.bonus = bonus;
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getBonus() {
		bonus = bonus/100;
		return bonus;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double calcularBonificacao(double bonificacao) {
		bonificacao = salario * bonus;
		return bonificacao;
	}
	
	

}
/*
Incremente ainda mais as classes do exerc�cio anterior (Funcion�rio e Gerente)
criando um m�todo para calcular a bonifica��o dos funcion�rios do banco.
  
A bonifica��o padr�o � de 10% do sal�rio, portanto o m�todo da superclasse deve retornar esse valor. 
  
Sobrescreva esse m�todo na classe Gerente, alterando o c�lculo para 15% do sal�rio.
*/