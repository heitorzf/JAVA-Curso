package Secao12EnumeracaoComposicao.entitesex1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import com.sun.jdi.Value;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter department's name:  ");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker data:");
        System.out.print("Name:");
        String workerName = sc.nextLine();
        System.out.println("Level:");
        String level = sc.nextLine();
        System.out.println("Enter base salary");
        double basesalary = sc.nextDouble();
        Worker worker = new Worker(workerName , WorkerLevel.valueOf(level) , basesalary , new Department(departmentName));
        System.out.println("How many contracts to this worker?");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1 ; i<= n ; i++ ) {
        System.out.println("Enter contract data #" +i + ":" );
        System.out.println("Date (DD/MM/YYYY): ");
        Date contractDate = sdf.parse(sc.next());
            System.out.println("Value per hour: ");
            double ValuePerHour = sc.nextDouble();
            System.out.print("Duration (hours):");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate , ValuePerHour , hours);
            worker.addContract(contract);

        }
        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0 , 2)); //esse metodo faz com que eu possa recortar uma string de uma parte, até a outra, informando os indices q eu quero ccomo parametro
        int year = Integer.parseInt(monthAndYear.substring(3)); // se eu botar só um valor, ele começa pelo indice e vai ate o final
        System.out.println("Name:" + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ":" + worker.income(year , month));



        sc.close();
    }
}
