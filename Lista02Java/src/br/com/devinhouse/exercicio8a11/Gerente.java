package br.com.devinhouse.exercicio8a11;

public class Gerente extends Funcionario {
	private String senha;
	private int numFunciononarios;

	public Gerente(String nome, String sobrenome, String cpf, double salario, double bonus, String senha, int numFuncionarios) {
		super(nome, sobrenome, cpf, salario, bonus);
		this.senha = senha;
		this.numFunciononarios = numFuncionarios;
		
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getNumFunciononarios() {
		return numFunciononarios;
	}

	public void setNumFunciononarios(int numFunciononarios) {
		this.numFunciononarios = numFunciononarios;
	}
	
	@Override
	public void setBonus(double bonus) {
		this.bonus = bonus;
		
	}
	
	@Override
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