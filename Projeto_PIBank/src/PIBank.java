
public class PIBank {
	public static void main(String[] args) {
		Conta c1, c2;
//		ContaEspecial c2;
		
		c1 = new Conta("Isidro", "123.456.789-00", 5843,  0.0);
		c2 = new ContaEspecial("Luana","987.654.321-00", 7896, 0.0, 500.0);
		
//		c1.setNumero(5843);
//		c1.setNomeTitular("Isidro");
//		c1.setCpf("123.456.789-00");
		
//		c2.setNumero(7896);
//		c2.setNomeTitular("Luana");
//		c2.setCpf("987.654.321-00");
//		c2.setLimite(500);
		
		System.out.println(c1);
		c1.creditar(100);
		System.out.println(c1);
		if (c1.debitar(30)) {
			System.out.println("Debito efetuado com sucesso");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println(c1);
		//----------- fazendo a mesma coisa com a conta especial 
		
		
		System.out.println(c2);
		c2.creditar(100);
		System.out.println(c2);
		if (c2.debitar(130)) {
			System.out.println("Debito efetuado com sucesso");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		
		System.out.println(c2);
		
		
		
		
	}

}
