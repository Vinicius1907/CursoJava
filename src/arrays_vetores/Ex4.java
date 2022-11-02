package arrays_vetores;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int vetor[] = new int[8];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o valor do elemento " + i + " do vetor");
			vetor[i] = scanner.nextInt();
		}
		
		System.out.println("Digite o valor do primeiro elemento a ser somado");
		int pos1 = scanner.nextInt();
		
		System.out.println("Digite o valor do segundo elemento a ser somado");
		int pos2 = scanner.nextInt();
		
		if(pos1 > vetor.length || pos2 > vetor.length) {
			System.out.println("Um dos valores está fora do range do array");
		} else {
			int soma = vetor[pos1] + vetor[pos2];
			System.out.println("O valor da soma entre o elemento na " + pos1 + " e " + pos2 + " do array é: " + soma);
		}
	}
}
