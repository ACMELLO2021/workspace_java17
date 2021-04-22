
public class Aluno extends Pessoa{  // interprete este cabeçalho como: A classe Aluno AMPLIA a estrutura Pessoa
	private int numMatricula;
	private String curso;
	
	public void exibirInfo() {
		System.out.println(super.nome + " / "+ super.email + "("+super.telefone+"): "+
						   this.numMatricula+" - "+this.curso);
	}

	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
