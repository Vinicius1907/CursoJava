package exercicios;

import java.util.Scanner;

public class Ex5 {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = scanner.nextInt();
		
		if(valor % 2 == 0) {
			System.out.println("Numero " + valor + " é par");
		} else {
			System.out.println("Numero " + valor + " é impar");
		}
		
		scanner.close();
	}
}
