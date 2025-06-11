package Arrays.ArrayList.ExercicioArrayList;

public abstract class AnimalDomestico {
    private String nome;
    private Integer idade;

    public AnimalDomestico(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public abstract void alimentacao();
    public String toString() {
        StringBuilder tsb = new StringBuilder();
        tsb.append("Informações especificas:\n");
        tsb.append(this.nome);
        tsb.append("\nIdade:").append(this.idade);
        return tsb.toString();
    }
}
