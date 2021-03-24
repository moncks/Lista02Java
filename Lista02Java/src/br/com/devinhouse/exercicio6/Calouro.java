package br.com.devinhouse.exercicio6;

public class Calouro extends EstudanteGraduacao {
	private String dataDeIngresso;

	public Calouro() {
		
	}
	
	public Calouro(String nome, String sobrenome, int cpf, int matricula, String curso, int semestre, String dataDeIngresso) {
		super(nome, sobrenome, cpf, matricula, curso, semestre);
		this.dataDeIngresso = dataDeIngresso;
		
	}

	public String getDataDeIngresso() {
		return dataDeIngresso;
	}
	
	

}
