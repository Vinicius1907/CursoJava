package estruturascondicionais;

import java.util.Scanner;

public class Ex23 {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um ano: ");
		int ano = scanner.nextInt();
		
		if(ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0) {
			System.out.println("O ano " + ano + " é bissexto");
		} else {
			System.out.println("O ano " + ano + " não é bissexto");
		}
		
		scanner.close();
	}
}
