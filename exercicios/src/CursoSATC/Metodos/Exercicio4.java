package Metodos;

import javax.swing.*;

public class Exercicio4 {
    public static void main(String[] args) {
        double n1 , n2;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira sua nota 1:"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 2"));
        resultado(n1 , n2);
    }
    public static void resultado(double n1 , double n2) {
        double media = (n1 + n2) / 2;
        if (media < 5) {
            JOptionPane.showMessageDialog(null , "Reprovado");
        }
        else if (media < 7 ) {
            JOptionPane.showMessageDialog(null , "Recuperacao");
        }
        else {
            JOptionPane.showMessageDialog(null , "Aprovado");
        }




    }
}
