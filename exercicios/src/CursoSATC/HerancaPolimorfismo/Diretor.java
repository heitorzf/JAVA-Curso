package HerancaPolimorfismo;

public class Diretor extends Funcionarios {
    private String areaGestao;

    public Diretor(Integer codigo, String nome, String sexo, Integer horasTrabalhadas, Double valorHora, String areaGestao) {
        super(codigo, nome, sexo, horasTrabalhadas, valorHora);
        this.areaGestao = areaGestao;
    }

    public String getAreaGestao() {
        return areaGestao;
    }

    public void setAreaGestao(String areaGestao) {
        this.areaGestao = areaGestao;
    }


    @Override
    public double pagamento() {
        return 1.02 * (getHorasTrabalhadas() * getValorHora());
    }
}
