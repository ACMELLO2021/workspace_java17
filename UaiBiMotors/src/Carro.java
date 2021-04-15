/* este arquivo n�o ter� m�todo main, ele servir� apenas para que a gente defina
 * o novo tipo de dado (que no caso vai armazenar informa��es de um carro
 */

public class Carro {
	
	// aqui eu n�o chamo mais "vari�veis", agora a nomenclatura � "atributos"
	String marca;
	String modelo;
	int    ano;
	int    km;
	String cor;
	double preco;
	
	void exibirAnuncio() {
		System.out.println("Carro: "+marca + " " + modelo);
		System.out.println("Ano: "+ano+ "  km "+km);
		System.out.println("Cor: "+cor);
		System.out.println("Pre�o R$ "+preco);
		System.out.println("---------------------------------------------------------");
	}
	
	double calcularIPVA(){
		double valorIpva;
		if (ano < 2000) {
			valorIpva = 0;
		}
		else {
			valorIpva = preco * 0.04;
		}
		return valorIpva;
	}
	
	
	void exibirAnuncioComDesconto(double desconto) {
		System.out.println("Mega Feirao do UaiBiMotors");
		System.out.println("===================================");
		System.out.println(marca+" " + modelo + " / "+ano);
		System.out.println("Pre�o com Desconto: de R$ "+preco + " por R$ "+ (preco - preco * desconto/100));
	}
}
