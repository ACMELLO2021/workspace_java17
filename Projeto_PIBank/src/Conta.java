
public class Conta {

	protected String nomeTitular;
	protected String cpf;
	protected int    numero;
	protected double saldo;
	
	
	public Conta(String nomeTitular, String cpf, int numero, double saldo) {
		super();
		this.nomeTitular = nomeTitular;
		this.cpf = cpf;
		this.numero = numero;
		this.saldo = saldo;
	}

	public void creditar(double valor) {
		this.saldo += valor;
	}
	
	public boolean debitar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public String toString() {
		return "Conta: "+this.numero + "/"+this.nomeTitular+"("+this.cpf+") R$ "+this.saldo;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
}
