import java.util.Scanner;

/* programa para ler uma letra e imprimir uma 
 * mensagem dizendo se é ou não uma vogal */

public class ex5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String letra;
		
		System.out.println("Digite uma letra: ");
		letra= scanner.next();
		
		//converte a letra em minusculo
		letra = letra.toLowerCase();
		if(letra.equals("a") || letra.equals("e") ||letra.equals("i") || letra.equals("o")|| letra.equals("u")) {
			System.out.println("É uma vogal.");
		}

		scanner.close();
		
	}

}
