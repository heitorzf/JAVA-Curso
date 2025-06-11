package Arrays.ArrayList.Revisao.ListaVetores.Ex1;

public class Ex5 {
    public static void main(String[] args) {
        double[] notas = {7.5, 8.0, 6.5, 9.0, 5.5};
        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        double media = soma / notas.length;

        System.out.println("Média: " + media);
        System.out.println("Notas acima da média:");


        for (double nota : notas) {
            if (nota > media) {
                System.out.println(nota);
            }
        }
    }
}
