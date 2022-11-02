package estruturascondicionais;

import java.util.Scanner;

public class Ex13 {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = scanner.nextDouble();
		System.out.println("Digite o peso da primeira nota: ");
		int peso1 = scanner.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = scanner.nextDouble();
		System.out.println("Digite o peso da segunda nota: ");
		int peso2 = scanner.nextInt();
		
		System.out.println("Digite a terceira nota: ");
		double nota3 = scanner.nextDouble();
		System.out.println("Digite o peso da terceira nota: ");
		int peso3 = scanner.nextInt();
		
		if(nota1 >= 0 && nota1 <= 10 && nota2 >= 0 && nota2 <= 10 && nota3 >= 0 && nota3 <= 10) {
			
			double calculoMedia = (((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3))/ (peso1 + peso2 + peso3));
			
			System.out.println("A média final é de: " + calculoMedia);
		}else {
			System.out.println("Nota inválida");
		}
		
		scanner.close();
	}
}
