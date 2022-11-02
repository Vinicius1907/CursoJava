package estruturasRepeticao;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		int soma = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um valor: ");
			int valor = scanner.nextInt();
			
			soma = soma + valor;
		}
		
		System.out.println(soma);
	}
}
