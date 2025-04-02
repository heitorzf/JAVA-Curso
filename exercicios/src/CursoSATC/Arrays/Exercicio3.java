package Arrays;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int countPosi =0 ;
        int countNeg = 0;

        for (int i = 0 ; i < numeros.length ; i++ ) {
          numeros[i] =   sc.nextInt();
          if (numeros[i] < 0 ) {
              countNeg++;
              System.out.println("negativos: "+ countNeg);
          }
          else if (numeros[i] >=0 ) {
              countPosi++;
              System.out.println("Positivos: " + countPosi);
          }
        }
    }
}
