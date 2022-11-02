package estruturascondicionais;

import java.util.Scanner;

public class Ex33 {

	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o preco antigo: ");
		double precoAntigo = scanner.nextDouble();
		
		if(precoAntigo < 50) {
			int porcentagem = 5;
			double precoNovo = precoAntigo + ((precoAntigo * porcentagem) / 100);
			System.out.println("O novo preço do produto é: " + precoNovo);
		} else if (precoAntigo >= 50 && precoAntigo <= 100) {
			int porcentagem = 10;
			double precoNovo = precoAntigo + ((precoAntigo * porcentagem) / 100);
			System.out.println("O novo preço do produto é: " + precoNovo);
		} else {
			int porcentagem = 15;
			double precoNovo = precoAntigo + ((precoAntigo * porcentagem) / 100);
			System.out.println("O novo preço do produto é: " + precoNovo);
		}
		
		scanner.close();
	}
}
