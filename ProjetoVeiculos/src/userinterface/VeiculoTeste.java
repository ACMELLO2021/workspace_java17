package userinterface;

import core.Carro;
import core.Moto;
import core.Veiculo;

public class VeiculoTeste {
	public static void main(String[] args) {
		Veiculo v1, v2;
		
		v1 = new Carro("vokis","fusco",1976);
		v2 = new Moto("onda", "cegê", "superbike");
		
		v1.acelerar();
		v1.frear();
		v2.acelerar();
		v2.frear();
	}

}
