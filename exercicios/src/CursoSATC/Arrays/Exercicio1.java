package Arrays;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] array = new double[5];

        for (int i = 0 ; i < array.length ; i++) {
            array[i] = sc.nextDouble();
        }
        for (int i = 0 ; i < array.length ; i++) {
            System.out.println("Temperatura " + (i+1) + ":" + array[i]);
        }
    }
}
