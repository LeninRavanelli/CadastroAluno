package Alunos;

public class Algoritmo {

	public static void main(String[] args) {
		ListaAlunos listaAlunos = new ListaAlunos();
		System.out.println("-------- Alunos adicionados---------");
		
		Aluno aluno1 = new Aluno();		
		aluno1.nome = "Lenin";		
		listaAlunos.adicionar(aluno1);

		Aluno aluno2 = new Aluno();
		aluno2.nome = "Paulo";
		listaAlunos.adicionar(aluno2);

		Aluno aluno3 = new Aluno();
		aluno3.nome = "Lais";
		listaAlunos.adicionar(aluno3);

		Aluno aluno4 = new Aluno();
		aluno4.nome = "Nicolle";
		listaAlunos.adicionar(aluno4);

		Aluno aluno5 = new Aluno();
		aluno5.nome = "Nelza";
		listaAlunos.adicionar(aluno5);

		iterar(listaAlunos);

		listaAlunos.ordenar();

		iterar(listaAlunos);

		listaAlunos.remover(aluno1);

		iterar(listaAlunos);
	}

	static void iterar(ListaAlunos listaAlunos) {
		
		for (int i = 0; i < listaAlunos.tamanho(); i++) {
		
			Aluno a = listaAlunos.obter(i);
			
			if ((a != null) && (!a.nome.equals(""))) {
				
				System.out.println("indice: " + i + " Aluno: " + a.nome);
			} else {
				
				System.out.println("nome nulo ou vazio");
			}
		}

		System.out.println("--------------------------");
	}

}
