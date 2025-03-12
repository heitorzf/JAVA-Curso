package Interfaces;

import javax.swing.*;

public class Exercicio6 {
    public static void main(String[] args) {
        String nome;
        int idade;
        double altura , peso ;
        nome = JOptionPane.showInputDialog("Insira seu nome: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Insira sua altura: "));
        peso = Double.parseDouble(JOptionPane.showInputDialog("Insira o seu peso:"));
        JOptionPane.showMessageDialog(null , "Seu IMC é: " + peso / (altura * altura));

    }
}
