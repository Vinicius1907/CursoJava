package teoria;

public class Foreach {

	public static void main(String[] args) {
		
		String nome = "Geek University";
		
		//Foreach não tem condição de parada,simplesmente iteramos sobre o item
		//Para cada um dos caracteres da string, imprima o caractere;
		for(char letra: nome.toCharArray()) {
		System.out.println(letra);
		}
	}
}
