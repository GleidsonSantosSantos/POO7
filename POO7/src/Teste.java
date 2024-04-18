import controller.ProvaControle;
import model.Atividade;
import model.Prova;

public class Teste {

	public static void main(String[] args) {
	
		
		        ProvaControle provaControle = new ProvaControle();
		        provaControle.adicionar(new Prova(10));
		        provaControle.adicionar(new Prova(20));

		        System.out.println("Lista de Provas:");
		        for (Prova prova : provaControle.listar()) {
		            System.out.println(prova);
		        }

		     
		        AtividadeControle atividadeControle = new AtividadeControle();
		        atividadeControle.adicionar(new Atividade("Matemática", 10));
		        atividadeControle.adicionar(new Atividade("História", 5));

		        System.out.println("\nLista de Atividades:");
		        for (Atividade atividade : atividadeControle.listar()) {
		            System.out.println(atividade);
		        }

		   
		        provaControle.limpar();
		        atividadeControle.limpar();

		        System.out.println("\nListas após limpeza:");
		        System.out.println("Provas: " + provaControle.listar());
		        System.out.println("Atividades: " + atividadeControle.listar());
		    }

	}

}
