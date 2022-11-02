package estruturascondicionais;

import java.util.Scanner;



public class Ex36 {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor da venda");
		double valorVenda = scanner.nextDouble();
		
		double comissao;
	
		if(valorVenda >= 100000) {
			 comissao = 700.00 + ((valorVenda * 16) / 100);
			 System.out.println("A venda foi de " + valorVenda + " e a comissao de " + comissao);
		}else if (valorVenda < 100000 && valorVenda >= 80000) {
			 comissao = 650.00 + ((valorVenda * 14) / 100);
			 System.out.println("A venda foi de " + valorVenda + " e a comissao de " + comissao);
		}else if(valorVenda < 80000 && valorVenda >= 60000) {
			 comissao = 600.00 + ((valorVenda * 14) / 100);
			 System.out.println("A venda foi de " + valorVenda + " e a comissao de " + comissao);
		}else if(valorVenda < 60000 && valorVenda >= 40000) {
			 comissao = 550.00 + ((valorVenda * 14) / 100);
			 System.out.println("A venda foi de " + valorVenda + " e a comissao de " + comissao);
		}else if(valorVenda < 40000 && valorVenda >= 20000) {
			 comissao = 500.00 + ((valorVenda * 14) / 100);
			 System.out.println("A venda foi de " + valorVenda + " e a comissao de " + comissao);
		} else {
			 comissao = 400.00 + ((valorVenda * 14) / 100);
			 System.out.println("A venda foi de " + valorVenda + " e a comissao de " + comissao);
		}
		
		scanner.close();
	}
}
