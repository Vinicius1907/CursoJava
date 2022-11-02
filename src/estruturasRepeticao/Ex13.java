package estruturasRepeticao;

import java.util.Scanner;

public class Ex13 {

public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int n = scanner.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(n >= 0) {
				i++;
				System.out.println(i);
			}
		}
	}
}
