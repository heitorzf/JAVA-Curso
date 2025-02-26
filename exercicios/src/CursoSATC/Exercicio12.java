import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media , n1 , n2;
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        media = (n1 + n2) / 2;
        if (media == 10 ){
            System.out.println("Aprovado com distinção");
        }
        else if (media >= 7) {
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }
        System.out.println("A media das duas notas é " );

    }
}
