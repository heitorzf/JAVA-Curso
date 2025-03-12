package Interfaces;
import javax.swing.*;

public class Exercicio1 {
    public static void main(String[] args) {
        String nome , endereco , bairro , cidade , estado;
        int fone;
        nome = JOptionPane.showInputDialog("Nome: ");
        endereco = JOptionPane.showInputDialog("endereco: ");
        bairro = JOptionPane.showInputDialog("Bairro: ");
        cidade = JOptionPane.showInputDialog("Cidade: ");
        estado = JOptionPane.showInputDialog("Estado: ");
        fone = Integer.parseInt(JOptionPane.showInputDialog("Telefone: "));
        JOptionPane.showMessageDialog(null , "Nome: "+ nome+
        "\nendereco: " +endereco +
        "\nbairro: " + bairro +
                "\ncidade: " + cidade +
                "\nestado: " + estado +
                "\nfone: " + fone);

    }
}
