package estruturascondicionais;

import java.util.Random;
import java.util.Scanner;

public class Ex29 {

	public static void main(String args[]) {
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int qtPerguntas = 1;
		int acertos = 0;	
		
		for(int i = 0; qtPerguntas <= 5; i++) {
			int valorA = random.nextInt(100);
			int valorB = random.nextInt(100);
			int resposta = valorA + valorB;
			
			System.out.println("Quanto é a soma de : " + valorA + " + " + valorB);
			int respostaAluno = scanner.nextInt();
			
			if(respostaAluno == resposta) {
				System.out.println("Parabens, você acertou! A soma de " + valorA + " + " + valorB + " é: " + resposta);
				acertos++;
			} else {
				System.out.println("Resposta incorreta: A soma de " + valorA + " + " + valorB + " é: " + resposta);
			}
			qtPerguntas++;
			
		}
		
		System.out.println("Voce acertou " + acertos + "de 5 questões");
		
		scanner.close();
	}
}
