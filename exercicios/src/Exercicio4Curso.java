/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
decimais. */
import java.util.Locale;
import java.util.Scanner;

public class Exercicio4Curso {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); //muito interessante sempre lembrar de setar o padrão para o americano, visto que pode bugar na entrada de dados relacionadas ao tipo Double.
		int numeroFuncionario , horas;
		double salario , valorHora;
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual seria o numero do funcionario?\n");
		numeroFuncionario = sc.nextInt();
		System.out.println("Agora, informe a quantidade de horas que o funcionario trabalha:\n");
		horas = sc.nextInt();
		System.out.println("Agora insira o valor que é dado por horas trabalhdas:\n");
		valorHora = sc.nextDouble();
		salario = valorHora * horas;
		System.out.printf("O numero do funcionario é %d , trabalha %d horas e o seu salário é %.2f", numeroFuncionario ,horas,  salario);
		
		sc.close();
	}

}
