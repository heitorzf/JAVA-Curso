package Lista2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a sigla do seu estado civil");
         String sigla = sc.nextLine();
        switch (sigla.toUpperCase().charAt(0)) {
            case 'S':
                System.out.println("Solteiro");
                break;

            case 'C':
                System.out.println("Casado");
                break;
            case 'V':
                System.out.println("Viúvo");
                break;
            case 'D':
                System.out.println("Divorciado");
                break;
            default:
                System.out.println("erro gamer.");

        }

    }
}
