import javax.swing.*;
import javax.swing.JOptionPane.*;

public class AnaliseFrequencia {
    public static void main(String[] args){
        
        String aulas = JOptionPane.showInputDialog(null, "Digite o número total de aulas", "Aulas Dadas",JOptionPane.QUESTION_MESSAGE);
        String faltas = JOptionPane.showInputDialog(null, "Digite o número de faltas","Ausências",JOptionPane.QUESTION_MESSAGE);
        
        //Transformando variável tipo string em float
        float v1=Float.parseFloat(aulas);
        float v2=Float.parseFloat(faltas);
        float percent=(((v1-v2)*100)/v1);
        
        JOptionPane.showMessageDialog(null, "Frequencia de " + percent + " %","Resultado",JOptionPane.INFORMATION_MESSAGE);
    
        if (percent<60){
        JOptionPane.showMessageDialog(null, "Frequencia muito baixa","Aviso", JOptionPane.WARNING_MESSAGE);
        }
        else if (percent>=75){
        JOptionPane.showMessageDialog(null, "Frequencia Ideal - Certificado Liberado","Aviso", JOptionPane.WARNING_MESSAGE);
        }
        System.exit(0);
    }
}
