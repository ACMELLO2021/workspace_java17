import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ufa.. meu primeiro exemplo do eclipse!");
		int a;
		System.out.println("Por favor digite um numero inteiro");
		a = teclado.nextInt();
		for (int num = 0; num <= 10; num++) {
			System.out.println(a + " x " + num + " = " + (a * num));
		}
		System.out.println("agora a gente pega e faz uma alteração so pra falar que mudou o horario");
		System.out.println("esse horario so porque a gente quer que mude nao muda!");
		teclado.close();
	}
}
