package arrays_vetores;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int maior = 0;
		int posicao = 0;

		int A[] = new int[10];

		for (int i = 0; i < A.length; i++) {
			System.out.println("Digite o valor do elemento na posição " + i + " do array");
			A[i] = scanner.nextInt();
		}

		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
			if (A[i] > maior) {
				maior = A[i];
				posicao = i;
			}
		}
		
		System.out.println("O maior elemento no vetor é: " + maior + " e sua posição no array é o " + posicao + "º elemento");
	}
}
