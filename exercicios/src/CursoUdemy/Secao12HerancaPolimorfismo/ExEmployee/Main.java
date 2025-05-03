package Secao12HerancaPolimorfismo.ExEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        System.out.print("Enter the number of employees:");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1 ; i <= n ; i++ ) {
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            char op = sc.next().charAt(0);
            System.out.print("Name:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Hours:");
            int hours = sc.nextInt();
            sc.nextLine();
            System.out.println("Value per hour:");
            double valuePerHour = sc.nextDouble();
            if (op == 'y'){
                System.out.print("Enter additional charge:");
                Double additionalCharge = sc.nextDouble();
                employees.add(new OutsourcedEmployee(name , hours , valuePerHour , additionalCharge));

            }
            else {
                employees.add(new Employee(name , hours , valuePerHour));
            }

        }
        System.out.println("PAYMENTS:");
        for (Employee emp : employees) {
            System.out.println(emp.getName() + " - " + emp.payment() );

        }
    }
}
