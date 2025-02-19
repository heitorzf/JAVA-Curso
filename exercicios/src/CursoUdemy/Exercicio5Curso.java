/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/

//peça1 e peça2 nesse caso seriam nome de produtos pré definidos, para facilitar a realização e compreensão do exercício.
import java.util.Locale;
import java.util.Scanner;
public class Exercicio5Curso {


public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codPeca1 , quantPeca1 , codPeca2 , quantPeca2;
		double valorPeca1 , valorPeca2 , total;
		System.out.println("Por favor, insira o codigo da peça1:\n");
		codPeca1 = sc.nextInt();
		System.out.println("Agora insira a quantidade de peca1:\n");
		quantPeca1 = sc.nextInt();
		System.out.println("Agora insira o preço unitário da peca1:\n");
		valorPeca1 = sc.nextDouble();
		System.out.println("Por favor, insira o codigo da peça2:\n");
		codPeca2 = sc.nextInt();
		System.out.println("Agora insira a quantidade de peca2:\n");
		quantPeca2 = sc.nextInt();
		System.out.println("Agora insira o preço unitário da peca2:\n");
		valorPeca2 = sc.nextDouble();
		total = valorPeca1 * quantPeca1 + valorPeca2 * quantPeca2;
		System.out.printf("Valor a ser pago: %.2f" , total);
		
		

	}

}
