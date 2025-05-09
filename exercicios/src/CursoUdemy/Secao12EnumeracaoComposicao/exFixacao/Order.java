package Secao12EnumeracaoComposicao.exFixacao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    public void addItem(OrderItem item) {
        items.add(item);
    }
    public void removeItem(OrderItem item) {
        items.remove(item);
    }
    public double total() {
       double sum = 0;
       for (OrderItem c : items) {
           sum += c.subTotal();
       }
       return sum;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order Moment:");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order Status: ");
        sb.append(status + "\n");
        sb.append("Client:");
        sb.append(client.getName() +" ");
        sb.append(new SimpleDateFormat("dd/MM/yyyy").format(client.getBirthDate()));

        sb.append(client.getEmail() + "\n");
        sb.append("Order Items:" + "\n");
        for (OrderItem orderItem : items) {
            sb.append(orderItem);
        }
        return sb.toString();




    }
}
