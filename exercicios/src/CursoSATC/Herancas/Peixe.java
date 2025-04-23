package Herancas;

public class Peixe extends Animal {
    private String caracteristicas;
    public Peixe(String nome, Double comprimento, Integer patas, String cor, String ambiente, Float vm , String caracteristicas) {
        super(nome, comprimento, patas, cor, ambiente, vm);
        this.caracteristicas = caracteristicas;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
    public void dadosPeixe() {
        System.out.println("Nome: "  +"\nComprimento:" + this.getComprimento() + "\nNumero de patas:" + this.getPatas() + "\nCor:" + this.getCor() + "\nAmbiente:" + this.getAmbiente() + "\nVelocidade media:" + this.getVm());
    }
}
