package arrays_vetores;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int A[] = new int[6];
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("Digite o valor do elemento na posição " + i + " do array");
			A[i] = scanner.nextInt();
			
			while(A[i] % 2 != 0) {
				System.out.println("Numero digitado é impar. Digite apenas numeros pares.");
				A[i] = scanner.nextInt();
			}
		}
		
		for(int i = A.length - 1; i >= 0; i--) {
			System.out.println(A[i]);
		}
	}
}
