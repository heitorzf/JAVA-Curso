package HerancaPolimorfismo;

public abstract class Funcionarios {
    private Integer codigo;
    private String nome;
    private String sexo;
    private Integer horasTrabalhadas;
    private Double valorHora;

    public Funcionarios(Integer codigo, String nome, String sexo, Integer horasTrabalhadas, Double valorHora) {
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }
    public abstract double pagamento();


}
