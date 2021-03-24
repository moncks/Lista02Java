package br.com.devinhouse.exercicio6;

public class Formado extends EstudanteGraduacao{
	private String dataDeConclusao;

	public Formado() {
		
	}
	
	public Formado(String nome, String sobrenome, int cpf, int matricula, String curso, String dataDeConclusao) {
		super(nome, sobrenome, cpf, matricula, curso);
		this.dataDeConclusao = dataDeConclusao;
	}

	public String getDataDeConclusao() {
		return dataDeConclusao;
	}

}
