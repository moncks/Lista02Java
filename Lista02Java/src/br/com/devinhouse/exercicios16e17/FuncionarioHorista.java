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
				"Sal�rio hora", this.salario, "Sal�rio", this.ganhos()));
	}

}
/*
 * Crie uma classe FuncionarioHorista, que � herdada da classe Funcionario do
 * exerc�cio anterior, e tem vari�veis de inst�ncia horas (double), que
 * representa as horas trabalhadas, e salario (double), que representa os
 * sal�rios por hora, al�m de um construtor que recebe como argumentos primeiro
 * nome, sobrenome, CPF, sal�rio por hora e n�mero de horas trabalhadas, m�todos
 * set e get para manipular horas e salario, um m�todo ganhos para calcular os
 * rendimentos de um funcion�rio horista com base nas horas trabalhadas e um
 * m�todo toString que retorna a representa��o String de FuncionarioHorista.
 * 
 * Assegure que salario n�o seja negativo, e que o valor das horas esteja entre
 * 0 e 168 (o n�mero total de horas em uma semana).
 */