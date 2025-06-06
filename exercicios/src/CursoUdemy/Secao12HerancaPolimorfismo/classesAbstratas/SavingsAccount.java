package Secao12HerancaPolimorfismo.classesAbstratas;

public class SavingsAccount extends Account {
    private Double interestRate;

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public SavingsAccount() {

    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
    public void updateBalance() {
        balance += balance * interestRate;
    }

    @Override // anotação
    public void withdraw(double amount) {
        balance -= amount; // implementação de forma diferente, sem a taxa,
    }
}
