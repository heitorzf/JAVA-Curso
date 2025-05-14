package HerancaPolimorfismo;

public class Secretario extends Funcionarios {
    private String categoria;
    private String setor;

    public Secretario(Integer codigo, String nome, String sexo, Integer horasTrabalhadas, Double valorHora, String categoria, String setor) {
        super(codigo, nome, sexo, horasTrabalhadas, valorHora);
        this.categoria = categoria;
        this.setor = setor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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
