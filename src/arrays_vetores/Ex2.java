package arrays_vetores;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int A[] = new int[6];
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("Digite o valor do elemento " + i + " do array");
			A[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
	}
}
