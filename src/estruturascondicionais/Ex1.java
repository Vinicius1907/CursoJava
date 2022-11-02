package estruturascondicionais;

import java.util.Scanner;

public class Ex1 {

	public static void main(String args[]) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite o valor 1");
		int valor1 = scanner.nextInt();
		
		System.out.println("digite o valor 2");
		int valor2 = scanner.nextInt();
	
		
		if(valor1 > valor2) {
			System.out.println("O maior valor é: " + valor1);
		} else if (valor2 > valor1) {
			System.out.println("O maior valor é: " + valor2);
		} else {
			System.out.println("Valor 1 e 2 são identicos");
		}
		
		scanner.close();
	}
}
