package Arrays.ArrayList.Revisao.ListaVetores.Ex1;

public class Ex3 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] invertido = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            invertido[i] = original[original.length - 1 - i];
        }
        for (int inver : invertido) {
            System.out.println(inver);
        }
    }
}