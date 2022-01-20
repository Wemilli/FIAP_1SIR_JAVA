package listaescolha;

import javax.swing.*;

public class ListaEscolha {
    
    public static void main(String[] args){
    
        Object[] itens = {"Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira"};
        
String selectedValue = (String) JOptionPane.showInputDialog(null, "Escolha um dia da semana", "Opção",JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

JOptionPane.showMessageDialog(null, "O dia escolhido para a consulta foi: "+""+selectedValue);
    }
}
