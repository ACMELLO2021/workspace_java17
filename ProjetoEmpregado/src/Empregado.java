
public class Empregado {
	private String nome;
	private String cargo;
	private double salario;

	// o método construtor é um método especial. Ele só pode ser chamado 1 única vez (no momento do new) e
	// é utilizado geralmente para parametrizar a criação do meu objeto
	public Empregado(String novoNome, String novoCargo, double novoSalario) {
		nome = novoNome;
		cargo = novoCargo;
		salario = novoSalario;
	}
	
	public String imprimir() {
		return "Empregado: "+nome+"/"+cargo+"  R$ "+salario;
	}
	
	public void aumentarSalario(double reajuste) {
		salario += salario * reajuste / 100 ;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
