import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dia = 20 * 80 * 3;
        double semana , mes;
        semana = dia * 7;
        mes = dia * 30;
        System.out.printf("O valor de um dia em lotação é %.2f, de uma semana é %.2f e o mês é %.2f" , dia , semana , mes);

        sc.close();
    }
}
