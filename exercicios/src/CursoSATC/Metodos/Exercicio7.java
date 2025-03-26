package Metodos;

import javax.swing.*;

public class Exercicio7 {
    public static void main(String[] args) {
        countset();
    }

    public static void countset() {
        int countA = 0, countP = 0, countC = 0;
        for (int i = 0; i < 5; i++) {
            String setor = JOptionPane.showInputDialog("Digite o seu setor entre: A , P , C");
            if (setor.equalsIgnoreCase("A")) {
                countA += 1;
            } else if (setor.equalsIgnoreCase("P")) {
                countP += 1;
            } else if (setor.equalsIgnoreCase("C")) {
                countC += 1;
            }


        }
        JOptionPane.showMessageDialog(null, "Almoxerifado:" + countA
        + "\nProdução:" + countP
        + "\nContabilidade:" + countC);

    }


}
