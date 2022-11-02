package arrays_vetores;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int A[] = new int[5];
		int maior = 0;
		int menor = Integer.MAX_VALUE;
		int soma = 0;
		int media;

		for (int i = 0; i < A.length; i++) {
			System.out.println("Digite o valor do elemento na posição " + i + " do array");
			A[i] = scanner.nextInt();

			if (A[i] > maior) {
				maior = A[i];
			}

			if (A[i] < menor) {
				menor = A[i];
			}

			soma = soma + A[i];
		}

		media = soma / A.length;
		
		System.out.println("O maior é: " + maior + " -> O menor é: " + menor + " -> A média é: " + media);

	}
}
