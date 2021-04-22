package core;

public abstract class Veiculo {
	protected String marca;
	protected String modelo;
	
	public Veiculo(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public abstract void acelerar();
	public abstract void frear();
	
}
