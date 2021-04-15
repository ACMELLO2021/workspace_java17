public class Biblioteca {
	public static void main(String[] args) {
		Livro l1, l2, l3;
		
		l1 = new Livro();
		l2 = new Livro();
		l3 = new Livro();
		
		// vou preencher (na prática eu recuperaria isso de um BD)
		l1.setTitulo("Java para Iniciantes");
		l1.setAutor("Professor Isidro");
		l1.setCategoria("Terror");
		l1.setAnoPublicacao(2021);
		l1.setPosEstante(2);
		l1.setPosPrateleira(3);
		l1.setDisponivel(true);
		
		l2.setTitulo("Java avançado");
		l2.setAutor("Professor Isidro");
		l2.setCategoria("Ficção");
		l2.setAnoPublicacao(2021);
		l2.setPosEstante(4);
		l2.setPosPrateleira(1);
		l2.setDisponivel(false);
		
		l3.setTitulo("Aprenda a programar");
		l3.setAutor("Professor Isidro");
		l3.setCategoria("Esoterismo");
		l3.setAnoPublicacao(2021);
		l3.setPosEstante(16);
		l3.setPosPrateleira(2);
		l3.setDisponivel(true);
		
		l1.exibirLivro();
		l2.exibirLivro();
		l3.exibirLivro();
		
		l1.emprestar();
		l1.exibirLivro();
		
	}

}
