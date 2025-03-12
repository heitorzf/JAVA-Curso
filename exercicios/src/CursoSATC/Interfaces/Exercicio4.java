package Interfaces;
import javax.swing.*;
public class Exercicio4 {
    public static void main(String[] args) {
        String nome , cargo;
        double salario;
        nome = JOptionPane.showInputDialog("Nome: ");
        cargo = JOptionPane.showInputDialog("Cargo:");
        salario = Double.parseDouble(JOptionPane.showInputDialog("Salário: "));
        JOptionPane.showMessageDialog(null ,"Salario antigo:"+ salario + "\nNovo Salario: "+  salario * 1.05);
    }
}
