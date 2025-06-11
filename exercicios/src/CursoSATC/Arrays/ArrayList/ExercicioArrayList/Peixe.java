package Arrays.ArrayList.ExercicioArrayList;

public class Peixe extends AnimalDomestico {
    private String tipo;

    public Peixe(String nome, Integer idade, String tipo) {
        super(nome, idade);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void alimentacao() {
        System.out.println("O animal" + getNome() + " está comendo ração de peixe." );
    }
    @Override
    public String toString() {
        StringBuilder tsb = new StringBuilder();
        tsb.append(super.toString());
        tsb.append("Tipo: ").append(this.tipo);

        return tsb.toString();
    }
}
