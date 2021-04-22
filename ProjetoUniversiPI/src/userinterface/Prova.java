package userinterface;

import java.util.ArrayList;
import java.util.Scanner;

import core.QuestaoComDica;
import core.QuestaoMultiplaEscolha;
import core.QuestaoSimples;

public class Prova {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String resposta;
		ArrayList<QuestaoSimples> questoes;
		questoes = new ArrayList<QuestaoSimples>();
		int pontos=0;
		
		// preenchendo as questoes
		questoes.add(new QuestaoSimples("Quem joga como nunca e perde como sempre?","XV de Jau"));
		questoes.add(new QuestaoComDica("Qual a linguagem do curso?","JAVA","Começa com JA e termina com VA"));
		questoes.add(new QuestaoSimples("Qual a formula da água?","H2O"));
		questoes.add(new QuestaoComDica("Qual a cor do cavalo Branco de Napoleão?","Marrom","Não pense na cor"));
		questoes.add(new QuestaoSimples("Quanto vale 2+2?","4"));
		questoes.add(new QuestaoMultiplaEscolha("Qual a formula do Sal de Cozinha", "b", "H2O", "NaCl","H2SO4", "H2O2"));
		
		// aplicando a prova e corrigindo
		for (QuestaoSimples q: questoes) {
			System.out.println(q.aplicarQuestao());
			resposta = teclado.nextLine();
			if (q.corrigir(resposta)) {
				System.out.println("Acertou!!");
				pontos++;
			}
			else {
				System.out.println("Errrooooou (pense no Faustão falando...)");
			}
		}		
		System.out.println("Voce acertou um total de "+pontos+"/"+questoes.size());
		

	}
}
