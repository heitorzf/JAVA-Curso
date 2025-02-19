import entities.Person;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Person x;
    x = new Person();
    x.name = sc.next();
    x.altura = sc.nextDouble();
    x.idade = sc.nextInt();
    x.peso = sc.nextDouble();
    System.out.println(x.toString());




    }
}
