package estruturasRepeticao;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor = scanner.nextInt();
		
		int a = valor/100;
		int b = (valor * 10)/100;
		int c = (valor * 10) % 10;
		
		System.out.println(valor);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//Precisa ser terminado
	}
}
