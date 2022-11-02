package teoria;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {

		int idade;
		String nome;

		Scanner teclado = new Scanner(System.in);

		//variavel de controle; condição de parada; forma de incremento
		//i++ -> i = i + 1
		for (int i = 0; i < 5; i++) {
			System.out.println("Qual seu nome?: ");
			nome = teclado.nextLine();

			System.out.println("Qual sua idade?: ");
			// idade = teclado.nextInt();
			idade = Integer.parseInt(teclado.nextLine());

			if (idade > 0) {
				System.out.println(nome + " tem " + idade + " anos");
			}
			
		}
		teclado.close();
	}
}
