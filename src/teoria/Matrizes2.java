package teoria;

public class Matrizes2 {

	public static void main(String[] args) {
		
		int numeros[][] = new int[3][3];
		
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros[i].length; j++) {
				numeros[i][j] = i + j * 2;
			}
		}
		
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros.length; j++) {
				System.out.println("numeros[" + i + "][" + j + "] = " + numeros[i][j]);
			}
		}
	}
}
