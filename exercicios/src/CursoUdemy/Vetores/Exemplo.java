package Vetores;

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            classExemplo[] vetor = new classExemplo[n];
            for (int i = 0 ; i < n ; i++){
                sc.nextLine();
                String name = sc.nextLine();
                double price = sc.nextDouble();
                vetor[i] = new classExemplo(name, price);

            }
            double sum = 0.0;
            for ( int i = 0 ; i < n ; i++){
                sum += vetor[i].getPrice();
            }
        System.out.println(sum);
    }
}
