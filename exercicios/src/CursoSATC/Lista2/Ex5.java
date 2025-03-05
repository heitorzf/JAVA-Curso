package Lista2;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 , n2 , resultado;
        System.out.println("Insira os dois numeros a seguir: ");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        System.out.println("Digite a operação que deseja, adicao, subtracao, multi, divi");
        String operacao = sc.nextLine();
        resultado = 0;
        if (operacao.equals("adicao")) {
            resultado = n1 + n2;



        }
        else if (operacao.equals("subtracao")){
            resultado = n1 - n2;

        }
        else if (operacao.equals("multi")){
            resultado = n1 * n2;

        }
        else if (operacao.equals("divi")){
            resultado = n1 / n2;
            System.out.println("O resultado da " + resultado);
        }
        else {
            System.out.println("Valor incorreto.");
        }
        System.out.println("O resultado da " + resultado);



    }
}
