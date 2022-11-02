package teoria;

import java.util.Scanner;

/*
 * Receba dados do usuário enquanto a idade for maior que 0
 * */

public class WhileDoWhile {

	public static void main(String[] args) {
	
	int idade = 1;
	String nome;
	
	Scanner teclado = new Scanner(System.in);
	
	//Sempre checa o valor antes de executar o bloco
	//No DoWhile ele executa o bloco e depois checa o valor
	
	while(idade > 0) {
	
	System.out.println("Qual seu nome?: ");
	nome = teclado.nextLine();
	
	System.out.println("Qual sua idade?: ");
	//idade = teclado.nextInt();
	idade = Integer.parseInt(teclado.nextLine());
	
	if(idade > 0) {
		System.out.println(nome + " tem " + idade + " anos");
		}
	}
	
	teclado.close();
	
	}
}
