
public class Empregado {
	private String nome;
	private String cargo;
	private double salario;

	// o m�todo construtor � um m�todo especial. Ele s� pode ser chamado 1 �nica vez (no momento do new) e
	// � utilizado geralmente para parametrizar a cria��o do meu objeto
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
