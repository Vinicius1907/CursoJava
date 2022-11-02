package estruturascondicionais;

import java.util.Scanner;

public class Ex35 {

	static boolean dataValida;
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o dia do mês: ");
		int dia = scanner.nextInt();
		
		System.out.println("Digite o mês do ano");
		int mes = scanner.nextInt();
		
		System.out.println("Digite o ano: ");
		int ano = scanner.nextInt();
		
		boolean anoBissexto = ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0;
		
		
		if(mes >= 1 && mes <=12) {
			
			if(mes == 2) {
				
				if(anoBissexto && dia >= 1 && dia <= 28) {
					dataValida = true;
				} else if (mes == 2 && anoBissexto == false && dia >= 1 && dia <= 29) {
					dataValida = true;
				} else {
					dataValida = false;
				}
				
			} else if(dia >= 1 && dia <= 30) {
				dataValida = true;
			}
			
			
		}
		
		System.out.println(dataValida);
		scanner.close();
	}
}
