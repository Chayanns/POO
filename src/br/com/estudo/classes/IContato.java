package br.com.estudo.classes;

import java.util.List;

public interface IContato <T> {
	String cadastrar(T dados);
	List<T> consultar();
	T consultar(String nome);

}
