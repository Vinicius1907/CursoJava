package arrays_vetores;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int A[] = new int[5];
		int codigo;

		for (int i = 0; i < A.length; i++) {
			System.out.println("Digite o valor do elemento na posição " + i + " do array");
			A[i] = scanner.nextInt();
		}

		do {
			System.out.println("Digite um codigo válido: ");
			codigo = scanner.nextInt();

			if (codigo == 0) {
				break;
			} else if (codigo == 1) {
				for (int i = 0; i < A.length; i++) {
					System.out.println(A[i]);
				}
			} else if (codigo == 2) {
				for (int i = A.length - 1; i >= 0; i--) {
					System.out.println(A[i]);
				}
			} else {
				System.out.println("Codigo inválido");
			}
		} while (codigo != 0);
	}
}
