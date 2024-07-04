package br.com.estudo.heranca;
// Está classe será a super classe das classes conta corrente e conta poupança
//portanto, está será uma classe abstrata
public abstract class ContaBancaria {


// Os atributos dessa classe são compartilhados com as 
// classes filhas, ou seja, com subclasses
// sendo assim, nós iremos declarar os atributos como
// protect 
	protected String numeroBanco;
	protected String numeroAgencia;
	protected String numeroConta;
	protected String titular;
	protected Double saldo;

}
