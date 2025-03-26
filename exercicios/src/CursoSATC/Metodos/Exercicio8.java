package Metodos;

import javax.swing.*;

public class Exercicio8 {
    public static void main(String[] args) {
        countensino();
    }

    public static void countensino() {
        int countF = 0, countM = 0, countT = 0;
        for (int i = 0; i < 300; i++) {
            String setor = JOptionPane.showInputDialog("Digite a sua formacao entre: A , P , C");
            if (setor.equalsIgnoreCase("A")) {
                countF += 1;
            } else if (setor.equalsIgnoreCase("P")) {
                countM += 1;
            } else if (setor.equalsIgnoreCase("C")) {
                countT += 1;
            }


        }
        JOptionPane.showMessageDialog(null, "Ensino fundamental:" + countF
                + "\nEnsino Médio:" + countM
                + "\nEnsino Técnico:" + countT);

    }


}
