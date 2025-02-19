 
/*Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas 
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o 
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0). 
 
Se o ponto estiver na origem, escreva a mensagem “Origem”. 
 
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a 
situação. */
package estruturacondicional;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x , y;
		System.out.println("Insira o valor da coordenada x:");
		x = sc.nextDouble();
		System.out.println("Insira o valor da coordenada y:");
		y = sc.nextDouble();
		if (x == 0 && y == 0) {
			System.out.println("Origem.");
		}
		else if (x == 0){
		System.out.println("Apenas Eixo Y fora da origem.");
		}
		else if (y == 0) {
			System.out.println("Apenas Eixo X fora da origem.");
		}
		else if (x > 0 && y > 0) {
			System.out.println("Primeiro quadrante.");
		}else if (x < 0 && y > 0) {
			System.out.println("Segundo quadrante.");
		}else if (x < 0 && y < 0) {
			System.out.println("Terceiro quadrante.");
			}else if (x > 0 && y <0 ) {
				System.out.println("Quarto quadrante.");
			}
		sc.close();
	}

}
