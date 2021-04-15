/* este arquivo não terá método main, ele servirá apenas para que a gente defina
 * o novo tipo de dado (que no caso vai armazenar informações de um carro
 */

public class Carro {
	
	// aqui eu não chamo mais "variáveis", agora a nomenclatura é "atributos"
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
		System.out.println("Preço R$ "+preco);
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
		System.out.println("Preço com Desconto: de R$ "+preco + " por R$ "+ (preco - preco * desconto/100));
	}
}
