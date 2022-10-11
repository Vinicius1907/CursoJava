package exercicios;

import java.util.Scanner;

public class Ex18 {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1 - Soma" + "\n" + "2 - Subtração" + "\n" + "3 - Multiplicação" + "\n" + "4 - Divisão");
		System.out.println("Digite a operação desejada: ");
		int operacao = scanner.nextInt();
		
		System.out.println("Digite o primeiro valor: ");
		double valorA = scanner.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		double valorB = scanner.nextDouble();
		double resultado;
		
		switch(operacao) {
		case 1:
			resultado = valorA + valorB;
			System.out.println(resultado);
			break;
		case 2:
			resultado = valorA - valorB;
			System.out.println(resultado);
			break;
		case 3:
			resultado = valorA * valorB;
			System.out.println(resultado);
			break;
		case 4:
			resultado = valorA / valorB;
			System.out.println(resultado);
			break;
		}
		
		scanner.close();
	}
}
