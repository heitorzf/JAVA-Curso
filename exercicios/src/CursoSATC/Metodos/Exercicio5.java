package Metodos;

import javax.swing.*;

public class Exercicio5 {
    public static void main(String[] args) {
        String escolha = JOptionPane.showInputDialog("Insira o seu estado civil S C V D").toUpperCase();
        estadoCivil(escolha);

    }
    public static void estadoCivil(String escolha) {
        switch (escolha) {
            case "S":
                JOptionPane.showMessageDialog(null , "Solteiro");
                break;
            case "C":
                JOptionPane.showMessageDialog(null , "Casado");
                break;
            case "V":
                JOptionPane.showMessageDialog(null , "Viuvo");
                break;
            case "D":
                JOptionPane.showMessageDialog(null , "Divorciado");
                break;
            default:
                JOptionPane.showMessageDialog(null , "Errado");
                break;
        }
    }
}

