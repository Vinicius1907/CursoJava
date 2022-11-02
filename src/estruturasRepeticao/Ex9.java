package estruturasRepeticao;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a quntidade de numeros impares");
		int n = scanner.nextInt();
		int impar = 1;
		
		for(int i = 0; i < n; i++) {	
			System.out.println(impar);
			impar += 2;
		}
	}
}
