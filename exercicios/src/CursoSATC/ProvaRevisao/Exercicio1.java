package ProvaRevisao;
import javax.swing.*;
public class Exercicio1 {
    public static void main(String[] args) {
        int senha = 2002;
        int adivnhar = 0;
        do {
            adivnhar = Integer.parseInt(JOptionPane.showInputDialog("Insira a senha."));
            if (senha != adivnhar){
                JOptionPane.showMessageDialog( null , "Senha incorreta!");

            }
            else {
                JOptionPane.showMessageDialog(null , "Senha Correta! Entre.");
            }
        }while (senha != adivnhar);
    }
}
