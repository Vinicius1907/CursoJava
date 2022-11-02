package estruturasRepeticao;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int soma = 0;
		int media = 0;
		int divisivel = 10;
		
		for(int i = 0; i < divisivel; i++) {
			
			System.out.println("Digite um valor: ");
			int valor = scanner.nextInt();
			
			if(valor >= 0) {
				soma = soma + valor;
			} else {
				divisivel--;
				i--;
			}
		}
		media = soma / divisivel;
		
		System.out.println("A média dos valores é: " + media);
	}
}
