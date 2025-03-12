package Interfaces;

import javax.swing.*;

public class Exercicio7 {
    public static void main(String[] args) {
        String nome , opcao;
        int horasTrab;
        double salario , valorHora  , salariofinal;
        do{
            nome = JOptionPane.showInputDialog("Insira o nome do funcionario: ");
            valorHora = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da hora trabalhada"));
            horasTrab = Integer.parseInt(JOptionPane.showInputDialog("Quantas horas o funcionario trabalhar: "));
            salario = valorHora * horasTrab;
            salariofinal = salario * 0.98;
            JOptionPane.showMessageDialog(null , "O salario final do funcionario foi de: " + salariofinal);
            opcao = JOptionPane.showInputDialog("Você deseja inserir outro usuario? Sim/Não: ");


        }while (opcao.equalsIgnoreCase("Sim"));
    }
}
