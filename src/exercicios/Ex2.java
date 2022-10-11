package exercicios;

import java.util.Scanner;

public class Ex2 {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		int valor = scanner.nextInt();
		
		scanner.close();
		
		if(valor >= 0) {
			System.out.println("A raiz quadrada do numero " + valor + " é: " + Math.sqrt(valor));
		}else {
			System.out.println("O valor é menor que 0, logo é inválido");
		}
	}
}
