package desafio.projeto.dio;

import services.Conta;
import services.ContaCorrente;
import services.ContaPoupanca;

public class Main {
	
	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta poupanca = new ContaPoupanca();
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
