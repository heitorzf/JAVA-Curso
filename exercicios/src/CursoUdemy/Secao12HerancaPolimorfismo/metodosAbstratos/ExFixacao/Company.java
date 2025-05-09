package Secao12HerancaPolimorfismo.metodosAbstratos.ExFixacao;

public class Company extends Taxpayer {
    private Double numberOfEmployees; // nao era pra eu ter criado com double mas foi sem querer

    public Company(String name, Double anualIncome, Double numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Double getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Double numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        if (numberOfEmployees > 10 ) {
            return getAnualIncome() *  0.14;
        }
        else {
            return getAnualIncome() * 0.16;
        }
    }
}
