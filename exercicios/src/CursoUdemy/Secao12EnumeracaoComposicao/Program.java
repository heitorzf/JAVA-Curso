package Secao12EnumeracaoComposicao;

import Secao12EnumeracaoComposicao.entities.program.Order;
import Secao12EnumeracaoComposicao.entities.program.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Order order = new Order(1080 , new Date() , OrderStatus.PENDING_PAYMENT);
        System.out.println(order);
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os2);
    }

}
