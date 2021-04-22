import java.util.ArrayList;

public class Universidade {
	public static void main(String[] args) {
		
		ArrayList<Aluno> lista;
		
		lista = new ArrayList<Aluno>();
		
		lista.add(new Aluno(1, "Huguinho", 8.5));
		lista.add(new Aluno(2, "Zezinho ", 7.0));
		lista.add(new Aluno(3, "Luizinho", 6.5));
		lista.add(new Aluno(4, "Patinhas", 5.5));
		lista.add(new Aluno(5, "Donald  ", 7.5));
		
		double maiorRendimento = 0.0;
		double media;
		double somatoriaRendimentos = 0.0;
		Aluno  alunoMaiorRendimento = null;
		
		for (int pos=0; pos<lista.size(); pos++) {
			
			somatoriaRendimentos += lista.get(pos).getRendimento();
			
			if (lista.get(pos).getRendimento() > maiorRendimento) {
				maiorRendimento = lista.get(pos).getRendimento();
				alunoMaiorRendimento = lista.get(pos);
			}
		}
		
		media = somatoriaRendimentos / lista.size();
		System.out.println("A media da turma vale "+ media);
		System.out.println("O maior rendimento entre todos os alunos é "+maiorRendimento);
		System.out.println("O aluno é "+alunoMaiorRendimento.exibirAluno());
		
		System.out.println(" -- procurando outros  alunos de maior rendimento ");
		// vamos procurar se também tem gente com rendimento igual ao maior
		for (int pos=0; pos<lista.size(); pos++) {
			if (lista.get(pos).getRendimento() == alunoMaiorRendimento.getRendimento()
				&& 
				lista.get(pos).getNumMatricula() != alunoMaiorRendimento.getNumMatricula()) {
				System.out.println(lista.get(pos).exibirAluno());
			}
		}
		
		
		// procurando quem está acima da média
		System.out.println(" Alunos que estão acima/abaixo ou na média");
		for (Aluno a : lista) {
			if (a.getRendimento() > media) {
				System.out.println("Aluno "+a.getNome() + " está acima da média");
			}
			else if (a.getRendimento() < media) {
				System.out.println("Aluno "+a.getNome() + " está abaixo da média");
			}
			else {
				System.out.println("Aluno "+a.getNome() + " exatamente na média");
			}
		}
	}
}
