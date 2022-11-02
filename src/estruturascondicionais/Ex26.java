package estruturascondicionais;

import java.util.Scanner;

public class Ex26 {

	public static void main(String args[]) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite a quantidade de km rodado");
	double km = scanner.nextDouble();
	
	System.out.println("Digite a quantidade de litros gastos pelo carro: ");
	double gasolina = scanner.nextDouble();
	
		if(km / gasolina < 8 ) {
			System.out.println("Venda o carro!");
		} else if(km / gasolina >= 8 && km / gasolina <= 14) {
			System.out.println("Economico!");
		} else {
		System.out.println("Super economico!");
		}
		
		scanner.close();
	}
}