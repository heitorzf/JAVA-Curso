 
/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
casas decimais conforme exemplos. 
 
Fórmula da área: area = π . raio2 
 
Considere o valor de π = 3.14159 */

import java.util.Scanner;

public class Exercicio2Curso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double raio , area;
		System.out.println("Insira o valor do raio: ");
		raio = sc.nextDouble();
		area = 3.14159 * Math.pow(raio, 2);
		System.out.printf("O valor da area do circulo é: %.4f" , area);
		sc.close();

	}

}
