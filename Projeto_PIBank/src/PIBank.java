import java.util.ArrayList;
import java.util.Scanner;

public class PIBank {
	public static void main(String[] args) {
		ArrayList<Conta> listaDeContas;
		Scanner teclado = new Scanner(System.in);
		int opcao, numConta;
		double valor;
		Conta contaSelecionada;
		
		listaDeContas = new ArrayList<Conta>();
		
		listaDeContas.add(new ContaEspecial("Cliente 1", "cpf1", 10001, 0.0, 100));
		listaDeContas.add(new Conta("Cliente 2", "cpf2", 10002, 0.0));
		listaDeContas.add(new ContaEspecial("Cliente 3", "cpf3", 10003, 0.0, 200));
		listaDeContas.add(new Conta("Cliente 4","cpf4", 10004, 0.0));
		
		do {
			contaSelecionada = null;
			System.out.println("Digite 1 - Deposito / 2 - Saque / 3 - Info / -1 - Sair");
			opcao = teclado.nextInt();
			switch(opcao) {
			case 1:
				System.out.println("Digte o numero da conta");
				numConta = teclado.nextInt();
				for (Conta c: listaDeContas) {
					if (c.getNumero() == numConta) {
						contaSelecionada = c;
						break;
					}
				}
				if (contaSelecionada != null) {
					System.out.println("Digite o valor a depositar");
					valor = teclado.nextDouble();
					contaSelecionada.creditar(valor);
					System.out.println(contaSelecionada);
				}
				else {
					System.out.println("Conta inexistente!");
				}
				break;
			case 2:
				System.out.println("Digte o numero da conta");
				numConta = teclado.nextInt();
				for (Conta c: listaDeContas) {
					if (c.getNumero() == numConta) {
						contaSelecionada = c;
						break;
					}
				}
				if (contaSelecionada != null) {
					System.out.println("Digite o valor a sacar");
					valor = teclado.nextDouble();			
					if (contaSelecionada.debitar(valor)) {
						System.out.println("Debito efetuado com sucesso");
					}
					else {
						System.out.println("Saldo insuficiente");
					}
					System.out.println(contaSelecionada);
				}
				else {
					System.out.println("Conta inexistente!");
				}
				break;
			case 3:
				for (Conta c: listaDeContas) {
				    System.out.println(c);					
				}
				break;
			case -1:
				System.out.println("TCHAU");
				break;
			default:
				System.out.println("OPCAO INVALIDA!");				
			}
			
		} while (opcao != -1);
		
		
		
		
		
		
		teclado.close();
		
		
		
		
	}

}
