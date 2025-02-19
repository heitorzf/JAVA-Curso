import entities.Triangle;

import java.util.Scanner;


public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle x;
        x = new Triangle();


       // double base , altura , area;
        x.base = sc.nextDouble();
        x.altura = sc.nextDouble();

        System.out.printf("A altura do triangulo é: %f" , x.area());

    }
}
