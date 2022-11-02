package estruturascondicionais;

import java.util.Scanner;

public class Ex34 {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o numero de faltas: ");
		int faltas = scanner.nextInt();
		
		System.out.println("Digite a nota: ");
		int nota = scanner.nextInt();
		
		if(faltas <= 20) {
			
			if(nota >= 9 && nota <= 10 ) {
				System.out.println("Conceito A");
			} else if(nota >= 7.5 && nota <=8.9) {
				System.out.println("Conceito B");
			} else if(nota >= 5 && nota <= 7.4) {
				System.out.println("Conceito C");
			} else if(nota >= 4 && nota <= 4.9) {
				System.out.println("Conceito D");
			} else if (nota >= 3.9 && nota <= 0) {
				System.out.println("Conceito E");
			} else {
				System.out.println("Nota Inválida");
			}
			
		} else {
			
			if(nota >= 9 && nota <= 10 ) {
				System.out.println("Conceito B");
			} else if(nota >= 7.5 && nota <=8.9) {
				System.out.println("Conceito C");
			} else if(nota >= 5 && nota <= 7.4) {
				System.out.println("Conceito D");
			} else if(nota >= 4 && nota <= 4.9) {
				System.out.println("Conceito E");
			} else if (nota >= 3.9 && nota <= 0) {
				System.out.println("Conceito E");
			} else {
				System.out.println("Nota Inválida");
			}
		}
		
		scanner.close();
	}
}
