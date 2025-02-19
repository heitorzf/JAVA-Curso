import java.util.Scanner;


public class Exercicio1 {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.println("Insira seu nome, cidade , estado e telefone:");
       String nome = sc.nextLine();
       String cidade,  estado;
       cidade = sc.nextLine();
       estado = sc.nextLine();
       int telefone = sc.nextInt();
        System.out.printf("Nome: %s%nCidade: %s%nEstado: %s%nTelefone: %d" , nome , cidade , estado , telefone);


    }
}