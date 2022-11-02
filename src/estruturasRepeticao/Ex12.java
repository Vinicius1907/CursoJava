package estruturasRepeticao;

import java.util.Scanner;

public class Ex12 {

public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int n = scanner.nextInt();
		
		for(int i = n; i >= 0; i--) {
			if(n >= 0) {
				System.out.println(i);
			}
		}
	}
}
