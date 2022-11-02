package estruturasRepeticao;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		int media = 0;
		int soma = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um valor: ");
			int valor = scanner.nextInt();
			
			soma = soma + valor;
			
			media = (soma / 10);
		}
		
		System.out.println("A média dos valores é: " + media);
		
		scanner.close();
	}
}
