package br.com.devinhouse.exercicios16e17;

public class FuncionarioComissionado extends Funcionario {
	private double vendasBrutas, taxaComissao;

	public FuncionarioComissionado(String nome, String sobrenome, String cpf, double vendasBrutas, double taxaComissao) {
		super(nome, sobrenome, cpf);
		if(vendasBrutas < 0) {
			this.vendasBrutas = 0;
		}
		this.vendasBrutas = vendasBrutas;
		
		if(taxaComissao > 0 && taxaComissao < 1) {
			this.taxaComissao = taxaComissao;
		}
	}

	public double getVendasBrutas() {
		return vendasBrutas;
	}

	public void setVendasBrutas(double vendasBrutas) {
		this.vendasBrutas = vendasBrutas;
	}

	public double getTaxaComissao() {
		return taxaComissao;
	}

	public boolean setTaxaComissao(double taxaComissao) {
		if(taxaComissao < 0 || taxaComissao > 1) {
			return false;
		}
		this.taxaComissao = taxaComissao;
		return true;
	}
	
	public double ganhos() {
		return taxaComissao * vendasBrutas;
	}
	
	@Override
	public String toString() {
		return (super.toString() + String.format("%n%s: %.2f %n%s: %.2f %n%s: %.2f",
				"Vendas", this.vendasBrutas, "Comiss�o", this.taxaComissao,"Ganhos",this.ganhos()));
	}
	
	
	

}

/*
Crie uma subclasse FuncionarioComissionado que estende a classe Funcionario. 
Essa nova subclasse deve possuir os atributos: vendas brutas (double) e taxa de comiss�o (double). 
Fa�a m�todos getters e setters para esses atributos. 
Valide os atributos: vendas brutas n�o pode ser negativo, 
j� a taxa de comiss�o deve ser um valor entre 0.0 e 1.0. 
Fa�a um construtor que reaproveite o construtor da superclasse e recebe como argumentos: 
nome, sobrenome, CPF, vendas brutas e taxa de comiss�o. 
Sobrescreva o m�todo toString da superclasse, invocando-o e adicionando os atributos da subclasse. 
Escreva tamb�m um m�todo "ganhos" para calcular os rendimentos de um funcion�rio comissionado, 
que segue a f�rmula: taxa * vendas.
*/