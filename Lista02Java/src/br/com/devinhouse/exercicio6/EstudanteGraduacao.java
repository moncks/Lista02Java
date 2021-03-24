package br.com.devinhouse.exercicio6;

public class EstudanteGraduacao extends Estudante {

	private String curso;
	private int semestre;

	public EstudanteGraduacao() {

	}

	public EstudanteGraduacao(String nome, String sobrenome, int cpf, int matricula, String curso) {
		super(nome, sobrenome, cpf, matricula);
		this.curso = curso;
	}

	public EstudanteGraduacao(String nome, String sobrenome, int cpf, int matricula, String curso, int semestre) {
		super(nome, sobrenome, cpf, matricula);
		this.curso = curso;
		this.semestre = semestre;

	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

}
