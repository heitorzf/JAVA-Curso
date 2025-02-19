import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        int numero = sc.nextInt();
        int horasTrabalhas = sc.nextInt();
        double valorHora = sc.nextDouble();
        double salario = valorHora * horasTrabalhas;
        double salarioBruto = salario + (salario * 0.02);
        System.out.println("O seu salario bruto é " + salarioBruto);

    }
}
