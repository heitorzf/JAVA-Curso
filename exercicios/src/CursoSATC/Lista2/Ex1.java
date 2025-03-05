package Lista2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        System.out.println("Agora insira a sigla do seu curso: ");
        String sigla = sc.nextLine();
        switch (sigla.toUpperCase()){
            case "ADM":
                System.out.println("Administração");
                break;
            case "DIR":
                System.out.println("Direito");
                break;
            case "CEX":
                System.out.println("Comércio Exterior");
                break;
            default:
                System.out.println("Curso inserido desconhecido");
        }
    }
}
