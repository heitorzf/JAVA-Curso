/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A 
seguir, calcule e mostre o valor da conta a pagar. */
package estruturacondicional;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cachorroquente,xSalada,xBacon,torradaSimples,refrigerante , total;
		cachorroquente = 4.0;
		xSalada = 4.5;
		xBacon = 5.0;
		torradaSimples = 2.0;
		refrigerante = 1.5;
		total = 0.0;
		int opcao, quantidade;
		System.out.println("Digite o codigo de um produto que deseja dentre:\n1 - Cachorro Quente\n2 - X-Salada\n3 - X-Bacon\n4 - Torrada Simples\n5 - Refrigerante");
		opcao = sc.nextInt();
		System.out.println("Agora digite a quantidade:");
		quantidade = sc.nextInt();
		if (opcao == 1) {
			total = cachorroquente * quantidade;
		}
		else if (opcao == 2) {
			total = xSalada * quantidade;
		}
		else if (opcao == 3) {
			total = xBacon * quantidade;
		}
		else if (opcao == 4) {
			total = torradaSimples * quantidade;
			
		}
		else if (opcao == 5) {
			total = refrigerante * quantidade;
		}
		System.out.println("O total da sua compra foi de: " + total);
		sc.close();
	}

}
