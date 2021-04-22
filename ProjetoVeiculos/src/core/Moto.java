package core;

public class Moto extends Veiculo {
	private String tipo;

	public Moto(String marca, String modelo, String tipo) {
		super(marca, modelo);
		this.tipo = tipo;
	}

	public void acelerar() {
		System.out.println("Moto "+super.marca+" acelera na mão! PROPROPRORPORPORO");
	}
	
	public void frear() {
		System.out.println("Moto "+super.marca+" freia no pé HQUWHEUWQHEPI)P&*YHWAPRÇIU#WQHkjdsv wseh 4");
	}
	

}
