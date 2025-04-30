package Secao12EnumeracaoComposicao.entitesex1;

import java.util.Locale;
import java.util.Scanner;
import
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter department's name:  ");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker data:");
        System.out.println("Name:");
        String workerName = sc.nextLine();
        System.out.println("Level:");
        String level = sc.nextLine();
        System.out.println("Enter base salary");
        double basesalary = sc.nextDouble();
        Worker worker = new Worker(workerName , level , basesalary , departmentName);



        sc.close();
    }
}
