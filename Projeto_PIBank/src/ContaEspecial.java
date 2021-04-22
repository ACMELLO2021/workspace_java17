
public class ContaEspecial extends Conta {
	private double limite;
	
	public ContaEspecial(String nomeTitular, String cpf, int numero, double saldo, double limite) {
		super(nomeTitular, cpf, numero, saldo);
		this.limite = limite;
	}
	
	public String toString() {
		return "Conta Especial:" +super.numero+"/"+super.nomeTitular+"("+super.cpf+") R$ "
				                +super.saldo + "  R$ "+this.limite;
	}
	
	public boolean debitar(double valor) {
		if (super.saldo + this.limite >= valor) {
			super.saldo -= valor;
			return true;
		}
		return false;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	

}
