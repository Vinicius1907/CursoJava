package arrays_vetores;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double A[] = new double[15];
		double soma = 0;
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("Digite o valor do elemento na posição " + i + " do array");
			A[i] = scanner.nextDouble();
			soma = soma + A[i];
		}
		
		double mediaGeral = soma / A.length;
		System.out.println("A média geral da turma foi de: " + mediaGeral);
	}
}
