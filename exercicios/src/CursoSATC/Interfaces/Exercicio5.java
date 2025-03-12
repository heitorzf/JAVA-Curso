package Interfaces;
import javax.swing.*;

public class Exercicio5 {
    public static void main(String[] args) {
        double base , altura;

        base = Double.parseDouble(JOptionPane.showInputDialog("Insira a base do triangulo: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Insira a altura do triang: "));
        JOptionPane.showMessageDialog(null , "A area do Triangulo é: " + (base * altura) / 2);

    }
}
