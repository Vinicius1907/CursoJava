package estruturascondicionais;

public class Ex10 {

	
	public static void main(String args[]) {
	
		double altura = 1.90;
		
		int sexo = 1;
		
		double pesoIdeal;
		
		
		if(sexo == 1) {
			pesoIdeal = ((72.7 * altura) - 58);
		}else {
			pesoIdeal = ((62.1 * altura) - 44.7);
		}
		
		System.out.println("Seu peso ideal é: " + pesoIdeal);
		
	}
}
