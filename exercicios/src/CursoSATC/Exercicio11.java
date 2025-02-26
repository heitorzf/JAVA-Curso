
 import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double produto1 , product2 , product3;
        produto1 = sc.nextDouble();
        product2 = sc.nextDouble();
        product3 = sc.nextDouble();
        if (produto1 < product2 && produto1 < product3) {
            System.out.println("O produto 1 é o mais barato");

        } else if (product2 < produto1 && product2 < product3) {
            System.out.println("O produto 2 é o menor ");

        }
        else {
            System.out.println("produto 3 é o mais barato, compre-o.");
        }
    }
}
