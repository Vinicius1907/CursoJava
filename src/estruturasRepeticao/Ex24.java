package estruturasRepeticao;

import java.util.Scanner;

public class Ex24 {

public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = scanner.nextInt();
		int soma = 0;
		
		for(int i = 1; i < valor; i++) {
			if(valor % i == 0) {
				System.out.println(i);
				soma = soma + i;
			}
		}
		System.out.println("A soma dos dividores do numero " + valor + "é de: " + soma);
	}
}
