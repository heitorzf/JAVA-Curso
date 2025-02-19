//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
package estruturacondicional;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		numero = sc.nextInt();
		if (numero < 0) {
			System.out.println("O numero inserido é negativo.");
		}
		else {
			System.out.println("O numero inserido é positivo");
		}
		sc.close();
	}

}
