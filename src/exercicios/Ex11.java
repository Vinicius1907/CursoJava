package exercicios;

import java.util.Scanner;

public class Ex11 {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = scanner.nextInt();
		
		if(valor > 99 || valor < 1000) {
			String valorFinal = Integer.toString(valor);
			
			int unidade = Integer.parseInt(valorFinal.substring(0, 1));
			int dezena = Integer.parseInt(valorFinal.substring(1, 2));
			int centena = Integer.parseInt(valorFinal.substring(2, 3));
			
			int total = unidade + dezena + centena;
			
			System.out.println("A soma dos caracteres é de: " + total);
		} else {
			System.out.println("Numero inválido");
		}
		
		scanner.close();
	}
}
