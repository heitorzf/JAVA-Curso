package Arrays.ArrayList.Revisao.ListaVetores.Ex1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int[] vetor= new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i < vetor.length ; i++) {
           int adiciona = sc.nextInt();
           vetor[i] = adiciona;

        }
        double soma = 0;
        for (int vect : vetor ){
            soma += vect;
        }
        System.out.println(soma);
     }
}
