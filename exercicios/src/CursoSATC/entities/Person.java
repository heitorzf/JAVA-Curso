package entities;

public class Person {
    public String name;
    public int idade;
    public double altura , peso;

    public double imc(){
        return peso / (altura * altura);
    }
    public String toString(){
        return "O imc de "
                + name
                + " é "
                + imc();
    }

}
