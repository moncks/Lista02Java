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
				"Vendas", this.vendasBrutas, "Comissão", this.taxaComissao,"Ganhos",this.ganhos()));
	}
	
	
	

}

/*
Crie uma subclasse FuncionarioComissionado que estende a classe Funcionario. 
Essa nova subclasse deve possuir os atributos: vendas brutas (double) e taxa de comissão (double). 
Faça métodos getters e setters para esses atributos. 
Valide os atributos: vendas brutas não pode ser negativo, 
já a taxa de comissão deve ser um valor entre 0.0 e 1.0. 
Faça um construtor que reaproveite o construtor da superclasse e recebe como argumentos: 
nome, sobrenome, CPF, vendas brutas e taxa de comissão. 
Sobrescreva o método toString da superclasse, invocando-o e adicionando os atributos da subclasse. 
Escreva também um método "ganhos" para calcular os rendimentos de um funcionário comissionado, 
que segue a fórmula: taxa * vendas.
*/