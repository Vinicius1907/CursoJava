package arrays_vetores;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int A[] = new int[10];
		
		for(int i = 0; i < A.length; i++) {
			
			System.out.println("Digite o valor do elemento na posição " + i + " do array");
			A[i] = scanner.nextInt();
			
			if(A[i] < 0) {
				A[i] = 0;
			}
		}
		
		for(int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
	}
}
