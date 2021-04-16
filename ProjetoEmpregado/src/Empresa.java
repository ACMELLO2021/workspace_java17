import java.util.Scanner;

public class Empresa {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		/* qual o propósito deste exemplo?
		 * vou pedir para o usuário informar qual a taxa de  aumento de salário e vou reajustar
		 * todos os salários dos funcionários (imprimo o antes e o depois)
		 * 
		 * Entrada: Reajuste
		 * Processamento: aplicar esse reajuste nos salarios
		 * saída: salario antes do reajuste e depois
		 * 
		 * 
		 * para isso, precisaremos de um tipo de dado que armazene nosso Empregado
		 */
		
		Empregado e1    , e2    , e3;
		e1 = new Empregado();
		e2 = new Empregado();
		e3 = new Empregado();
		
		/* como a estrutura do objeto Empregado está inacessível de forma direta, ou seja
		 * eu não consigo apontar diretamente o atributo que eu quero colocar valor, como eu faço?
		 * uso os método de modificação (métodos SET)
		 */
		e1.setNome("Isidro");
		e1.setCargo("Professor");
		e1.setSalario(5000.00);
		
		e2.setNome("Jane");
		e2.setCargo("Coordenadora");
		e2.setSalario(7500.00);
		
		e3.setNome("Alberto");
		e3.setCargo("Lider de Projeto");
		e3.setSalario(8350.00);
		
		double percentual;
		
		System.out.println(e1.imprimir());
		System.out.println(e2.imprimir());
		System.out.println(e3.imprimir());
		
		System.out.print("---> Reajuste: informe o percentual: ");
		percentual = teclado.nextDouble(); 
		
		e1.aumentarSalario(percentual);  // internamente na lógica do método: reajuste = percentual;
		e2.aumentarSalario(percentual);
		e3.aumentarSalario(percentual);
		
		System.out.println(e1.imprimir());
		System.out.println(e2.imprimir());
		System.out.println(e3.imprimir());
		
	}

}
