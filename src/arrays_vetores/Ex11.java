package arrays_vetores;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int A[] = new int[10];
		int qtNegativos = 0;
		int somaPositivos = 0;
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("Digite o valor do elemento na posição " + i + " do array");
			A[i] = scanner.nextInt();
			
			if(A[i] < 0) {
				qtNegativos = qtNegativos + 1;
			} else {
				somaPositivos = somaPositivos + A[i];
			}
		}
		
		System.out.println(qtNegativos);
		System.out.println(somaPositivos);
	}
}
