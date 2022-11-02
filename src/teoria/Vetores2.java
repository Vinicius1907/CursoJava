package teoria;

public class Vetores2 {

	public static void main(String[] args) {
		
		//Declaração e definição de tamanho do vetor
		int numeros[] = new int[10];
		
		System.out.println("Tamanho do vetor: " + numeros.length);
		
		for(int i = 0; i < numeros.length; i++) {
			//numeros[] = i + 3;
			numeros[i] = i + 3;
			//numeros[9] = i + 3;
		}
		
		System.out.println(numeros[0]); //Primeiro elemento
		System.out.println(numeros[9]); //Ultimo elemento
		
		//0..9
		//numeros[10] = 42;
		//System.out.println(numeros[10]); -> Vai gerar um erro
		/*
		 * Os vetores/arrays possuem tamanho fixo e não podem
		 * ser aumentados/diminuídos
		 */
		
		numeros[0] = 7;
		System.out.println(numeros[0]); //Vai virar 7, os valores não são imutaveis
		
		//numeros[0] = 23.4f; -> Vai gerar um erro
		/*
		 *Os vetores/arrays possuem tipos de dados fixos e 
		 *não aceitam tipos variados;
		 *
		 */
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[1] = (int)Math.round(Math.random() * 10);
		}
		
		System.out.println(numeros[0]); //Primeiro elemento
		System.out.println(numeros[9]); //Ultimo elemento
		
		//0..1 double
		System.out.println(Math.random()); //Math.random gera um Double entre 0 e 1
		
		System.out.println(Math.random() * 10); //Aqui estamos multiplicando por 10 pra aumentar o range de valores 
		
		System.out.println(Math.round(Math.random() * 10)); //Math.round arredonda o valor pra um numero inteiro
		
		for (int i : numeros) {
			System.out.println(i);
		}
		
	}
}
