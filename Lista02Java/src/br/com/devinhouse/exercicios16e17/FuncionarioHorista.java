package br.com.devinhouse.exercicios16e17;

public class FuncionarioHorista extends Funcionario {
	public double horas, salario;

	public FuncionarioHorista(String nome, String sobrenome, String cpf, double horas, double salario) {
		super(nome, sobrenome, cpf);
		if (horas >= 0 && horas <= 168) {
			this.horas = horas;
		}
		//this.horas = horas;
		if (salario > 0) {
			this.salario = salario;
		}
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		if (horas >= 0 && horas <= 168) {
			this.horas = horas;
		}
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if (salario > 0) {
			this.salario = salario;
		}

	}

	public double ganhos() {
		return salario * horas;
	}

	@Override
	public String toString() {
		return (super.toString() + String.format("%n%s: %.2f %n%s: %.2f %n%s: %.2f", "Horas trabalhadas", this.horas,
				"Salário hora", this.salario, "Salário", this.ganhos()));
	}

}
/*
 * Crie uma classe FuncionarioHorista, que é herdada da classe Funcionario do
 * exercício anterior, e tem variáveis de instância horas (double), que
 * representa as horas trabalhadas, e salario (double), que representa os
 * salários por hora, além de um construtor que recebe como argumentos primeiro
 * nome, sobrenome, CPF, salário por hora e número de horas trabalhadas, métodos
 * set e get para manipular horas e salario, um método ganhos para calcular os
 * rendimentos de um funcionário horista com base nas horas trabalhadas e um
 * método toString que retorna a representação String de FuncionarioHorista.
 * 
 * Assegure que salario não seja negativo, e que o valor das horas esteja entre
 * 0 e 168 (o número total de horas em uma semana).
 */