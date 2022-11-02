package arrays_vetores;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int maior = 0;
		int menor = Integer.MAX_VALUE;
		
		int A[] = new int[10];
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("Digite o valor do elemento na posição " + i + " do array");
			A[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < A.length; i++) {
			if(A[i] > maior) {
				maior = A[i];
			} else if(A[i] < menor) {
				menor = A[i];
			}
		}
		
		System.out.println("O maior valor do vetor é: " + maior);
		System.out.println("O menor valor do vetor é: " + menor);
	}
}
