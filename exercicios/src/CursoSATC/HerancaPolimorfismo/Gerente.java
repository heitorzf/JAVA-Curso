package HerancaPolimorfismo;

public class Gerente extends Funcionarios {
    private String setor;

    public Gerente(Integer codigo, String nome, String sexo, Integer horasTrabalhadas, Double valorHora, String setor) {
        super(codigo, nome, sexo, horasTrabalhadas, valorHora);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public double pagamento() {
        return 1.05 *(getHorasTrabalhadas() * getValorHora());
    }
}
