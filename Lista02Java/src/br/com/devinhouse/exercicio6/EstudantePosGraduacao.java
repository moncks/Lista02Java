package br.com.devinhouse.exercicio6;

public class EstudantePosGraduacao extends Formado{
	private String especializacao, previsaoDeConclusao;
	
	public EstudantePosGraduacao() {
		
	}
	
	public EstudantePosGraduacao(String nome, String sobrenome, int cpf, int matricula, String curso, String dataDeConclusao, String especializacao,String previsaoDeConclusao) {
		super(nome, sobrenome, cpf, matricula, curso, dataDeConclusao);
		this.especializacao = especializacao;
		this.previsaoDeConclusao = previsaoDeConclusao;
	}
	
	
	public String getEspecializacao() {
		return especializacao;
	}
	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	public String getPrevisaoDeConclusao() {
		return previsaoDeConclusao;
	}
	public void setPrevisaoDeConclusao(String previsaoDeConclusao) {
		this.previsaoDeConclusao = previsaoDeConclusao;
	}

}
