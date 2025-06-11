package Arrays.ArrayList.ListaArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        System.out.println("Escreva o nome que deseja cadastrar, caso queira sair digite sair");
        String nome;
        Scanner sc = new Scanner(System.in);
        while (true) {
            nome = sc.nextLine();
            if (nome.equalsIgnoreCase("sair")){
                break;
            }
            nomes.add(nome);


        }
        for (String vect : nomes) {
            System.out.println(vect);
        }
    }
}
