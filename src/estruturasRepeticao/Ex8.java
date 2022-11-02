package estruturasRepeticao;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um valor inicial: ");
		int valorInicial = scanner.nextInt();
		int menor = valorInicial;
		int maior = valorInicial;

		for (int i = 0; i < 9; i++) {
			System.out.println("Digite um valor: ");
			int novoValor = scanner.nextInt();

			if (novoValor > menor) {
				maior = novoValor;
			} else {
				menor = novoValor;
			}
		}

		System.out.println("O menor valor digitado foi:" + menor);
		System.out.println("O maior valor digitado foi:" + maior);

	}
}
