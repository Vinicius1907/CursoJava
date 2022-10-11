package exercicios;

import java.util.Scanner;

public class Ex19 {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = scanner.nextInt();
		
		if(valor % 3 == 0 && valor % 5 != 0 || valor % 3 != 0 && valor % 5 == 0) {
			System.out.println("Valor é divisivel por 3 ou por 5 e não pelos dois");
		}else if(valor % 3 == 0 && valor % 5 == 0) {
			System.out.println("Valor é divisivel simultaneamente por 3 e 5");
		}else {
			System.out.println("Não é divisivel por 3 ou por 5");
		}
		
		scanner.close();
		
	}
}
