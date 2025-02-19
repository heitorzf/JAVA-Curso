package estruturacondicional;

/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. 
package estruturacondicional;*/

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horainicio , horafinal , duracao;
		horainicio = sc.nextInt();
		horafinal = sc.nextInt();
		if (horainicio < horafinal) {
		duracao = horafinal - horainicio ;
		}
		else {
			duracao = 24 - (horainicio + horafinal);
		}
		System.out.println("Duração foi de: " + duracao);
		sc.close();
	}

}
