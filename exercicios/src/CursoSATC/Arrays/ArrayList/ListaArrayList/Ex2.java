package Arrays.ArrayList.ListaArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos deseja cadastrar?");
        int quant = sc.nextInt();
        sc.nextLine();
        for ( int i = 0 ;  i < quant ; i++) {
            String nome = sc.nextLine();
            nomes.add(nome);
            System.out.println("Deseja deletar algum nome?" );
            String op = sc.nextLine();
            if( op.equalsIgnoreCase("sim")){
                for ( String vect : nomes ) {
                    System.out.print(vect + "-");
                }
                System.out.println(" ");
                System.out.println("Nome que deseja deletar:");
                String nomeDelete = sc.nextLine();
                nomes.remove(nomeDelete);
                System.out.println("Ficou assim depois da remoção:");
                for ( String vect : nomes ) {
                    System.out.print(vect + "-");
                    System.out.print(":");


                }
            }


        }

    }
}
