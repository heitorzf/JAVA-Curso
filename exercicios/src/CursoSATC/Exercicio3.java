import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome , produto;
        int quantidade;
        double preco , total;
        nome = sc.nextLine();
        produto = sc.nextLine();
        quantidade = sc.nextInt();
        preco = sc.nextDouble();
        total = preco * quantidade;
        System.out.println("O total da compra deste produto foi de "+total);





    }
}
