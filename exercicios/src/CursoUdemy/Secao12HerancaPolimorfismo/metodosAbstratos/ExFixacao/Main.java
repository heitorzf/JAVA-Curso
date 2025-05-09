package Secao12HerancaPolimorfismo.metodosAbstratos.ExFixacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Taxpayer> list = new ArrayList<>();
        System.out.print("Enter the number of tax payers:");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n ; i++) {
            System.out.print("Individual or Company?(i/c)");
            char c = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name:");
            String name = sc.nextLine();
            System.out.println("Anual Income:");
            double anualIncome = sc.nextDouble();
            sc.nextLine();
            if (c == 'i') {
                System.out.print("Enter health expenditures:");
                double healthExpenditures = sc.nextDouble();
                sc.nextLine();
                list.add(new Individual(name , anualIncome , healthExpenditures));

            }
            else {
                System.out.print("Enter the number of employees:");
                int numberOfEmployees = sc.nextInt();
                sc.nextLine();
                list.add(new Company(name , anualIncome , (double) numberOfEmployees));
            }



        }
        System.out.println("TAXES PAID:");
        for ( Taxpayer t : list){
            System.out.println(t.getName() + ": $" + t.tax() );
        }

    }
}
