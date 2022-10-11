package exercicios;

import java.util.Scanner;

public class Ex3 {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor:");
		int valor = scanner.nextInt();
		
		if(valor > 0) {
			System.out.println("A raiz quadrada de " + valor + " é: " + Math.sqrt(valor));
		} else {
			System.out.println("O quadrado de " + valor + " é: " + valor*valor);
		}
		
		scanner.close();
	}
}
