
public class Loja {
	public static void main(String[] args) {
		Carro c1, c2;
		
		c1 = new Carro();
		c2 = new Carro();
		
		c1.marca  = "Pórxi";
		c1.modelo = "Kayenny";
		c1.ano    = 2021;
		c1.km     = 0;
		c1.cor    = "Preto";
		c1.preco  = 1590000.00;
		
		c2.marca  = "Xevrolé";
		c2.modelo = "Corça";
		c2.ano    = 1995;
		c2.km     = 287954;
		c2.cor    = "Azul geladeira com detalhes em branco porque é guerreiro";
		c2.preco  = 7000.00;
		
		// exibindo o anúncio
		
		System.out.println("O patrao ficou louco!!!");
		System.out.println("=========================================================");
		c1.exibirAnuncio();
		c2.exibirAnuncio();
		
		// internamente o que acontece?
		// ao chamar calcularIPVA, eu faço todo um algoritmo e o resultado é armazenado dentro de 
		// uma variável chamada valorIpva (dentro do método)
		// o RETURN permite que este conteúdo da variável seja transferido para a variável aqui
		// chamada de ipvaC1
		double ipvaC1 = c1.calcularIPVA();
		double ipvaC2 = c2.calcularIPVA();
		
		System.out.println("Para efeito de curiosidade o IPVA do carro "+c1.modelo+ " custa R$ "+ipvaC1);
		System.out.println("Para efeito de curiosidade o IPVA do carro "+c2.modelo+ " custa R$ "+ipvaC2);
		
		
		c1.exibirAnuncioComDesconto(10.0);
		c2.exibirAnuncioComDesconto(10.0);
		
		
//		System.out.println("Carro: "+c1.marca + " " + c1.modelo);
//		System.out.println("Cor: "+c1.cor);
//		System.out.println("Ano: "+c1.ano + "  km "+ c1.km);
//		System.out.println("Preço R$ "+c1.preco);
//		System.out.println("---------------------------------------------------------");
//		
//		System.out.println("Carro: "+c2.marca + " " + c2.modelo);
//		System.out.println("Cor: "+c2.cor);
//		System.out.println("Ano: "+c2.ano + "  km "+ c2.km);
//		System.out.println("Preço R$ "+c2.preco);
//		System.out.println("---------------------------------------------------------");
		
	}
	

}
