package exercicios;

import java.util.Scanner;

public class Ex6 {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor 1: ");
		int valor1 = scanner.nextInt();
		
		System.out.println("Digite o valor 2: ");
		int valor2 = scanner.nextInt();
		
		if(valor1 > valor2) {
			System.out.println("O maior valor entre " + valor1 + " e " + valor2 + " é: " + valor1);
			System.out.println("A diferença entre eles é de: " + (valor1 - valor2));
		}else {
			System.out.println("O maior valor entre " + valor1 + " e " + valor2 + " é: " + valor2);
			System.out.println("A diferença entre eles é de: " + (valor2 - valor1));
		}
		
		scanner.close();
	}
}
