package br.com.devinhouse.exercicio8a11;

public class GerenteRegional extends Gerente {
	private double extraBonus = 1000.00;

	public GerenteRegional(String nome, String sobrenome, String cpf, double salario, double bonus, String senha, int numFuncionarios) {
		super(nome, sobrenome, cpf, salario, bonus, senha, numFuncionarios);
	}
	
	@Override
	public double calcularBonificacao(double bonificacao) {
		bonificacao = salario * bonus;
		bonificacao += extraBonus;
		return bonificacao;
	}

}
