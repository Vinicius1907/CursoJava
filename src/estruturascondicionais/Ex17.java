package estruturascondicionais;

import java.util.Scanner;

public class Ex17 {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a base maior do trapézio");
		int baseMaior = scanner.nextInt();
		
		System.out.println("Digite a base maior do trapézio");
		int baseMenor = scanner.nextInt();
		
		System.out.println("Digite a altura do trapézio");
		int altura = scanner.nextInt();
		
		if(baseMaior > 0 && baseMenor > 0 ) {
			
			int calculoTrapezio = (((baseMaior + baseMenor) * altura) / 2);
			System.out.println("A area do trapézio é de: " + calculoTrapezio + "M²");
		}else {
			System.out.println("Valores Invalidos");
		}
		
		scanner.close();
	}
}
