import java.util.Scanner;

import javax.swing.JOptionPane;

public class Banco {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ContaBancaria c;
		c = new ContaBancaria();
		int opcao;
		double valor;
		
		// preenchendo os dados da conta
		c.setNomeTitular("Prof. Isidro");
		c.setCpfTitular("123.456.789-00");
		c.setNumeroAgencia(1001);
		c.setNumeroConta(101122);
		c.setDv(3);
		
		do {
			System.out.println("Digite 1 para deposito / 2 saque / 3 info / -1 sair");
			opcao = teclado.nextInt();
			switch(opcao) {
			case 1:
				System.out.println("Digite o valor a depositar");
				valor = teclado.nextDouble();
				c.depositar(valor);
				break;
			case 2:
				System.out.println("Digite o valor do saque");
				valor = teclado.nextDouble();
				boolean resultadoSaque = c.sacar(valor);
				if (resultadoSaque == true) {
					System.out.println(" -> Saque efetuado com sucesso");
				}
				else {
					System.out.println(" -> Saldo insuficiente");
				}
				break;
			case 3:
				//System.out.println(c.exibirInfo());
				JOptionPane.showMessageDialog(null, c.exibirInfo());
				break;
			case -1: 
				System.out.println("Obrigado pela preferencia");
				break;
			default:
				System.out.println("Opcao invalida");
			}
			
		} while (opcao != -1);
		
		
		teclado.close();
	}

}
