package Vetores.Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Heitor");
        nomes.add("Vanessa");
        nomes.add("Leonardo");
        nomes.add("Vincent");
        nomes.add(0 , "Yokoso Fernando");
        nomes.addFirst("Yokoso 2");
        System.out.println("-------------------------------------------------");
        for (String a : nomes) {
            System.out.println(a);
        }
        System.out.println("-------------------------------------------------");
        nomes.remove("Heitor");
        nomes.removeIf( x -> x.charAt(0) == 'Y');



        for (String a : nomes) {
            System.out.println(a);
        }
        System.out.println("--------------------------------------");
        System.out.println("Index of vincent:" + nomes.indexOf("Vincent")); // se ele n encotnra o usuario, retorna -1
        List<String> result = nomes.stream().filter( x -> x.charAt(0) == 'L').collect(Collectors.toList());
        for (String a : result) {
            System.out.println(a);
        }
    }
}
