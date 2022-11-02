package arrays_vetores;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int A[] = new int[10];
		int B[] = new int[10];
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("Digite o valor do elemento " + A[i] + " do array");
			A[i] = scanner.nextInt();
			System.out.println(A[i]);
		}
		
		for(int i = 0; i < B.length; i++) {
			B[i] = A[i] * A[i];
			System.out.println(B[i]);
		}
	}
}
