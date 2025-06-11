package Arrays.ArrayList.ExercicioArrayList;

public class Gato extends AnimalDomestico {
    private String raca;

    public Gato(String nome, Integer idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    @Override
    public void alimentacao() {
    System.out.println("O gato " + getNome() + " está comendo peixe.");
    }

    @Override
    public String toString() {
        StringBuilder tsb = new StringBuilder();
        tsb.append(super.toString());
        tsb.append("Raça: ").append(this.raca);
        return tsb.toString();
    }
}
