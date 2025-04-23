package Herancas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        Double comprimento = sc.nextDouble();
        Integer patas = sc.nextInt();
        sc.nextLine();
        String cor = sc.nextLine();
        String ambiente = sc.nextLine();
        Float vm = sc.nextFloat();
       Animal animal = new Animal(nome , comprimento , patas , cor , ambiente , vm);
        System.out.println("Nome: " + animal.getNome() +"\nComprimento:" + animal.getComprimento() + "\nNumero de patas:" + animal.getPatas() + "\nCor:" + animal.getCor() + "\nAmbiente:" + animal.getAmbiente() + "\nVelocidade media:" + animal.getVm());

    }
}
