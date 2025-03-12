package Interfaces;
import javax.swing.*;

public class Exemplo {
    public static void main(String[] args) {

        double cel = Double.parseDouble(JOptionPane.showInputDialog("Temperatura em celcius"));


        double far = (9.0 / 5.0) * cel + 32;


        JOptionPane.showMessageDialog(null, "Fahrenheit: " + far);
    }
}
