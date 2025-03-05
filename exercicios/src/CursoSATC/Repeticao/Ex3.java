package Repeticao;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fundcount = 0, mediocount = 0, tecnicocount = 0 , gradcount = 0;
        int i = 0;

        while (i < 5) {
            i++;
            System.out.println("Insira sua formação: Fundamental , Medio ,  Tecnico , Graduacao");
            String op = sc.nextLine();
            if (op.equalsIgnoreCase("FUNDAMENTAL")){
                fundcount += 1;

            }
            else if (op.equalsIgnoreCase("medio")) {
                mediocount +=1;
            }
            else if (op.equalsIgnoreCase("tecnico")){
                tecnicocount += 1;
            }
            else if (op.equalsIgnoreCase("graduacao")){
                gradcount += 1;
            }
            System.out.printf("\nFundamental: %d\nMédio: %d\nTecnico: %d\nGraduação: %d" , fundcount , mediocount , tecnicocount , gradcount);


        }
    }
}
