package estruturascondicionais;

import java.util.Scanner;

public class Ex9 {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o salário: ");
		double salario = scanner.nextDouble();
		
		System.out.println("Digite o valor da prestação: ");
		double valorPrestacao = scanner.nextDouble();
		
		if(valorPrestacao > ((salario*20)/100)) {
			System.out.println("Emprestimo Negado");
		}else {
			System.out.println("Emprestimo Aceito");
		}
		
		scanner.close();
	}
}
