package Repeticao;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome , disciplina;
        double n1 , n2;

        for (int i = 0; i < 5; i++  ){
            nome = sc.nextLine();
            disciplina = sc.nextLine();
            n1 = sc.nextDouble();
            n2 = sc.nextDouble();
            sc.nextLine();
            double media = (n1 + n2) / 2;
            if (media < 5) {
                System.out.println("Reprovado");
                System.out.printf("\n%d Seu nome é %s, disciplina %s e media:%f\n", i+1 , nome , disciplina , media);
            }
            else if (media >=5 && media < 7){
                System.out.println("Recuperação");
                System.out.printf("\n%d Seu nome é %s, disciplina %s e media:%f\n", i+1 , nome , disciplina , media);
            }
            else{
                System.out.println("Aprovado!!!");
                System.out.printf("\n%d Seu nome é %s, disciplina %s e media:%f\n", i+1 , nome , disciplina , media);
        }}
        System.out.println("acabou");

    }
}
