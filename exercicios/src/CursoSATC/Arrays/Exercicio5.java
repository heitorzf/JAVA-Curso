package Arrays;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0 ; i < numeros[i] ; i++){
            numeros[i] = sc.nextInt();

        }
        System.out.println(MaiorNumero(numeros));

    }
    public static int MaiorNumero(int[] numeros){
        int aux = -3232313;
        for (int i = 0 ; i < numeros[i] ; i++){
            if (numeros[i] > aux ){
                aux = numeros[i];
            }
        }
        return aux;
    }
}
