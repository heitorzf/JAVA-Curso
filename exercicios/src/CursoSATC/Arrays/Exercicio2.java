package Arrays;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int menor = 894329384;
        int maior = -403430440;
        for (int i = 0 ; i < numeros.length ; i++) {
            System.out.println("Insira o numero:");
            numeros[i] = sc.nextInt();
            if (numeros[i] > maior){
                maior = numeros[i];
            }
            else if (numeros[i] < menor) {
                menor = numeros[i];
            }
            System.out.println("menor:" + menor + " maiores:" + maior);
        }


    }
}
