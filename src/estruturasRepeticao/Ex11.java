package estruturasRepeticao;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int n = scanner.nextInt();
		
		for(int i = 0; i <= n; i++) {
			if(n >= 0) {
				System.out.println(i);
			}
		}
	}
}
