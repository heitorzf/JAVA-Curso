package Lista2;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cargo = sc.nextLine();
        switch (cargo.toUpperCase().charAt(0)){
            case 'T':
                System.out.println("Tecnico: 1500");
                break;
            case 'E':
                System.out.println("Engenheiro de Software: 4500");
                break;
            case 'A':
                System.out.println("Analista de sistemas: 4499");
                break;
            case 'P':
                System.out.println("Programador: 4498");
                break;
            case 'W':
                System.out.println("Web designer: 4000");
                break;
            case 'G':
                System.out.println("Gerente de projetos: 5500");
                break;
            default:
                System.out.println("Erro");

        }
    }
}
