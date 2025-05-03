package Secao12HerancaPolimorfismo;

import Secao12HerancaPolimorfismo.exemplo.Account;
import Secao12HerancaPolimorfismo.exemplo.BusinessAccount;
import Secao12HerancaPolimorfismo.exemplo.SavingsAccount;

public class exUpcasting {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex" , 0.0);
        BusinessAccount bacc = new BusinessAccount(1002 , "Maria" , 0.0 , 500.0);
        //UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003 , "Hector" , 1000.00 , 500.00);
        Account acc3 = new SavingsAccount(10045 , "Lontroso" , 3928.00 , 1.25);
        //DOWNCASTING
        BusinessAccount bacc2 = (BusinessAccount) acc2;
       // BusinessAccount bacc3 = (BusinessAccount) acc3; isso da errado.
        if (acc3 instanceof BusinessAccount) {
            System.out.println("sempre falso");
        }
        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            System.out.println("UPDATED!!");
        }

    }
}
