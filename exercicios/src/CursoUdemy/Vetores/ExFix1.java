package Vetores;

import java.util.Scanner;

public class ExFix1 {
    public static void main(String[] args) {
        int[] numeros = new int[10];


        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i < numeros.length ; i++){
             numeros[i] = sc.nextInt();

        }
        for (int i = 0 ; i < numeros.length ; i++) {
            if (numeros[i] < 0){
             System.out.println("Numeros negativos: " + numeros[i]);
        }
    }
}}
