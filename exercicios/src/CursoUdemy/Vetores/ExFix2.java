package Vetores;

import java.util.Scanner;

public class ExFix2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0 ;
        double[] numeros = new double[10];
        for (int i = 0 ; i < numeros.length ; i++) {
            numeros[i] = sc.nextDouble();
             soma += numeros[i];

        }
        System.out.print("VALORES: ");
        for (int i = 0 ; i < numeros.length ; i++) {
            System.out.printf("%.2f " , numeros[i]);
        }
        System.out.println("Soma = " + soma);
        System.out.println("Media =" + soma / numeros.length);

    }
}
