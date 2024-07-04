package br.com.estudo.heranca;

public class ContaCorrente extends ContaBancaria implements OperacoesBancarias{
	private Double limite;
	private  Double limiteinicial; 
		
	
	
	public String abrirConta(String nb,String na,String nc,String ti,Double sa,Double li) {
		super.numeroBanco= nb;
		super.numeroAgencia= na;
		super.numeroConta=nc;
		super.titular=ti;
		super.saldo=sa;
		this.limite=li;
		this.limiteinicial=li;
		return"Conta corrente aberta com sucesso!";
	}

	@Override
	public String sacar(Double valor) {
		// TODO Auto-generated method stub
		String rs = "";
		if(super.saldo+this.limite<valor) {
			rs="Saldo insuficiente";
			
		}
		else if(valor>super.saldo) {
		Double pass = valor - super.saldo;
		super.saldo = 0.0;
		limite-=valor;
		rs="Saque efetuado.Seu saldo é"+super.saldo+"e seu limite é"+limite;
		}
		
		else {
			super.saldo-=valor;
			rs="Saque efetuado.Seu saldo é"+super.saldo+"e seu limite é"+limite;
		}
		return rs;
   }
	
	@Override
	public String depositar(Double valor) {
		// TODO Auto-generated method stub
		
		String rs = "";
		if (limiteinicial==limite) {
			super.saldo+=valor;
			rs="Depósito realizado. Seu novo saldo é"+super.saldo;
		}
		else if(limiteinicial-limite > valor) {
			this.limite+=valor;
			rs="Depósito realizado. Seu limite foi atualizado para"+this.limite;
		}
		else {
			this.limite+=limiteinicial-limite;
			super.saldo+=valor-(limiteinicial-limite);
			rs="Seu saldo atual é de"+super.saldo+"e seu limite foi atualizado para"+this.limite;
		}
		
		
		
		return rs;
	}

	@Override
	public String transferir(String destinoConta, Double valor) {
		String rs = "";
		if(super.saldo+this.limite<valor) {
			rs="Saldo insuficiente";
			
		}
		else if(valor>super.saldo) {
		Double pass = valor - super.saldo;
		super.saldo = 0.0;
		limite-=valor;
		rs="Transferência efetuado.Seu saldo é"+destinoConta+"e seu limite é"+limite;
		}
		
		else {
			super.saldo-=valor;
			rs="Transferência efetuado.Seu saldo é"+destinoConta+"e seu limite é"+limite;
		}
		return rs;
	}

	}

