package estruturasRepeticao;

public class Ex3 {

	public static void main(String[] args) {
		
		int contador = 10;
		
		while(contador != 0) {
			System.out.println(contador);
			contador--;
			
			if(contador == 0) {
				System.out.println("FIM!");
			}
		}
	}
}
