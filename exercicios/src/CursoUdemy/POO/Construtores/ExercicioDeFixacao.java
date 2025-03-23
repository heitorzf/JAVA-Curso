/*Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
        Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
        exemplo).
        Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque
realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
suficiente para realizar o saque e/ou pagar a taxa.
Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
mostrando os dados da conta após cada operação.*/

package POO.Construtores;

import entities.BankAccount;

import javax.swing.*;
import java.util.Scanner;

public class ExercicioDeFixacao {
    public static void main(String[] args) {
        BankAccount account;
        String name , AccountNumber , response;
        double InitialDeposit , deposit , withdraw;
        name = JOptionPane.showInputDialog("Insert your name: ");
        AccountNumber = JOptionPane.showInputDialog("Insert your account number:");
        response = JOptionPane.showInputDialog("Is there a initial deposit? y / n ");
        if (response.equalsIgnoreCase("y")){
            InitialDeposit = Double.parseDouble(JOptionPane.showInputDialog("Enter your initial deposit value:"));
            account = new BankAccount(name , AccountNumber , InitialDeposit);
        }
        else {
            account = new BankAccount(name , AccountNumber);
        }
        JOptionPane.showMessageDialog(null , "Account data:");
        JOptionPane.showMessageDialog(null , account);
        deposit = Double.parseDouble(JOptionPane.showInputDialog("Enter your deposit value: "));
        account.deposit(deposit);
        JOptionPane.showMessageDialog(null , "Updated account data:");
        JOptionPane.showMessageDialog(null , account);
        withdraw = Double.parseDouble(JOptionPane.showInputDialog("Enter your withdraw value"));
        account.withdraw(withdraw);
        JOptionPane.showMessageDialog(null , "Updated account data:");
        JOptionPane.showMessageDialog(null , account);




    }

}
