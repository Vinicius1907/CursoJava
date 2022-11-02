package estruturasRepeticao;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int valor = 0;
		
		int qtValores = 0;
		int qtPares = 0;
		
		while(valor != 1000) {
			System.out.println("Digite o valor: ");
			valor = scanner.nextInt();
			
			qtValores++;
			if(valor % 2 == 0) {
				System.out.println("O numero " + valor + " é par");
				qtPares++;
			}else {
				System.out.println("É impar, não conta");
			}
		}
		System.out.println("A quantidade de valores digitados foi de: " + qtValores);
		System.out.println("A quantidade de valores pares digitados foi de: " + qtPares);
	}
}
