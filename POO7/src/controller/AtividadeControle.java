package controller;
import java.util.ArrayList;
import java.util.List;

public class AtividadeControle implements AvaliacoesInterface<Atividade> {
    private List<Atividade> atividades;

    public AtividadeControle() {
        atividades = new ArrayList<>();
    }

    @Override
    public void adicionar(Atividade atividade) {
        atividades.add(atividade);
    }

    @Override
    public Atividade consultar(int posicao) {
        if (posicao >= 0 && posicao < atividades.size()) {
            return atividades.get(posicao);
        } else {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
    }

    @Override
    public void limpar() {
        atividades.clear();
    }

    @Override
    public List<Atividade> listar() {
        return new ArrayList<>(atividades);
    }
}
