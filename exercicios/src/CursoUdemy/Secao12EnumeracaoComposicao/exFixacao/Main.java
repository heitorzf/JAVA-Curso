package Secao12EnumeracaoComposicao.exFixacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY):");
        Date birthDate = sdf.parse(sc.next());
        sc.nextLine();
        Client client = new Client(name , email , birthDate);
        System.out.println("Enter Order data:");
        System.out.print("Status:");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());
        Order order = new Order(new Date() , status , client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1 ; i <= n ; i++) {
            System.out.println("Enter #" +i + " item data:" );
            System.out.print("Product name:");
            String productName = sc.nextLine();
            System.out.print("Product price:");
            double productPrice = sc.nextDouble();
            int quantity = sc.nextInt();
            sc.nextLine();
            Product p = new Product(productName , productPrice);
            OrderItem orderItem = new OrderItem(quantity , productPrice , p);
            order.addItem(orderItem);

        }
        System.out.println();
        System.out.println("Order summary:");
        System.out.println(order);
    }
}
