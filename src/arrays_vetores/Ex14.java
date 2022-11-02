package arrays_vetores;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int A[] = new int[5];

		for (int i = 0; i < A.length; i++) {
			System.out.println("Digite o valor do elemento na posição " + i + " do array");
			A[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < A.length; i++) {
			for(int j = 0; j < A.length; j++) {
				if(i != j) {
					if(A[i] == A[j]) {
						System.out.println("Valor repetido " + A[i]);
					}
				}
			}
		}
	}
}
