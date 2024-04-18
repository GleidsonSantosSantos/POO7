package controller;

import java.util.List;

import model.Prova;

public interface AvaliacoesInterface<T> {
	void addActivity(T activity);
    T getActivity(int index);
    void clearActivities();
	void limpar();
	void adicionar(Prova prova);
	Prova consultar(int posicao);
	List<Prova> listar();
}