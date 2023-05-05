import java.util.Scanner;

/* programa para ler uma letra e imprimir uma 
 * mensagem dizendo se é ou não uma vogal */

public class ex6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String letra;
		
		System.out.println("Digite uma letra: ");
		letra= scanner.next();
		
		//converte a letra em minusculo
		letra = letra.toLowerCase();
		
		//Se a mensagem for igual em todos os cases coloca só no último!
		switch(letra) {
			case "a":
			case "e":
			case "i":	
			case "o":	
			case "u":	
				System.out.println("É uma vogal.");
			break;
			
		}
			
		scanner.close();
		
	}

}
