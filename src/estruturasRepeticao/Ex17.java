package estruturasRepeticao;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o valor");
		int n = scanner.nextInt();
		int soma = 0;

		if (n > 0) {
			for (int i = 0; i < n; i++) {
				int novoValor = i;
				soma = soma + novoValor;
			}

			System.out.println("A soma dos numeros naturais até + " + 10 + ": " + soma);
		}
	}
}
