
public class ContaBancaria {
	private String cpfTitular;
	private String nomeTitular;
	private int    numeroAgencia;
	private int    numeroConta;
	private int    dv;
	private double saldo;
	
	public void depositar(double valor) {
		saldo = saldo + valor;
		// setSaldo(getSaldo() + valor);
	}
	
	public boolean sacar(double valor) {
		boolean resultado;
		if (saldo >= valor) {
			saldo = saldo - valor;
			resultado = true;
		}
		else {
			resultado = false;
		}
		return resultado;
	}
	
	public String exibirInfo() {
		String infoConta;
		infoConta = "Conta: "+numeroConta+"-"+dv+" Ag: "+numeroAgencia+ " R$" + saldo + " Titular:"+nomeTitular+ " ("+cpfTitular+")";
		return infoConta;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}
	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public int getNumeroAgencia() {
		return numeroAgencia;
	}
	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public int getDv() {
		return dv;
	}
	public void setDv(int dv) {
		this.dv = dv;
	}
	public double getSaldo() {
		return saldo;
	}

}
