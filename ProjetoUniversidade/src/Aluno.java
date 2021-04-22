public class Aluno {
	private int numMatricula;
	private String nome;
	private double rendimento;
	
	public Aluno(int numMatricula, String nome, double rendimento) {
		this.numMatricula = numMatricula;
		this.nome = nome;
		this.rendimento = rendimento;
	}
	
	public Aluno(int numMatricula, String nome) {
		this.numMatricula = numMatricula;
		this.nome = nome;
		this.rendimento = 0.0;
	}
	
	public Aluno(int numMatricula) {
		this.numMatricula = numMatricula;
		this.nome = "";
		this.rendimento = 0.0;
	}
	
	public Aluno() {
		this.numMatricula = -1;
		this.nome = "";
		this.rendimento = 0.0;
	}
	
	public String exibirAluno() {
		return numMatricula + " | " + nome + " | " + rendimento;
	}
	public int getNumMatricula() {
		return numMatricula;
	}
	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getRendimento() {
		return rendimento;
	}
	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	
	

}
