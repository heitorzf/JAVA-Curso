/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos 
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em 
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.*/
package estruturacondicional;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor para verificar em qual intervalo ele se encontra:");
		double valor = sc.nextDouble(); //digitar com virgula por padrao brasileiro
		if (valor >= 0 && valor <= 25) {
			System.out.println("Intervalo: 0 a 25");
		}else if (valor <= 50) {
			System.out.println("Intervalo: 25 a 50 ");
		}else if (valor <= 75) {
			System.out.println("Intervalo: 50 a 75 ");
		}else if (valor <= 100) {
			System.out.println("Intervalo: 75 a 100 ");
		}else {
			System.out.println("Valor fora de intervalo. ");
		}
		sc.close();
		  

	}

}
