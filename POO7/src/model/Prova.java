package model;

public class Prova {
    private int numQuestoes;
    private float nota;

    public Prova(int numQuestoes) {
        this.numQuestoes = numQuestoes;
        this.nota = 0.0f;
    }

    public int getNumQuestoes() {
        return numQuestoes;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Prova [numQuestoes=" + numQuestoes + ", nota=" + nota + "]";
    }
}