import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira seu nome");
        String nome = sc.nextLine();
        System.out.println("Insira seu curso");
        String curso = sc.nextLine();
        System.out.println("Insira sua disciplina");
        String disciplina = sc.nextLine();
        System.out.println("Insira sua nota 1");
        double n1 , n2 , n3 , media;
        n1 = sc.nextDouble();
        System.out.println("Insira sua nota 2");
        n2 = sc.nextDouble();
        System.out.println("Insira sua nota 3");
        n3 = sc.nextDouble();
        media = (n1 + n2 + n3) / 3;
        System.out.println("Sua média foi: " + media);





    }
}
