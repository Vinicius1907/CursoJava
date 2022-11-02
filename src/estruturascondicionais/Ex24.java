package estruturascondicionais;

import java.util.Scanner;

public class Ex24 {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor da compra: ");
		double valorCompra = scanner.nextDouble();
		
		System.out.println("Escolha o estado de incidencia do imposto: ");
		int estado = scanner.nextInt();
		
		if(estado == 1) {
			
			System.out.println("A incidencia de imposto em Minas Gerais é de 7%");
			valorCompra += ((valorCompra * 7)/100);
			System.out.println("O valor final da compra é de: " + valorCompra + "R$");
			
		} else if (estado == 2) {
			
			System.out.println("A incidencia de imposto em São Paulo é de 12%");
			valorCompra += ((valorCompra * 12)/100);
			System.out.println("O valor final da compra é de: " + valorCompra + "R$");
			
		} else if (estado == 3) {
			
			System.out.println("A incidencia de imposto no Rio de Janeiro é de 15%");
			valorCompra += ((valorCompra * 15)/100);
			System.out.println("O valor final da compra é de: " + valorCompra + "R$");
			
		} else if (estado == 4) {
			
			System.out.println("A incidencia de imposto em Mato Grosso é de 8%");
			valorCompra += ((valorCompra * 8)/100);
			System.out.println("O valor final da compra é de: " + valorCompra + "R$");
		
		} else {
			System.out.println("Digite um estado válido: ");
		}
		
		scanner.close();
	}
}
