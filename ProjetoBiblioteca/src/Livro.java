

public class Livro {
	// atributos
	// agora preciso "blindar" a estrutura, de forma que outras classes não acessem diretamente estes atributos
	private String  titulo;
	private String  autor;
	private String  categoria;
	private int     anoPublicacao;
	private int     posEstante;
	private int     posPrateleira;
	private boolean disponivel;
	
	// para cada atributo, preciso criar 2 funcionalidades: 1 para alterar seu valor e outra para recuperar seu valor
	// funcionalidade 1: para alterar
    
	
	
	
	// funcionalidades
	public void exibirLivro() {
		System.out.println("Livro: "+titulo+" ("+anoPublicacao+") Autor: "+autor);
		System.out.println("Posicao E: "+posEstante+ "  P:"+posPrateleira);
		if (disponivel) {
			System.out.println("   LIVRO DISPONIVEL PARA EMPRESTIMO");
		}
		else {
			System.out.println("   *** INDISPONIVEL ***");
		}
	}
	
	public void emprestar() {
		disponivel = false;
	}
	public void devolver() {
		disponivel = true;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public int getPosEstante() {
		return posEstante;
	}

	public void setPosEstante(int posEstante) {
		this.posEstante = posEstante;
	}

	public int getPosPrateleira() {
		return posPrateleira;
	}

	public void setPosPrateleira(int posPrateleira) {
		this.posPrateleira = posPrateleira;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}



}
