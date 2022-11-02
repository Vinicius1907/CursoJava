package estruturasRepeticao;

/*
 * Faça um programa que determine os cinco primeiros multiplos de 3, considerando numeros maiores que 0
 * */

public class Ex1 {
	
	public static void main(String[] args) {
		
		int valorBase = 3;
		
		for(int i = 1; i < 6; i++) {
			System.out.println(valorBase * i);
		}
	}
}
