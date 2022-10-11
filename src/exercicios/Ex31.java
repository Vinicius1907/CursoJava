package exercicios;

import java.util.Scanner;

public class Ex31 {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua altura em m");
		double altura = scanner.nextDouble();
		
		System.out.println("Digite seu peso em kg");
		double peso = scanner.nextDouble();
		
		if(altura < 1.20) {
			
			if(peso < 60) {
				System.out.println("Classificação A");
			} else if(peso >= 60 && peso <= 90) {
				System.out.println("Classificação B");
			} else {
				System.out.println("Classificação C");
			}
			
		} else if(altura >= 1.20 && altura <= 1.70) {
			
			if(peso < 60) {
				System.out.println("Classificação D");
			} else if(peso >= 60 && peso <= 90) {
				System.out.println("Classificação E");
			} else {
				System.out.println("Classificação F");
			}
			
		} else {
	
			if(peso < 60) {
				System.out.println("Classificação G");
			} else if(peso >= 60 && peso <= 90) {
				System.out.println("Classificação H");
			} else {
				System.out.println("Classificação I");
			}
		}
		
		scanner.close();
	}
}
