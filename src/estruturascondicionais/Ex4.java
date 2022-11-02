package estruturascondicionais;

import java.util.Scanner;

public class Ex4 {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = scanner.nextInt();
		
		if(valor > 0) {
			System.out.println("O valor de " + valor + " ao quadrado é " + valor*valor);
			System.out.println("A raiz quadrada de " + valor + " é " + Math.sqrt(valor));
		} else {
			System.out.println("Valor negativo, inválido");
		}
		
		scanner.close();
	}
}
