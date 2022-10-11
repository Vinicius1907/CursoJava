package exercicios;

import java.util.Scanner;

public class Ex14 {
	
	public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite a primeira nota: ");
	double trabalhoLab = scanner.nextDouble();
	
	int peso1 = 2;
	
	System.out.println("Digite a segunda nota: ");
	double avaliacaoSem = scanner.nextDouble();
	int peso2 = 3;
	
	System.out.println("Digite a terceira nota: ");
	double provaFinal = scanner.nextDouble();
	int peso3 = 5;
	
	if(trabalhoLab >= 0 && trabalhoLab <= 10 && avaliacaoSem >= 0 && avaliacaoSem <= 10 && provaFinal >= 0 && provaFinal <= 10) {
		
		double calculoMedia = (((trabalhoLab * peso1) + (avaliacaoSem * peso2) + (provaFinal * peso3))/ (peso1 + peso2 + peso3));	
		System.out.println("A média final é de: " + calculoMedia);
		
		if(calculoMedia < 3) {
			System.out.println("O Aluno está Reprovado");
		} else if (calculoMedia < 5) {
			System.out.println("O Aluno está de Recuperação");
		} else {
			System.out.println("O Aluno está Aprovado");
		}
		
	}else {
		System.out.println("Nota inválida");
		}
	
	scanner.close();
}
	
	
	
}

