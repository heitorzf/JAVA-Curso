package Metodos;

import javax.swing.*;

public class Exercicio3 {
    public static void main(String[] args) {
    double altura , peso , imc;
    peso = Double.parseDouble(JOptionPane.showInputDialog("Insira seu peso:"));
    altura = Double.parseDouble(JOptionPane.showInputDialog("Insira sua altura"));

    imc = IMC(peso , altura);
    JOptionPane.showMessageDialog(null,"Seu IMC é:" + imc);
    }


    public static double IMC(double peso ,double altura){
        return peso / (Math.pow(altura , 2));
    }
}
