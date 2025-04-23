package Herancas;

public class Animal {
    private String nome;
    private Double comprimento;
    private Integer patas;
    private String cor;
    private String ambiente;
    private Float vm;

    public Animal(String nome, Double comprimento, Integer patas, String cor, String ambiente, Float vm) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.patas = patas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.vm = vm;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public Float getVm() {
        return vm;
    }

    public Integer getPatas() {
        return patas;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public String getCor() {
        return cor;
    }

    public String getNome() {
        return nome;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPatas(Integer patas) {
        this.patas = patas;
    }

    public void setVm(Float vm) {
        this.vm = vm;
    }
}
