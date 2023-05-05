import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double peso, altura;
		String nome, genero;
		
		System.out.println("Digite o seu Nome: ");
		nome= scanner.next();		
		System.out.println("Digite seu genero: ");
		genero= scanner.next();
		System.out.println("Digite sua altura: ");
		altura= scanner.nextDouble();
		
		//Não da para usar == com Strings
		if(genero.equalsIgnoreCase("feminino")) {
			peso = 62.1 * altura - 44.7;
		}
		else {
			peso = 72.7 * altura - 58;
		}
		
		System.out.println(nome + "seu peso ideal é: " + peso);
 
		scanner.close();

	}

}
