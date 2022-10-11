package exercicios;

import java.util.Scanner;

public class Ex22 {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = scanner.nextInt();
		
		System.out.println("Digite seu tempo de trabalho: ");
		int tempoTrabalho = scanner.nextInt();
		
		if(idade >= 65 || tempoTrabalho >= 30 || idade >= 60 && tempoTrabalho >= 25) {
			System.out.println("Aposentado");
		}else {
			System.out.println("Não tem os requisitos minimos pra aposentadoria");
		}
		
		scanner.close();
	}
}
