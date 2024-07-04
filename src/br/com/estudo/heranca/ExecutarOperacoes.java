package br.com.estudo.heranca;
 
public class ExecutarOperacoes {
 
	public static void main(String[] args) {
		
//ContaPoupanca cp = new ContaPoupanca();
//String ab = cp.abrirConta("21", "2627", "121341", "Gessica", 1000.0, 10.0);
//System.out.println(ab);
//String sc = cp.sacar(800.0);
//System.out.println(sc);
	
		ContaCorrente ct = new ContaCorrente();
		String ab = ct.abrirConta("21", "26275", "121341", "Chayanne", 1000.0, 10.0);
		System.out.println(ab);
		System.out.println( ct.sacar(1500.0));
		System.out.println(ct.depositar(800.0));
			}
	
}
 