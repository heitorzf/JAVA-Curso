package Repeticao;
import java.util.Scanner;
public class Ex2
         {
             public static void main(String[] args) {
                 Scanner sc = new Scanner(System.in);
                 int i  = 0;
                 while ( i <  5) {
                     i++;
                     System.out.println("Insira seu nome:");

                     String setor = sc.nextLine();
                     switch (setor.toUpperCase().charAt(0)) {
                         case 'A':
                             System.out.println("Amaoxerifado");
                             break;
                         case 'P':
                             System.out.println("Produção");
                             break;
                         case 'C':
                             System.out.println("Contabilidade");
                             break;
                         case 'V':
                             System.out.println("Vendas");
                             break;
                         default:
                             System.out.println("Valor incorreto");

                     }
                     System.out.println(i);
                 }
                 System.out.println("Acabou");

             }
}
