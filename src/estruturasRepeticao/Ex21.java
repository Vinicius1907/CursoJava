package estruturasRepeticao;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o menor numero de intervalo");
		int menor = scanner.nextInt();
		
		System.out.println("Digite o maior numero de intervalo");
		int maior = scanner.nextInt();
		
		int soma = 0;
		int multi = 1;
		
		for(int i = menor; i <= maior; i++) {
			if(i % 2 == 0) {
				System.out.println(i + " par");
				soma = soma + i;
			} else {
				System.out.println(i + "impar");
				multi = multi * i;
			}
		}
		System.out.println("A soma dos valores pares é: " + soma);
		
		System.out.println("A multiplicação dos valores impares é: " + multi);
	}
}
