import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia = sc.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terceira");
                break;
            case 4:
                System.out.println("Quarta feira");
                break;
            case 5:
                System.out.println("Quinta feira");
                break;
            case 6:
                System.out.println("Sexta Feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Digito incoerente com os dias.");
                break;
        }

    }
}
