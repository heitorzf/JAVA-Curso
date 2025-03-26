package Metodos;

import javax.swing.*;

public class Exercicio6 {
    public static void main(String[] args) {
        double n1 , n2;
        String op;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Numero 1:"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Numero 2:"));
        op = JOptionPane.showInputDialog("Operação: A , S , M , D");
        double resultado = operaoes(n1 , n2 , op);
        JOptionPane.showMessageDialog(null , resultado);
    }
    public static double operaoes(double n1 , double n2 ,String op){
        if (op.equalsIgnoreCase("A")){
            return n1+n2;
        }
        else if (op.equalsIgnoreCase("S")){
            return n1 - n2;
        }
        else if (op.equalsIgnoreCase("M")){
            return n1 * n2;
        }
        else if (op.equalsIgnoreCase("D")){
            return n1 / n2;
        }
        else {
            return 0;
        }


    }

}
