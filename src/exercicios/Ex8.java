package exercicios;

import java.util.Scanner;

public class Ex8 {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		double nota1 = scanner.nextDouble();
		
		System.out.println("Digite a segunda nota:");
		double nota2 = scanner.nextDouble();
		
		if(nota1 < 0 || nota2 < 0 || nota1 > 10 || nota2 > 10) {
			System.out.println("Uma ou as duas notas são menor que 0 ou maior que 10. Digite uma nota válida.");
		}else {
			System.out.println("A média do aluno é de: " + ((nota1 + nota2)/2));
		}
		
		scanner.close();
	}
}
