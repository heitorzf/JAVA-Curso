//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
package estruturacondicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		numero = sc.nextInt();
		if (numero % 2 == 0) {
			System.out.println("O numero inserido é par");
		}
		else {
			System.out.println("O numero inserido é impar");
		}
		sc.close();

	}

}
