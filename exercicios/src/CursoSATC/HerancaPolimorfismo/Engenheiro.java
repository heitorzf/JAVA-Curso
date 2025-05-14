package HerancaPolimorfismo;

public class Engenheiro extends Funcionarios {
    private Integer nrCREA;
    private String especializacao;

    public Engenheiro(Integer codigo, String nome, String sexo, Integer horasTrabalhadas, Double valorHora, Integer nrCREA, String especializacao) {
        super(codigo, nome, sexo, horasTrabalhadas, valorHora);
        this.nrCREA = nrCREA;
        this.especializacao = especializacao;
    }

    public Integer getNrCREA() {
        return nrCREA;
    }

    public void setNrCREA(Integer nrCREA) {
        this.nrCREA = nrCREA;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    @Override
    public double pagamento() {
        return 1.05 *(getHorasTrabalhadas() * getValorHora());
    }

}
