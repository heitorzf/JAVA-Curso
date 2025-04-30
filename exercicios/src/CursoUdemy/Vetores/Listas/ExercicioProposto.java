package Vetores.Listas;

import Vetores.Listas.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto {
    public static void main(String[] args) {
        Integer id;
        Double salary;
        String nome;
        Scanner sc = new Scanner(System.in);
        int quantidade;
        System.out.println("Quantos funcionarios você quer registrar?");
        quantidade = sc.nextInt();
        sc.nextLine();
        List<Employee> vetor = new ArrayList<>();
        for (int i = 0 ; i < quantidade ; i++){
            System.out.println("Funcionario #" +(i+1));
            System.out.println("Id:");
            id = sc.nextInt();
            System.out.println("Digite o nome do funcionario:");
            nome = sc.nextLine();
            System.out.println("Agora, insira o salario do mesmo:");
            salary = sc.nextDouble();
            vetor.add(id , new Employee(id , salary , nome));

        }
        System.out.println("Insira o id do funcionario que voce deseja fazer o acrescimo de salario:");
        int escolha = sc.nextInt();
        System.out.println("Agora insira a porcentagem que deseja:");
        double porcentagem = sc.nextDouble();



    }
}
