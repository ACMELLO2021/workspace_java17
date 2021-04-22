package core;

public class Carro extends Veiculo{
    private int ano;

	public Carro(String marca, String modelo, int ano) {
		super(marca, modelo);
		this.ano = ano;
	}
    
	public void acelerar() {
		System.out.println("Carro "+super.marca+" acelera no p�! VRUUMMMM");
	}
	public void frear() {
		System.out.println("Carro "+super.marca+" freia na m�o! IIICCCHHHHH");
	}
    
}
