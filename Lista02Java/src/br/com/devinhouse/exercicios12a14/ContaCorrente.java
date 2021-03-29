package br.com.devinhouse.exercicios12a14;

public class ContaCorrente extends Conta {

	public ContaCorrente(String nomeDoTitular, int numero, int agencia, double saldo, double limite, String dataDeAbertura) {
		super(nomeDoTitular, numero, agencia, saldo, limite, dataDeAbertura);
	}
	
	@Override
	public boolean sacar(double valor) {
		valor = 0.10;
		if(this.saldo - valor <= this.getSaldoComLimite() && this.saldo - valor > this.limite * -(1)) {
			 this.saldo -= valor;
			 System.out.printf("%nO valor de R$%.2f foi sacado com sucesso!%n", valor);
			 return true;
		}
		System.out.printf("%nSaldo insuficiente! R$%.2f %n", valor);
		return false;
	}
	
	@Override
	public String getTipo() {
		return "Conta Corrente";
	}
}
	

/*
Utilizando o projeto de Sistema Bancário dos exercícios da semana passada, 
crie a subclasse ContaCorrente, 
herdando da classe Conta. 
Na classe ContaCorrente, sobrescreva o método sacar 
para invocar o método da superclasse 
e adicionalmente retirar R$0,10 do saldo.
*/