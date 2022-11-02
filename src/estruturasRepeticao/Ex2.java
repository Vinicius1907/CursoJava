package estruturasRepeticao;

public class Ex2 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			System.out.println(i + ": For");
	}
	
		int While = 1;
		
		while(While <= 100) {
			System.out.println(While + ": While");
			While++;	
		}
		
		int doWhile = 1;
		
		do {
			System.out.println(doWhile + ": DoWhile");
			doWhile++;
		} while (doWhile <= 100);
	}
}
