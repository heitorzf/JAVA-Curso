package Arrays.ArrayList.ExercicioArrayList;

public class Cao extends AnimalDomestico{
    private String raca;

    public Cao(String nome, Integer idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void alimentacao() {
        System.out.println("O animal " + getNome() + " está roendo um osso");
    }
    @Override
    public String toString() {
        StringBuilder tsb = new StringBuilder();
        tsb.append(super.toString());
        tsb.append("Raça: ").append(this.raca);
        return tsb.toString();
    }
}
