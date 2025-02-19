import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorCarro = sc.nextDouble();
        double valorFinal = valorCarro + (valorCarro*0.35) + (valorCarro * 0.2);
        System.out.println("O valor final do seu carro foi de:" + valorFinal);

    }
}
