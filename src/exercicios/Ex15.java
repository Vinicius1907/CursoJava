package exercicios;

import java.util.Scanner;

public class Ex15 {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o numero do dia da semana");
		int diaSemana = scanner.nextInt();
		
		switch(diaSemana) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terca-Feira");
			break;
		case 4:
			System.out.println("Quarta-Feira");
			break;
		case 5:
			System.out.println("Quinta-Feira");
			break;
		case 6 :
			System.out.println("Sexta-Feira");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		}
		
		scanner.close();
	}
}
