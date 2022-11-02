package estruturasRepeticao;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de numeros a serem computados: ");
		int qtValores = scanner.nextInt();
		
		int maior = 0;
		int nRepeticoes = 0;
		
		for(int i = 0; i <= qtValores; i++) {
			System.out.println("Digite um valor: ");
			int valor = scanner.nextInt();
			
			if(valor > maior) {
				maior = valor;
				nRepeticoes = 0;
			} else if(valor == maior) {
				nRepeticoes++;
			}
			
		}
		
		System.out.println("O maior numero digitado foi: " + maior + " e o numero de vezes que este valor apareceu foi: " + nRepeticoes + " vezes");
	}
}
