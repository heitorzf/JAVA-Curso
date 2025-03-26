package Metodos;

import javax.swing.*;

public class Exercicio9 {
    public static void main(String[] args) {
        contadorUniversidade();
    }
    public static void contadorUniversidade(){
        int contMaior = 0 , contMenor = 0 , contF = 0 , contM = 0;

        for (int i = 0 ; i <5 ; i++){
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade do aluno"));
            String sexo = JOptionPane.showInputDialog("Insira o sexo do aluno");
            if (idade < 18) {
                contMenor += 1;
            }
            else {
                contMaior += 1;
            }
            if (sexo.equalsIgnoreCase("F")){
                contF += 1;

            }
            else if (sexo.equalsIgnoreCase("M")){
                contM++;
            }
        }
        JOptionPane.showMessageDialog(null , "Alunos homens:" + contM + " Alunas mulheres" + contF
         + " Alunos menores de idade:" + contMenor + " Alunos maiores de idade: " + contMaior);
    }
}
