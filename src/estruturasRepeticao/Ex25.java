package estruturasRepeticao;

public class Ex25 {

	public static void main(String[] args) {
		
		int soma = 0;
		
		for(int i = 0; i < 1000; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				System.out.println(i);
				soma = soma + i;
			}
		}
		System.out.println("A soma dos multiplos 3 ou 5 abaixo de 1000 é: " + soma);
	}
}
