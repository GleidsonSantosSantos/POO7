package controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import model.Prova;

public class ProvaControle implements AvaliacoesInterface<Prova> {
	private List<Prova> provas;
	private Random random;

	public ProvaControle() {
		provas = new ArrayList<>();
		random = new Random();
	}

	@Override
	public void addActivity(Prova activity) {
		// TODO Auto-generated method stub

	}

	@Override
	public Prova getActivity(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clearActivities() {
		// TODO Auto-generated method stub

	}

}
