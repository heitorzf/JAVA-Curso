/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
mensagem explicativa, conforme exemplos. */
import java.util.Scanner;

public class Exercicio1Curso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2 , soma;
		
		System.out.println("Insira o primeiro valor: ");
		n1 = sc.nextInt();
		System.out.println("Agora Insira o segundo valor: ");
		n2 = sc.nextInt();
		soma = n1 + n2;
		System.out.printf("Soma: %d" , soma);
		
		
		sc.close();

	}

}
