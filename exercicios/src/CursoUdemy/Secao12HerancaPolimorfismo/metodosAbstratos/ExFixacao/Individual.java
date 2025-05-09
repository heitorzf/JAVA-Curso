package Secao12HerancaPolimorfismo.metodosAbstratos.ExFixacao;

public class Individual extends Taxpayer {
    private Double healthExpenditures;

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        if (getAnualIncome() > 20000.0 ) {
            return getAnualIncome() * 0.15 - healthExpenditures / 2;
        }
        else {
            return getAnualIncome() * 0.25 - healthExpenditures / 2;
        }
    }
}
