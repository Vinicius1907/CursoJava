package estruturasRepeticao;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = scanner.nextInt();
		
		for(int i = 1; i <= valor; i++) {
			if(valor % i == 0) {
				System.out.println(i);
			}
		}
	}
}
