package Interfaces;

import javax.swing.*;

public class Exercicio8 {
    public static void main(String[] args) {
        int idade;
        for (int i = 0 ; i <= 3 ; i++){
           idade =  Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade: "));
           if (idade <= 3) {
           JOptionPane.showMessageDialog(null , "Bebê");
           }
           else if (idade <= 11){
               JOptionPane.showMessageDialog(null , "Criança");
           }
           else if (idade <= 17){
               JOptionPane.showMessageDialog(null , "Adolescente");
           }
        }
    }
}
