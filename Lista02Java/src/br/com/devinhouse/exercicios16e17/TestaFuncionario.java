package br.com.devinhouse.exercicios16e17;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("pessoa1", "sobrenome 1", "123");
		FuncionarioComissionado fc = new FuncionarioComissionado("Pessoa 2", "Comissão", "124", 100, 0.5);
		FuncionarioHorista fh = new FuncionarioHorista("Pessoa 3", "Horista", "125", 169, 5.5);

		System.out.println(f1.toString());
		System.out.println(fc.toString());
		System.out.println(fh.toString());

		fc.setTaxaComissao(0.6);

		System.out.println(fc.toString());

		fc.setTaxaComissao(6);

		System.out.println(fc.toString());
		
		fh.setHoras(168);
		fh.setSalario(15.5);
		System.out.println(fh.toString());
	}

}
