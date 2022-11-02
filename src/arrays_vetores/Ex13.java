package arrays_vetores;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int A[] = new int[5];
		int maior = 0;
		int menor = Integer.MAX_VALUE;
		int posMaior = 0;
		int posMenor = 0;
		

		for (int i = 0; i < A.length; i++) {
			System.out.println("Digite o valor do elemento na posição " + i + " do array");
			A[i] = scanner.nextInt();
			
			if (A[i] > maior) {
				maior = A[i];
				posMaior = i;
			}

			if (A[i] < menor) {
				menor = A[i];
				posMenor = i;
			}
		}
		
		System.out.println("O maior valor é: " + maior + " e sua posicao no array é: " + posMaior);
		System.out.println("O menor valor é: " + menor + " e sua posicao no array é: " + posMenor);
	}
}
