package Arrays;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[10];
        int par = 0;

        int impar = 0 ;
        for (int i = 0 ; i < valores.length ; i++) {
            valores[i] = sc.nextInt();
            if (valores[i] % 2 == 0){
                par++;
            }
            else if (valores[i] % 2 == 1){
                impar++;
            }
            System.out.println("Impar:" + impar + "\nPar:" + par);
        }
    }
}
