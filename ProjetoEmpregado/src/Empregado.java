
public class Empregado {
	private String nome;
	private String cargo;
	private double salario;
	
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
