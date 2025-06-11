package Arrays.ArrayList.Revisao.ListaVetores.Ex1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int[] vetor = {1 , 2 , 3 , 4 , 5 , 6 , 7 ,  8 ,  9 , 328999};
        int maior, menor;
        maior = -382392832;
        menor = 999999999;
        for (int vect : vetor) {
            if (vect < menor) {
                menor = vect;
            }
            if (vect > maior) {
                maior = vect;
            }
            System.out.println(maior);
            System.out.println(menor);
        }

    }
}
