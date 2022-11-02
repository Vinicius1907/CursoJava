package estruturascondicionais;

import java.util.Scanner;

public class Ex25 {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor de a: ");
		int a = scanner.nextInt();
		
		System.out.println("Digite o valor de b: ");
		int b = scanner.nextInt();
		
		System.out.println("Digite o valor de c: ");
		int c = scanner.nextInt();
		
		int delta = ((b * b) - 4 * a * c);
		
		int x = (int) ((-b * b) + Math.sqrt(delta) / 2 * a);
		
		if(a != 0) {
			if(delta <  0) {
				System.out.println("Não existe raiz");
			} else if(delta == 0) {
				System.out.println("Existe uma única raiz, e ela é: " + delta);
			}else {
				System.out.println("As duas raizes são: " + delta);
			}
		} else {
			System.out.println("Não é equação de segundo grau");
		}
		
		//Precisa ser corrigido
		
		scanner.close();
	}
}
