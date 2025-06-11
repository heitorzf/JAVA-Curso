package Arrays.ArrayList.ExercicioArrayList;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<AnimalDomestico> animais = new ArrayList<>();
        int quantidade = sc.nextInt();
        sc.nextLine();
        System.out.println("Insira o nome dele:");
        String nome = sc.nextLine();
        System.out.println("Insira a idade dele:");
        int idade = sc.nextInt();

        String raca;
        for (int i = 0 ; i < quantidade ; i++) {
            System.out.println("Menu:" +
                    "A)Cachorro\n"
                    +"B)Gato\n" +
                    "C)Peixe");
            char escolha = sc.next().charAt(0);
            sc.nextLine();
            if (escolha == 'A') {
                System.out.println("Insira a raça do seu cachorro:");
                raca = sc.nextLine();
                animais.add(new Cao(nome ,idade , raca));

            }
            else if (escolha == 'B') {
                System.out.println("Insira a raça do seu gato:");
                raca = sc.nextLine();
                animais.add(new Gato(nome ,idade , raca));

            }
            else {
                System.out.println("Insira o tipo do seu peixe:");
                raca = sc.nextLine();
                animais.add(new Peixe(nome ,idade , raca));
            }
        }
        System.out.println("Mostrando todas informações deles agora:");
        for (AnimalDomestico ani : animais) {
            System.out.println(ani);
            ani.alimentacao();
        }
    }
}
