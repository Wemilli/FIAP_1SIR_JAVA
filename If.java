import java.util.Scanner;

public class If {
    public static void main(String[] args){
        
        Scanner input = new Scanner (System.in);
        String nome;
        int idade;
        
        System.out.print("Qual é o seu nome? ");
        nome = input.next();
        System.out.print("Qual é a sua idade? ");
        idade = input.nextInt();
    
        if (idade >=18){
        System.out.println("Pode entrar no evento");
      }
        else{
        System.out.println("Não pode entrar no evento");   
        }
    }
}
