package br.com.estudo.heranca;
 
public interface OperacoesBancarias {
 
	String sacar(Double valor);
	String depositar(Double valor);
	String transferir(String destinoConta, Double valor);
	
}