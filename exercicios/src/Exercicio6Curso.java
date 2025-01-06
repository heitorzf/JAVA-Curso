
/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
mostre:  
a) a área do triângulo retângulo que tem A por base e C por altura.  
b) a área do círculo de raio C. (pi = 3.14159)  
c) a área do trapézio que tem A e B por bases e C por altura.  
d) a área do quadrado que tem lado B.  
e) a área do retângulo que tem lados A e B. */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6Curso {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double A , B , C , triangulo , circulo , trapezio , quadrado , retangulo;
		//A base , B base e C altura/raio
		Scanner sc = new Scanner(System.in);
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		triangulo = A * C / 2;
		circulo = Math.pow(C, 2) * 3.14;
		trapezio = (A + B) * C/ 2;
		quadrado = Math.pow(A, 2);
		retangulo = A*B;
		System.out.printf("Triangulo:%.2f\nCirculo:%.2f\nTrapézio:%.2f\nQuadrado:%.2f\nRetangulo:%.2f\n" , triangulo , circulo , trapezio , quadrado , retangulo);
		

	}

}
