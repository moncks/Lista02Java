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
Incremente ainda mais as classes do exercício anterior (Funcionário e Gerente)
criando um método para calcular a bonificação dos funcionários do banco.
  
A bonificação padrão é de 10% do salário, portanto o método da superclasse deve retornar esse valor. 
  
Sobrescreva esse método na classe Gerente, alterando o cálculo para 15% do salário.
*/