package estruturascondicionais;

import java.util.Scanner;

public class Ex32 {

	static double produto;
	static double pedido;
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o codigo do produto: ");
		int codigo = scanner.nextInt();
		
		System.out.println("Digite a quantidade desejada: ");
		int quantidade = scanner.nextInt();
		
		switch(codigo) {
		case 100:
			produto = 1.20;
			pedido = produto * quantidade;
			System.out.println("O valor do pedido é de: " + pedido + "R$");
			break;
		case 101:
			produto = 1.30;
			pedido = produto * quantidade;
			System.out.println("O valor do pedido é de: " + pedido + "R$");
			break;
		case 102:
			produto = 1.50;
			pedido = produto * quantidade;
			System.out.println("O valor do pedido é de: " + pedido + "R$");
			break;
		case 103:
			produto = 1.20;
			pedido = produto * quantidade;
			System.out.println("O valor do pedido é de: " + pedido + "R$");
			break;
		case 104:
			produto = 1.70;
			pedido = produto * quantidade;
			System.out.println("O valor do pedido é de: " + pedido + "R$");
			break;
		case 105:
			produto = 2.20;
			pedido = produto * quantidade;
			System.out.println("O valor do pedido é de: " + pedido + "R$");
			break;
		case 106:
			produto = 1.00;
			pedido = produto * quantidade;
			System.out.println("O valor do pedido é de: " + pedido + "R$");
			break;
		}
		
		scanner.close();
	}
}
