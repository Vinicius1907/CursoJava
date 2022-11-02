package estruturasRepeticao;

import java.util.Scanner;

public class Ex14 {

public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int n = scanner.nextInt();
		
		if(n % 2 == 0) {
			for(int i = n; i > 0; i--) {
				if(n >= 0) {
					i--;
					System.out.println(i);
				}
			}
		} else {
			System.out.println("Numero impar não pode");
		}
	}
}
