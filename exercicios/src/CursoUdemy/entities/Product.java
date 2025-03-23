package entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String nome , double preco , int quantidade){
        this.name = nome;
        this.price = preco;
        this.quantity = quantidade;

    }

    public Product(String nome , double preco){
        name = nome;
        price = preco;
        //o quantity foi iniciado com 0.


    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQuantity(){
        return quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}