package Secao12HerancaPolimorfismo;

import Secao12HerancaPolimorfismo.exemplo.Account;
import Secao12HerancaPolimorfismo.exemplo.BusinessAccount;
import Secao12HerancaPolimorfismo.exemplo.SavingsAccount;

public class exOverride {
    public static void main(String[] args) {
        Account acc1 = new Account(1 , "Heitor" , 1000.00);
        acc1.withdraw(100);
        System.out.println(acc1.getBalance());
        Account acc2 = new SavingsAccount(2 , "Beako" , 1000.00 , 0.5);
        acc2.withdraw(100); // o metodo withdraw prevaleceu
        System.out.println(acc2.getBalance());
        Account acc3 = new BusinessAccount(3 , "Vincent" , 1000.00 , 29302.00);
        acc3.withdraw(100);
        System.out.println(acc3.getBalance());


    }

}
