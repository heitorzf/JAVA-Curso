import java.util.Scanner;


public class Exercicio4 {

    public static void main(String[] args) {
        System.out.println("Por favor, insira nome,  cargo e salario do funcionario");
        Scanner sc = new Scanner(System.in);
        String nome , cargo;
        double salario;

        nome = sc.nextLine();
        cargo = sc.nextLine();
        salario = sc.nextDouble();
        double comAumento = salario + salario * 0.05;
        System.out.printf("O salário final do funcionario é:%.2f", comAumento);


    }

}
