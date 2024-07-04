package br.com.estudo.heranca;

public class ContaPoupanca extends ContaBancaria implements OperacoesBancarias{

	private Double rendimento;
	
	public String abrirConta(String nb,String na,String nc,String ti,Double sa, Double re) {
		super.numeroBanco = nb;
		super.numeroAgencia = na;
		super.numeroConta = nc;
		super.titular = ti;
		super.saldo = sa;
		this.rendimento = re;
		return "Conta poupança aberta";
	}

	@Override
	public String sacar(Double valor) {
		String rs = "";
		if(valor > super.saldo) {
			rs = "Saldo insuficiente";
		}
		else {
			super.saldo -= valor;
			rs = "Saque efetuado. Seu saldo é de "+super.saldo;
		}
		return rs;
	}

	@Override
	public String depositar(Double valor) {
		super.saldo += valor;
		return "Depósito efetuado, Seu saldo é de "+super.saldo;
	}

	@Override
	public String transferir(String destinoConta, Double valor) {
		String rs = "";
		if(valor > super.saldo) {
			rs = "Saldo insuficiente";
		}
		else {
			super.saldo -= valor;
			rs = "O valor "+valor+" foi transferido para a conta "+destinoConta;
		}
		return rs;
	}
	
}
