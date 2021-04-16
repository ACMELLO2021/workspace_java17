import java.util.ArrayList;

public class VitrineVirtual {
	public static void main(String[] args) {
		
		ArrayList<Produto> lista;
		
		lista = new ArrayList<Produto>();
		
		lista.add( new Produto(1, "Computador", 2500.00, 0) );
		lista.add( new Produto(2, "Mouse de Luzinha", 50.0, 10) );
		lista.add( new Produto(3, "Teclado de Luzinha", 100, 5) );
		lista.add( new Produto(4, "Mesa de Motorzinho que sobe e desce", 3000.0, 1) );
		
		System.out.println(" --- Linha de produtos ---");
		
		for (int posicao = 0; posicao < lista.size(); posicao++) {
			System.out.println(lista.get(posicao).exibirProduto());
		}
		
		for (Produto p : lista) {  // para cada produto P pertencente à lista
			System.out.println(p.exibirProduto());
		}
//		System.out.println(lista.get(0).exibirProduto());
//		System.out.println(lista.get(1).exibirProduto());
//		System.out.println(lista.get(2).exibirProduto());
//		System.out.println(lista.get(3).exibirProduto());
	}

}
