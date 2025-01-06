/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). */

import java.util.Scanner;

public class Exercicio3Curso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a , b , c , d , diferenca;
		System.out.println("Insira o valor de a:");
		a = sc.nextInt();
		System.out.println("Insira o valor de b:");
		b = sc.nextInt();
		System.out.println("Insira o valor de c:");
		c = sc.nextInt();
		System.out.println("Insira o valor de d:");
		d = sc.nextInt();
		diferenca = (a*b - c*d);
		System.out.printf("A diferença entre os produtos: %d x %d - %d x %d é %d", a,b,c,d,diferenca);
		
		
		
	}

}
